


public class boh {
    
    public static void main(String[] args) {

       
        String nome1= "Giulio";
        String nome2= "Marco";
        
        String nome3= "Fabrizio";
        String nome4= "Fabrizio";
        
        String nome5= "Paolo";
        String nome6= "Maria";
        
        
        
        int risultato1 = nome1.compareTo(nome2); //nome1 viene prima di nome2 in ordine alfabetico.. per questo il risultato è negativo
        int risultato2 = nome3.compareTo(nome4); // ""
        int risultato3 = nome5.compareTo(nome6); // nome1 viene dopo di nome2 in ordine alfabetico.. per questo il risultato è positivo
        
        System.out.println("Il risultato del confronto alfabetco : "+risultato1);
        System.out.println("Il risultato del confronto alfabetco : "+risultato2);
        System.out.println("Il risultato del confronto alfabetco : "+risultato3);
        
        
        
         
        
    }
    
}
