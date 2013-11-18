package at.guelcehre.hospital.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("D")
public class Doctor extends Person{

    @NotNull
    @Column(name = "qualification", nullable = false)
	private String qualification;
	
    @NotNull
    @Column(name = "specialization", nullable = false)
	private String specialization;
}
