


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class NewStageFinale {
    
    
    
    public Label albl1;
    public Label albl1_1;
    public Label albl1_2;
    public Label albl2;
    public Label albl2_1;
    public Label albl2_2;
    
    public Label albl3;
    public Label albl3_1;
    public Label albl3_2;
    public Label albl4;
    public Label albl4_1;
    
    
    public Label albl5;
    public Label albl5_1;
    public Label albl5_2;
    public Label albl6;
    public Label albl6_1;
    public Label alblq1;
    public Label alblq2;
    public Label alblq3;
    //private
    public Label lblNpaese1;
    public Label lblNpaese2;

    private Label classifica;
    
    Paese p1;
    Paese p2;

    
    public Label lblPrimoIncontro;
    public Label lblSecondoIncontro;
   
  
    HBox hb1;
    HBox hb2;
   
    
    public Label lblPP1;
    public Label lblPP2;

    public Paese pA;
    public Paese pB;

    ArrayList<Paese> gironeFinaleWin;
    
    static Stage finestra7;
  
    public NewStageFinale() {
       
       finestra7 = new Stage();
        
       
        String teamA = NewStageSemifinale.gironeFinale.get(0).getNome();
        String teamB = NewStageSemifinale.gironeFinale.get(1).getNome();
       
        albl1 = new Label("--1° incontro");
        albl1_1 = new Label(teamA+" - "+teamB);
        lblPrimoIncontro = new Label("0-0");
       
        gironeFinaleWin = new ArrayList<Paese>();
        classifica = new Label ("CLASSIFICA");


        pA= NewStageSemifinale.gironeFinale.get(0); // squadra vincitrice delle prima riga del primo incontro
        pB= NewStageSemifinale.gironeFinale.get(1); // squadra vincitrice delle prima riga del secondo incontro
       
        //gironeFinale.clear();
        gironeFinaleWin.add(pA);
        gironeFinaleWin.add(pB);
        
       

       // Collections.sort(girone1); //  questo codice mi fa ordinare girone1 che è il mio array list!
        
        lblNpaese1 = new Label(gironeFinaleWin.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        lblNpaese2 = new Label(gironeFinaleWin.get(1).getNome());
       

        lblPP1 = new Label(gironeFinaleWin.get(0).getPunteggio()+ "");
        lblPP2 = new Label(gironeFinaleWin.get(1).getPunteggio()+ "");
       

        hb1 = new HBox();
        hb1.getChildren().add(lblNpaese1);
        hb1.getChildren().add(gironeFinaleWin.get(0).getBandieraa());
        
        hb2 = new HBox();
        hb2.getChildren().add(lblNpaese2);
        hb2.getChildren().add(gironeFinaleWin.get(1).getBandieraa());
        
      

        
   //griglia dove vengono aggiunti tutti i componenti 
       
        GridPane gp = new GridPane();
        
         
        gp.setPadding(new Insets (15,15,15,15));
        gp.setHgap(40);
   //gp.setStyle("-fx-border-color: blue;"); 
        gp.setGridLinesVisible(true); 
        gp.add(albl1, 0, 0);   //1° incontro
        gp.add(albl1_1, 0, 1);  //team
        gp.add(lblPrimoIncontro, 1, 1); //risultato
       
        gp.add(new Label(), 1, 8);
        gp.add(classifica, 1, 9);
        
    //aggiunta nome paese e bandiera
        gp.add(hb1, 0,10);
        gp.add(hb2, 0,11);
       
        

        //aggiunta punteggio
        gp.add(lblPP1, 1,10);
        gp.add(lblPP2, 1,11);
        

        
        
    
        
        
       // gp.getChildren().add(lbl);
        
        Scene scene = new Scene(gp, 300, 250);
        
        finestra7.setTitle("Finale");
        finestra7.setScene(scene);
        finestra7.setX(720);
        finestra7.setY(60);
        finestra7.setMinHeight(240);
        finestra7.setMinWidth(280);
        finestra7.show();
    
    }
   
   
    
      ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
   public void lanciaFinale(){
       
       int goalPaeseA = randInt(0, 2); //1° squadra vincintrice del prima riga primo  incontro 
       int goalPaeseB = randInt(0, 2);  //1° squadra vincintrice del prima riga secondo  incontro 
      
      
      
       
        lblPrimoIncontro.setText( goalPaeseA+ "-"+ goalPaeseB);
        
        
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
       //// FUNZIONE incontro USATA PER RISPARMIARE RIGHE E RIGHE DI CODICE!
        
         //NewStageQuarti.incontro(goalPaese1A, goalPaese2A, pA, pB, gironeSemifinale);
        
   }
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
       
  
    public static int randInt(int min,int max) { //funzione per generare un valore casuale tra 0 e 5
        return (min+ (int)(Math.random()* ((max-min)+1)));
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////
    ////////////////CLASSIFICA//////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////
    
    public void classifica () {
     
        
         //Collections.sort(gironeSemifinale); 
         //Collections.sort(gironeSemifinale); 
         
        lblPP1.setText(gironeFinaleWin.get(0).getPunteggio()+ " ");  // label per punteggi
        lblPP2.setText(gironeFinaleWin.get(1).getPunteggio()+ " ");
      
       lblNpaese1.setText(gironeFinaleWin.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        lblNpaese2.setText(gironeFinaleWin.get(1).getNome()); // label per nomi
      
        System.out.println(gironeFinaleWin.get(0).getNome()+""+gironeFinaleWin.get(0).getPunteggio());
         System.out.println(gironeFinaleWin.get(1).getNome()+""+gironeFinaleWin.get(1).getPunteggio());
          
           System.out.println("-------------------------------");
        
       
         hb1.getChildren().clear();
         hb1.getChildren().add(lblNpaese1);
         hb1.getChildren().add(gironeFinaleWin.get(0).getBandieraa());

        
          hb2.getChildren().clear();
          hb2.getChildren().add(lblNpaese2);
          hb2.getChildren().add(gironeFinaleWin.get(1).getBandieraa());
   
     }
    
  
}
