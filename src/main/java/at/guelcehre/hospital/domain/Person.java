package at.guelcehre.hospital.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance
@DiscriminatorColumn(name="persons_type")
@Table(name="persons")
public class Person extends BasePersistable{

}
