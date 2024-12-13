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
        System.out.println("¡Bienvenido a Heladería Papus!");

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
            if (numPedido > 3 || numPedido < 0) 
            {
                System.out.println("Opción inválida");
            }
            
           
            elegirMenuMain( ch, numPedido, menuClientes1, menuAdministrador);
            obtenerInformacion(historialPrecioCompra, historialIdCliente, contador, productos, menuClientes1);
            
            contador ++;

            menuClientes1.productos2.resetearCuenta();
            menuAdministrador.setnumeroDeClientes(contador);
            menuAdministrador.setHistorialIdClienteAdmin(historialIdCliente);
            menuAdministrador.setHistorialPrecioCompraAdmin(historialPrecioCompra);

        } while (numPedido != 3 && numPedido < 3 && numPedido > 0);

    }

    public static void elegirMenuMain(CajaDeHerramientas ch, int numPedido, menusClientes menuClientes1, Administrador menuAdministrador) {
        switch (numPedido) {
            case 1:
                menuClientes1.mostrarMenu();
            break;
            case 2:
                System.out.println("Ingrese el pin de acceso");
                menuAdministrador.ingresoAdministrador(menuClientes1);
                break;
            case 3:
                System.out.println("Saliendo del menú");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static void obtenerInformacion(double historialPrecioCompra[], int historialIdCliente[],int contador, Productos productos, menusClientes menuClientes1) {
        historialPrecioCompra[contador] = menuClientes1.productos2.getTotalCuenta();
        historialIdCliente[contador] = menuClientes1.productos2.getIdCliente();

    }  
}