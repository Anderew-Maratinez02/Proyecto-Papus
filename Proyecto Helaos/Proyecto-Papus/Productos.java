public class Productos {
    CajaDeHerramientas ch = new CajaDeHerramientas();

    private String[] helados;
    private String[] granizado;
    private String[] gofres;
    private String[] bebidas;

    private double precioHelados[];
    private double precioGranizado[];
    private double precioGofres[];
    private double precioBebidas[];

    private double cuenta; 



    

    protected Productos() {
        this.helados = new String[]{"Helado de fresa", "Helado de limón", "Helado de nieve"};
        this.granizado = new String[]{"Granizado de piña", "Granizado de Cola", "Granizado de kiwi"};
        this.gofres = new String[]{"Gofre de chocolate", "Gofre de vainilla", "Gofre Mixto"};
        this.bebidas = new String[]{"Colaculo", "Zumo melocotón", "Ron cola"};
        this.precioHelados = new double[] {5,4,3};
        this.precioGranizado = new double[] {3,3.5,4};
        this.precioGofres = new double[] {6.5,6.5,8};
        this.precioBebidas = new double[] {3,4,6.99};
        this.cuenta = 0;
    }

    protected void getTodosLosProductos() {
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
        public double getCuenta() 
        
    {
        return cuenta;
    }
    protected void cambiarNombreProductos() { // Esta funcion aun no esta en uso y podrias meterla en administrador
        int numElegir = 0;
        int numElegirProducto= 0;
        String nombreNuevo = "jija";
       
        
        do {System.out.println("Elije que apartado del producto 1-4");
        System.out.println("1º Helados");
        System.out.println("2º Granizado");
        System.out.println("3º Gofres");
        System.out.println("4º Bebidas");
        System.out.println("5º Salir");

        numElegir = ch.pedirNumero();

        switch (numElegir) {
            case 1:for (int i = 0; i < helados.length; i++) {
                System.out.println("º" + (i+1) + " " + helados[i]);
            }
            System.out.println("Estas cambiando... Helados, elige cual cambiar");
            numElegirProducto = ch.pedirNumero();
            if (numElegirProducto == 1) 
            {
                nombreNuevo = ch.pedirString();
               helados[0] =  nombreNuevo;
            }

            break;
            case 2:for (int i = 0; i < granizado.length; i++) {
                System.out.println("º" + (i+1) + " " + granizado[i]);
            }
            System.out.println("Estas cambiando... granizados, elige cual cambiar");
            numElegirProducto = ch.pedirNumero();
            switch (numElegirProducto) {

                case 1:granizado[0] = ch.pedirString();
                break;

                case 2:granizado[1] = ch.pedirString();
                break;

                case 3:granizado[2] = ch.pedirString();
                break;
            
                default:System.out.println("Opción invalida");
                break;
            }
            break;
            case 3:for (int i = 0; i < gofres.length; i++) {
                System.out.println("º" + (i+1) + " " + gofres[i]);
            }
            System.out.println("Estas cambiando... gofres, elige cual cambiar");
            numElegirProducto = ch.pedirNumero();
            switch (numElegirProducto) {

                case 1:gofres[0] = ch.pedirString();
                break;

                case 2:gofres[1] = ch.pedirString();
                break;

                case 3:gofres[2] = ch.pedirString();
                break;
            
                default:System.out.println("Opción invalida");
                break;
            }
            break;
            case 4:for (int i = 0; i < bebidas.length; i++) {
                System.out.println("º" + (i+1) + " " + bebidas[i]);
            }
            System.out.println("Estas cambiando... bebidas, elige cual cambiar");
            numElegirProducto = ch.pedirNumero();
            switch (numElegirProducto) {

                case 1:bebidas[0] = ch.pedirString();
                break;

                case 2:bebidas[1] = ch.pedirString();
                break;

                case 3:bebidas[2] = ch.pedirString();
                break;
            
                default:System.out.println("Opción invalida");
                break;
            }
            break;
        
            default:System.out.println("Opcion de clase de producto incorrecta o desconocida");
                break;
        }

            
        } while (numElegir != 5);
        
            
        

    }

    protected void getHelados() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");

            for (int i = 0; i < helados.length; i++) {
                System.out.println("º" + (i + 1) + " " + helados[i]);
                System.out.println("-------------------");

            }
            numElegir = ch.pedirNumero();

            switch (numElegir) {

                case 1: System.out.println("||¿Deseas este producto? "+helados[0]+ " ||");

                System.out.println("si - no");
                    char charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ helados[0] +" ||");
                        cuenta += precioHelados[0];
                    }
        
                break;

                case 2: 
                        System.out.println("||¿Deseas este producto? "+ helados[1]+ " ||");

                        System.out.println("si - no");
                         charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ helados[1] +" ||");
                        cuenta += precioHelados[1];
                    }
                break;

                
                case 3: System.out.println("||¿Deseas este producto? "+ helados[2]+ " ||");

                        System.out.println("si - no");
                        charConfirmar = ch.confirmarPedido();

                        if (charConfirmar == 's') 
                        {
                            System.out.println("||Elegiste... "+ helados[2] +" ||");
                            cuenta += precioHelados[2];
                        }
                break;
            
                default:System.out.println("||Elegiste... "+ " una opción incorrecta||");
               
                break;
            }



        } while (numElegir != 0);

    }

   protected void getGranizados() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");

            for (int a = 0; a < granizado.length; a++) {
                System.out.println("º" + (a + 1) + " " + granizado[a]);
                System.out.println("-------------------");

            }
            numElegir = ch.pedirNumero();

            switch (numElegir) {

                case 1: System.out.println("||¿Deseas este producto? "+granizado[0]+ " ||");

                System.out.println("si - no");
                    char charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ granizado[0] +" ||");
                        cuenta += precioGranizado[0];
                    }
        
                break;

                case 2: 
                        System.out.println("||¿Deseas este producto? "+ granizado[1]+ " ||");

                        System.out.println("si - no");
                         charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ granizado[1] +" ||");
                        cuenta += precioGranizado[1];
                    }
                break;

                
                case 3: System.out.println("||¿Deseas este producto? "+ granizado[2]+ " ||");

                        System.out.println("si - no");
                        charConfirmar = ch.confirmarPedido();

                        if (charConfirmar == 's') 
                        {
                            System.out.println("||Elegiste... "+ granizado[2] +" ||");
                            cuenta += precioGranizado[2];
                        }
                break;
            
                default:System.out.println("||Elegiste... "+ " una opción incorrecta||");
               
                break;
            }



        } while (numElegir != 0);
    }


    protected void getGofres() {
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

            switch (numElegir) {

                case 1: System.out.println("||¿Deseas este producto? "+gofres[0]+ " ||");

                System.out.println("si - no");
                    char charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ gofres[0] +" ||");
                        cuenta += precioGofres[0];
                    }
        
                break;

                case 2: 
                        System.out.println("||¿Deseas este producto? "+ gofres[1]+ " ||");

                        System.out.println("si - no");
                         charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ gofres[1] +" ||");
                        cuenta += precioGofres[1];
                    }
                break;

                
                case 3: System.out.println("||¿Deseas este producto? "+ gofres[2]+ " ||");

                        System.out.println("si - no");
                        charConfirmar = ch.confirmarPedido();

                        if (charConfirmar == 's') 
                        {
                            System.out.println("||Elegiste... "+ gofres[2] +" ||");
                            cuenta += precioGofres[2];
                        }
                break;
            
                default:System.out.println("||Elegiste... "+ " una opción incorrecta||");
               
                break;
            }


        } while (numElegir != 0);
    }

   protected void getBebidas() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");


            {
                for (int c = 0; c < bebidas.length; c++)
                    System.out.println("º" + (c + 1) + " " + bebidas[c]+" "+precioBebidas[c]+" $");
                System.out.println("-------------------");


            }
           
            numElegir = ch.pedirNumero();

            switch (numElegir) {

                case 1: System.out.println("||¿Deseas este producto? "+ bebidas[0]+ " ||");

                System.out.println("si - no");
                    char charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ bebidas[0] +" ||");
                        cuenta += precioBebidas[0];
                    }
        
                break;

                case 2: 
                        System.out.println("||¿Deseas este producto? "+ bebidas[1]+ " ||");

                        System.out.println("si - no");
                         charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ bebidas[1] +" ||");
                        cuenta += precioBebidas[1];
                    }
                break;

                
                case 3: System.out.println("||¿Deseas este producto? "+ bebidas[2]+ " ||");

                        System.out.println("si - no");
                        charConfirmar = ch.confirmarPedido();

                        if (charConfirmar == 's') 
                        {
                            System.out.println("||Elegiste... "+ bebidas[2] +" ||");
                            cuenta += precioBebidas[2];
                        }
                break;
            
                default:System.out.println("||Elegiste... "+ " una opción incorrecta||");
               
                break;
            }



        } while (numElegir != 0);
    }

}