import java.util.Scanner;

public class Productos {
    Scanner sc = new Scanner(System.in);
    public String[] helados;
    public String[] granizado;
    public String[] gofres;
    public String[] bebidas;

    public double precioHelados[];


    public Productos(String[] helados, String[] granizado, String[] gofres, String[] bebidas) {
        this.helados = helados;
        this.granizado = granizado;
        this.gofres = gofres;
        this.bebidas = bebidas;
    }

    public void getTodosLosProductos() {
        for (int i = 0; i < helados.length; i++) {
            System.out.println(helados[i]);
        }

        for (int a = 0; a < granizado.length; a++) {
            System.out.println(granizado[a]);
        }

        for (int b = 0; b < gofres.length; b++) {
            System.out.println(gofres[b]);
        }

        for (int c = 0; c < bebidas.length; c++) {
            System.out.println(bebidas[c]);
        }

    }

    public void cambiarNombreProductos() {
        int numElegir = 0;
        System.out.println("Elije que apartado del producto 1-4");
        numElegir = sc.nextInt();

        if (numElegir == 1) {
            for (int i = 0; i < helados.length; i++) {
                System.out.println("º" + i + " " + helados[i]);
            }
        }

    }

    public void getHelados() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");

            for (int i = 0; i < helados.length; i++) {
                System.out.println("º" + (i + 1) + " " + helados[i]);
                System.out.println("-------------------");

            }
            numElegir = sc.nextInt();

        } while (numElegir != 0);

    }

    public void getGranizados() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");

            for (int a = 0; a < granizado.length; a++) {
                System.out.println("º" + (a + 1) + " " + granizado[a]);
                System.out.println("-------------------");

            }
            numElegir = sc.nextInt();

        } while (numElegir != 0);
    }


    public void getGofres() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");


            {
                for (int b = 0; b < gofres.length; b++)
                    System.out.println("º" + (b + 1) + " " + gofres[b]);
                System.out.println("-------------------");


            }
            numElegir = sc.nextInt();

        } while (numElegir != 0);
    }

    public void getBebidas() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");


            {
                for (int c = 0; c < bebidas.length; c++)
                    System.out.println("º" + (c + 1) + " " + bebidas[c]);
                System.out.println("-------------------");


            }
            numElegir = sc.nextInt();

        } while (numElegir != 0);
    }

    
}
