package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author ：07
 * @date ：Created in 16:59 2021/10/11
 * @Description：TODO
 * @Modified By：
 * @Version: 1.0
 */

@EnableTransactionManagement
public class MybatisConfig {

        @Bean
        JdbcTemplate jdbcTemplate (DataSource dataSource) {
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            return jdbcTemplate;
        }

        /**
         * SqlSessionFactoryBean配置
         * @param dataSource
         * @return
         */
        @Bean("sqlSessionFactoryBean")
        SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
            SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    //        配置数据源厂商 例如mysql/oracle
    //        sqlSessionFactoryBean.setDatabaseIdProvider(new VendorDatabaseIdProvider());
            sqlSessionFactoryBean.setDataSource(dataSource);
            org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
            //配置config
            setting(configuration);
            sqlSessionFactoryBean.setConfiguration(configuration);
    //        配置mapper的xml文件
            try {
                sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                        .getResources("classpath:mapper/*Mapper.xml"));
            }catch (IOException e){
                e.printStackTrace();
            }

            return sqlSessionFactoryBean;
        }

        /**
         * 基础扫描包和加载sql工厂
         * @return
         */
        @Bean
        MapperScannerConfigurer getMapperScannerConfigurer(){
            MapperScannerConfigurer msc = new MapperScannerConfigurer();
            msc.setBasePackage("mapper");
            msc.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
            return msc;
        }


        /**
         * mybatis配置
         * @param configuration
         */
        private void setting(org.apache.ibatis.session.Configuration configuration) {
    //        不开启缓存
            configuration.setCacheEnabled(false);
    //        配置别名
            configuration.getTypeAliasRegistry().registerAliases("bean");
            //        开启驼峰命名
            configuration.setMapUnderscoreToCamelCase(true);

        }


}
