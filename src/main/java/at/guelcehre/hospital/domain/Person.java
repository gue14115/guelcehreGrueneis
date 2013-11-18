package at.guelcehre.hospital.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	private static final long serialVersionUID = -1894844304628938112L;

	@Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;
    
    @NotNull
    @Column(name = "is_man", nullable = false, length = 255)
    private boolean isMan;
    
    @NotNull
    @Column(name = "telephone_number", nullable = false, length = 255)
    private String telephoneNumber;
    
    @NotNull
    @Column(name = "address", nullable = false, length = 255)
    private String address;
    
    @NotNull
    @Column(name = "zip", nullable = false, length = 255)
    private String zip;
}
