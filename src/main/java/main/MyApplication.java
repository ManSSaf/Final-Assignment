package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MyApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(MyApplication.class.getResource("/fxml/first.fxml"));
        stage.setTitle("Coin Game");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
