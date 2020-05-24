package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import results.GameResultZVHU97;
import results.GameResultDao;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

@Slf4j
public class GameController {
    private String PL1;
    private String PL2;
    private Instant beginGame;
    private int numSteps;
    private int winnerNum;
    private String winner;
    private int countNum;
    private int headsTails1;
    private int headsTails2;
    private int headsTails3;
    private int headsTails4;
    private int headsTails5;
    private int headsTails6;
    private int headsTails7;
    private int headsTails8;
    private int headsTails9;
    private int headsTails10;

    private GameResultDao gameResultDao;

    private Image image = new Image(getClass().getResource("/pictures/Tails.png").toExternalForm());
    private Image image1 = new Image(getClass().getResource("/pictures/Heads.png").toExternalForm());

    @FXML
    private Label playerName;

    @FXML
    private Label playerName1;

    @FXML
    private Circle Player1Turn;

    @FXML
    private Circle Player2Turn;

    @FXML
    private Label winnerName;

    @FXML
    private Label stepCount;

    @FXML
    private ImageView coin1;

    @FXML
    private ImageView coin2;

    @FXML
    private ImageView coin3;

    @FXML
    private ImageView coin4;

    @FXML
    private ImageView coin5;

    @FXML
    private ImageView coin6;

    @FXML
    private ImageView coin7;

    @FXML
    private ImageView coin8;

    @FXML
    private ImageView coin9;

    @FXML
    private ImageView coin10;

    private String playerWon;


    public void initdata(String PL1, String PL2) {
        this.PL1 = PL1;
        this.PL2 = PL2;
        playerName.setText("Player 1: " + this.PL1);
        playerName1.setText("Player 2: " + this.PL2);

    }

    public boolean isSolved() {
        if (winnerNum == 10) {
            winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
            playerWon = Player1Turn.getOpacity() == 1 ? PL1 : PL2;
            winnerName.setText(winner);
            return true;
        }
        return false;
    }

    ;


    public void turnTails1(MouseEvent mouseEvent) {
        if (headsTails1 == 0) {
            coin1.setImage(image);
            stepNumber();
            headsTails1 = 1;
            winnerNum = winnerNum + 1;
            isSolved();
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin1.setImage(image1);
            stepNumber();
            headsTails1 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }

    }

    public void turnTails2(MouseEvent mouseEvent) {
        if (headsTails2 == 0) {
            coin2.setImage(image);
            stepNumber();
            headsTails2 = 1;
            winnerNum = winnerNum + 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin2.setImage(image1);
            stepNumber();
            headsTails2 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }

    }

    public void turnTails3(MouseEvent mouseEvent) {
        if (headsTails3 == 0) {
            coin3.setImage(image);
            stepNumber();
            headsTails3 = 1;
            winnerNum = winnerNum + 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin3.setImage(image1);
            stepNumber();
            headsTails3 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }
    }

    public void turnTails4(MouseEvent mouseEvent) {
        if (headsTails4 == 0) {
            coin4.setImage(image);
            stepNumber();
            headsTails4 = 1;
            winnerNum = winnerNum + 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin4.setImage(image1);
            stepNumber();
            headsTails4 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }
    }

    public void turnTails5(MouseEvent mouseEvent) {
        if (headsTails5 == 0) {
            coin5.setImage(image);
            stepNumber();
            headsTails5 = 1;
            winnerNum = winnerNum + 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin5.setImage(image1);
            stepNumber();
            headsTails5 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }
    }

    public void turnTails6(MouseEvent mouseEvent) {
        if (headsTails6 == 0) {
            coin6.setImage(image);
            stepNumber();
            headsTails6 = 1;
            winnerNum = winnerNum + 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin6.setImage(image1);
            stepNumber();
            headsTails6 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }
    }

    public void turnTails7(MouseEvent mouseEvent) {
        if (headsTails7 == 0) {
            coin7.setImage(image);
            stepNumber();
            headsTails7 = 1;
            winnerNum = winnerNum + 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin7.setImage(image1);
            stepNumber();
            headsTails7 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }
    }

    public void turnTails8(MouseEvent mouseEvent) {
        if (headsTails8 == 0) {
            coin8.setImage(image);
            stepNumber();
            headsTails8 = 1;
            winnerNum = winnerNum + 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin8.setImage(image1);
            stepNumber();
            headsTails8 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }
    }

    public void turnTails9(MouseEvent mouseEvent) {
        if (headsTails9 == 0) {
            coin9.setImage(image);
            stepNumber();
            headsTails9 = 1;
            winnerNum = winnerNum + 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin9.setImage(image1);
            stepNumber();
            headsTails9 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }
    }

    public void turnTails10(MouseEvent mouseEvent) {
        if (headsTails10 == 0) {
            coin10.setImage(image);
            stepNumber();
            headsTails10 = 1;
            winnerNum = winnerNum + 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        } else if (numSteps == 1 || numSteps == 3) {
            coin10.setImage(image1);
            stepNumber();
            headsTails10 = 0;
            winnerNum = winnerNum - 1;
            if (winnerNum == 10) {
                winner = Player1Turn.getOpacity() == 1 ? "Winner is " + PL1 : "Winner is " + PL2;
                winnerName.setText(winner);
            }
            numSteps = numSteps + 1;
            if (numSteps == 3) {
                switchPlayerTurn();
                numSteps = 0;
            }
        }

    }

    /**
     * Switches player turns based on a blue circle which will appear at the top next to the names.
     */
    private void switchPlayerTurn() {
        if (Player1Turn.getOpacity() == 1) {
            Player1Turn.setOpacity(0);
            Player2Turn.setOpacity(1);
        } else {
            Player1Turn.setOpacity(1);
            Player2Turn.setOpacity(0);
        }
    }

    @FXML
    public void initialize() {
        numSteps = 0;

        winnerNum = 0;

        countNum = 0;

        Player1Turn.setOpacity(1);
        Player2Turn.setOpacity(0);
        beginGame = Instant.now();

        headsTails1 = 0;
        headsTails2 = 0;
        headsTails3 = 0;
        headsTails4 = 0;
        headsTails5 = 0;
        headsTails6 = 0;
        headsTails7 = 0;
        headsTails8 = 0;
        headsTails9 = 0;
        headsTails10 = 0;

    }

    private void stepNumber() {
        countNum++;
        stepCount.setText(String.valueOf(countNum));
    }

    private void storeResult() {
        GameResultDao gameResultDao = GameResultDao.getInstance();
        GameResultZVHU97 gameResult = GameResultZVHU97.builder()
                .player(playerWon)
                .solved(isSolved())
                .steps(countNum)
                .duration(Duration.between(beginGame, Instant.now()))
                .build();
        gameResultDao.persist(gameResult);
    }

    /**
     * @param actionEvent An action which is sent when a button is pressed.
     * @throws IOException An exception that is caught if an error occurs.
     */
    public void finishGame(ActionEvent actionEvent) throws IOException {
        if (isSolved()) {
            storeResult();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/topFive.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
        log.info("Finished game, loading Top Five scene.");
    }

}

