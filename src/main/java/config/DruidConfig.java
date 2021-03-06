package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ：07
 * @date ：Created in 14:41 2021/10/8
 * @Description：TODO    druid 数据库连接池
 * @Modified By：
 * @Version: 1.0
 */
@PropertySource("classpath:db.properties")
public class DruidConfig {
    @Value("${driver}")
    private String driverClassName;

    @Value("${url}")
    private String url;

    @Value("${name}")
    private String username;

    @Value("${password}")
    private String password;

    /**
     * 数据源
     * @return
     */
    @Bean
    DruidDataSource dataSource() {
        //数据源配置
        DruidDataSource dataSource = new DruidDataSource();
        //这个可以缺省的，会根据url自动识别
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);


        //下面都是可选的配置
        dataSource.setInitialSize(10);  //初始连接数，默认0
        dataSource.setMaxActive(30);  //最大连接数，默认8
        dataSource.setMinIdle(10);  //最小闲置数
        dataSource.setMaxWait(2000);  //获取连接的最大等待时间，单位毫秒
        //缓存PreparedStatement，默认false
        dataSource.setPoolPreparedStatements(true);
        //缓存PreparedStatement的最大数量，默认-1（不缓存）。大于0时会自动开启缓存PreparedStatement，所以可以省略上一句代码
        dataSource.setMaxOpenPreparedStatements(20);
        return dataSource;
    }




}
