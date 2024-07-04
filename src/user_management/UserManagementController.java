package user_management;

import add_user.AddUserScreenViewer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UserManagementController {
	
	@FXML
	Button adduser;
	
	public void AddUserClicked() throws Exception {
		
		AddUserScreenViewer.show();
	}

}
