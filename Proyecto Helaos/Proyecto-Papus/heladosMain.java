public class heladosMain {
    public static void main(String[] args) {
        CajaDeHerramientas ch = new CajaDeHerramientas();
        menusClientes menuClientes1 = new menusClientes();
        Administrador menuAdministrador = new Administrador();
        Productos productos = new Productos();


        menuMain(ch, menuClientes1, menuAdministrador, productos);
           System.out.println(menuClientes1.productos.getIdCliente()); 
           System.out.println(menuClientes1.productos.getTotalCuenta()); 
    }


    public static void menuMain(CajaDeHerramientas ch, menusClientes menuClientes1, Administrador menuAdministrador, Productos productos) {
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
            elegirMenuMain(ch, numPedido, menuClientes1, menuAdministrador);
            menuAdministrador.copiarCuenta();
            menuAdministrador.mostrarHistorialDeVentas();
           
           

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


    public static void obtenerInformacion(double historialPrecioCompra[], int historialIdCliente[], int contadorArray, Productos productos, menusClientes menuClientes1) {
        for (int j = 0; j < contadorArray;j++)
        {

        

        historialPrecioCompra[j] = menuClientes1.productos.getTotalCuenta();
        historialIdCliente[j] = menuClientes1.productos.getIdCliente();
        System.out.println("Ciente #ID " + historialIdCliente[j] + " " + historialPrecioCompra[j] + " $");
        }
        contadorArray ++;


    }

    public static void mostrarHistorialDeVentas(double historialPrecioCompra[], int historialIdCliente[], Productos productos) {
        for (int i = 0; i < historialPrecioCompra.length; i++) {
            System.out.println("Ciente º " + historialIdCliente[i] + " " + historialPrecioCompra[i] + " $");

        }
    }


}