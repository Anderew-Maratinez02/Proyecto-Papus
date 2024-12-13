import java.util.Scanner;

public class CajaDeHerramientas {
    Scanner sc = new Scanner(System.in);

    

    
    /** 
     * @param pedirNumero
     * @param pedirDoubles
     * @param pediString
     * @param pedirConfirmarPedido
     *
     * Clase usada para el uso del Peticiones de valores por teclado via scanner
     * que cada metodo varia el valor de su return dependiendo las necesidades 
     */
    public int pedirNumero() {
        return sc.nextInt();
    }

    public double pedirDoubles() {
        return sc.nextDouble();
    }

    public String pedirString() {
        String palabraClave = sc.nextLine();
        return palabraClave;
    }

    public char confirmarPedido() {
        String temporal = sc.next();

        return temporal.charAt(0);
    }

    public void evitarSaltoDeEnteros() //metodo para evitar errores de scanner
    {
        sc.nextLine();
    }

}

