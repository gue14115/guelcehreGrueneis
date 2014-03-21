package at.guelcehre.hospital.repository;

import at.guelcehre.hospital.domain.Room;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by anil on 10/03/14.
 */
public interface RoomRepository extends CrudRepository<Room, Long> {
}
