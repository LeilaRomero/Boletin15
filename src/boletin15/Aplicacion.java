package boletin15;

import Paquete.Persoal;
import calcularnotamedia.CalcularNotaMedia;

/**
 *
 * @author Leila
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persoal alumno = new Persoal(101010,"leila@gmail.com");
        String datos=alumno.toString();
        System.out.println(datos);
        
        CalcularNotaMedia nota=new CalcularNotaMedia();
        nota.setNotaPrimeraEvaluacion();
        
        
    }
    
}
