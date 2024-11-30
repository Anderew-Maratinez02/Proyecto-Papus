import java.util.Scanner;

public class menusClientes {
     Scanner sc = new Scanner(System.in);

    

    
    
    public void mostrarMenu(){

    int numPedido = 0;
    

        do 
        { 
        System.out.println("elige un apartado del menú del 1 al 5");
            
        System.out.println("1. Helados fríos");
 
         System.out.println("---------------");
         System.out.println("2. Granizao");
 
         System.out.println("---------------");
         System.out.println("3. Gofres");
 
         System.out.println("---------------");
         System.out.println("4. Bebias");
 
         System.out.println("---------------");
         System.out.println("5. Salir del menú");
         
          numPedido = sc.nextInt();

          if (numPedido > 5 || numPedido < 0) 
          {
            System.out.println("Opción invalida");  
          }
         
        } while (numPedido != 5 && numPedido <5 && numPedido > 0) ;
        
     }
}