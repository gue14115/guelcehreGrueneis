package at.guelcehre.hospital.repositoryjpa;

import at.guelcehre.hospital.domain.Room;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Anil on 16.01.14.
 */
@Repository
public class RoomJpaRepository extends AbstractJpaRepository<Room>{
    public List<Room> findAll(){
        return entityManager().createQuery("SELECT r FROM Doctor r", Room.class).getResultList();
    }
    public Room findById(Long id){
        return entityManager().find(Room.class,id);
    }
}
