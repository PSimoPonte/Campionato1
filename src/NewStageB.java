
import java.util.ArrayList;
import java.util.Collections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class NewStageB extends Stage {
    
    
    public Label blbl1;
    public Label blbl1_1;
    public Label blbl1_2;
    public Label blbl2;
    public Label blbl2_1;
    public Label blbl2_2;
    
    public Label blbl3;
    public Label blbl3_1;
    public Label blbl3_2;
    public Label blbl4;
    public Label blbl4_1;
    
    
    public Label blbl5;
    public Label blbl5_1;
    public Label blbl5_2;
    public Label blbl6;
    public Label blbl6_1;
    public Label paese5;
    public Label paese6;
    public Label paese7;
    public Label paese8;
    
    private Label classifica;
    
    Paese p5;
    Paese p6;
    Paese p7;
    Paese p8;
    
    public Label blbl7;
    public Label blbl8;
    public Label blbl9;
    public Label blbl10;
    
    
     
    static ArrayList<Paese> girone2;
    
    HBox hb1;
    HBox hb2;
    HBox hb3;
    HBox hb4;
    
    
    static Stage finestra3=null;
    
    public NewStageB() {
       
        finestra3 = new Stage();
        
        blbl1 = new Label("--1° giornata");
        blbl1_1 = new Label("Spagna - Russia");
        blbl1_2 = new Label("0-0");
        blbl2_1 = new Label("Olanda - Bulgaria");
        blbl2_2 = new Label("0-0");
        
        blbl3 = new Label("--2° giornata");
        blbl3_1 = new Label("Spagna - Olanda");
        blbl3_2 = new Label("0-0");
        blbl4 = new Label ("Russia - Bulgaria");
        blbl4_1 = new Label ("0-0");
        
        blbl5 = new Label("--3° giornata");
        blbl5_1 = new Label("Spagna - Bulgaria");
        blbl5_2 = new Label("0-0");
        blbl6 = new Label ("Olanda - Russia");
        blbl6_1 = new Label ("0-0");
        
        classifica = new Label ("CLASSIFICA");
        
        /*
        paese5 = new Label("Olanda");
        paese6 = new Label("Bulgaria");
        paese7 = new Label("Russia");
        paese8 = new Label("Spagna");
        
        */

        Bandiera3fasce B_olanda = new Bandiera3fasce("verticale");
        B_olanda.disegna(Color.RED, Color.WHITE, Color.BLUE);
        
        Bandiera3fasce B_bulgaria = new Bandiera3fasce("verticale");
        B_bulgaria.disegna(Color.WHITE, Color.GREEN, Color.RED);
        
        Bandiera3fasce B_russia = new Bandiera3fasce("verticale");
        B_russia.disegna(Color.WHITE, Color.RED, Color.BLUE);
        
        Bandiera3fasce B_spagna = new Bandiera3fasce("verticale");
        B_spagna.disegna(Color.RED, Color.GOLD, Color.RED);
        
        p5 = new Paese("Olanda", 0, B_olanda );
        p6 = new Paese("Bulgaria", 0, B_bulgaria );

        p7 = new Paese("Russia", 0, B_russia );
        p8 = new Paese("Spagna", 0, B_spagna );
        
        
        girone2 = new ArrayList<Paese>();
        
        girone2.add(p5);
        girone2.add(p6);
        girone2.add(p7);
        girone2.add(p8);
        
        // Collections.sort(girone1); //  questo codice mi fa ordinare girone1 che è il mio array list!

        paese5 = new Label(girone2.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        paese6 = new Label(girone2.get(1).getNome());
        paese7 = new Label(girone2.get(2).getNome());
        paese8 = new Label(girone2.get(3).getNome());
        
        blbl7 = new Label(girone2.get(0).getPunteggio()+ "");
        blbl8 = new Label(girone2.get(1).getPunteggio()+ "");
        blbl9 = new Label(girone2.get(2).getPunteggio()+ "");
        blbl10 = new Label(girone2.get(3).getPunteggio()+ "");
        
        
        hb1 = new HBox(20);
        hb1.getChildren().add(paese5);
        hb1.getChildren().add(girone2.get(0).getBandieraa());

        hb2 = new HBox(13);
        hb2.getChildren().add(paese6);
        hb2.getChildren().add(girone2.get(1).getBandieraa());
        
        hb3 = new HBox(20);
        hb3.getChildren().add(paese7);
        hb3.getChildren().add(girone2.get(2).getBandieraa());
        
        hb4 = new HBox(14);
        hb4.getChildren().add(paese8);
        hb4.getChildren().add(girone2.get(3).getBandieraa());
        
        
        
         
        GridPane gp1 = new GridPane();
        gp1.setPadding(new Insets (15,15,15,15));
        gp1.setHgap(40);
        gp1.setGridLinesVisible(true);
        
        gp1.add(blbl1, 0, 0);     //Label giornata
        gp1.add(blbl1_1, 0, 1);  //Label incontro
        gp1.add(blbl1_2, 1, 1);  //Label risultato
        gp1.add(blbl2_1, 0, 3);  //Label incontro
        gp1.add(blbl2_2, 1, 3 );  //Label risultato
        
        gp1.add(blbl3, 0, 4);     //Label giornata
        gp1.add(blbl3_1, 0, 5);  //Label incontro
        gp1.add(blbl3_2, 1, 5);  //Label risultato
        gp1.add(blbl4, 0, 6);  //Label incontro
        gp1.add(blbl4_1, 1, 6);  //Label risultato
        
        gp1.add(blbl5, 0, 7);     //Label giornata
        gp1.add(blbl5_1, 0, 8);  //Label incontro
        gp1.add(blbl5_2, 1, 8);  //Label risultato
        gp1.add(blbl6, 0, 9);  //Label incontro
        gp1.add(blbl6_1, 1, 9);  //Label risultato
        
        gp1.add(new Label(), 1, 10);
        gp1.add(classifica, 1, 11);

        gp1.add(hb1, 0, 12);
        gp1.add(hb2, 0, 13);
        gp1.add(hb3, 0, 14);
        gp1.add(hb4, 0, 15);
        gp1.add(blbl7, 1, 12);
        gp1.add(blbl8, 1, 13);
        gp1.add(blbl9, 1, 14); 
        gp1.add(blbl10, 1, 15);
        
        
       // StackPane root = new StackPane();
        Scene scene = new Scene(gp1, 300, 250);
        
        finestra3.setTitle("Tabella campionato 2");
        finestra3.setScene(scene);
        finestra3.setX(430);
        finestra3.setY(60);
        finestra3.setMinHeight(400);
        finestra3.setMinWidth(400);
        finestra3.show();
    }
    
    
    /*
     public void lanciaPartita(){
        
        blbl1_2.setText(randInt(0, 9) + "-"+ randInt(0, 9));
        blbl2_2.setText(randInt(0, 9) + "-"+ randInt(0, 9));
                
              String[] punteggio = blbl1_2.getText().split("-");
              String[] squadra = blbl1_1.getText().split(" - ");
                
                if(Integer.parseInt(punteggio[0])>Integer.parseInt(punteggio[1]))
                {
                    
                }
    }
    */
    
    
     // metodo per lanciare la prima giornata
   // ===========================================================================
    
    
    public void lanciaPrimaGiornata(){
        
       int goalPaeseE =  randInt(0, 2); //olanda
       int goalPaeseF = randInt(0, 2);  //bulgaria
       int goalPaeseG = randInt(0, 2); //Russia
       int goalPaeseH = randInt(0, 2); // spagna
     
        
        blbl1_2.setText( goalPaeseH+ "-"+ goalPaeseG);
        blbl2_2.setText(goalPaeseE+ "-"+ goalPaeseF);
               
        // spagna - russia
         if(goalPaeseH > goalPaeseG) {
             
             p8.setPunteggio( p8.getPunteggio()+3);
             p7.setPunteggio(p7.getPunteggio()+0);
             
         }
         else if(goalPaeseH < goalPaeseG) {
             
             p8.setPunteggio(p8.getPunteggio()+0);
             p7.setPunteggio(p7.getPunteggio()+3);
         }
         
         else if(goalPaeseH == goalPaeseG) {
             
             p8.setPunteggio(p8.getPunteggio()+1);
             p7.setPunteggio(p7.getPunteggio()+1);
             
         }
         
         // olanda - bulgaria
         if(goalPaeseE > goalPaeseF) {
             
             p5.setPunteggio(p5.getPunteggio()+3);
             p6.setPunteggio(p6.getPunteggio()+0);
             
         }
         else if(goalPaeseE < goalPaeseF) {
             
             p5.setPunteggio(p5.getPunteggio()+0);
             p6.setPunteggio(p6.getPunteggio()+3);
         }
         
         else if(goalPaeseE == goalPaeseF) {
             
             p5.setPunteggio(p5.getPunteggio()+1);
             p6.setPunteggio(p6.getPunteggio()+1);
             
         }
        
        
         
    
    }
    
    // metodo per lanciare la seconda giornata
   // ===========================================================================
    
     public void lanciaSecondaGiornata(){
        
       int goalPaeseE =  randInt(0, 2); //olanda
       int goalPaeseF = randInt(0, 2);  //bulgaria
       int goalPaeseG = randInt(0, 2); //Russia
       int goalPaeseH = randInt(0, 2); // spagna
     
        
        blbl3_2.setText( goalPaeseH+ "-"+ goalPaeseE);
        blbl4_1.setText(goalPaeseG+ "-"+ goalPaeseF);
               
        // spagna - olanda
         if(goalPaeseH > goalPaeseE) {
             
             p8.setPunteggio( p8.getPunteggio()+3);
             p5.setPunteggio(p5.getPunteggio()+0);
         
             
         }
         else if(goalPaeseH < goalPaeseE) {
             
             p8.setPunteggio(p8.getPunteggio()+0);
             p5.setPunteggio(p5.getPunteggio()+3);
         }
         
         else if(goalPaeseH == goalPaeseE) {
             
             p8.setPunteggio(p8.getPunteggio()+1);
             p5.setPunteggio(p5.getPunteggio()+1);
             
         }
         
         // russia - bulgaria
         if(goalPaeseG > goalPaeseF) {
             
             p7.setPunteggio(p7.getPunteggio()+3);
             p6.setPunteggio(p6.getPunteggio()+0);
             
         }
         else if(goalPaeseG < goalPaeseF) {
             
             p7.setPunteggio(p7.getPunteggio()+0);
             p6.setPunteggio(p6.getPunteggio()+3);
         }
         
         else if(goalPaeseG== goalPaeseF) {
             
             p7.setPunteggio(p7.getPunteggio()+1);
             p6.setPunteggio(p6.getPunteggio()+1);
             
         }
        
        
         
    
    }
    
    
    // ===========================================================================
     
     
     // metodo per lanciare la terza giornata
   // ===========================================================================
    
     public void lanciaTerzaGiornata(){
        
       int goalPaeseE =  randInt(0, 2); //olanda
       int goalPaeseF = randInt(0, 2);  //bulgaria
       int goalPaeseG = randInt(0, 2); //Russia
       int goalPaeseH = randInt(0, 2); // spagna
     
     
        
        blbl5_2.setText( goalPaeseH+ "-"+ goalPaeseF);
        blbl6_1.setText(goalPaeseE+ "-"+ goalPaeseG);
               
        // spagna - bulgaria
         if(goalPaeseH > goalPaeseF) {
             
             p8.setPunteggio( p8.getPunteggio()+3);
             p6.setPunteggio(p6.getPunteggio()+0);
           //  System.out.println("Italia+3---Austria+0");
             
         }
         else if(goalPaeseH < goalPaeseF) {
             
             p8.setPunteggio(p8.getPunteggio()+0);
             p6.setPunteggio(p6.getPunteggio()+3);
            // System.out.println("Italia+0---Austria+3");
         }
         
         else if(goalPaeseH == goalPaeseF) {
             
             p8.setPunteggio(p8.getPunteggio()+1);
             p6.setPunteggio(p6.getPunteggio()+1);
           //  System.out.println("Italia+1---Austria+1");
         }
         
         // olanda - russia
         if(goalPaeseE > goalPaeseG) {
             
             p5.setPunteggio(p5.getPunteggio()+3);
             p7.setPunteggio(p7.getPunteggio()+0);
         //    System.out.println("Francia+3---Germania+0");
             
         }
         else if(goalPaeseE < goalPaeseG) {
             
             p5.setPunteggio(p5.getPunteggio()+0);
             p7.setPunteggio(p7.getPunteggio()+3);
           //  System.out.println("Francia+0---Germania+3");
         }
         
         else if(goalPaeseE== goalPaeseG) {
             
             p5.setPunteggio(p5.getPunteggio()+1);
             p7.setPunteggio(p7.getPunteggio()+1);
            // System.out.println("Francia+1---Germania+1");
             
         }
        
        
         
    
    }
    
    
    // ===========================================================================
    
     
     
     
    
      public static int randInt(int min,int max) { //funzione per generare un valore casuale tra 0 e 5
        return (min+ (int)(Math.random()* ((max-min)+1)));
    }
      
     public void classifica () {
     
        Collections.sort(girone2); 
         
        blbl7.setText(girone2.get(0).getPunteggio()+ " ");  // label per punteggi
        blbl8.setText(girone2.get(1).getPunteggio()+ " ");
        blbl9.setText(girone2.get(2).getPunteggio()+ " ");
        blbl10.setText(girone2.get(3).getPunteggio()+ " "); 
        
        
       paese5.setText(girone2.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        paese6.setText(girone2.get(1).getNome()); // label per nomi
        paese7.setText(girone2.get(2).getNome());
        paese8.setText(girone2.get(3).getNome());
       
        System.out.println(girone2.get(0).getNome()+""+girone2.get(0).getPunteggio());
         System.out.println(girone2.get(1).getNome()+""+girone2.get(1).getPunteggio());
          System.out.println(girone2.get(2).getNome()+""+girone2.get(2).getPunteggio());
           System.out.println(girone2.get(3).getNome()+"  "+girone2.get(3).getPunteggio());
           System.out.println("-------------------------------");
        
        
       
         hb1.getChildren().clear();
         hb1.getChildren().add(paese5);
         hb1.getChildren().add(girone2.get(0).getBandieraa());

        
          hb2.getChildren().clear();
          hb2.getChildren().add(paese6);
          hb2.getChildren().add(girone2.get(1).getBandieraa());
        
        
           hb3.getChildren().clear();
           hb3.getChildren().add(paese7);
           hb3.getChildren().add(girone2.get(2).getBandieraa());
        
       
          hb4.getChildren().clear();
          hb4.getChildren().add(paese8);
          hb4.getChildren().add(girone2.get(3).getBandieraa());
        
 
     }
    
}
