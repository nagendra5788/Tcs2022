package employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee.bean.Message;



@Repository

public interface MyEmployeeRepository extends JpaRepository<Message,Long>{

}
