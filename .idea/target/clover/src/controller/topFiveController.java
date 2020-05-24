/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package controller;

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
import results.GameResult;
import results.GameResultDao;

import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
public class topFiveController {public static class __CLR4_3_1cccckajqy8vw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0069\u0072\u006c\u006f\u0073\u0079\u006f\u0075\u0073\u0065\u0066\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u0046\u0069\u006e\u0061\u006c\u002d\u0041\u0073\u0073\u0069\u0067\u006e\u006d\u0065\u006e\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590245230253L,8589935092L,480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    private TableView<GameResult> toptenTable;

    @FXML
    private TableColumn<GameResult, String> player;

    @FXML
    private TableColumn<GameResult, Integer> steps;

    @FXML
    private TableColumn<GameResult, Duration> duration;

    @FXML
    private TableColumn<GameResult, ZonedDateTime> created;

    private GameResultDao gameResultDao;

    public void back(ActionEvent actionEvent) throws IOException {try{__CLR4_3_1cccckajqy8vw.R.inc(444);

        __CLR4_3_1cccckajqy8vw.R.inc(445);Parent root = FXMLLoader.load(getClass().getResource("/fxml/launch.fxml"));
        __CLR4_3_1cccckajqy8vw.R.inc(446);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_3_1cccckajqy8vw.R.inc(447);stage.setScene(new Scene(root));
        __CLR4_3_1cccckajqy8vw.R.inc(448);stage.show();
        __CLR4_3_1cccckajqy8vw.R.inc(449);log.info("Loading launch scene.");
    }finally{__CLR4_3_1cccckajqy8vw.R.flushNeeded();}}


    @FXML
    public void initialize() {try{__CLR4_3_1cccckajqy8vw.R.inc(450);
        __CLR4_3_1cccckajqy8vw.R.inc(451);gameResultDao = GameResultDao.getInstance();

        __CLR4_3_1cccckajqy8vw.R.inc(452);List<GameResult> toptenList = gameResultDao.findBest(10);

        __CLR4_3_1cccckajqy8vw.R.inc(453);player.setCellValueFactory(new PropertyValueFactory<>("player"));
        __CLR4_3_1cccckajqy8vw.R.inc(454);steps.setCellValueFactory(new PropertyValueFactory<>("steps"));
        __CLR4_3_1cccckajqy8vw.R.inc(455);duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
        __CLR4_3_1cccckajqy8vw.R.inc(456);created.setCellValueFactory(new PropertyValueFactory<>("created"));


        __CLR4_3_1cccckajqy8vw.R.inc(457);duration.setCellFactory(column -> {
            __CLR4_3_1cccckajqy8vw.R.inc(458);TableCell<GameResult, Duration> cell = new TableCell<GameResult, Duration>() {

                @Override
                protected void updateItem(Duration item, boolean empty) {try{__CLR4_3_1cccckajqy8vw.R.inc(459);
                    __CLR4_3_1cccckajqy8vw.R.inc(460);super.updateItem(item, empty);
                    __CLR4_3_1cccckajqy8vw.R.inc(461);if((((empty)&&(__CLR4_3_1cccckajqy8vw.R.iget(462)!=0|true))||(__CLR4_3_1cccckajqy8vw.R.iget(463)==0&false))) {{
                        __CLR4_3_1cccckajqy8vw.R.inc(464);setText(null);
                    }
                    }else {{
                        __CLR4_3_1cccckajqy8vw.R.inc(465);setText(DurationFormatUtils.formatDuration(item.toMillis(),"H:mm:ss"));
                    }
                }}finally{__CLR4_3_1cccckajqy8vw.R.flushNeeded();}}
            };

            __CLR4_3_1cccckajqy8vw.R.inc(466);return cell;
        });

        __CLR4_3_1cccckajqy8vw.R.inc(467);created.setCellFactory(column -> {
            __CLR4_3_1cccckajqy8vw.R.inc(468);TableCell<GameResult, ZonedDateTime> cell = new TableCell<GameResult, ZonedDateTime>() {
                private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss Z");

                @Override
                protected void updateItem(ZonedDateTime item, boolean empty) {try{__CLR4_3_1cccckajqy8vw.R.inc(469);
                    __CLR4_3_1cccckajqy8vw.R.inc(470);super.updateItem(item, empty);
                    __CLR4_3_1cccckajqy8vw.R.inc(471);if((((empty)&&(__CLR4_3_1cccckajqy8vw.R.iget(472)!=0|true))||(__CLR4_3_1cccckajqy8vw.R.iget(473)==0&false))) {{
                        __CLR4_3_1cccckajqy8vw.R.inc(474);setText(null);
                    }
                    }else {{
                        __CLR4_3_1cccckajqy8vw.R.inc(475);setText(item.format(formatter));
                    }
                }}finally{__CLR4_3_1cccckajqy8vw.R.flushNeeded();}}
            };

            __CLR4_3_1cccckajqy8vw.R.inc(476);return cell;
        });

        __CLR4_3_1cccckajqy8vw.R.inc(477);ObservableList<GameResult> observableResult = FXCollections.observableArrayList();
        __CLR4_3_1cccckajqy8vw.R.inc(478);observableResult.addAll(toptenList);

        __CLR4_3_1cccckajqy8vw.R.inc(479);toptenTable.setItems(observableResult);
    }finally{__CLR4_3_1cccckajqy8vw.R.flushNeeded();}}

}
