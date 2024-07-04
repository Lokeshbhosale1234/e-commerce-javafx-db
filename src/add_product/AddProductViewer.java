package add_product;

import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import stage_holder.StageHolder;

public class AddProductViewer{

	public static void show() throws Exception {
		URL fxmlUrl = Paths.get("D:\\java-2023-12\\JavaFx_ECommerce\\src\\add_product\\AddProductScreen.fxml").toUri().toURL();
		
		Parent actorGroup = FXMLLoader.load(fxmlUrl);
		Scene scene = new Scene(actorGroup,600,400);
		StageHolder.stage.setTitle("Add Product");
		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();
	}

}
