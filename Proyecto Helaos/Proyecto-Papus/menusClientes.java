public class menusClientes {
    CajaDeHerramientas ch = new CajaDeHerramientas();
    Productos productos = new Productos();
    protected String arrayOpcionCliente[];
    protected int cantidadPersonas;
    protected int contadorHelados;
    protected int contadorGranizados;
    protected int contadorGofres;
    protected int contadorBebidas;

    public int contadoresProductos(int cHelados, int cGranizados, int cGofres, int cBebidas) {
        this.contadorHelados = cHelados;
        this.contadorGranizados = cGranizados;
        this.contadorGofres = cGofres;
        this.contadorBebidas = cBebidas;
        int total = contadorHelados + contadorGranizados + contadorGofres + contadorBebidas;
        System.out.println("Helados" + contadorHelados + "\n"
                + "Granizaddos" + contadorGranizados + "\n"
                + "Gofres" + contadorGofres + "\n" +
                "Bebidas" + contadorBebidas);
        return total;
    }


    public menusClientes() {
        cantidadPersonas = pedirClientes();
    }

    public int pedirClientes() {
        System.out.println("Ingresa clientes");
        return ch.pedirNumero();
    }

    public void arrayParaClientes() {

        arrayOpcionCliente = new String[cantidadPersonas];
//        for (int i = 0; i < arrayOpcionCliente.length; i++) {
//            System.out.println("Cliente #" + (i + 1));
//        }

    }

    public void mostrarMenu() {
        arrayParaClientes();
        productos.contadoresProductos();
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

                elegirMenuClientes(numPedido, productos, contadorHelados, contadorGranizados, contadorGofres, contadorBebidas);

            } while (numPedido != 6 && numPedido < 6 && numPedido > 0);

        }
    }

    public static void elegirMenuClientes(int numPedido, Productos productos, int contadorHelados, int contadorGranizados, int contadorGofres, int contadorBebidas) {
        switch (numPedido) {
            case 1:
                productos.getHelados();
                contadorHelados++;
                break;

            case 2:
                productos.getGranizados();
                contadorGranizados++;
                break;

            case 3:
                productos.getGofres();
                contadorGofres++;
                break;

            case 4:
                productos.getBebidas();
                contadorBebidas++;
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

    public int getContadorHelados() {
        return contadorHelados;
    }

    public void setContadorHelados(int contadorHelados) {
        this.contadorHelados = contadorHelados;
    }
}
