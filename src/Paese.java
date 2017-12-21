
import java.util.Comparator;

//domanda 1 : cosa è un interface?
//domanda 2 : qual'è la differenza tra ereditarietà signola ed ereditarietà multipla?

/**
 * Questa classe si chiama paese e rappresenta un paese che partecipa al campionato
 * @author Simone.Pontalti
 */


public class Paese implements Comparator<Paese>, Comparable<Paese>{  // la classe Paese implememnta due interfaccie : 1) Comparator,  2) Comparable
    
    private String nome = null;
    private int punteggio= 0;
    private Bandieraa band = null;
    
    
    /**
     * Questo è il costruttore che accetta 3 parametri e viene usato per istanziare un oggetto
     * @param nome di tipo String ,rappresenta il nome del paese
     * @param punteggio di tipo int, rappresenta il punteggio della squadra
     * @param band di tipo bandiera, rappresenta la bandiera della squadra
     */
    
public Paese(String nome, int punteggio, Bandieraa band){
        
        this.nome = nome;   //cambio il valore della proprietà nome a sinistra con quello dopo l'=, il valore verrà passato quando
                            //chiamo il costruttore
        this.punteggio = punteggio;
        this.band = band;
        
    }

    /**
     * Questo metodo ritorna il nome della squadra
     * @return, ritorna una stringa che rappresenta il nome della squadra
     */
    
    public String getNome(){
        return nome;
    
    }
    
    /**
     * Questo metodo ritorna il punteggio della squadra
     * @return, ritorna un intero che rappresenta il punteggio della squadra
     */
    public int getPunteggio(){
        return punteggio;
    
    }
    
    public Bandieraa getBandieraa(){
    
        return band;
    }
    
    
    
    /**
     * Questo metodo serve per aggiornare il punteggio della squadra
     * @param punteggio è di tipo int che rappresenta il punteggio della squadra
     */
     public void setPunteggio(int punteggio){
    
       this.punteggio=punteggio;
    }
    /**
     * Questo metodo confronta due paesi e viene usato per ordinare la lista delle squadre
     * @param d, rappresenta un paese
     * @param d1, rappresenta un altro paese
     * @return , mi ritorna un intero che rappresenta il risultato del confronto
     */
  public int compare(Paese d, Paese d1){    // compare appartiene all'interface Comparator
        
        if (d.punteggio!=d1.punteggio){ // se i punteggi dei due paesi sono diversi, ordino secondo il punteggio
        
            return d.punteggio - d1.punteggio;   ////// Serve per ordinare un ArrayList di paese in base al punteggio
        
        }
        
       //se i punteggi dei due paesi sono uguali li ordino secondo i loro nomi con il metodo---> .compareToIgnoreCase
            return d.nome.compareToIgnoreCase(d1.nome);
   }

    ///////////////////////////// metodo per confrontare il paese in base al punteggio!
    ///////////////////////////// metodo per confrontare due paesi in base al punteggio
    
    
    /**
     * Questo metodo compara this paese (il primo nel confronto) con un altro paese ricevuto come parametro
     * @param comparePaese
     * @return ,ritorna un intero che rappresenta il risultato della comparazione
     */
    public int compareTo(Paese comparePaese) { // compareTo appartiene all'interface Comparable

       int comparePunteggio =  comparePaese.getPunteggio();

		//ascending order
		//return this.punteggio - comparePunteggio;

		//descending order
	return comparePunteggio - this.punteggio;

	}
 
}
