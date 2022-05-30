package amazonapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import amazonapp.Service.productservice;
import amazonapp.bean.product;

@RestController
public class productcontroller {
	
	
	@Autowired
	productservice productService;
	
	@PostMapping(value = "/createproduct")
	product createproduct(@RequestBody product prod) {
		product p =productService.addproduct(prod);
		System.out.println(" product ->>>>>>>>" + p.getProductname());
		System.out.println(" color ->>>>>>>>" + p.getColor());
		return p;
		
		
	}
	@GetMapping(value = "/viewallofproduct")
	List<product> viewAllListOfProducts() {
		return productService.getAllListOfProducts();
	}
	@PutMapping(value = "/updateproduct/{id}")
	product updateproduct(@RequestBody product updateproduct, @PathVariable long id) {
		product updatedDetails = productService.updateProduct(updateproduct, id);
		return updatedDetails;
		
	}
	@DeleteMapping(value = "/deleteproductbyid/{productid}")
	ResponseEntity<String> deleteproductBy(@PathVariable long productid) {
		
		
		
		try {
			if(productid ==0) {
				return ResponseEntity.ok("pls enter in proper id" + productid);
			}
			productService.deleteProductById(productid);
			return ResponseEntity.ok("Sucessfully deleted " + productid);
		} catch (Exception e) {
			return ResponseEntity.ok("product id does not exsists " + productid);
		}
	}
	

}
