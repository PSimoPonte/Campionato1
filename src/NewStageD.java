
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



public class NewStageD extends Stage {
    
    
     
    public Label dlbl1;
    public Label dlbl1_1;
    public Label dlbl1_2;
    public Label dlbl2;
    public Label dlbl2_1;
    public Label dlbl2_2;
    
    public Label dlbl3;
    public Label dlbl3_1;
    public Label dlbl3_2;
    public Label dlbl4;
    public Label dlbl4_1;
    
    
    public Label dlbl5;
    public Label dlbl5_1;
    public Label dlbl5_2;
    public Label dlbl6;
    public Label dlbl6_1;
    public Label paese13;
    public Label paese14;
    public Label paese15;
    public Label paese16;
    
    private Label classifica;
    
    Paese p13;
    Paese p14;
    Paese p15;
    Paese p16;
    
    public Label dlbl7;
    public Label dlbl8;
    public Label dlbl9;
    public Label dlbl10;
    
    
     
    static ArrayList<Paese> girone4;
    
    HBox hb1;
    HBox hb2;
    HBox hb3;
    HBox hb4;
    
    
    
    static Stage finestra5=null;
    
    public NewStageD() {
       
        finestra5 = new Stage();
        
        dlbl1 = new Label("--1° giornata");
        dlbl1_1 = new Label("Finlandia - Danimarca");
        dlbl1_2 = new Label("0-0");
        dlbl2_1 = new Label("Polonia - Ucraina");
        dlbl2_2 = new Label("0-0");
        
        dlbl3 = new Label("--2° giornata");
        dlbl3_1 = new Label("Finlandia - Polonia");
        dlbl3_2 = new Label("0-0");
        dlbl4 = new Label ("Danimarca - Ucraina");
        dlbl4_1 = new Label ("0-0");
        
        dlbl5 = new Label("--3° giornata");
        dlbl5_1 = new Label("Finlandia - Ucraina");
        dlbl5_2 = new Label("0-0");
        dlbl6 = new Label ("Polonia - Danimarca");
        dlbl6_1 = new Label ("0-0");
        
        classifica = new Label ("CLASSIFICA");
        
        /*
        paese13 = new Label("Finlandia");
        paese14 = new Label("Danimarca");
        paese15 = new Label("Polonia");
        paese16 = new Label("Ucraina");
        */        

        Bandiera2fasce B_finlandia = new Bandiera2fasce("verticale");
        B_finlandia.disegna(Color.WHITE, Color.RED, Color.WHITE);
        
        Bandiera2fasce B_danimarca = new Bandiera2fasce("verticale");
        B_danimarca.disegna(Color.WHITE, Color.RED, Color.WHITE);
        
        Bandiera2fasce B_polonia = new Bandiera2fasce("verticale");
        B_polonia.disegna(Color.WHITE, Color.RED, Color.WHITE);
        
        Bandiera2fasce B_ucraina = new Bandiera2fasce("verticale");
        B_ucraina.disegna(Color.BLUE, Color.YELLOW, Color.BLUE);
        
        
        
        p13 = new Paese("Finlandia", 0, B_finlandia );
        p14 = new Paese("Danimarca", 0, B_danimarca);

        p15 = new Paese("Polonia", 0, B_polonia );
        p16 = new Paese("Ucraina", 0, B_ucraina );
        
        girone4 = new ArrayList<Paese>();
        
        girone4.add(p13);
        girone4.add(p14);
        girone4.add(p15);
        girone4.add(p16);
        
        // Collections.sort(girone1); //  questo codice mi fa ordinare girone1 che è il mio array list!

        paese13 = new Label(girone4.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        paese14 = new Label(girone4.get(1).getNome());
        paese15 = new Label(girone4.get(2).getNome());
        paese16 = new Label(girone4.get(3).getNome());
        
        dlbl7 = new Label(girone4.get(0).getPunteggio()+ "");
        dlbl8 = new Label(girone4.get(1).getPunteggio()+ "");
        dlbl9 = new Label(girone4.get(2).getPunteggio()+ "");
        dlbl10 = new Label(girone4.get(3).getPunteggio()+ "");
        
        
        
        
        hb1 = new HBox(25);
        hb1.getChildren().add(paese13);
        hb1.getChildren().add(girone4.get(0).getBandieraa());

        hb2 = new HBox(16);
        hb2.getChildren().add(paese14);
        hb2.getChildren().add(girone4.get(1).getBandieraa());
        
        hb3 = new HBox(35);
        hb3.getChildren().add(paese15);
        hb3.getChildren().add(girone4.get(2).getBandieraa());
        
        hb4 = new HBox(32);
        hb4.getChildren().add(paese16);
        hb4.getChildren().add(girone4.get(3).getBandieraa());
        
        
        
        
        GridPane gp = new GridPane();
        gp.setPadding(new Insets (15,15,15,15));
        gp.setHgap(40);
        gp.setGridLinesVisible(true);
        
        gp.add(dlbl1, 0, 0);     //Label giornata
        gp.add(dlbl1_1, 0, 1);  //Label incontro
        gp.add(dlbl1_2, 1, 1);  //Label risultato
        gp.add(dlbl2_1, 0, 3);  //Label incontro
        gp.add(dlbl2_2, 1, 3 );  //Label risultato
        
        gp.add(dlbl3, 0, 4);     //Label giornata
        gp.add(dlbl3_1, 0, 5);  //Label incontro
        gp.add(dlbl3_2, 1, 5);  //Label risultato
        gp.add(dlbl4, 0, 6);  //Label incontro
        gp.add(dlbl4_1, 1, 6);  //Label risultato
        
        gp.add(dlbl5, 0, 7);     //Label giornata
        gp.add(dlbl5_1, 0, 8);  //Label incontro
        gp.add(dlbl5_2, 1, 8);  //Label risultato
        gp.add(dlbl6, 0, 9);  //Label incontro
        gp.add(dlbl6_1, 1, 9);  //Label risultato
        
        gp.add(new Label(), 1, 10);
        gp.add(classifica, 1, 11);
        
        gp.add(hb1, 0, 12);
        gp.add(hb2, 0, 13);
        gp.add(hb3, 0, 14);
        gp.add(hb4, 0, 15);
        gp.add(dlbl7, 1, 12);
        gp.add(dlbl8, 1, 13);
        gp.add(dlbl9, 1, 14); 
        gp.add(dlbl10, 1, 15);
        
        
   
        
       // gp.getChildren().add(lbl);
        
        Scene scene = new Scene(gp, 300, 250);
        
        finestra5.setTitle("Tabella campionato 4");
        finestra5.setScene(scene);
        finestra5.setX(1255);
        finestra5.setY(60);
        finestra5.setMinHeight(400);
        finestra5.setMinWidth(400);
        finestra5.show();
    }
    /*
     public void lanciaPartita(){
        
        dlbl1_2.setText(randInt(0, 9) + "-"+ randInt(0, 9));
        dlbl2_2.setText(randInt(0, 9) + "-"+ randInt(0, 9));
                
              String[] punteggio = dlbl1_2.getText().split("-");
              String[] squadra = dlbl1_1.getText().split(" - ");
                
                if(Integer.parseInt(punteggio[0])>Integer.parseInt(punteggio[1]))
                {
                    
                }
    
    }
    */
    
     
    public void lanciaPrimaGiornata(){
        
       int goalPaeseO =  randInt(0, 2); //Finlandia
       int goalPaeseP = randInt(0, 2);  //Danimarca
       int goalPaeseQ = randInt(0, 2); //Polonia
       int goalPaeseR = randInt(0, 2); //Ucraina
     
        
        dlbl1_2.setText( goalPaeseO+ "-"+ goalPaeseP);
        dlbl2_2.setText(goalPaeseQ+ "-"+ goalPaeseR);
               
        // Finlandia - Danimarca
         if(goalPaeseO > goalPaeseP) {
             
             p13.setPunteggio( p13.getPunteggio()+3);
             p14.setPunteggio(p14.getPunteggio()+0);
             
         }
         else if(goalPaeseO < goalPaeseP) {
             
             p13.setPunteggio(p13.getPunteggio()+0);
             p14.setPunteggio(p14.getPunteggio()+3);
         }
         
         else if(goalPaeseO == goalPaeseP) {
             
             p13.setPunteggio(p13.getPunteggio()+1);
             p14.setPunteggio(p14.getPunteggio()+1);
             
         }
         
         // Polonia - Ucraina
         if(goalPaeseQ > goalPaeseR) {
             
             p15.setPunteggio(p15.getPunteggio()+3);
             p16.setPunteggio(p16.getPunteggio()+0);
             
         }
         else if(goalPaeseQ < goalPaeseR) {
             
             p15.setPunteggio(p15.getPunteggio()+0);
             p16.setPunteggio(p16.getPunteggio()+3);
         }
         
         else if(goalPaeseQ == goalPaeseR) {
             
             p15.setPunteggio(p15.getPunteggio()+1);
             p16.setPunteggio(p16.getPunteggio()+1);
             
         }
        
        
         
    
    }
    
    // metodo per lanciare la seconda giornata
   // ===========================================================================
    
     public void lanciaSecondaGiornata(){
        
       int goalPaeseO =  randInt(0, 2); //Finlandia
       int goalPaeseP = randInt(0, 2);  //Danimarca
       int goalPaeseQ = randInt(0, 2); //Polonia
       int goalPaeseR = randInt(0, 2); //Ucraina
     
        
        dlbl3_2.setText( goalPaeseO+ "-"+ goalPaeseQ);
        dlbl4_1.setText(goalPaeseP+ "-"+ goalPaeseR);
               
        // Finlandia - Polonia
         if(goalPaeseO > goalPaeseQ) {
             
             p13.setPunteggio( p13.getPunteggio()+3);
             p15.setPunteggio(p15.getPunteggio()+0);
         
             
         }
         else if(goalPaeseO < goalPaeseQ) {
             
             p13.setPunteggio(p13.getPunteggio()+0);
             p15.setPunteggio(p15.getPunteggio()+3);
         }
         
         else if(goalPaeseO == goalPaeseQ) {
             
             p13.setPunteggio(p13.getPunteggio()+1);
             p15.setPunteggio(p15.getPunteggio()+1);
             
         }
         
         // Danimarca - Ucraina
         if(goalPaeseP > goalPaeseR) {
             
             p14.setPunteggio(p14.getPunteggio()+3);
             p16.setPunteggio(p16.getPunteggio()+0);
             
         }
         else if(goalPaeseP < goalPaeseR) {
             
             p14.setPunteggio(p14.getPunteggio()+0);
             p16.setPunteggio(p16.getPunteggio()+3);
         }
         
         else if(goalPaeseP==goalPaeseR) {
             
             p14.setPunteggio(p14.getPunteggio()+1);
             p16.setPunteggio(p16.getPunteggio()+1);
             
         }
        
        
         
    
    }
    
    
    // ===========================================================================
     
     
     // metodo per lanciare la terza giornata
   // ===========================================================================
    
     public void lanciaTerzaGiornata(){
        
       int goalPaeseO =  randInt(0, 2); //Finlandia
       int goalPaeseP = randInt(0, 2);  //Danimarca
       int goalPaeseQ = randInt(0, 2); //Polonia
       int goalPaeseR = randInt(0, 2); //Ucraina
     
     
        
        dlbl5_2.setText( goalPaeseO+ "-"+ goalPaeseR);
        dlbl6_1.setText(goalPaeseQ+ "-"+ goalPaeseP);
               
        // Finlandia - Ucraina
         if(goalPaeseO > goalPaeseR) {
             
             p13.setPunteggio( p13.getPunteggio()+3);
             p16.setPunteggio(p16.getPunteggio()+0);
           //  System.out.println("Italia+3---Austria+0");
             
         }
         else if(goalPaeseO < goalPaeseR) {
             
             p13.setPunteggio(p13.getPunteggio()+0);
             p16.setPunteggio(p16.getPunteggio()+3);
            // System.out.println("Italia+0---Austria+3");
         }
         
         else if(goalPaeseO == goalPaeseR) {
             
             p13.setPunteggio(p13.getPunteggio()+1);
             p16.setPunteggio(p16.getPunteggio()+1);
           //  System.out.println("Italia+1---Austria+1");
         }
         
         // polonia - danimarca
         if(goalPaeseQ > goalPaeseP) {
             
             p15.setPunteggio(p15.getPunteggio()+3);
             p14.setPunteggio(p14.getPunteggio()+0);
         //    System.out.println("Francia+3---Germania+0");
             
         }
         else if(goalPaeseQ < goalPaeseP) {
             
             p15.setPunteggio(p15.getPunteggio()+0);
             p14.setPunteggio(p14.getPunteggio()+3);
           //  System.out.println("Francia+0---Germania+3");
         }
         
         else if(goalPaeseQ==goalPaeseP) {
             
             p15.setPunteggio(p15.getPunteggio()+1);
             p14.setPunteggio(p14.getPunteggio()+1);
            // System.out.println("Francia+1---Germania+1");
             
         }
        
        
         
    
    }
    
    
    // ===========================================================================
    
     
     
     
    
      public static int randInt(int min,int max) { //funzione per generare un valore casuale tra 0 e 5
        return (min+ (int)(Math.random()* ((max-min)+1)));
    }
      
     public void classifica () {
     
        Collections.sort(girone4); 
         
        dlbl7.setText(girone4.get(0).getPunteggio()+ " ");  // label per punteggi
        dlbl8.setText(girone4.get(1).getPunteggio()+ " ");
        dlbl9.setText(girone4.get(2).getPunteggio()+ " ");
        dlbl10.setText(girone4.get(3).getPunteggio()+ " "); 
        
        
       paese13.setText(girone4.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        paese14.setText(girone4.get(1).getNome()); // label per nomi
        paese15.setText(girone4.get(2).getNome());
        paese16.setText(girone4.get(3).getNome());
       
        System.out.println(girone4.get(0).getNome()+""+girone4.get(0).getPunteggio());
         System.out.println(girone4.get(1).getNome()+""+girone4.get(1).getPunteggio());
          System.out.println(girone4.get(2).getNome()+""+girone4.get(2).getPunteggio());
           System.out.println(girone4.get(3).getNome()+"  "+girone4.get(3).getPunteggio());
           System.out.println("-------------------------------");
        
        
       
         hb1.getChildren().clear();
         hb1.getChildren().add(paese13);
         hb1.getChildren().add(girone4.get(0).getBandieraa());

        
          hb2.getChildren().clear();
          hb2.getChildren().add(paese14);
          hb2.getChildren().add(girone4.get(1).getBandieraa());
        
        
           hb3.getChildren().clear();
           hb3.getChildren().add(paese15);
           hb3.getChildren().add(girone4.get(2).getBandieraa());
        
       
          hb4.getChildren().clear();
          hb4.getChildren().add(paese16);
          hb4.getChildren().add(girone4.get(3).getBandieraa());
        
 
     }
    
    
}
