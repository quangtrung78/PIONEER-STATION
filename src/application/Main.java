package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("GuiGiaoDein.fxml"));
            Scene scene = new Scene(root);
            
            Image icon = new Image("file:image/icon.png");
            primaryStage.getIcons().add(icon);
            
            primaryStage.setTitle("Hệ thống bán vé tại nhà ga PIONEER STATION");
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}