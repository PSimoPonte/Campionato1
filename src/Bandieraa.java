
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * Questa è una classe abstract e rappresenta  una bandiera generica
 * ed estende uno StackPane perchè andrò ad aggiungerlo ad un GridPane
 * @author Simone.Pontalti
 */
public abstract class Bandieraa extends StackPane{ //
    /**
     * Questo metodo mi consente di creare una bandiera con 3 colori
     * @param x, rappresenta il primo colore
     * @param y, rappresenta il secondo colore
     * @param z, rappresenta il terzo colore
     */
    public abstract void disegna(Color x, Color y, Color z);
    
    
}
