package at.guelcehre.hospital.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Inheritance
@DiscriminatorColumn(name="persons_type")
@Table(name="persons")
public class Person extends BasePersistable{
    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;
}
