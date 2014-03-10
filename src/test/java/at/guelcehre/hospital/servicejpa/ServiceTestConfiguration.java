package at.guelcehre.hospital.servicejpa;

import at.guelcehre.hospital.domain.DomainConfiguration;
import at.guelcehre.hospital.repositoryjpa.RepositoryJpaConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Created by anil on 10/03/14.
 */
@Configuration
@Import({DomainConfiguration.class, RepositoryJpaConfiguration.class, ServiceJpaConfiguration.class})
public class ServiceTestConfiguration {
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
