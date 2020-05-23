package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.MyApplication;

import java.awt.*;
import java.io.IOException;
import javafx.scene.control.TextField;

public class PlayerController {



        @FXML
        private TextField firstName;

        @FXML
        private TextField secondName;

        @FXML
        private Button switchSTART;

        @FXML
        private Label errorLabel;





//        public void switchMode(ActionEvent Event) throws IOException {
//                Parent root = FXMLLoader.load(MyApplication.class.getResource("/fxml/game.fxml"));
//                Stage stage= (Stage) ((Node) Event.getSource()).getScene().getWindow();
//                stage.setScene(new Scene(root));
//                stage.show();
//        }
        public void startAction(ActionEvent actionEvent) throws IOException {
                if (firstName.getText().isEmpty() || secondName.getText().isEmpty()) {
                        errorLabel.setText("* Username is empty!");
                } else {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
                        Parent root = fxmlLoader.load();
                        fxmlLoader.<GameController>getController().initdata(firstName.getText(), secondName.getText());
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setScene(new Scene(root));
                        stage.show();
//                        log.info("Username is set to {}, loading game scene.", FirstName.getText());
                }

        }
}
