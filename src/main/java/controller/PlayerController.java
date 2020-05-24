package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.io.IOException;
import javafx.scene.control.TextField;

@Slf4j
public class PlayerController {



        @FXML
        private TextField firstName;

        @FXML
        private TextField secondName;

        @FXML
        private Button switchSTART;

        @FXML
        private Label errorLabel;





        /**
         * Checks whether one of the player's names is empty, if so an error label will show up with a message,
         * providing them with the problem,then sets the player names and
         * loads game.fxml with the player's names accordingly.
         * @param actionEvent A mouse event, in this case onAction.
         * @throws IOException An exception that is caught if an error occurs.
         */

        public void startAction(ActionEvent actionEvent) throws IOException {
                if (firstName.getText().isEmpty() || secondName.getText().isEmpty()) {
                        errorLabel.setText("* Player names are empty!");
                } else {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
                        Parent root = fxmlLoader.load();
                        fxmlLoader.<GameController>getController().initdata(firstName.getText(), secondName.getText());
                        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                        stage.setScene(new Scene(root));
                        stage.show();
                        log.info("First player is set to {}, loading game scene.", firstName.getText());
                        log.info("Second player is set to {}, loading game scene.", secondName.getText());
                }

        }
}
