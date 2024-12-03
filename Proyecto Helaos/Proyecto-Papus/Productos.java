

public class Productos {
    CajaDeHerramientas ch = new CajaDeHerramientas();

    public String[] helados;
    public String[] granizado;
    public String[] gofres;
    public String[] bebidas;

    public double precioHelados[];




    public Productos() 
    {
        this.helados =  new String[]{"Helado de fresa", "Helado de limón", "Helado de nieve"};
        this.granizado =  new String[]{"Granizado de piña", "Granizado de Cola", "Granizado de kiwi"};
        this.gofres =  new String[]{"Gofre de chocolate", "Gofre de vainilla", "Gofre Mixto"};
        this.bebidas =  new String[]{"Colaculo", "Zumo melocotón", "Ron cola"};
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

    public void cambiarNombreProductos(int num) {
        int numElegir = 0;
        System.out.println("Elije que apartado del producto 1-4");
        numElegir = num;

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
            numElegir = ch.pedirNumero();

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
            numElegir = ch.pedirNumero();

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
            numElegir = ch.pedirNumero();

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
            numElegir = ch.pedirNumero();;

        } while (numElegir != 0);
    }


}
