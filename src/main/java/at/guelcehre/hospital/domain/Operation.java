package at.guelcehre.hospital.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "operations")
public class Operation extends BasePersistable{

	private static final long serialVersionUID = 1766209272109267427L;
	
	private int estimatedLengthInHours;
	private Weekday day;

}
