package amazonapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import amazonapp.bean.product;




@Repository
public interface MyLocalRepository extends JpaRepository<product,Long>{

}
