package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DurationFormatUtils;
import results.GameResultZVHU97;
import results.GameResultDao;

import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
public class topFiveController {

    @FXML
    private TableView<GameResultZVHU97> topfiveTable;

    @FXML
    private TableColumn<GameResultZVHU97, String> player;

    @FXML
    private TableColumn<GameResultZVHU97, Integer> steps;

    @FXML
    private TableColumn<GameResultZVHU97, Duration> duration;

    private GameResultDao gameResultDao;

    public void back(ActionEvent actionEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/first.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        log.info("Loading launch scene.");
    }


    @FXML
    public void initialize() {
        gameResultDao = GameResultDao.getInstance();

        List<GameResultZVHU97> topfiveList = gameResultDao.findBest(5);

        player.setCellValueFactory(new PropertyValueFactory<>("player"));
        steps.setCellValueFactory(new PropertyValueFactory<>("steps"));
        duration.setCellValueFactory(new PropertyValueFactory<>("duration"));

        duration.setCellFactory(column -> {
            TableCell<GameResultZVHU97, Duration> cell = new TableCell<GameResultZVHU97, Duration>() {

                @Override
                protected void updateItem(Duration item, boolean empty) {
                    super.updateItem(item, empty);
                    if(empty) {
                        setText(null);
                    }
                    else {
                        setText(DurationFormatUtils.formatDuration(item.toMillis(),"H:mm:ss"));
                    }
                }
            };

            return cell;
        });

        ObservableList<GameResultZVHU97> observableResult = FXCollections.observableArrayList();
        observableResult.addAll(topfiveList);

        topfiveTable.setItems(observableResult);
    }

}
