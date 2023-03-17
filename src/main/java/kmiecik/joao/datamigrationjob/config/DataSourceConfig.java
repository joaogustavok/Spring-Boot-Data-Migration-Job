package kmiecik.joao.datamigrationjob.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource springDataSource(){
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/springbatch?createDatabaseIfNotExist=True")
                .username("root")
                .password("root")
                .build();
    }

    @Bean
    @ConfigurationProperties(prefix = "app.datasource")
    public DataSource appDataSource(){
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/data_migration?createDatabaseIfNotExist=True")
                .username("root")
                .password("root")
                .build();
    }
}
