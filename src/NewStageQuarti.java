
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class NewStageQuarti {
    
    
    
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
    public Label lblNpaese5;
    public Label lblNpaese6;
    public Label lblNpaese7;
    public Label lblNpaese8;
    
    private Label classifica;
    
    Paese p1;
    Paese p2;
    Paese p3;
    Paese p4;
    Paese p5;
    Paese p6;
    Paese p7;
    Paese p8;
    
    public Label lblPrimoIncontro;
    public Label lblSecondoIncontro;
    public Label lblTerzoIncontro;
    public Label lblQuartoIncontro;
    
    static ArrayList<Paese> gironeQuarti;
    
    HBox hb1;
    HBox hb2;
    HBox hb3;
    HBox hb4;
    
    HBox hb5;
    HBox hb6;
    HBox hb7;
    HBox hb8;
    
    public Label lblPP1;
    public Label lblPP2;
    public Label lblPP3;
    public Label lblPP4;
    public Label lblPP5;
    public Label lblPP6;
    public Label lblPP7;
    public Label lblPP8;
    
    public Paese p1A;
    public Paese p2A;
    public Paese p1B;
    public Paese p2B;
    public Paese p1C;
    public Paese p2C;
    public Paese p1D;
    public Paese p2D;

    static Stage finestra6;
     
    static ArrayList<Paese> vincentiQuarti1riga;
    
    static ArrayList<Paese> vincentiQuarti2riga;
    
    public static ArrayList<Paese> lista;

    public NewStageQuarti() {
       
        finestra6 = new Stage();
        
        String team1A = NewStageA.girone1.get(0).getNome();
        String team2A = NewStageA.girone1.get(1).getNome();
        
        String team1B = NewStageB.girone2.get(0).getNome();
        String team2B = NewStageB.girone2.get(1).getNome();
        
        String team1C = NewStageC.girone3.get(0).getNome();
        String team2C = NewStageC.girone3.get(1).getNome();
        
        String team1D = NewStageD.girone4.get(0).getNome();
        String team2D = NewStageD.girone4.get(1).getNome();
       
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
        
        albl5 = new Label("--3° incontro");
        albl5_1 = new Label(team1C+" - "+team2D);
        lblTerzoIncontro = new Label("0-0");
       
        //albl6 = new Label ("Francia - Germania");
        //albl6_1 = new Label ("0-0");
        
        alblq1 = new Label("--4° incontro");
        alblq2 = new Label(team2C+" - "+team1D);
        lblQuartoIncontro = new Label("0-0");
       
        classifica = new Label ("CLASSIFICA"); 
 
        ////////////////////////////////////////////////////////////////////////
        /////////////////ARRAYLIST//////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        gironeQuarti = new ArrayList<Paese>();  // per salvare 8 squadre arrivati al quarto-finale
        
        vincentiQuarti1riga = new ArrayList<Paese>(); // per salvare 2 squadre
                
        vincentiQuarti2riga = new ArrayList<Paese>(); // per salvare 2 squadre
        
       // lista = new ArrayList<Paese>();
         ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        p1A= NewStageA.girone1.get(0);
        p2A= NewStageA.girone1.get(1);
        
        p1B= NewStageB.girone2.get(0);
        p2B= NewStageB.girone2.get(1);
        
        p1C= NewStageC.girone3.get(0);
        p2C= NewStageC.girone3.get(1);
       
        p1D= NewStageD.girone4.get(0);
        p2D= NewStageD.girone4.get(1);
        
        
        gironeQuarti.add(p1A);
        gironeQuarti.add(p2A);
        
        gironeQuarti.add(p1B);
        gironeQuarti.add(p2B);
        
        gironeQuarti.add(p1C);
        gironeQuarti.add(p2C);
        
        gironeQuarti.add(p1D);
        gironeQuarti.add(p2D);
        
       // Collections.sort(girone1); //  questo codice mi fa ordinare girone1 che è il mio array list!
        
        lblNpaese1 = new Label(gironeQuarti.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        lblNpaese2 = new Label(gironeQuarti.get(1).getNome());
        lblNpaese3 = new Label(gironeQuarti.get(2).getNome());
        lblNpaese4 = new Label(gironeQuarti.get(3).getNome());
        lblNpaese5 = new Label(gironeQuarti.get(4).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        lblNpaese6 = new Label(gironeQuarti.get(5).getNome());
        lblNpaese7 = new Label(gironeQuarti.get(6).getNome());
        lblNpaese8 = new Label(gironeQuarti.get(7).getNome());
         
        /*
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
        
        
        */
        
        lblPP1 = new Label(gironeQuarti.get(0).getPunteggio()+ "");
        lblPP2 = new Label(gironeQuarti.get(1).getPunteggio()+ "");
        lblPP3 = new Label(gironeQuarti.get(2).getPunteggio()+ "");
        lblPP4 = new Label(gironeQuarti.get(3).getPunteggio()+ "");
        lblPP5 = new Label(gironeQuarti.get(4).getPunteggio()+ "");
        lblPP6 = new Label(gironeQuarti.get(5).getPunteggio()+ "");
        lblPP7 = new Label(gironeQuarti.get(6).getPunteggio()+ "");
        lblPP8 = new Label(gironeQuarti.get(7).getPunteggio()+ "");
        
        hb1 = new HBox();
        hb1.getChildren().add(lblNpaese1);
        hb1.getChildren().add(gironeQuarti.get(0).getBandieraa());
        
        hb2 = new HBox();
        hb2.getChildren().add(lblNpaese2);
        hb2.getChildren().add(gironeQuarti.get(1).getBandieraa());
        
        hb3 = new HBox();
        hb3.getChildren().add(lblNpaese3);
        hb3.getChildren().add(gironeQuarti.get(2).getBandieraa());
        
        hb4 = new HBox();
        hb4.getChildren().add(lblNpaese4);
        hb4.getChildren().add(gironeQuarti.get(3).getBandieraa());
        
        hb5 = new HBox();
        hb5.getChildren().add(lblNpaese5);
        hb5.getChildren().add(gironeQuarti.get(4).getBandieraa());
        
        hb6 = new HBox();
        hb6.getChildren().add(lblNpaese6);
        hb6.getChildren().add(gironeQuarti.get(5).getBandieraa());
        
        hb7 = new HBox();
        hb7.getChildren().add(lblNpaese7);
        hb7.getChildren().add(gironeQuarti.get(6).getBandieraa());
        
        hb8 = new HBox();
        hb8.getChildren().add(lblNpaese8);
        hb8.getChildren().add(gironeQuarti.get(7).getBandieraa());

        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
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
        gp.add(albl5, 0, 4); // 3°incontro
        gp.add(albl5_1, 0, 5); //team
        gp.add(lblTerzoIncontro, 1, 5); //risultato
        gp.add(alblq1, 0, 6); // 4°incontro
        gp.add(alblq2, 0, 7); //team
        gp.add(lblQuartoIncontro, 1, 7); //risultato
        gp.add(new Label(), 1, 8);
        gp.add(classifica, 1, 9);
        
        //aggiunta nome paese e bandiera
        gp.add(hb1, 0,10);
        gp.add(hb2, 0,11);
        gp.add(hb3, 0,12);
        gp.add(hb4, 0,13);
        gp.add(hb5, 0,14);
        gp.add(hb6, 0,15);
        gp.add(hb7, 0,16);
        gp.add(hb8, 0,17);
        
        //aggiunta punteggio
        gp.add(lblPP1, 1,10);
        gp.add(lblPP2, 1,11);
        gp.add(lblPP3, 1,12);
        gp.add(lblPP4, 1,13);
        gp.add(lblPP5, 1,14);
        gp.add(lblPP6, 1,15);
        gp.add(lblPP7, 1,16);
        gp.add(lblPP8, 1,17);

        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////

       // gp.getChildren().add(lbl);
        
        Scene scene = new Scene(gp, 300, 250);
        
        finestra6.setTitle("Quarti di finale");
        finestra6.setScene(scene);
        finestra6.setX(720);
        finestra6.setY(60);
        finestra6.setMinHeight(530);
        finestra6.setMinWidth(400);
        finestra6.show();
    }
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
   public void lanciaQuartidiFinale(){
       
       int goalPaese1A = randInt(0, 2); //1° squadra del primo girone 
       int goalPaese2A = randInt(0, 2);  //2° squadra del primo girone 
       
       int goalPaese1B = randInt(0, 2); //1° squadra del secondo girone 
       int goalPaese2B = randInt(0, 2); //2° squadra del secondo girone 
       
       int goalPaese1C = randInt(0, 2); //1° squadra del terzo girone 
       int goalPaese2C = randInt(0, 2); //2° squadra del terzo girone 
     
       int goalPaese1D = randInt(0, 2); //1° squadra del quarto girone 
       int goalPaese2D = randInt(0, 2); //2° squadra del quarto girone 
       
        lblPrimoIncontro.setText( goalPaese1A+ "-"+ goalPaese2B);
        lblSecondoIncontro.setText(goalPaese2A+ "-"+ goalPaese1B);
        lblTerzoIncontro.setText( goalPaese1C+ "-"+ goalPaese2D);
        lblQuartoIncontro.setText(goalPaese2C+ "-"+ goalPaese1D);
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
       //// FUNZIONE incontro USATA PER RISPARMIARE RIGHE E RIGHE DI CODICE!
        
         incontro(goalPaese1A, goalPaese2B, p1A, p2B, vincentiQuarti1riga);
         incontro(goalPaese2A, goalPaese1B, p2A, p1B, vincentiQuarti1riga);
         incontro(goalPaese1C, goalPaese2D, p1C, p2D, vincentiQuarti2riga);
         incontro(goalPaese2C, goalPaese1D, p2C, p1D, vincentiQuarti2riga);
   }
       
        ////////////////////////////////////////////////////////////////////////
        ////////////////////FUNZIONE RANDOM!////////////////////////////////////
       
     public static int randInt(int min,int max) { //funzione per generare un valore casuale tra 0 e 5
        return (min+ (int)(Math.random()* ((max-min)+1)));
    }
        ////////////////////////////////////////////////////////////////////////
     /////////////////////////////////////////////////////////////////////////////////////
          //funzione unica che posso riutilizzare più volte!
      
    public static void incontro(int risTeam1 , int risTeam2 ,Paese p1 , Paese p2 , ArrayList<Paese> lista)
    { 

          if(risTeam1 > risTeam2) {
             
             p1.setPunteggio(p1.getPunteggio()+3);  //  .getPuntggio ottengo il punteggio  Grazie a .setPunteggio ci sommo +0
             p2.setPunteggio(p2.getPunteggio()+0);
            
             System.out.println(" nome paese : "+p1.getNome() + " ---punteggio ----" + p1.getPunteggio());
             System.out.println(" nome paese : "+p2.getNome() + " ---punteggio ----" + p2.getPunteggio());
           
              lista.add(p1);
          
          }
         else if(risTeam1 < risTeam2) {
            
             p1.setPunteggio(p1.getPunteggio()+0);
             p2.setPunteggio(p2.getPunteggio()+3);
             
             System.out.println(" nome paese : "+p1.getNome() + " ---punteggio ----" + p1.getPunteggio());
             System.out.println(" nome paese : "+p2.getNome() + " ---punteggio ----" + p2.getPunteggio());

              lista.add(p2);
         }
         
         else if(risTeam1 == risTeam2) {
             
             p1.setPunteggio(p1.getPunteggio()+1);
             p2.setPunteggio(p2.getPunteggio()+1);
             
             System.out.println(" && nome paese : "+p1.getNome() + " ---punteggio ----" + p1.getPunteggio());
             System.out.println("  && nome paese : "+p2.getNome() + " ---punteggio ----" + p2.getPunteggio());
             
              /////////////////////////////////////////////////////////////
              //confronto i nomi dei due paesi se i loro punteggi risultano uguali
              //selezioniamo quello che viene prima in ordine alfabetico
              
             if(p1.getNome().compareTo(p2.getNome()) < 0 ){ 
                 
              lista.add(p1);
             }
             
             else if(p1.getNome().compareTo(p2.getNome()) > 0 ){
                 
                 lista.add(p2);
                 
             }
    }    
   
   }

        //////////////////////////////////////////////////////////////////////////////////
        ///////////////////CLASSIFICA//////////////////////////////////////////////////////
     /////////////////////////////////////////////////////////////////////////////////////
    
    public void classifica () {
     
        
         Collections.sort(gironeQuarti); 
         //Collections.sort(gironeQuarti); 
         
        lblPP1.setText(gironeQuarti.get(0).getPunteggio()+ " ");  // label per punteggi
        lblPP2.setText(gironeQuarti.get(1).getPunteggio()+ " ");
        lblPP3.setText(gironeQuarti.get(2).getPunteggio()+ " ");
        lblPP4.setText(gironeQuarti.get(3).getPunteggio()+ " "); 
        
        lblPP5.setText(gironeQuarti.get(4).getPunteggio()+ " ");  // label per punteggi
        lblPP6.setText(gironeQuarti.get(5).getPunteggio()+ " ");
        lblPP7.setText(gironeQuarti.get(6).getPunteggio()+ " ");
        lblPP8.setText(gironeQuarti.get(7).getPunteggio()+ " "); 
        
        
       lblNpaese1.setText(gironeQuarti.get(0).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        lblNpaese2.setText(gironeQuarti.get(1).getNome()); // label per nomi
        lblNpaese3.setText(gironeQuarti.get(2).getNome());
        lblNpaese4.setText(gironeQuarti.get(3).getNome());
        
        lblNpaese5.setText(gironeQuarti.get(4).getNome());  //assegno a paese1 il nome alla posizione (0) dell'ArrayList grazie a getNome
        lblNpaese6.setText(gironeQuarti.get(5).getNome()); // label per nomi
        lblNpaese7.setText(gironeQuarti.get(6).getNome());
        lblNpaese8.setText(gironeQuarti.get(7).getNome());
       
        
        System.out.println(gironeQuarti.get(0).getNome()+""+gironeQuarti.get(0).getPunteggio());
         System.out.println(gironeQuarti.get(1).getNome()+""+gironeQuarti.get(1).getPunteggio());
          System.out.println(gironeQuarti.get(2).getNome()+""+gironeQuarti.get(2).getPunteggio());
           System.out.println(gironeQuarti.get(3).getNome()+"  "+gironeQuarti.get(3).getPunteggio());
           System.out.println("-------------------------------");
           
         System.out.println(gironeQuarti.get(4).getNome()+""+gironeQuarti.get(4).getPunteggio());
         System.out.println(gironeQuarti.get(5).getNome()+""+gironeQuarti.get(5).getPunteggio());
          System.out.println(gironeQuarti.get(6).getNome()+""+gironeQuarti.get(6).getPunteggio());
           System.out.println(gironeQuarti.get(7).getNome()+"  "+gironeQuarti.get(7).getPunteggio());
           System.out.println("-------------------------------");
        
         hb1.getChildren().clear();
         hb1.getChildren().add(lblNpaese1);
         hb1.getChildren().add(gironeQuarti.get(0).getBandieraa());

        
          hb2.getChildren().clear();
          hb2.getChildren().add(lblNpaese2);
          hb2.getChildren().add(gironeQuarti.get(1).getBandieraa());
        
        
           hb3.getChildren().clear();
           hb3.getChildren().add(lblNpaese3);
           hb3.getChildren().add(gironeQuarti.get(2).getBandieraa());
        
       
          hb4.getChildren().clear();
          hb4.getChildren().add(lblNpaese4);
          hb4.getChildren().add(gironeQuarti.get(3).getBandieraa());
        
          
          hb5.getChildren().clear();
         hb5.getChildren().add(lblNpaese5);
         hb5.getChildren().add(gironeQuarti.get(4).getBandieraa());

          hb6.getChildren().clear();
          hb6.getChildren().add(lblNpaese6);
          hb6.getChildren().add(gironeQuarti.get(5).getBandieraa());
        
        
          hb7.getChildren().clear();
          hb7.getChildren().add(lblNpaese7);
          hb7.getChildren().add(gironeQuarti.get(6).getBandieraa());
        
       
          hb8.getChildren().clear();
          hb8.getChildren().add(lblNpaese8);
          hb8.getChildren().add(gironeQuarti.get(7).getBandieraa());
     }
    
    
}
