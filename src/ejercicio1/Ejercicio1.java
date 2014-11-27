
package ejercicio1;

/**
 *
 * 
 * 
 * 
 * 
 * @author dfloresalarcon
 */
public class Ejercicio1 {

    public static void main(String[] args) throws InterruptedException {
        
            CalcularAnos hiloCalcular = new CalcularAnos();
            
            hiloCalcular.start();
            hiloCalcular.join();
            
            System.out.println("----Finalizado----");      
    }    
}