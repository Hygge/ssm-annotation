package config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ：07
 * @date ：Created in 16:46 2021/10/11
 * @Description：TODO
 * @Modified By：
 * @Version: 1.0
 */
@Configuration
@ComponentScan(basePackages = {"service","mapper"})
@Import({DruidConfig.class, MybatisConfig.class})
public class SpringConfig {


}
