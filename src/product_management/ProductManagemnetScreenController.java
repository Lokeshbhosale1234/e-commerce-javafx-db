package product_management;

import add_product.AddProductViewer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ProductManagemnetScreenController {
	
	@FXML
	Button addproduct;
	
	public void AddProductClicked() throws Exception {
		
		AddProductViewer.show();
	}

}
