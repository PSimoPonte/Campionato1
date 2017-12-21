

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



public class NewStageA extends Stage {
    
    
    
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
    //private
    public Label paese1;
    public Label paese2;
    public Label paese3;
    public Label paese4;
    
    private Label classifica;
    
    Paese p1;
    Paese p2;
    Paese p3;
    Paese p4;
    
    public Label albl7;
    public Label albl8;
    public Label albl9;
    public Label albl10;
    
    static ArrayList<Paese> girone1;
    
    HBox hb1;
    HBox hb2;
    HBox hb3;
    HBox hb4;
    
   static Stage finestra2=null;

    public NewStageA() {
       
        finestra2 = new Stage();
        
        albl1 = new Label("--1° giornata");
        albl1_1 = new Label("Italia - Germania");
        albl1_2 = new Label("0-0");
        albl2_1 = new Label("Francia - Austria");
        albl2_2 = new Label("0-0");
        
        albl3 = new Label("--2° giornata");
        albl3_1 = new Label("Italia - Francia");
        albl3_2 = new Label("0-0");
        albl4 = new Label ("Germania - Austria");
        albl4_1 = new Label ("0-0");
        
        albl5 = new Label("--3° giornata");
        albl5_1 = new Label("Italia - Austria");
        albl5_2 = new Label("0-0");
        albl6 = new Label ("Francia - Germania");
        albl6_1 = new Label ("0-0");
        
        classifica = new Label ("CLASSIFICA");
        
       
        
      
        
        Bandiera3fasce B_austria = new Bandiera3fasce("verticale");
        B_austria.disegna(Color.RED, Color.WHITE, Color.RED);
        
        Bandiera3fasce B_francia = new Bandiera3fasce("orizzontale");
        B_francia.disegna(Color.BLUE, Color.WHITE, Color.RED);
        
        Bandiera3fasce B_italia = new Bandiera3fasce("orizzontale");
        B_italia.disegna(Color.GREEN, Color.WHITE, Color.RED);
        
        Bandiera3fasce B_germania = new Bandiera3fasce("verticale");
        B_germania.disegna(Color.RED, Color.YELLOW, Color.BLACK);
        
        p1 = new Paese("Italia", 0, B_italia );
        p2 = new Paese("Germania", 0, B_germania );

        p3 = new Paese("Francia", 0, B_francia );
        p4 = new Paese("Austria", 0, B_austria );
       

        girone1 = new ArrayList<Paese>();
        
        girone1.add(p1);
        girone1.add(p2);
        girone1.add(p3);
        girone1.add(p4);

       // Collections.sort(girone1); //  questo codice mi fa ordinare girone1 che è il mio array list!
        
        paese1 = new Label(girone1.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        paese2 = new Label(girone1.get(1).getNome());
        paese3 = new Label(girone1.get(2).getNome());
        paese4 = new Label(girone1.get(3).getNome());
        
        albl7 = new Label(girone1.get(0).getPunteggio()+ "");
        albl8 = new Label(girone1.get(1).getPunteggio()+ "");
        albl9 = new Label(girone1.get(2).getPunteggio()+ "");
        albl10 = new Label(girone1.get(3).getPunteggio()+ "");
        
        hb1 = new HBox(25);
        hb1.getChildren().add(paese1);
        hb1.getChildren().add(girone1.get(0).getBandieraa());

        hb2 = new HBox(25);
        hb2.getChildren().add(paese2);
        hb2.getChildren().add(girone1.get(1).getBandieraa());
        
        hb3 = new HBox(40);
        hb3.getChildren().add(paese3);
        hb3.getChildren().add(girone1.get(2).getBandieraa());
        
        hb4 = new HBox(10);
        hb4.getChildren().add(paese4);
        hb4.getChildren().add(girone1.get(3).getBandieraa());
        
        
        
        
        
        GridPane gp = new GridPane();
        gp.setPadding(new Insets (15,15,15,15));
        gp.setHgap(40);
        //gp.setStyle("-fx-border-color: blue;"); 
        gp.setGridLinesVisible(true);
        gp.add(albl1, 0, 0);     //Label giornata
        gp.add(albl1_1, 0, 1);  //Label incontro
        gp.add(albl1_2, 1, 1);  //Label risultato
        gp.add(albl2_1, 0, 3);  //Label incontro
        gp.add(albl2_2, 1, 3 );  //Label risultato
        
        gp.add(albl3, 0, 4);     //Label giornata
        gp.add(albl3_1, 0, 5);  //Label incontro
        gp.add(albl3_2, 1, 5);  //Label risultato
        gp.add(albl4, 0, 6);  //Label incontro
        gp.add(albl4_1, 1, 6);  //Label risultato
        
        gp.add(albl5, 0, 7);     //Label giornata
        gp.add(albl5_1, 0, 8);  //Label incontro
        gp.add(albl5_2, 1, 8);  //Label risultato
        gp.add(albl6, 0, 9);  //Label incontro
        gp.add(albl6_1, 1, 9);  //Label risultato
        
        gp.add(new Label(), 1, 10);
        gp.add(classifica, 1, 11);
        
        gp.add(hb1, 0, 12);
        gp.add(hb2, 0, 13);
        gp.add(hb3, 0, 14);
        gp.add(hb4, 0, 15);
        gp.add(albl7, 1, 12);
        gp.add(albl8, 1, 13);
        gp.add(albl9, 1, 14); 
        gp.add(albl10, 1, 15);
        
        
   
        
       // gp.getChildren().add(lbl);
        
        Scene scene = new Scene(gp, 300, 250);
        
        finestra2.setTitle("Tabella campionato 1");
        finestra2.setScene(scene);
        finestra2.setX(20);
        finestra2.setY(60);
        finestra2.setMinHeight(400);
        finestra2.setMinWidth(400);
        finestra2.show();
    
    }
    
       // metodo per lanciare la prima giornata
   // ===========================================================================
    
    public void lanciaPrimaGiornata(){
        
       int goalPaeseA = randInt(0, 2); //italia
       int goalPaeseB = randInt(0, 2);  //germania
       int goalPaeseC = randInt(0, 2); //francia
       int goalPaeseD = randInt(0, 2); // austria
     
        
        albl1_2.setText( goalPaeseA+ "-"+ goalPaeseB);
        albl2_2.setText(goalPaeseC+ "-"+ goalPaeseD);
               
        // italia - germania
         if(goalPaeseA > goalPaeseB) {
             
             p1.setPunteggio( p1.getPunteggio()+3);
             p2.setPunteggio(p2.getPunteggio()+0);
             
         }
         else if(goalPaeseA < goalPaeseB) {
             
             p1.setPunteggio(p1.getPunteggio()+0);
             p2.setPunteggio(p2.getPunteggio()+3);
         }
         
         else if(goalPaeseA == goalPaeseB) {
             
             p1.setPunteggio(p1.getPunteggio()+1);
             p2.setPunteggio(p2.getPunteggio()+1);
             
         }
         
         // francia - austria
         if(goalPaeseC > goalPaeseD) {
             
             p3.setPunteggio(p3.getPunteggio()+3);
             p4.setPunteggio(p4.getPunteggio()+0);
             
         }
         else if(goalPaeseC < goalPaeseD) {
             
             p3.setPunteggio(p3.getPunteggio()+0);
             p4.setPunteggio(p4.getPunteggio()+3);
         }
         
         else if(goalPaeseC== goalPaeseD) {
             
             p3.setPunteggio(p3.getPunteggio()+1);
             p4.setPunteggio(p4.getPunteggio()+1);
             
         }
        
        
         
    
    }
    
    // metodo per lanciare la seconda giornata
   // ===========================================================================
    
     public void lanciaSecondaGiornata(){
        
       int goalPaeseA =  randInt(0, 2); //italia
       int goalPaeseB = randInt(0, 2);  //germania
       int goalPaeseC = randInt(0, 2); //francia
       int goalPaeseD = randInt(0, 2); // austria
     
        
        albl3_2.setText( goalPaeseA+ "-"+ goalPaeseC);
        albl4_1.setText(goalPaeseB+ "-"+ goalPaeseD);
               
        // italia - francia
         if(goalPaeseA > goalPaeseC) {
             
             p1.setPunteggio( p1.getPunteggio()+3);
             p3.setPunteggio(p3.getPunteggio()+0);
         
             
         }
         else if(goalPaeseA < goalPaeseC) {
             
             p1.setPunteggio(p1.getPunteggio()+0);
             p3.setPunteggio(p3.getPunteggio()+3);
         }
         
         else if(goalPaeseA == goalPaeseC) {
             
             p1.setPunteggio(p1.getPunteggio()+1);
             p3.setPunteggio(p3.getPunteggio()+1);
             
         }
         
         // germania - austria
         if(goalPaeseB > goalPaeseD) {
             
             p2.setPunteggio(p2.getPunteggio()+3);
             p4.setPunteggio(p4.getPunteggio()+0);
             
         }
         else if(goalPaeseB < goalPaeseD) {
             
             p2.setPunteggio(p2.getPunteggio()+0);
             p4.setPunteggio(p4.getPunteggio()+3);
         }
         
         else if(goalPaeseB== goalPaeseD) {
             
             p2.setPunteggio(p2.getPunteggio()+1);
             p4.setPunteggio(p4.getPunteggio()+1);
             
         }
        
        
         
    
    }
    
    
    // ===========================================================================
     
     
     // metodo per lanciare la terza giornata
   // ===========================================================================
    
     public void lanciaTerzaGiornata(){
        
       int goalPaeseA =  randInt(0, 2); //italia
       int goalPaeseB = randInt(0, 2);  //germania
       int goalPaeseC = randInt(0, 2); //francia
       int goalPaeseD = randInt(0, 2); // austria
     
        
        albl5_2.setText( goalPaeseA+ "-"+ goalPaeseD);
        albl6_1.setText(goalPaeseC+ "-"+ goalPaeseB);
               
        // italia - austria
         if(goalPaeseA > goalPaeseD) {
             
             p1.setPunteggio( p1.getPunteggio()+3);
             p4.setPunteggio(p4.getPunteggio()+0);
           //  System.out.println("Italia+3---Austria+0");
             
         }
         else if(goalPaeseA < goalPaeseD) {
             
             p1.setPunteggio(p1.getPunteggio()+0);
             p4.setPunteggio(p4.getPunteggio()+3);
            // System.out.println("Italia+0---Austria+3");
         }
         
         else if(goalPaeseA == goalPaeseD) {
             
             p1.setPunteggio(p1.getPunteggio()+1);
             p4.setPunteggio(p4.getPunteggio()+1);
           //  System.out.println("Italia+1---Austria+1");
         }
         
         // francia - germania
         if(goalPaeseC > goalPaeseB) {
             
             p3.setPunteggio(p3.getPunteggio()+3);
             p2.setPunteggio(p2.getPunteggio()+0);
           //  System.out.println("Francia+3---Germania+0");
             
         }
         else if(goalPaeseC < goalPaeseB) {
             
             p3.setPunteggio(p3.getPunteggio()+0);
             p2.setPunteggio(p2.getPunteggio()+3);
             System.out.println("Francia+0---Germania+3");
         }
         
         else if(goalPaeseC== goalPaeseB) {
             
             p3.setPunteggio(p3.getPunteggio()+1);
             p2.setPunteggio(p2.getPunteggio()+1);
             System.out.println("Francia+1---Germania+1");
             
         }
        
        
         
    
    }
    
    
    // ===========================================================================
    
     
     
     //###############################################################################################
     //##########FUNZIONE RANDOM#####################################################################
    //###############################################################################################
     
      public static int randInt(int min,int max) { //funzione per generare un valore casuale tra 0 e 5
        return (min+ (int)(Math.random()* ((max-min)+1)));
    }
      
      //###############################################################################################
      //###############################################################################################
           
      public void classifica () {
     
        Collections.sort(girone1); 
         
        albl7.setText(girone1.get(0).getPunteggio()+ " ");  // label per punteggi
        albl8.setText(girone1.get(1).getPunteggio()+ " ");
        albl9.setText(girone1.get(2).getPunteggio()+ " ");
        albl10.setText(girone1.get(3).getPunteggio()+ " "); 
        
        
        paese1.setText(girone1.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        paese2.setText(girone1.get(1).getNome()); // label per nomi
        paese3.setText(girone1.get(2).getNome());
        paese4.setText(girone1.get(3).getNome());
       
        System.out.println(girone1.get(0).getNome()+""+girone1.get(0).getPunteggio());
         System.out.println(girone1.get(1).getNome()+""+girone1.get(1).getPunteggio());
          System.out.println(girone1.get(2).getNome()+""+girone1.get(2).getPunteggio());
           System.out.println(girone1.get(3).getNome()+"  "+girone1.get(3).getPunteggio());
           System.out.println("-------------------------------");
        
        
       
         hb1.getChildren().clear();
         hb1.getChildren().add(paese1);
         hb1.getChildren().add(girone1.get(0).getBandieraa());

        
          hb2.getChildren().clear();
          hb2.getChildren().add(paese2);
          hb2.getChildren().add(girone1.get(1).getBandieraa());
        
        
           hb3.getChildren().clear();
           hb3.getChildren().add(paese3);
           hb3.getChildren().add(girone1.get(2).getBandieraa());
        
       
          hb4.getChildren().clear();
          hb4.getChildren().add(paese4);
          hb4.getChildren().add(girone1.get(3).getBandieraa());
        
 
     }
    
}
