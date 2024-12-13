import java.lang.reflect.Array;

public class menusClientes {
    CajaDeHerramientas ch = new CajaDeHerramientas();
    Productos productos2 = new Productos();
   
    
    
   
    
    protected String arrayOpcionCliente[];
    protected int cantidadPersonas = 0; //corregirrrr
    protected int cantidadTemporal = cantidadPersonas; //no lo uso

    public int cantidadPersonasEsperada() {
        System.out.println("Ingresa cantidad de personas");
        cantidadPersonas = ch.pedirNumero();
        return cantidadPersonas;
    }


    public void mostrarMenu() {
        cantidadPersonas = cantidadPersonasEsperada();
        arrayOpcionCliente = new String[cantidadPersonas];
        productos2.darIdCliente();
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
                /// /quitar esto xd commit por commit erroneous
                numPedido = ch.pedirNumero();


                if (numPedido > 6 || numPedido < 0) {
                    System.out.println("Opción invalida");
                }

                elegirMenuClientes(numPedido, productos2);

            } while (numPedido != 6 && numPedido < 6 && numPedido > 0);

            productos2.sumarTotalCuenta();
            

        }
    }

    public static void elegirMenuClientes(int numPedido, Productos productos2) {
        switch (numPedido) {
            case 1:
                productos2.getHelados();
                break;

            case 2:
                productos2.getGranizados();
                break;

            case 3:
                productos2.getGofres();
                break;

            case 4:
                productos2.getBebidas();
                break;

            case 5:
            productos2.soloMostrarCuenta();
           
                break;

            default:
                break;
        }
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }
    

}
