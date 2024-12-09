public class heladosMain {
    public static void main(String[] args) {
        CajaDeHerramientas ch = new CajaDeHerramientas();
        menusClientes menuClientes1 = new menusClientes();
        Administrador menuAdministrador = new Administrador();
        Productos productos = new Productos();

        double historialPrecioCompra[] = new double[3];
        int historialIdCliente[] = new int[25];

        int contadorArray = 0;


        menuMain(ch, menuClientes1, menuAdministrador, productos, historialPrecioCompra, historialIdCliente, contadorArray);


    }

    public static void menuMain(CajaDeHerramientas ch, menusClientes menuClientes1, Administrador menuAdministrador, Productos productos, double historialPrecioCompra[], int historialIdCliente[], int contadorArray) {
        System.out.println();
        System.out.println("¡Bienvenido a Heladeria Papus!");

        int numPedido = 0;


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
            obtenerInformacion(historialPrecioCompra, historialIdCliente, contadorArray, productos);
            productos.resetearCuenta();


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


    public static void obtenerInformacion(double historialPrecioCompra[], int historialIdCliente[], int contadorArray, Productos productos) {

        historialPrecioCompra[contadorArray] = productos.getTotalCuenta();
        historialIdCliente[contadorArray] = productos.getIdCliente();

        contadorArray += 1;
        for (int i = 0; i < historialPrecioCompra.length; i++) {
            System.out.println("Ciente º " + historialIdCliente[i] + " " + historialPrecioCompra[i] + " $");

        }

    }

    public static void mostrarHistorialDeVentas(double historialPrecioCompra[], int historialIdCliente[], Productos productos) {
        for (int i = 0; i < historialPrecioCompra.length; i++) {
            System.out.println("Ciente º " + historialIdCliente[i] + " " + historialPrecioCompra[i] + " $");

        }
    }
}