public class heladosMain {
    public static void main(String[] args) {
        CajaDeHerramientas ch = new CajaDeHerramientas();
        menusClientes menuClientes1 = new menusClientes();
        Administrador menuAdministrador = new Administrador();
        Productos productos = new Productos();

        int contador = 0;


        double historialPrecioCompra[] = new double[10] ;
        int historialIdCliente[] = new int[10] ;

        menuMain( contador,ch, menuClientes1, menuAdministrador, productos,historialPrecioCompra,historialIdCliente);
          
    }


    public static void menuMain( int contador,CajaDeHerramientas ch, menusClientes menuClientes1, Administrador menuAdministrador, Productos productos, double historialPrecioCompra[], int historialIdCliente[]) {
        int numPedido = 0;
        

        System.out.println();
        System.out.println("¡Bienvenido a Heladeria Papus!");

        


        do {
            System.out.println(" ");
            System.out.println("Elige un apartado del menú del 1 al 3");
            System.out.println(" ");

            System.out.println("1.Menú para clientes");
            System.out.println("---------------");
            System.out.println("2.Administrador");
            System.out.println("---------------");
            System.out.println("3.Salir del menú");

            numPedido = ch.pedirNumero();
            if (numPedido > 3 || numPedido < 0) {
                System.out.println("Opción inválida");
            }
            
           
            elegirMenuMain( ch, numPedido, menuClientes1, menuAdministrador);
            obtenerInformacion(historialPrecioCompra, historialIdCliente, contador, productos, menuClientes1);
           contador ++;
           menuClientes1.productos2.resetearCuenta();

        } while (numPedido != 3 && numPedido < 3 && numPedido > 0);

    }

    public static void elegirMenuMain(CajaDeHerramientas ch, int numPedido, menusClientes menuClientes1, Administrador menuAdministrador) {
        switch (numPedido) {
            case 1:
                menuClientes1.mostrarMenu();

                break;

            case 2:
                System.out.println("Ingrese el pin de acceso");
                menuAdministrador.ingresoAdministrador();
                break;
            case 3:
                System.out.println("Saliendo del menú");
                break;
            default:
                System.out.println("Opcion no válida");
                break;
        }
    }


    public static void obtenerInformacion(double historialPrecioCompra[], int historialIdCliente[],int contador, Productos productos, menusClientes menuClientes1) {
        

        

        historialPrecioCompra[contador] = menuClientes1.productos2.getTotalCuenta();
        historialIdCliente[contador] = menuClientes1.productos2.getIdCliente();
        
        for (int j = 0; j < historialIdCliente.length;j++)
        { 
        if (historialIdCliente[j] != 0)
            { 
                System.out.println("Ciente #ID " + historialIdCliente[j] + " " + historialPrecioCompra[j] + " $");
                
            }
            

        }
        System.out.println(contador);
        


    }

    public static void mostrarHistorialDeVentas(double historialPrecioCompra[], int historialIdCliente[], Productos productos) {
        for (int i = 0; i < historialPrecioCompra.length; i++) {
            System.out.println("Ciente º " + historialIdCliente[i] + " " + historialPrecioCompra[i] + " $");

        }
    }


}