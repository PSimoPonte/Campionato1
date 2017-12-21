


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



public class NewStageSemifinale {
    
    
    
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
    public Label lblNpaese3;
    public Label lblNpaese4;

    
    private Label classifica;
    
    Paese p1;
    Paese p2;
    Paese p3;
    Paese p4;

    
    public Label lblPrimoIncontro;
    public Label lblSecondoIncontro;
    public Label lblTerzoIncontro;
    public Label lblQuartoIncontro;
    
    ArrayList<Paese> gironeSemifinale; // per salvare le 4 squadre arrivate alla semi-finale
    static ArrayList<Paese> gironeFinale ;  // per salvare in questo contenitore le squadre vincitrice della semi-finale.
                                     //
    HBox hb1;
    HBox hb2;
    HBox hb3;
    HBox hb4;
    

    
    public Label lblPP1;
    public Label lblPP2;
    public Label lblPP3;
    public Label lblPP4;

    public Paese p1A;
    public Paese p2A;
    public Paese p1B;
    public Paese p2B;
    
    static Stage finestra6;
  
    public NewStageSemifinale() {
       
        finestra6 = new Stage();
        
       
        String team1A = NewStageQuarti.vincentiQuarti1riga.get(0).getNome();
        String team2A = NewStageQuarti.vincentiQuarti1riga.get(1).getNome();
        
        String team1B = NewStageQuarti.vincentiQuarti2riga.get(0).getNome();
        String team2B = NewStageQuarti.vincentiQuarti2riga.get(1).getNome();
       
        /*
        String team1C = NewStageC.girone3.get(0).getNome();
        String team2C = NewStageC.girone3.get(1).getNome();
        
        String team1D = NewStageD.girone4.get(0).getNome();
        String team2D = NewStageD.girone4.get(1).getNome();
       */
       
        albl1 = new Label("--1° incontro");
        albl1_1 = new Label(team1A+" - "+team2B);
        lblPrimoIncontro = new Label("0-0");
       
        //albl2_1 = new Label(team3+" - "+team4);
        //albl2_2 = new Label("0-0");
        
        albl3 = new Label("--2° incontro");
        albl3_1 = new Label(team2A+" - "+team1B);
        lblSecondoIncontro = new Label("0-0");
        
        //albl4 = new Label (team6+" - "+team7);
        //albl4_1 = new Label ("0-0");
      
        /*
        
        albl5 = new Label("--3° incontro");
        albl5_1 = new Label(team1C+" - "+team2D);
        lblTerzoIncontro = new Label("0-0");
       
        
        //albl6 = new Label ("Francia - Germania");
        //albl6_1 = new Label ("0-0");
        
        alblq1 = new Label("--4° incontro");
        alblq2 = new Label(team2C+" - "+team1D);
        lblQuartoIncontro = new Label("0-0");
      */ 
        
        classifica = new Label ("CLASSIFICA");

        gironeSemifinale = new ArrayList<Paese>();
        gironeFinale = new ArrayList<Paese>();

        p1A= NewStageQuarti.vincentiQuarti1riga.get(0); // squadra vincitrice delle prima riga del primo incontro
        p2A= NewStageQuarti.vincentiQuarti1riga.get(1); // squadra vincitrice delle prima riga del secondo incontro
        
        p1B= NewStageQuarti.vincentiQuarti2riga.get(0);// squadra vincitrice delle seconda riga del terzo  incontro
        p2B= NewStageQuarti.vincentiQuarti2riga.get(1);// squadra vincitrice delle seconda riga del quarto incontro

        gironeSemifinale.add(p1A);
        gironeSemifinale.add(p2A);
        
        gironeSemifinale.add(p1B);
        gironeSemifinale.add(p2B);


       // Collections.sort(girone1); //  questo codice mi fa ordinare girone1 che è il mio array list!
        
        lblNpaese1 = new Label(gironeSemifinale.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        lblNpaese2 = new Label(gironeSemifinale.get(1).getNome());
        lblNpaese3 = new Label(gironeSemifinale.get(2).getNome());
        lblNpaese4 = new Label(gironeSemifinale.get(3).getNome());


        lblPP1 = new Label(gironeSemifinale.get(0).getPunteggio()+ "");
        lblPP2 = new Label(gironeSemifinale.get(1).getPunteggio()+ "");
        lblPP3 = new Label(gironeSemifinale.get(2).getPunteggio()+ "");
        lblPP4 = new Label(gironeSemifinale.get(3).getPunteggio()+ "");

        hb1 = new HBox();
        hb1.getChildren().add(lblNpaese1);
        hb1.getChildren().add(gironeSemifinale.get(0).getBandieraa());
        
        hb2 = new HBox();
        hb2.getChildren().add(lblNpaese2);
        hb2.getChildren().add(gironeSemifinale.get(1).getBandieraa());
        
        hb3 = new HBox();
        hb3.getChildren().add(lblNpaese3);
        hb3.getChildren().add(gironeSemifinale.get(2).getBandieraa());
        
        hb4 = new HBox();
        hb4.getChildren().add(lblNpaese4);
        hb4.getChildren().add(gironeSemifinale.get(3).getBandieraa());

        
   //griglia dove vengono aggiunti tutti i componenti 
        
        GridPane gp = new GridPane();
        gp.setPadding(new Insets (15,15,15,15));
        gp.setHgap(40);
   //gp.setStyle("-fx-border-color: blue;"); 
        gp.setGridLinesVisible(true); 
        gp.add(albl1, 0, 0);   //1° incontro
        gp.add(albl1_1, 0, 1);  //team
        gp.add(lblPrimoIncontro, 1, 1); //risultato
        gp.add(albl3, 0, 2); // 2°incontro
        gp.add(albl3_1, 0, 3); //team
        gp.add(lblSecondoIncontro, 1, 3); //risultato
    //gp.add(albl5, 0, 4); // 3°incontro
    //gp.add(albl5_1, 0, 5); //team
    //  gp.add(lblTerzoIncontro, 1, 5); //risultato
    //  gp.add(alblq1, 0, 6); // 4°incontro
    //gp.add(alblq2, 0, 7); //team
    //  gp.add(lblQuartoIncontro, 1, 7); //risultato
        gp.add(new Label(), 1, 8);
        gp.add(classifica, 1, 9);
        
    //aggiunta nome paese e bandiera
        gp.add(hb1, 0,10);
        gp.add(hb2, 0,11);
        gp.add(hb3, 0,12);
        gp.add(hb4, 0,13);

        //aggiunta punteggio
        gp.add(lblPP1, 1,10);
        gp.add(lblPP2, 1,11);
        gp.add(lblPP3, 1,12);
        gp.add(lblPP4, 1,13);

        
        
    
        
        
       // gp.getChildren().add(lbl);
        
        Scene scene = new Scene(gp, 300, 250);
        
        finestra6.setTitle("Semifinale");
        finestra6.setScene(scene);
        finestra6.setX(720);
        finestra6.setY(60);
        finestra6.setMinHeight(300);
        finestra6.setMinWidth(350);
        finestra6.show();
    
    }
   
   
    
      ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
   public void lanciaSemifinale(){
       
       int goalPaese1A = randInt(0, 2); //1° squadra vincintrice del prima riga primo  incontro 
       int goalPaese2A = randInt(0, 2);  //1° squadra vincintrice del prima riga secondo  incontro 
       
       int goalPaese1B = randInt(0, 2); //1° squadra vincintrice del seconda riga terzo  incontro 
       int goalPaese2B = randInt(0, 2); //1° squadra vincintrice del seconda riga quarto  incontro 
       
      
      
       
        lblPrimoIncontro.setText( goalPaese1A+ "-"+ goalPaese2A);
        lblSecondoIncontro.setText(goalPaese1B+ "-"+ goalPaese2B);
        
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
       //// FUNZIONE incontro USATA PER RISPARMIARE RIGHE E RIGHE DI CODICE!
        
         NewStageQuarti.incontro(goalPaese1A, goalPaese2A, p1A, p2A, gironeFinale);
         NewStageQuarti.incontro(goalPaese1B, goalPaese2B, p1B, p2B, gironeFinale);

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
         
        lblPP1.setText(gironeSemifinale.get(0).getPunteggio()+ " ");  // label per punteggi
        lblPP2.setText(gironeSemifinale.get(1).getPunteggio()+ " ");
        lblPP3.setText(gironeSemifinale.get(2).getPunteggio()+ " ");
        lblPP4.setText(gironeSemifinale.get(3).getPunteggio()+ " "); 
        
       lblNpaese1.setText(gironeSemifinale.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        lblNpaese2.setText(gironeSemifinale.get(1).getNome()); // label per nomi
        lblNpaese3.setText(gironeSemifinale.get(2).getNome());
        lblNpaese4.setText(gironeSemifinale.get(3).getNome());
       
        System.out.println(gironeSemifinale.get(0).getNome()+""+gironeSemifinale.get(0).getPunteggio());
         System.out.println(gironeSemifinale.get(1).getNome()+""+gironeSemifinale.get(1).getPunteggio());
          System.out.println(gironeSemifinale.get(2).getNome()+""+gironeSemifinale.get(2).getPunteggio());
           System.out.println(gironeSemifinale.get(3).getNome()+"  "+gironeSemifinale.get(3).getPunteggio());
           System.out.println("-------------------------------");
        
       
         hb1.getChildren().clear();
         hb1.getChildren().add(lblNpaese1);
         hb1.getChildren().add(gironeSemifinale.get(0).getBandieraa());

        
          hb2.getChildren().clear();
          hb2.getChildren().add(lblNpaese2);
          hb2.getChildren().add(gironeSemifinale.get(1).getBandieraa());
        
        
           hb3.getChildren().clear();
           hb3.getChildren().add(lblNpaese3);
           hb3.getChildren().add(gironeSemifinale.get(2).getBandieraa());
        
       
          hb4.getChildren().clear();
          hb4.getChildren().add(lblNpaese4);
          hb4.getChildren().add(gironeSemifinale.get(3).getBandieraa());
    
     }
    
  
}
