/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package controller;

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
import results.GameResult;
import results.GameResultDao;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

@Slf4j
public class GameController {public static class __CLR4_3_100kajqy8tl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u006b\u0069\u0072\u006c\u006f\u0073\u0079\u006f\u0075\u0073\u0065\u0066\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u0046\u0069\u006e\u0061\u006c\u002d\u0041\u0073\u0073\u0069\u0067\u006e\u006d\u0065\u006e\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590245230253L,8589935092L,433,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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


    public void initdata(String PL1, String PL2) {try{__CLR4_3_100kajqy8tl.R.inc(0);
        __CLR4_3_100kajqy8tl.R.inc(1);this.PL1 = PL1;
        __CLR4_3_100kajqy8tl.R.inc(2);this.PL2 = PL2;
        __CLR4_3_100kajqy8tl.R.inc(3);playerName.setText("Player 1: " + this.PL1);
        __CLR4_3_100kajqy8tl.R.inc(4);playerName1.setText("Player 2: " + this.PL2);

    }finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}

    public boolean isSolved(){try{__CLR4_3_100kajqy8tl.R.inc(5);
        __CLR4_3_100kajqy8tl.R.inc(6);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(7)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(8)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(9);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(10)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(11)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
            __CLR4_3_100kajqy8tl.R.inc(12);playerWon = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(13)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(14)==0&false))? PL1 : PL2;
            __CLR4_3_100kajqy8tl.R.inc(15);winnerName.setText(winner);
            __CLR4_3_100kajqy8tl.R.inc(16);return true;
        }
        }__CLR4_3_100kajqy8tl.R.inc(17);return false;
    }finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}};

    public void turnTails1(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(18);
        __CLR4_3_100kajqy8tl.R.inc(19);if ((((headsTails1==0)&&(__CLR4_3_100kajqy8tl.R.iget(20)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(21)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(22);coin1.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(23);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(24);headsTails1 = 1;
            __CLR4_3_100kajqy8tl.R.inc(25);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(26);isSolved();
            __CLR4_3_100kajqy8tl.R.inc(27);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(28);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(29)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(30)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(31);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(32);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(33);coin1.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(34);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(35);headsTails1 = 0;
            __CLR4_3_100kajqy8tl.R.inc(36);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(37);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(38)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(39)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(40);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(41)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(42)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(43);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(44);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(45);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(46)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(47)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(48);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(49);numSteps = 0;
            }
        }}

    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}

    public void turnTails2(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(50);
        __CLR4_3_100kajqy8tl.R.inc(51);if ((((headsTails2==0)&&(__CLR4_3_100kajqy8tl.R.iget(52)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(53)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(54);coin2.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(55);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(56);headsTails2 = 1;
            __CLR4_3_100kajqy8tl.R.inc(57);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(58);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(59)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(60)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(61);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(62)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(63)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(64);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(65);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(66);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(67)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(68)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(69);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(70);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(71);coin2.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(72);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(73);headsTails2 = 0;
            __CLR4_3_100kajqy8tl.R.inc(74);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(75);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(76)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(77)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(78);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(79)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(80)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(81);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(82);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(83);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(84)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(85)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(86);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(87);numSteps = 0;
            }
        }}

    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}
    public void turnTails3(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(88);
        __CLR4_3_100kajqy8tl.R.inc(89);if ((((headsTails3==0)&&(__CLR4_3_100kajqy8tl.R.iget(90)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(91)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(92);coin3.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(93);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(94);headsTails3 = 1;
            __CLR4_3_100kajqy8tl.R.inc(95);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(96);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(97)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(98)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(99);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(100)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(101)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(102);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(103);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(104);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(105)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(106)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(107);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(108);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(109);coin3.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(110);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(111);headsTails3 = 0;
            __CLR4_3_100kajqy8tl.R.inc(112);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(113);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(114)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(115)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(116);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(117)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(118)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(119);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(120);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(121);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(122)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(123)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(124);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(125);numSteps = 0;
            }
        }}
    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}
    public void turnTails4(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(126);
        __CLR4_3_100kajqy8tl.R.inc(127);if ((((headsTails4==0)&&(__CLR4_3_100kajqy8tl.R.iget(128)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(129)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(130);coin4.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(131);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(132);headsTails4 = 1;
            __CLR4_3_100kajqy8tl.R.inc(133);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(134);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(135)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(136)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(137);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(138)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(139)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(140);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(141);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(142);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(143)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(144)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(145);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(146);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(147);coin4.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(148);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(149);headsTails4 = 0;
            __CLR4_3_100kajqy8tl.R.inc(150);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(151);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(152)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(153)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(154);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(155)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(156)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(157);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(158);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(159);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(160)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(161)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(162);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(163);numSteps = 0;
            }
        }}
    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}
    public void turnTails5(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(164);
        __CLR4_3_100kajqy8tl.R.inc(165);if ((((headsTails5==0)&&(__CLR4_3_100kajqy8tl.R.iget(166)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(167)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(168);coin5.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(169);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(170);headsTails5 = 1;
            __CLR4_3_100kajqy8tl.R.inc(171);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(172);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(173)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(174)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(175);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(176)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(177)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(178);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(179);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(180);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(181)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(182)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(183);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(184);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(185);coin5.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(186);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(187);headsTails5 = 0;
            __CLR4_3_100kajqy8tl.R.inc(188);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(189);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(190)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(191)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(192);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(193)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(194)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(195);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(196);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(197);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(198)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(199)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(200);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(201);numSteps = 0;
            }
        }}
    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}
    public void turnTails6(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(202);
        __CLR4_3_100kajqy8tl.R.inc(203);if ((((headsTails6==0)&&(__CLR4_3_100kajqy8tl.R.iget(204)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(205)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(206);coin6.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(207);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(208);headsTails6 = 1;
            __CLR4_3_100kajqy8tl.R.inc(209);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(210);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(211)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(212)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(213);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(214)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(215)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(216);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(217);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(218);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(219)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(220)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(221);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(222);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(223);coin6.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(224);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(225);headsTails6 = 0;
            __CLR4_3_100kajqy8tl.R.inc(226);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(227);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(228)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(229)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(230);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(231)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(232)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(233);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(234);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(235);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(236)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(237)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(238);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(239);numSteps = 0;
            }
        }}
    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}
    public void turnTails7(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(240);
        __CLR4_3_100kajqy8tl.R.inc(241);if ((((headsTails7==0)&&(__CLR4_3_100kajqy8tl.R.iget(242)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(243)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(244);coin7.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(245);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(246);headsTails7 = 1;
            __CLR4_3_100kajqy8tl.R.inc(247);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(248);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(249)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(250)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(251);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(252)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(253)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(254);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(255);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(256);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(257)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(258)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(259);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(260);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(261);coin7.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(262);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(263);headsTails7 = 0;
            __CLR4_3_100kajqy8tl.R.inc(264);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(265);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(266)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(267)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(268);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(269)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(270)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(271);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(272);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(273);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(274)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(275)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(276);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(277);numSteps = 0;
            }
        }}
    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}
    public void turnTails8(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(278);
        __CLR4_3_100kajqy8tl.R.inc(279);if ((((headsTails8==0)&&(__CLR4_3_100kajqy8tl.R.iget(280)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(281)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(282);coin8.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(283);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(284);headsTails8 = 1;
            __CLR4_3_100kajqy8tl.R.inc(285);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(286);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(287)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(288)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(289);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(290)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(291)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(292);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(293);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(294);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(295)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(296)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(297);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(298);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(299);coin8.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(300);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(301);headsTails8 = 0;
            __CLR4_3_100kajqy8tl.R.inc(302);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(303);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(304)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(305)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(306);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(307)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(308)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(309);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(310);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(311);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(312)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(313)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(314);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(315);numSteps = 0;
            }
        }}
    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}
    public void turnTails9(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(316);
        __CLR4_3_100kajqy8tl.R.inc(317);if ((((headsTails9==0)&&(__CLR4_3_100kajqy8tl.R.iget(318)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(319)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(320);coin9.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(321);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(322);headsTails9 = 1;
            __CLR4_3_100kajqy8tl.R.inc(323);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(324);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(325)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(326)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(327);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(328)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(329)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(330);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(331);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(332);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(333)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(334)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(335);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(336);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(337);coin9.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(338);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(339);headsTails9 = 0;
            __CLR4_3_100kajqy8tl.R.inc(340);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(341);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(342)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(343)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(344);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(345)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(346)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(347);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(348);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(349);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(350)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(351)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(352);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(353);numSteps = 0;
            }
        }}
    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}
    public void turnTails10(MouseEvent mouseEvent) {try{__CLR4_3_100kajqy8tl.R.inc(354);
        __CLR4_3_100kajqy8tl.R.inc(355);if ((((headsTails10==0)&&(__CLR4_3_100kajqy8tl.R.iget(356)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(357)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(358);coin10.setImage(image);
            __CLR4_3_100kajqy8tl.R.inc(359);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(360);headsTails10 = 1;
            __CLR4_3_100kajqy8tl.R.inc(361);winnerNum = winnerNum + 1;
            __CLR4_3_100kajqy8tl.R.inc(362);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(363)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(364)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(365);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(366)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(367)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(368);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(369);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(370);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(371)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(372)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(373);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(374);numSteps = 0;
            }
        }}
        }else{{
            __CLR4_3_100kajqy8tl.R.inc(375);coin10.setImage(image1);
            __CLR4_3_100kajqy8tl.R.inc(376);stepNumber();
            __CLR4_3_100kajqy8tl.R.inc(377);headsTails10 = 0;
            __CLR4_3_100kajqy8tl.R.inc(378);winnerNum = winnerNum - 1;
            __CLR4_3_100kajqy8tl.R.inc(379);if ((((winnerNum == 10)&&(__CLR4_3_100kajqy8tl.R.iget(380)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(381)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(382);winner = (((Player1Turn.getOpacity() == 1 )&&(__CLR4_3_100kajqy8tl.R.iget(383)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(384)==0&false))? "Winner is " + PL1 : "Winner is " + PL2;
                __CLR4_3_100kajqy8tl.R.inc(385);winnerName.setText(winner);
            }
            }__CLR4_3_100kajqy8tl.R.inc(386);numSteps = numSteps + 1;
            __CLR4_3_100kajqy8tl.R.inc(387);if ((((numSteps == 3)&&(__CLR4_3_100kajqy8tl.R.iget(388)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(389)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(390);switchPlayerTurn();
                __CLR4_3_100kajqy8tl.R.inc(391);numSteps = 0;
            }
        }}

    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}

    /**
     * Switches player turns based on a blue circle which will appear at the top next to the names.
     */
    private void switchPlayerTurn() {try{__CLR4_3_100kajqy8tl.R.inc(392);
            __CLR4_3_100kajqy8tl.R.inc(393);if ((((Player1Turn.getOpacity() == 1)&&(__CLR4_3_100kajqy8tl.R.iget(394)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(395)==0&false))) {{
                __CLR4_3_100kajqy8tl.R.inc(396);Player1Turn.setOpacity(0);
                __CLR4_3_100kajqy8tl.R.inc(397);Player2Turn.setOpacity(1);
            } }else {{
                __CLR4_3_100kajqy8tl.R.inc(398);Player1Turn.setOpacity(1);
                __CLR4_3_100kajqy8tl.R.inc(399);Player2Turn.setOpacity(0);
            }
    }}finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}

    @FXML
    public void initialize(){try{__CLR4_3_100kajqy8tl.R.inc(400);
        __CLR4_3_100kajqy8tl.R.inc(401);numSteps=0;

        __CLR4_3_100kajqy8tl.R.inc(402);winnerNum=0;

        __CLR4_3_100kajqy8tl.R.inc(403);countNum=0;

        __CLR4_3_100kajqy8tl.R.inc(404);Player1Turn.setOpacity(1);
        __CLR4_3_100kajqy8tl.R.inc(405);Player2Turn.setOpacity(0);
        __CLR4_3_100kajqy8tl.R.inc(406);beginGame = Instant.now();

        __CLR4_3_100kajqy8tl.R.inc(407);headsTails1=0;
        __CLR4_3_100kajqy8tl.R.inc(408);headsTails2=0;
        __CLR4_3_100kajqy8tl.R.inc(409);headsTails3=0;
        __CLR4_3_100kajqy8tl.R.inc(410);headsTails4=0;
        __CLR4_3_100kajqy8tl.R.inc(411);headsTails5=0;
        __CLR4_3_100kajqy8tl.R.inc(412);headsTails6=0;
        __CLR4_3_100kajqy8tl.R.inc(413);headsTails7=0;
        __CLR4_3_100kajqy8tl.R.inc(414);headsTails8=0;
        __CLR4_3_100kajqy8tl.R.inc(415);headsTails9=0;
        __CLR4_3_100kajqy8tl.R.inc(416);headsTails10=0;

    }finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}

    private void stepNumber(){try{__CLR4_3_100kajqy8tl.R.inc(417);
        __CLR4_3_100kajqy8tl.R.inc(418);countNum++;
        __CLR4_3_100kajqy8tl.R.inc(419);stepCount.setText(String.valueOf(countNum));
    }finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}

    private GameResult getResult() {try{__CLR4_3_100kajqy8tl.R.inc(420);

        __CLR4_3_100kajqy8tl.R.inc(421);GameResult result = GameResult.builder()
                .player(playerWon)
                .solved(isSolved())
                .duration(Duration.between(beginGame, Instant.now()))
                .steps(countNum)
                .build();
        __CLR4_3_100kajqy8tl.R.inc(422);return result;
    }finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}


    public void finishGame(ActionEvent actionEvent) throws IOException {try{__CLR4_3_100kajqy8tl.R.inc(423);
        __CLR4_3_100kajqy8tl.R.inc(424);if ((((isSolved())&&(__CLR4_3_100kajqy8tl.R.iget(425)!=0|true))||(__CLR4_3_100kajqy8tl.R.iget(426)==0&false))) {{
            __CLR4_3_100kajqy8tl.R.inc(427);System.out.println(getResult());
//            gameResultDao.persist(getResult());
        }

        }__CLR4_3_100kajqy8tl.R.inc(428);Parent root = FXMLLoader.load(getClass().getResource("/fxml/topFive.fxml"));
        __CLR4_3_100kajqy8tl.R.inc(429);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_3_100kajqy8tl.R.inc(430);stage.setScene(new Scene(root));
        __CLR4_3_100kajqy8tl.R.inc(431);stage.show();
        __CLR4_3_100kajqy8tl.R.inc(432);log.info("Finished game, loading Top Ten scene.");
    }finally{__CLR4_3_100kajqy8tl.R.flushNeeded();}}

}

