public class menusClientes {
    CajaDeHerramientas ch = new CajaDeHerramientas();
    Productos productos = new Productos();
    protected int cantidadClientes = cantidadClientes();
    //Cambiar esto
    private String[] eleccionCliente;


    public int cantidadClientes(){
        System.out.println("Ingrese la cantidad de clientes");
        cantidadClientes = ch.pedirNumero();
        return cantidadClientes;
    }
    // cambiar la manera de como preguntar la cantidad n de clientes
    public void mostrarMenu() {
        ch.evitarSaltoDeEnteros();
        eleccionCliente = new String[cantidadClientes];
        int numPedido = 0;
        for (int i = 0; i < eleccionCliente.length; i++) {
            System.out.println("Cliente #" + (i + 1));
        }

        do {
            System.out.println(" ");
            System.out.println("elige un apartado del menú del 1 al 5");
            System.out.println(" ");

            System.out.println("1. Helados fríos");

            System.out.println("---------------");
            System.out.println("2. Granizados");

            System.out.println("---------------");
            System.out.println("3. Gofres");

            System.out.println("---------------");
            System.out.println("4. Bebidas");

            System.out.println("---------------");
            System.out.println("5. ver cuenta de compra");

            System.out.println("---------------");
            System.out.println("6. Salir del menú");

            numPedido = ch.pedirNumero();


            if (numPedido > 6 || numPedido < 0) {
                System.out.println("Opción invalida");
            }

            elegirMenuClientes(numPedido, productos);

        } while (numPedido != 6 && numPedido < 6 && numPedido > 0);

    }

    public static void elegirMenuClientes(int numPedido, Productos productos) {
        switch (numPedido) {
            case 1:
                productos.getHelados();
                break;

            case 2:
                productos.getGranizados();
                break;

            case 3:
                productos.getGofres();
                break;

            case 4:
                productos.getBebidas();
                break;

            case 5:
                productos.getCuenta();


                break;

            default:
                break;
        }
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }
}