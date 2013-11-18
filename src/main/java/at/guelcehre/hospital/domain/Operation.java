package at.guelcehre.hospital.domain;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "operations")
public class Operation extends BasePersistable{

	private static final long serialVersionUID = 1766209272109267427L;
	
	@NotNull
	@Column(name = "start", nullable = false, length = 255)
	private GregorianCalendar start;
	
	@NotNull
	@Column(name = "end", nullable = false, length = 255)
	private GregorianCalendar end;
	
	@NotNull
	@Column(name = "estimated_length_in_hours", nullable = false, length = 255)
	private int estimatedLengthInHours;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="patient")
	private Patient patient;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="doctor")
	private Doctor doctor;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="room")
	private Room room;

}
