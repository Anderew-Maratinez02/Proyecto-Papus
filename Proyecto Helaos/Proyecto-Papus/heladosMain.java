import java.util.Scanner;

public class heladosMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menusClientes menuClientes = new menusClientes();

        menuMain(sc);

        
        
        
    }
    public static void menuMain (Scanner sc)
    {
        System.out.println("¡Bienvenido a Heladeria Papus!");

        int numPedido = 0;
    

        do 
        { 
        System.out.println("elige un apartado del menú del 1 al 5");
            
         System.out.println("1. Menu para clientes");
         System.out.println("---------------");
       
         System.out.println("2. Administrador");
         System.out.println("---------------");
         System.out.println("3. Salir del menú");
         
          numPedido = sc.nextInt();

          if (numPedido > 3 || numPedido < 0) 
          {
            System.out.println("Opción invalida");  
          }
          
          elegirMenuMain(sc, numPedido, null);
          

        } while (numPedido != 3 && numPedido <3 && numPedido > 0) ;
        
    }

    public static void elegirMenuMain (Scanner sc,int numPedido,menusClientes menuClientes)
    {
        switch (numPedido) 
        {
            case 1:menuClientes.mostrarMenu();
            break;

            case 2:System.out.println("trabajando en ello xd");
            break;
        
            default:
                break;
        }
    }

}

