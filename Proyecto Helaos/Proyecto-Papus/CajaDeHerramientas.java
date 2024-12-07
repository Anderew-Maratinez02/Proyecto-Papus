import java.util.Scanner;

public class CajaDeHerramientas {
    Scanner sc = new Scanner(System.in);

        public int pedirNumero()
    {
        int numTemporal = 0;
        numTemporal = sc.nextInt();
        return numTemporal;
    }

    public String pedirString(){
          String palabraClave = sc.nextLine();
          return palabraClave;
    }

    public char confirmarPedido ()
    {
        String temporal = sc.next();
        
        return temporal.charAt(0);
    }
    public void evitarSaltoDeEnteros(){
            sc.nextLine();
    }
}
