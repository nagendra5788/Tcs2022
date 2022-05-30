package amazonapp.Service;

import java.util.List;

import amazonapp.bean.product;

public interface productservice {
	product addproduct(product product);
	
	List<product> getAllListOfProducts();
	
	product updateProduct(product product,long id);
	void deleteProductById(long id);
	
	
	
	

}
