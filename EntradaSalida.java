import javax.swing.JOptionPane;

/**
 * Esta clase se encarga de la interacción con el usuario vía pantalla. Es capaz de
 * solicitar un entero, un decimal o una hilera. También es capaz de mostrar un mensaje
 * en pantalla, siempre usando los métodos de JOptionPane.
 */
public class EntradaSalida
{
    //Este método muestra un mensaje al usuario (recibido por parámetro). Luego
    //captura lo digitado por el usuario y lo convierte a entero y devuelve este valor.
    public int solicitarEntero(String mensajeParametro) {
        String enteroHilera = JOptionPane.showInputDialog(null, mensajeParametro);
        int enteroDigitado = Integer.parseInt(enteroHilera);
        return enteroDigitado;
    }

    //Este método muestra un mensaje al usuario (recibido por parámetro). Luego
    //captura lo digitado por el usuario y lo convierte a decimal y devuelve este valor.
    public double solicitarDecimal(String mensajeParametro) {
        String decimalHilera = JOptionPane.showInputDialog(null, mensajeParametro);
        double decimalDigitado = Double.parseDouble(decimalHilera);
        return decimalDigitado;
    }
    
    //Este método muestra un mensaje al usuario (recibido por parámetro). Luego
    //captura lo digitado y lo devuelve como hilera.
    public String solicitarHilera(String mensajeParametro) {
        String hileraDigitada = JOptionPane.showInputDialog(null, mensajeParametro);
        return hileraDigitada;
    }
    
    //Este método recibe una hilera por parámetro y la muestra en pantalla
    public void mostrarMensaje(String mensajeParametro) {
        JOptionPane.showMessageDialog(null, mensajeParametro);
    }
    
}