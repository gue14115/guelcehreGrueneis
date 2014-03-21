package at.guelcehre.hospital.service;

import at.guelcehre.hospital.domain.DomainConfiguration;
import at.guelcehre.hospital.repository.RepositoryConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Created by anil on 21/03/14.
 */
@Configuration
@Import({DomainConfiguration.class, RepositoryConfiguration.class, ServiceConfiguration.class})
public class ServiceTestConfiguration {
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
