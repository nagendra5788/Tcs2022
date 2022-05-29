package amazonapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import amazonapp.Service.productservice;
import amazonapp.bean.product;





@RestController
public class productcontroller {
	
	@Autowired
	productservice ProductService;
	
	
	@PostMapping(value="/addproduct")
	product addproduct(@RequestBody product Product) {
		product productadd = ProductService.addproduct(Product);
		return productadd;
	}

}
