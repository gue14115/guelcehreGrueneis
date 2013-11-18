package at.guelcehre.hospital.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("P")
public class Patient extends Person{
    @NotNull
    @Column(name = "sickness", nullable = false)
	private String sickness;
}
