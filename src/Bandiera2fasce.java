

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Questa classe mi consente di creare una bandiera a due fasce
 * Estende la classe padre Bandieraa
 * @author Simone.Pontalti
 */
public class Bandiera2fasce extends Bandieraa{
    
    Rectangle rect1; 
    Rectangle rect2; 

 
   /**
    * Questo è il costruttore della classe
    * @param v, è di tipo String e rappresenta il valore "verticale" / "orizzontale"
    */
    public Bandiera2fasce(String v){
        
     rect1 = new Rectangle(10,10,50,10);
     rect2 = new Rectangle(10,10,50,10);
     
     if (v.equals("verticale")){
         
         VBox vb = new VBox();
         vb.setPadding(new Insets(5,5,5,5));
         vb.getChildren().addAll(rect1,rect2);
         this.getChildren().add(vb);
         
     }
     else if (v.equals("orizzontale")){
         
         HBox hb = new HBox();
         hb.setPadding(new Insets(5,5,5,5));
         hb.getChildren().addAll(rect1,rect2);
         this.getChildren().add(hb);
     }
    
    }
    
    
    /**
     * Qua implemento il metodo abstract della classe Bandieraa
     * @param x, rappresenta il primo colore
     * @param y, rappresenta il secondo colore
     * @param z, rappresenta il terzo colore che non fa modifiche
     */
    public void disegna(Color x, Color y, Color z){
    
        rect1.setFill(x);
        rect2.setFill(y);
    
    
    }
    
}


