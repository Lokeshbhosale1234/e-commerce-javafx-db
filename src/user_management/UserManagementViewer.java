package user_management;

import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import stage_holder.StageHolder;

public class UserManagementViewer {
	
	public static void show() throws Exception {
		URL fxmlUrl1 = Paths.get("D:\\java-2023-12\\JavaFx_ECommerce\\src\\user_management\\UserManagementScreen.fxml").toUri().toURL();
		
		Parent actorGroup = FXMLLoader.load(fxmlUrl1);
		StageHolder.stage.setTitle("User Management");
		Scene scene = new Scene(actorGroup,600,400);
		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();
		
	}

}
