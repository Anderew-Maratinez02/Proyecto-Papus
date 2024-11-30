import java.util.Scanner;

public class heladosMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menusClientes menuClientes1 = new menusClientes();
        Administrador menuAdministrador = new Administrador();
        menuMain(sc,menuClientes1,menuAdministrador);

        
        
        
    }
    public static void menuMain (Scanner sc,menusClientes menuClientes1, Administrador menuAdministrador)
    {
        System.out.println("¡Bienvenido a Heladeria Papus!");

        int numPedido = 0;
    

        do 
        { 
        System.out.println("elige un apartado del menú del 1 al 5");
            
         System.out.println("1. Menu para clientes");
       
         System.out.println("2. Administrador");
         System.out.println("---------------");
         System.out.println("3. Salir del menú");
         
          numPedido = sc.nextInt();

          if (numPedido > 3 || numPedido < 0) 
          {
            System.out.println("Opción invalida");  
          }
          
          elegirMenuMain(sc, numPedido, menuClientes1,menuAdministrador);
          

        } while (numPedido != 3 && numPedido <3 && numPedido > 0) ;
        
    }

    public static void elegirMenuMain (Scanner sc,int numPedido,menusClientes menuClientes1, Administrador menuAdministrador)
    {
        switch (numPedido) 
        {
            case 1:menuClientes1.mostrarMenu();
            break;

            case 2:
                menuAdministrador.ingresoAdministrador();
            break;
        
            default:
                break;
        }
    }

}

