
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



public class NewStageC extends Stage {
    
    
    
    public Label clbl1;
    public Label clbl1_1;
    public Label clbl1_2;
    public Label clbl2;
    public Label clbl2_1;
    public Label clbl2_2;
    
    public Label clbl3;
    public Label clbl3_1;
    public Label clbl3_2;
    public Label clbl4;
    public Label clbl4_1;
    
    
    public Label clbl5;
    public Label clbl5_1;
    public Label clbl5_2;
    public Label clbl6;
    public Label clbl6_1;
    public Label paese9;
    public Label paese10;
    public Label paese11;
    public Label paese12;
    
    private Label classifica;
    
     
    Paese p9;
    Paese p10;
    Paese p11;
    Paese p12;
    
    public Label clbl7;
    public Label clbl8;
    public Label clbl9;
    public Label clbl10;
    
    static ArrayList<Paese> girone3;
    
    HBox hb1;
    HBox hb2;
    HBox hb3;
    HBox hb4;
    
    static Stage finestra4=null;
    
    public NewStageC() {
       
        finestra4 = new Stage();
        
        clbl1 = new Label("--1° giornata");
        clbl1_1 = new Label("Ungheria - Belgio");
        clbl1_2 = new Label("0-0");
        clbl2_1 = new Label("Irlanda - Svezia");
        clbl2_2 = new Label("0-0");
        
        clbl3 = new Label("--2° giornata");
        clbl3_1 = new Label("Ungheria - Irlanda");
        clbl3_2 = new Label("0-0");
        clbl4 = new Label ("Belgio - Svezia");
        clbl4_1 = new Label ("0-0");
        
        clbl5 = new Label("--3° giornata");
        clbl5_1 = new Label("Ungheria - Svezia");
        clbl5_2 = new Label("0-0");
        clbl6 = new Label ("Irlanda - Belgio");
        clbl6_1 = new Label ("0-0");
        
        classifica = new Label ("CLASSIFICA");
        
        /*
        paese9 = new Label("Svezia");
        paese10 = new Label("Belgio");
        paese11 = new Label("Irlanda");
        paese12 = new Label("Ungheria");
        
        */
        
        
        Bandiera2fasce B_svezia = new Bandiera2fasce("verticale");
        B_svezia.disegna(Color.YELLOW, Color.BLUE, Color.YELLOW);
        
        Bandiera3fasce B_belgio = new Bandiera3fasce("orizzontale");
        B_belgio.disegna(Color.RED, Color.GOLD, Color.BLACK);
        
        Bandiera3fasce B_irlanda = new Bandiera3fasce("orizzontale");
        B_irlanda.disegna(Color.RED, Color.WHITE, Color.HONEYDEW);
        
        Bandiera3fasce B_ungheria = new Bandiera3fasce("verticale");
        B_ungheria.disegna(Color.RED, Color.WHITE, Color.GREEN);
        
        p9 = new Paese("Svezia", 0, B_svezia );
        p10 = new Paese("Belgio", 0, B_belgio );

        p11 = new Paese("Irlanda", 0, B_irlanda );
        p12 = new Paese("Ungheria", 0, B_ungheria );
        
        
        girone3 = new ArrayList<Paese>();
        
        girone3.add(p9);
        girone3.add(p10);
        girone3.add(p11);
        girone3.add(p12);
        
        // Collections.sort(girone1); //  questo codice mi fa ordinare girone1 che è il mio array list!

        
        paese9 = new Label(girone3.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        paese10 = new Label(girone3.get(1).getNome());
        paese11 = new Label(girone3.get(2).getNome());
        paese12 = new Label(girone3.get(3).getNome());
        
        clbl7 = new Label(girone3.get(0).getPunteggio()+ "");
        clbl8 = new Label(girone3.get(1).getPunteggio()+ "");
        clbl9 = new Label(girone3.get(2).getPunteggio()+ "");
        clbl10 = new Label(girone3.get(3).getPunteggio()+ "");
        
        
        
        hb1 = new HBox(30);
        hb1.getChildren().add(paese9);
        hb1.getChildren().add(girone3.get(0).getBandieraa());

        hb2 = new HBox(30);
        hb2.getChildren().add(paese10);
        hb2.getChildren().add(girone3.get(1).getBandieraa());
        
        hb3 = new HBox(30);
        hb3.getChildren().add(paese11);
        hb3.getChildren().add(girone3.get(2).getBandieraa());
        
        hb4 = new HBox(16);
        hb4.getChildren().add(paese12);
        hb4.getChildren().add(girone3.get(3).getBandieraa());
        
        
        
        
        GridPane gp = new GridPane();
        gp.setPadding(new Insets (15,15,15,15));
        gp.setHgap(40);
        gp.setGridLinesVisible(true);
        
        gp.add(clbl1, 0, 0);     //Label giornata
        gp.add(clbl1_1, 0, 1);  //Label incontro
        gp.add(clbl1_2, 1, 1);  //Label risultato
        gp.add(clbl2_1, 0, 3);  //Label incontro
        gp.add(clbl2_2, 1, 3 );  //Label risultato
        
        gp.add(clbl3, 0, 4);     //Label giornata
        gp.add(clbl3_1, 0, 5);  //Label incontro
        gp.add(clbl3_2, 1, 5);  //Label risultato
        gp.add(clbl4, 0, 6);  //Label incontro
        gp.add(clbl4_1, 1, 6);  //Label risultato
        
        gp.add(clbl5, 0, 7);     //Label giornata
        gp.add(clbl5_1, 0, 8);  //Label incontro
        gp.add(clbl5_2, 1, 8);  //Label risultato
        gp.add(clbl6, 0, 9);  //Label incontro
        gp.add(clbl6_1, 1, 9);  //Label risultato
        
        gp.add(new Label(), 1, 10);
        gp.add(classifica, 1, 11);
        
        gp.add(hb1, 0, 12);
        gp.add(hb2, 0, 13);
        gp.add(hb3, 0, 14);
        gp.add(hb4, 0, 15);
        gp.add(clbl7, 1, 12);
        gp.add(clbl8, 1, 13);
        gp.add(clbl9, 1, 14); 
        gp.add(clbl10, 1, 15);
        
        
        
   
        
       // gp.getChildren().add(lbl);
        
        Scene scene = new Scene(gp, 300, 250);
        
        finestra4.setTitle("Tabella campionato 3");
        finestra4.setScene(scene);
        finestra4.setX(842);
        finestra4.setY(60);
        finestra4.setMinHeight(400);
        finestra4.setMinWidth(400);
        finestra4.show();
    }
    
    
    /*
     public void lanciaPartita(){
        
        clbl1_2.setText(randInt(0, 9) + "-"+ randInt(0, 9));
        clbl2_2.setText(randInt(0, 9) + "-"+ randInt(0, 9));
                
              String[] punteggio = clbl1_2.getText().split("-");
              String[] squadra = clbl1_1.getText().split(" - ");
                
                if(Integer.parseInt(punteggio[0])>Integer.parseInt(punteggio[1]))
                {
                    
                }
    
    }
*/
    
      
     // metodo per lanciare la prima giornata
   // ===========================================================================
    
    
     
    public void lanciaPrimaGiornata(){
        
       int goalPaeseI =  randInt(0, 2); //Svezia
       int goalPaeseL = randInt(0, 2);  //Belgio
       int goalPaeseM = randInt(0, 2); //Irlanda
       int goalPaeseN = randInt(0, 2); // Ungheria
     
        
        clbl1_2.setText( goalPaeseN+ "-"+ goalPaeseL);
        clbl2_2.setText(goalPaeseM+ "-"+ goalPaeseI);
              
        // Ungheria - Belgio
         if(goalPaeseN > goalPaeseL) {
             
             p12.setPunteggio( p12.getPunteggio()+3);
             p10.setPunteggio(p10.getPunteggio()+0);
             
         }
         else if(goalPaeseN < goalPaeseL) {
             
             p12.setPunteggio(p12.getPunteggio()+0);
             p10.setPunteggio(p10.getPunteggio()+3);
         }
         
         else if(goalPaeseN == goalPaeseL) {
             
             p12.setPunteggio(p12.getPunteggio()+1);
             p10.setPunteggio(p10.getPunteggio()+1);
             
         }
         
         // Irlanda - Svezia
         if(goalPaeseM > goalPaeseI) {
             
             p11.setPunteggio(p11.getPunteggio()+3);
             p9.setPunteggio(p9.getPunteggio()+0);
             
         }
         else if(goalPaeseM < goalPaeseI) {
             
             p11.setPunteggio(p11.getPunteggio()+0);
             p9.setPunteggio(p9.getPunteggio()+3);
         }
         
         else if(goalPaeseM == goalPaeseI) {
             
             p11.setPunteggio(p11.getPunteggio()+1);
             p9.setPunteggio(p9.getPunteggio()+1);
             
         }
        
        
         
    
    }
    
    // metodo per lanciare la seconda giornata
   // ===========================================================================
    
     public void lanciaSecondaGiornata(){
        
       int goalPaeseI =  randInt(0, 2); //Svezia
       int goalPaeseL = randInt(0, 2);  //Belgio
       int goalPaeseM = randInt(0, 2); //Irlanda
       int goalPaeseN = randInt(0, 2); // Ungheria
     
        
        clbl3_2.setText( goalPaeseN+ "-"+ goalPaeseM);
        clbl4_1.setText(goalPaeseL+ "-"+ goalPaeseI);
               
        // ungheria - irlanda
         if(goalPaeseN > goalPaeseM) {
             
             p12.setPunteggio( p12.getPunteggio()+3);
             p11.setPunteggio(p11.getPunteggio()+0);
        
             
         }
         else if(goalPaeseN < goalPaeseM) {
             
             p12.setPunteggio(p12.getPunteggio()+0);
             p11.setPunteggio(p11.getPunteggio()+3);
         }
         
         else if(goalPaeseN == goalPaeseM) {
             
             p12.setPunteggio(p12.getPunteggio()+1);
             p11.setPunteggio(p11.getPunteggio()+1);
             
         }
         
         // belgio - svezia
         if(goalPaeseL > goalPaeseI) {
             
             p10.setPunteggio(p10.getPunteggio()+3);
             p9.setPunteggio(p9.getPunteggio()+0);
             
         }
         else if(goalPaeseL < goalPaeseI) {
             
             p10.setPunteggio(p10.getPunteggio()+0);
             p9.setPunteggio(p9.getPunteggio()+3);
         }
         
         else if(goalPaeseL== goalPaeseI) {
             
             p10.setPunteggio(p10.getPunteggio()+1);
             p9.setPunteggio(p9.getPunteggio()+1);
             
         }
        
        
         
    
    }
    
    
    // ===========================================================================
     
     
     // metodo per lanciare la terza giornata
   // ===========================================================================
    
     public void lanciaTerzaGiornata(){
        
       int goalPaeseI =  randInt(0, 2); //Svezia
       int goalPaeseL = randInt(0, 2);  //Belgio
       int goalPaeseM = randInt(0, 2); //Irlanda
       int goalPaeseN = randInt(0, 2); // Ungheria
     
     
        
        clbl5_2.setText( goalPaeseN+ "-"+ goalPaeseI);
        clbl6_1.setText(goalPaeseM+ "-"+ goalPaeseL);
               
        // Ungheria - Svezia
         if(goalPaeseN > goalPaeseI) {
             
             p12.setPunteggio( p12.getPunteggio()+3);
             p9.setPunteggio(p9.getPunteggio()+0);
           //  System.out.println("Italia+3---Austria+0");
             
         }
         else if(goalPaeseN < goalPaeseI) {
             
             p12.setPunteggio(p12.getPunteggio()+0);
             p9.setPunteggio(p9.getPunteggio()+3);
            // System.out.println("Italia+0---Austria+3");
         }
         
         else if(goalPaeseN == goalPaeseI) {
             
             p12.setPunteggio(p12.getPunteggio()+1);
             p9.setPunteggio(p9.getPunteggio()+1);
           //  System.out.println("Italia+1---Austria+1");
         }
         
         // Irlanda - Belgio
         if(goalPaeseM > goalPaeseL) {
             
             p11.setPunteggio(p11.getPunteggio()+3);
             p10.setPunteggio(p10.getPunteggio()+0);
         //    System.out.println("Francia+3---Germania+0");
             
         }
         else if(goalPaeseM < goalPaeseL) {
             
             p11.setPunteggio(p11.getPunteggio()+0);
             p10.setPunteggio(p10.getPunteggio()+3);
           //  System.out.println("Francia+0---Germania+3");
         }
         
         else if(goalPaeseM== goalPaeseL) {
             
             p11.setPunteggio(p11.getPunteggio()+1);
             p10.setPunteggio(p10.getPunteggio()+1);
            // System.out.println("Francia+1---Germania+1");
             
         }
        
        
         
    
    }
    
    
    // ===========================================================================
    
     
     
     
    
      public static int randInt(int min,int max) { //funzione per generare un valore casuale tra 0 e 5
        return (min+ (int)(Math.random()* ((max-min)+1)));
    }
      
     public void classifica () {
     
        Collections.sort(girone3); 
         
        clbl7.setText(girone3.get(0).getPunteggio()+ " ");  // label per punteggi
        clbl8.setText(girone3.get(1).getPunteggio()+ " ");
        clbl9.setText(girone3.get(2).getPunteggio()+ " ");
        clbl10.setText(girone3.get(3).getPunteggio()+ " "); 
        
        
       paese9.setText(girone3.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        paese10.setText(girone3.get(1).getNome()); // label per nomi
        paese11.setText(girone3.get(2).getNome());
        paese12.setText(girone3.get(3).getNome());
       
        System.out.println(girone3.get(0).getNome()+""+girone3.get(0).getPunteggio());
         System.out.println(girone3.get(1).getNome()+""+girone3.get(1).getPunteggio());
          System.out.println(girone3.get(2).getNome()+""+girone3.get(2).getPunteggio());
           System.out.println(girone3.get(3).getNome()+"  "+girone3.get(3).getPunteggio());
           System.out.println("-------------------------------");
        
        
       
         hb1.getChildren().clear();
         hb1.getChildren().add(paese9);
         hb1.getChildren().add(girone3.get(0).getBandieraa());

        
          hb2.getChildren().clear();
          hb2.getChildren().add(paese10);
          hb2.getChildren().add(girone3.get(1).getBandieraa());
        
        
           hb3.getChildren().clear();
           hb3.getChildren().add(paese11);
           hb3.getChildren().add(girone3.get(2).getBandieraa());
        
       
          hb4.getChildren().clear();
          hb4.getChildren().add(paese12);
          hb4.getChildren().add(girone3.get(3).getBandieraa());
        
 
     }
    
    
    
}































