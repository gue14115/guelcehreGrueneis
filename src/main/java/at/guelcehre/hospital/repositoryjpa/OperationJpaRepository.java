package at.guelcehre.hospital.repositoryjpa;

import at.guelcehre.hospital.domain.Operation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Anil on 16.01.14.
 */

@Repository
public class OperationJpaRepository extends AbstractJpaRepository<Operation>{
    public List<Operation> findAll(){
        return entityManager().createQuery("SELECT o FROM Doctor o", Operation.class).getResultList();
    }
    public Operation findById(Long id){
        return entityManager().find(Operation.class,id);
    }
}
