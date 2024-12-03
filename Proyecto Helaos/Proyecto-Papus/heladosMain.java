

public class heladosMain {
    public static void main(String[] args) {
        CajaDeHerramientas ch = new CajaDeHerramientas();
        menusClientes menuClientes1 = new menusClientes();
        Administrador menuAdministrador = new Administrador();


        
        menuMain(ch,menuClientes1,menuAdministrador);

        
        
        
    }
    public static void menuMain (CajaDeHerramientas ch, menusClientes menuClientes1, Administrador menuAdministrador)
    {
        System.out.println("¡Bienvenido a Heladeria Papus!");

        int numPedido = 0;
    

        do 
        { 
            System.out.println(" ");
        System.out.println("elige un apartado del menú del 1 al 3");
        System.out.println(" ");
            
         System.out.println("1. Menú para clientes");
         System.out.println("---------------");
         System.out.println("2. Administrador");
         System.out.println("---------------");
         System.out.println("3. Salir del menú");
         
          numPedido = ch.pedirNumero();

          if (numPedido > 3 || numPedido < 0) 
          {
            System.out.println("Opción inválida");
          }
          
          elegirMenuMain(ch, numPedido, menuClientes1,menuAdministrador);
          

        } while (numPedido != 3 && numPedido <3 && numPedido > 0) ;
        
    }

    public static void elegirMenuMain (CajaDeHerramientas ch,int numPedido,menusClientes menuClientes1, Administrador menuAdministrador)
    {
        switch (numPedido) 
        {
            case 1:menuClientes1.mostrarMenu();
            break;

            case 2:
                System.out.println("Ingrese el pin de acceso");
                menuAdministrador.ingresoAdministrador();
            break;
        
            default:
                break;
        }
    }
 
}