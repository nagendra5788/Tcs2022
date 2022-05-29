package amazonapp.Serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amazonapp.Repository.MyLocalRepository;
import amazonapp.Service.productservice;
import amazonapp.bean.product;




@Service
public class productserviceimp implements productservice{
	
	
	@Autowired
	MyLocalRepository myLocalRepository;

	@Override
	public product addproduct(product product) {
		// TODO Auto-generated method stub
		product prod = myLocalRepository.save(product);
		
		
		return prod;
	}

}
