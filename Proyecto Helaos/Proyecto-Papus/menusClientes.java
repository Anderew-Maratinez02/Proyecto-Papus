public class menusClientes {
    CajaDeHerramientas ch = new CajaDeHerramientas();
    Productos productos = new Productos();
    protected String arrayOpcionCliente[];
    protected int cantidadPersonas = cantidadPersonasEsperada(); //corregirrrr
    protected int cantidadTemporal = cantidadPersonas;

    public int cantidadPersonasEsperada() {
        System.out.println("Ingresa cantidad de personas");
        return ch.pedirNumero();
    }


    public void mostrarMenu() {

        ch.evitarSaltoDeEnteros();
        arrayOpcionCliente = new String[cantidadTemporal];
        productos.darIdCliente();
        int numPedido = 0;
        for (int i = 0; i < arrayOpcionCliente.length; i++) {
            System.out.println("Cliente #" + (i + 1));
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
                System.out.println("6. Salir del menú y finalizar compra");

                numPedido = ch.pedirNumero();


                if (numPedido > 6 || numPedido < 0) {
                    System.out.println("Opción invalida");
                }

                elegirMenuClientes(numPedido, productos);

            } while (numPedido != 6 && numPedido < 6 && numPedido > 0);

        }
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
                productos.getCuentaCliente();
                break;

            default:
                break;
        }
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }
}
