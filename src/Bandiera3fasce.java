
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 * Questa classe rappresenta una bandiera a 3 fasce ed
 * estende la classe padre Bandieraa
 * @author Simone.Pontalti
 */
public class Bandiera3fasce extends Bandieraa {
    
    Rectangle rect1; 
    Rectangle rect2; 
    Rectangle rect3; 

 
   /**
    * Questo è il costruttore della classe che mi serve per istanziare un oggetto
    * @param v, è di tipo String e rappresental'opzione "verticale"/"orizzontale"
    */
    public Bandiera3fasce(String v){
        
     
      if (v.equals("verticale")){
         
         rect1 = new Rectangle(50,10);
         rect2 = new Rectangle(50,10);
         rect3 = new Rectangle(50,10);

         VBox vb = new VBox();
         vb.setPadding(new Insets(5,5,5,5));
         vb.getChildren().addAll(rect1,rect2,rect3);
         this.getChildren().add(vb);
         
     }
     else if (v.equals("orizzontale")){
         
        rect1 = new Rectangle(17,30);
        rect2 = new Rectangle(17,30);
        rect3 = new Rectangle(17,30);
    
         HBox hb = new HBox();
         hb.setPadding(new Insets(5,5,5,5));
         hb.getChildren().addAll(rect1,rect2,rect3);
         this.getChildren().add(hb);
     }
    

    
    }
    
    /**
     * Qua implemento il metodo abstract della classe Bandieraa
     * @param x, rappresenta il primo colore
     * @param y, rappresenta il secondo colore
     * @param z, rappresenta il terzo colore 
     */
    public void disegna(Color x, Color y, Color z){
    
        rect1.setFill(x);
        rect2.setFill(y);
        
   
        rect3.setFill(z);
    
    
    }
    
}
    