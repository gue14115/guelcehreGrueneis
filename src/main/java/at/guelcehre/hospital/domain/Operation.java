package at.guelcehre.hospital.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "operations")
public class Operation extends BasePersistable{

	private static final long serialVersionUID = 1766209272109267427L;
	
	@NotNull
	@Column(name = "estimatedLengthInHours", nullable = false, length = 255)
	private int estimatedLengthInHours;
	@NotNull
	@Column(name = "day", nullable = false, length = 255)
	private Weekday day;

}
