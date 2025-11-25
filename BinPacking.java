
/**
 * Write a description of class BinPacking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinPacking
{
    private int cantidadBins;
    private int capacidadBins;
    private int[] pesos;
    private int[] usoBins;
    private int[] binAsignada;
    private int[] posicionesItems;
    
    public BinPacking(int cantidadBins, int capacidadBins, int[] pesos) {
        this.cantidadBins = cantidadBins;
        this.capacidadBins = capacidadBins;
        this.pesos = pesos;
        this.usoBins = new int[pesos.length];
        this.binAsignada = new int[pesos.length];
        this.posicionesItems = new int[pesos.length];
        for (int i = 0; i < pesos.length; i++) {
            usoBins[i] = 0;
            binAsignada[i] = 0; 
            posicionesItems[i] = -1;
        }
    }
    
    public void resolver() {
        this.resolverRecursivo(0);
    }
    
    //Este método recibe el número de ítem que se debe tratar de colocar
    private void resolverRecursivo(int posicionItem) {
        if (posicionItem < pesos.length) {
        //Colocar
            for (int i = 0; i < cantidadBins; i++) {
                if (this.usoBins[i] + this.pesos[posicionItem] <= this.capacidadBins) {
                    //En la bin i hay suficiente campo, colocar ahí
                    this.usoBins[i] += this.pesos[posicionItem];
                    this.binAsignada[posicionItem] = i;
                    //Llamado recursivo con posiciónItem+1
                    this.resolverRecursivo(posicionItem+1);
                    //Y ahora backtracking, quitamos el ítem de bin i
                    this.usoBins[i] -= this.pesos[posicionItem];
                    this.binAsignada[posicionItem] = -1;
                }
            }
        } else {
            System.out.println("No hay más ítems por colocar");
            this.mostrarSolucion();
        }
    }
    
    private void mostrarSolucion(){
       for (int i = 0; i < pesos.length; i++) {
            System.out.print(i + "->" + binAsignada[i] + " ");
       }
       System.out.println("Fin de solución");
    }
    
    public static void main(String[] args) {
        int[] pesos = {3,7,6,4,5};
        BinPacking bin = new BinPacking(3, 10, pesos);
        bin.resolver();
    }
}