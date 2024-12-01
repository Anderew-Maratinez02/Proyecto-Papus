import java.util.Scanner;

public class menusClientes {
    Scanner sc = new Scanner(System.in);
    Productos productos = new Productos(
            new String[]{"Helado de fresa", "Helado de limón", "Helado de nieve"},
            new String[]{"Granizado de piña", "Granizado de Cola", "Granizado de kiwi"},
            new String[]{"Gofre de chocolate", "Gofre de vainilla", "Gofre Mixto"},
            new String[]{"Colaculo", "Zumo melocotón", "Ron cola"});
    //Cambiar esto

    public void mostrarMenu() {

        int numPedido = 0;


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
            System.out.println("5. Salir del menú");

            numPedido = sc.nextInt();

            if (numPedido > 5 || numPedido < 0) {
                System.out.println("Opción invalida");
            }

            elegirMenuClientes(sc, numPedido,  productos);

        } while (numPedido != 5 && numPedido < 5 && numPedido > 0);

    }

    public static void elegirMenuClientes(Scanner sc, int numPedido, Productos productos) {
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

            default:
                break;
        }
    }
}