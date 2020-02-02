package code.exampleliquibase.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

import static org.springframework.boot.jdbc.DataSourceBuilder.create;

@Configuration
@EnableTransactionManagement
public class DB1DataSourceConfiguration {
    @Primary
    @Bean(name = "db1DataSource")
    @ConfigurationProperties(prefix = "db1.datasource")
    public DataSource db1DataSource() {
        return create().build();
    }

}
