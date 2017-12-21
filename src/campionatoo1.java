import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.stage.WindowEvent;

/**
 *
 * @author Simone.Pontalti
 */
public class campionatoo1 extends Application {
Stage tabella_1 = null;
    
    @Override
    public void start(Stage finestra1) {
       
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        //LANCIO ALTRE FINESTRE ALL'AVVIO
        ////////////////////////////////////////////////////////////////////////
        
        NewStageA b = new NewStageA();
        NewStageB c = new NewStageB();
        NewStageC d = new NewStageC();
        NewStageD e = new NewStageD();
        ////////////////////////////////////////////////////////////////////////
        
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        
        Button btn0 = new Button();
        btn0.setText("1a giornata");
        btn0.setOnAction(new EventHandler<ActionEvent>() {
        @Override
            public void handle(ActionEvent event) {
                
                
                b.lanciaPrimaGiornata();
                b.classifica();
                
                
                c.lanciaPrimaGiornata();
                c.classifica();
                
                d.lanciaPrimaGiornata();
                d.classifica();
                
                e.lanciaPrimaGiornata();
                e.classifica();

                btn0.setDisable(true);
                btn1.setDisable(false);
            }
        });
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        btn1.setText("2a giornata");
        btn1.setDisable(true);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                b.lanciaSecondaGiornata();
                b.classifica();
                
                c.lanciaSecondaGiornata();
                c.classifica();
                
                d.lanciaSecondaGiornata();
                d.classifica();
                
                e.lanciaSecondaGiornata();
                e.classifica();
                
                
                btn1.setDisable(true);
                btn2.setDisable(false);
            }
        });
         ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        
        btn2.setText("3a giornata");
        btn2.setDisable(true);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               
               b.lanciaTerzaGiornata();
               b.classifica();
               
               c.lanciaTerzaGiornata();
               c.classifica();
               
               d.lanciaTerzaGiornata();
               d.classifica();
               
               e.lanciaTerzaGiornata();
               e.classifica();
               
               btn2.setDisable(true);
               btn3.setDisable(false);
            }
        });
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
       
        btn3.setText("Quarti");
        btn3.setDisable(true);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
               NewStageA.finestra2.close();
               NewStageB.finestra3.close();
               NewStageC.finestra4.close();
               NewStageD.finestra5.close();
               
               NewStageQuarti quarti = new NewStageQuarti();
               
               quarti.lanciaQuartidiFinale();
               quarti.classifica();
               btn3.setDisable(true);
               btn4.setDisable(false);

            }
        });
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
       
        btn4.setText("Semifinale");
        btn4.setDisable(true);
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
               NewStageQuarti.finestra6.close();
               
               NewStageSemifinale semifinale = new NewStageSemifinale();
               
               semifinale.lanciaSemifinale();
               semifinale.classifica();
                
               btn4.setDisable(true);
               btn5.setDisable(false);
            }
        });
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        btn5.setText("Finale");
        btn5.setDisable(true);
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                 NewStageSemifinale.finestra6.close();
                 
                 NewStageFinale finale = new NewStageFinale();
                
                 finale.lanciaFinale();
                 finale.classifica();
                  
                 btn5.setDisable(true);
            }
        });
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        HBox hb1 = new HBox(10);
        
        //CREAZIONE CERCHIO
        Circle circle = new Circle();
        circle.setFill(Color.RED);
        circle.setCenterX(10.0f);
        circle.setCenterY(10.0f);
        circle.setRadius(10.0f);
        
        Path path = new Path();
        
        path.getElements().add(new MoveTo(30.0f, 30.0f));
        path.getElements().add(new HLineTo(300.0f));
        
        PathTransition ptransition = new PathTransition();
        ptransition.setDuration(Duration.seconds(2.0));
        
        ptransition.setPath(path);
        ptransition.setNode(circle);
        ptransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        ptransition.setCycleCount(Timeline.INDEFINITE);
        ptransition.setAutoReverse(true);
        ptransition.play();
        
        hb1.getChildren().add(circle);
                
        GridPane gp = new GridPane();
        gp.setPadding(new Insets (15,15,15,15));
        gp.setHgap(40);
        gp.setVgap(40);
        gp.add(btn0, 0, 0);  
        gp.add(btn1, 1,0);  
        gp.add(btn2, 2, 0);  
        gp.add(btn3, 0, 1);
        gp.add(btn4, 1, 1);
        gp.add(btn5, 2, 1);
        
        VBox vb1 = new VBox (100);
        vb1.getChildren().addAll(hb1,gp);
        
        
        Scene scene = new Scene(vb1, 300, 250);
        
        finestra1.setTitle("CAMPIONATO");
        finestra1.setScene(scene);
        finestra1.setX(700);
        finestra1.setY(600);
        finestra1.setWidth(400);
        finestra1.setHeight(300);
        finestra1.show();

        ////////////////////////////////////////////////////////////////////////
         //////////// Per chiudere la finestra!
         
        finestra1.setOnCloseRequest((new EventHandler<WindowEvent>(){

        @Override
        public void handle(WindowEvent arg0) {
            Platform.exit();
        }
        }));
    
        ///////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        StackPane root = new StackPane();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
        
    }
}