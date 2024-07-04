package home_screen;

import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import stage_holder.StageHolder;

public class HomeScreenViewer{
	

	public static void show() throws Exception{
		
		URL fxmlUrl = Paths.get("D:\\java-2023-12\\JavaFx_ECommerce\\src\\home_screen\\HomeScreen.fxml").toUri().toURL();
		
		Parent actorGroup = FXMLLoader.load(fxmlUrl);
		StageHolder.stage.setTitle("Home");
		Scene scene = new Scene(actorGroup,600,400);
		StageHolder.stage.setScene(scene);;
		StageHolder.stage.show();
	}

}
