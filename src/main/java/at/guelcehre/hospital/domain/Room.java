package at.guelcehre.hospital.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "rooms")
public class Room extends BasePersistable{

	private static final long serialVersionUID = -3156916839316342870L;
	@NotNull
	@Column(name = "name", nullable = false, length = 255)
	private String name;
	@NotNull
	@Column(name = "building", nullable = false, length = 255)
	private String building;
	@NotNull
	@Column(name = "floor", nullable = false, length = 255)
	private String floor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
}
