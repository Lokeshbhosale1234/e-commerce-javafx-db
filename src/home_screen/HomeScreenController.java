package home_screen;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import product_management.ProductManagementScreenViewer;
import user_management.UserManagementViewer;

public class HomeScreenController {
	
	@FXML
	Button productmanagement;
	
	@FXML
	Button usermanagement;
	
	@FXML
	Button logout;
	
	public void ProductManagementClicked() throws Exception{
		
		ProductManagementScreenViewer.show();
		
		
	}
	
	public void UserManagementClicked() throws Exception{
		
		UserManagementViewer.show();
		
	}
	
	public void logoutClicked(){
		
		
	}

}
