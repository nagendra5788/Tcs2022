package amazonapp.Serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amazonapp.Service.productservice;
import amazonapp.bean.product;
import amazonapp.repository.MyLocalRepository;

@Service
public class productserviceimp implements productservice {

	@Autowired
	MyLocalRepository myLocalRepository;
	public product addproduct(product product) {
		
		product addproduct = myLocalRepository.save(product);
		return addproduct;
	}

	
	public List<product> getAllListOfProducts() {
		
		List<product> listOfproducts = myLocalRepository.findAll();
		
		return listOfproducts;
	}

	public product updateProduct(product product, long id) {
		
		
		product.setId(id);
		product updatedproduct = myLocalRepository.save(product);
		return updatedproduct;
	}

	@Override
	public void deleteProductById(long id) {
		
		myLocalRepository.deleteById(id);
		
	}
	
	

}
