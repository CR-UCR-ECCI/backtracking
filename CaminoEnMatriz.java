
/**
 * Código base para trabajar en el ejercicio de la práctica de examen relacionado con encontrar recursivamente el camino más largo
 * de números en orden creciente que sean vecinos. Imprime la matriz en la línea de comandos y deja pendiente dos ejercicios, uno para
 * listar todos los caminos de longitud n (que no es el ejercicio original) y otro para encontrar el camino más largo.
 */
public class CaminoEnMatriz
{
    private int filas;
    private int columnas;
    private int[][] matriz;
    EntradaSalida expertoIO;
    private final int SALIR = 3;
    
    public CaminoEnMatriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.inicializarMatriz();  
        this.expertoIO = new EntradaSalida();
    }
    
    public void mostrarOpciones() {
        int opcion = 0;
        do {
            String menu = "1. Caminos de longitud n.\n2. Camino más largo.\n3. Salir";
            opcion = this.expertoIO.solicitarEntero("Favor escoger una opción:\n"+menu);
            switch (opcion) {
                case 1: //Buscar todos los caminos de distancia n
                    int longitud = this.expertoIO.solicitarEntero("Favor elegir longitud del camino");
                    String caminos = this.encontrarCaminos(longitud);
                    this.expertoIO.mostrarMensaje("Caminos: " + caminos);
                    break;
                case 2: //Buscar el camino más largo
                    String camino = this.encontrarCaminoMasLargo();
                    this.expertoIO.mostrarMensaje("Camino más largo: " + camino);
                    break;
                case 3:
                    this.expertoIO.mostrarMensaje("Hasta luego. Feliz Black Friday");
                    break;
            }
        } while (opcion != this.SALIR);
    }
    
    /*
    Completar este método para la opción 1 del menú: listar todos los caminos
    de la longitud recibida por parámetro
    */
    private String encontrarCaminos(int longitud) {
        return "";
    }
    
    /*
    Completar este método para encontrar el camino más largo en toda la matriz.   
    */
    private String encontrarCaminoMasLargo(){
        return "";
    }
    
    private void inicializarMatriz() {
        this.matriz = new int[this.filas][this.columnas];
        int numeroMaximo = filas * columnas;
        String contenidoMatriz = "";
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                this.matriz[i][j] = (int) (Math.random() * numeroMaximo);
                contenidoMatriz += this.matriz[i][j] + "\t";
            }
            contenidoMatriz += "\n";
        }
        System.out.println("Matriz inicializada:\n" + contenidoMatriz);
    }
    
    public static void main(String[] args) {
        CaminoEnMatriz camino = new CaminoEnMatriz(4,5);
        camino.mostrarOpciones();
    }
}