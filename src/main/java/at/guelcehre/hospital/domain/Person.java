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

import at.guelcehre.hospital.Ensure;

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

	public Person(String name, Date birthDate, boolean isMan,
			String telephoneNumber, String address, String zip) {
		super();
		Ensure.notEmpty("name", name);
		Ensure.notEmpty("telephone_number", telephoneNumber);
		Ensure.notEmpty("address", address);
		Ensure.notEmpty("zip", zip);
		this.name = name;
		this.birthDate = birthDate;
		this.isMan = isMan;
		this.telephoneNumber = telephoneNumber;
		this.address = address;
		this.zip = zip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
