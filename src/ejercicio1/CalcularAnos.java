

package ejercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author dfloresalarcon
 */
public class CalcularAnos extends Thread {
    
    private String nombre;

    public CalcularAnos(String nombre)
    {
        
    }
    
    public CalcularAnos()
    {}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaMenor =null;
        
        String fecha = JOptionPane.showInputDialog("Dame tu fecha de nacimiento formato DD/MM/YYYY");
        try {
            fechaMenor = formato.parse(fecha);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());        
        }
        
        
        int anos = diferenciaEnDias2(fechaMenor)/365;
        System.out.println("dias::: " + diferenciaEnDias2(fechaMenor)+
                "\nAños::: "+anos);
    }

    public static int diferenciaEnDias2(Date fechaMenor) {
        Date fecha = new Date();
        long diferencia = fecha.getTime() - fechaMenor.getTime();
        long dias = diferencia / (1000 * 60 * 60 * 24);
        return (int) dias;
    }
}
