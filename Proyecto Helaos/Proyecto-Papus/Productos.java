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

    
    /** 
     * @param cuenta
     * @param NomDeProductosComprado
     * @param tamCuenta
     * 
     * Estos tres valores muestran el resumen del pedido que realizar el cliente en el menú de clientes.
     * estos valores se usan en sus respectivos getters para copiar los valores al main.
     */
    private double[] cuenta;
    private String[] NomDeProductosComprados;
    private int tamCuenta;


 /** 
     * @param totalCuenta
     * @param idCliente
     * 
     * Estos dos atributos son el resultado final que se transfieren al main para guardar el registro del cliente
     * estos valores se usan en el metodo (soloMostrarCuenta).
     */
    private double totalCuenta = 0;
    private int idCliente = 0;


    protected Productos() {
        this.helados = new String[]{"Helado de fresa", "Helado de limón", "Helado de nieve"};
        this.granizado = new String[]{"Granizado de piña", "Granizado de Cola", "Granizado de kiwi"};
        this.gofres = new String[]{"Gofre de chocolate", "Gofre de vainilla", "Gofre Mixto"};
        this.bebidas = new String[]{"Colaculo", "Zumo melocotón", "Ron cola"};
        this.precioHelados = new double[]{5, 4, 3};
        this.precioGranizado = new double[]{3, 3.5, 4};
        this.precioGofres = new double[]{6.5, 6.5, 8};
        this.precioBebidas = new double[]{3, 4, 6.99};
        this.tamCuenta = 0;
        
        this.cuenta = new double[25];
        this.NomDeProductosComprados = new String[25];
        
    }



    public void darIdCliente() {
        int numeroAleatorio = 0;
        if (idCliente == 0 || idCliente == numeroAleatorio) {

            numeroAleatorio = (int) (Math.random() * 1000) + 1;
            idCliente = numeroAleatorio;
        }
    }

   

    protected void resetearCuenta() {
        for (int i = 0; i < cuenta.length; i++) {
            cuenta[i] = 0;
            NomDeProductosComprados[i] = "";
            
        }
        totalCuenta = 0;
        idCliente = 0;
        tamCuenta = 0;
    }

    public void sumarTotalCuenta ()
    {
        for (int i = 0; i < cuenta.length; i++) 
        {
        totalCuenta += cuenta[i];
        }

    }

    public void soloMostrarCuenta ()
    {
        for (int i = 0; i < cuenta.length; i++) 
        {if (NomDeProductosComprados[i] != null && cuenta[i] != 0){
            System.out.println(NomDeProductosComprados[i] + " " + cuenta[i]);
            totalCuenta += cuenta[i];
        }}
            System.out.println("Tu cuenta es de = " + totalCuenta);
            totalCuenta = 0; 
    }
    

    protected void cambiarNombreProductos() // metodo el cual se accede desde administrador para cambiar los nombres de productos
    {
        int numElegir = 0;
        int numElegirProducto = 0;
        String nombreNuevo = "jijijijá";


        do {
            System.out.println("Elije que apartado del producto 1-4");
            System.out.println("1º Helados");
            System.out.println("2º Granizado");
            System.out.println("3º Gofres");
            System.out.println("4º Bebidas");
            System.out.println("5º Salir");


            numElegir = ch.pedirNumero();

            switch (numElegir) {
                case 1:
                    for (int i = 0; i < helados.length; i++) {
                        System.out.println("º" + (i + 1) + " " + helados[i]);
                    }
                    System.out.println("Estas cambiando... Helados, elige cual cambiar");
                    numElegirProducto = ch.pedirNumero();

                    if (numElegir > 0 && numElegir < 4) {


                        ch.evitarSaltoDeEnteros();

                        nombreNuevo = ch.pedirString();
                        helados[numElegirProducto - 1] = nombreNuevo;
                    } else System.out.println("Opción desconocida");
                    break;

                case 2:
                    for (int i = 0; i < granizado.length; i++) {
                        System.out.println("º" + (i + 1) + " " + granizado[i]);
                    }
                    System.out.println("Estas cambiando... granizados, elige cual cambiar");
                    numElegirProducto = ch.pedirNumero();

                    if (numElegir > 0 && numElegir < 4) {
                        ch.evitarSaltoDeEnteros();

                        nombreNuevo = ch.pedirString();
                        granizado[numElegirProducto - 1] = nombreNuevo;
                    } else System.out.println("Opción desconocida");
                    break;

                case 3:
                    for (int i = 0; i < gofres.length; i++) {
                        System.out.println("º" + (i + 1) + " " + gofres[i]);
                    }
                    System.out.println("Estas cambiando... gofres, elige cual cambiar");
                    numElegirProducto = ch.pedirNumero();

                    if (numElegir > 0 && numElegir < 4) {
                        ch.evitarSaltoDeEnteros();


                        nombreNuevo = ch.pedirString();
                        gofres[numElegirProducto - 1] = nombreNuevo;
                    } else System.out.println("Opción desconocida");
                    break;

                case 4:
                    for (int i = 0; i < bebidas.length; i++) {
                        System.out.println("º" + (i + 1) + " " + bebidas[i]);
                    }
                    System.out.println("Estas cambiando... bebidas, elige cual cambiar");
                    numElegirProducto = ch.pedirNumero();

                    if (numElegir > 0 && numElegir < 4) {
                        ch.evitarSaltoDeEnteros();


                        nombreNuevo = ch.pedirString();
                        bebidas[numElegirProducto - 1] = nombreNuevo;
                    } else System.out.println("Opción desconocida");
                    break;

                default:
                    System.out.println("Opcion de clase de producto incorrecta o desconocida");
                    break;
            }
        } while (numElegir != 5);
    }

    protected void cambiarPrecioProductos() // metodo el cual se accede desde administrador para cambiar los precios de productos 
    {
        int numElegir = 0;
        int numElegirProducto = 0;
        double nuevoValor = 0.0;


        do {
            System.out.println("Ingresa un numero del 1 al 5");
            System.out.println("1º Helados");
            System.out.println("2º Granizado");
            System.out.println("3º Gofres");
            System.out.println("4º Bebidas");
            System.out.println("5º Salir");


            numElegir = ch.pedirNumero();

            switch (numElegir) {
                case 1:
                    System.out.println("Precio de los helados disponibles");
                    for (int i = 0; i < precioHelados.length; i++) {
                        System.out.println("º" + (i + 1) + " " + helados[i] + " " + precioHelados[i]); //// aqui
                    }
                    System.out.println("Elige el helado al que desea cambiar su valor (ingrese un número entre 1 al 3)");
                    numElegirProducto = ch.pedirNumero();
                    if (numElegir > 0 && numElegir < 4) {
                        ch.evitarSaltoDeEnteros();
                        System.out.println("Por favor ingrese nuevo valor para " + helados[numElegirProducto - 1]);
                        nuevoValor = ch.pedirDoubles();
                        precioHelados[numElegirProducto - 1] = nuevoValor;
                    } else System.out.println("Opción no válida");
                    break;

                case 2:
                    System.out.println("Precio de los granizados disponibles");
                    for (int i = 0; i < precioGranizado.length; i++) {
                        System.out.println("º" + (i + 1) + " " + granizado[i] + " " + precioGranizado[i]);
                    }
                    System.out.println("Elige el granizado al que desea cambiar su valor (ingrese un número entre 1 al 3)");
                    numElegirProducto = ch.pedirNumero();

                    if (numElegir > 0 && numElegir < 4) {
                        ch.evitarSaltoDeEnteros();
                        System.out.println("Por favor ingrese nuevo valor para " + granizado[numElegirProducto - 1]);
                        nuevoValor = ch.pedirDoubles();
                        precioGranizado[numElegirProducto - 1] = nuevoValor;
                    } else System.out.println("Opción no válida");
                    break;

                case 3:
                    System.out.println("Precio de los Gofres disponibles");
                    for (int i = 0; i < precioGofres.length; i++) {
                        System.out.println("º" + (i + 1) + " " + gofres[i] + " " + precioGofres[i]);
                    }
                    System.out.println("Elige el Gofre al que desea cambiarle su valor (ingrese un número entre 1 al 3)");
                    numElegirProducto = ch.pedirNumero();

                    if (numElegir > 0 && numElegir < 4) {
                        ch.evitarSaltoDeEnteros();
                        System.out.println("Por favor ingrese nuevo valor para " + gofres[numElegirProducto - 1]);

                        nuevoValor = ch.pedirDoubles();
                        precioGofres[numElegirProducto - 1] = nuevoValor;
                    } else System.out.println("Opción no válida");
                    break;

                case 4:
                    System.out.println("Precio de las Bebidas disponibles");
                    for (int i = 0; i < precioBebidas.length; i++) {
                        System.out.println("º" + (i + 1) + bebidas[i] + " " + " " + precioBebidas[i]);
                    }
                    System.out.println("Elige a la Bebida a la que desea cambiarle su valor (ingrese un número entre 1 al 3)");
                    numElegirProducto = ch.pedirNumero();

                    if (numElegir > 0 && numElegir < 5) {
                        ch.evitarSaltoDeEnteros();
                        System.out.println("Por favor ingrese nuevo valor para " + bebidas[numElegirProducto - 1]);

                        nuevoValor = ch.pedirDoubles();
                        precioBebidas[numElegirProducto - 1] = nuevoValor;
                    } else System.out.println("Opción no válida");
                    break;
                case 5:
                    if (numElegir == 5) {
                        System.out.println("Saliendo del apartado de cambiar precios a los productos");
                    }
                    break;
                default:
                    System.out.println("Por favor verifique el dato ingresado");
                    break;
            }
        } while (numElegir != 5);
    }


    public void elegirHelados() //Metodo de eleccion de productos que se puede acceder desde menuClientes
    {
      
        int numElegir = 0;
        do {
            System.out.println(" ");
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");

            for (int i = 0; i < helados.length; i++) {
                System.out.println((i + 1) + ". " + helados[i] + " " + precioHelados[i] + " $");
                System.out.println("-------------------");

            }
            numElegir = ch.pedirNumero();
            if (numElegir > 0 && numElegir < 4) {
                System.out.println("||¿Deseas este producto? " + helados[numElegir - 1] + " ||");

                System.out.println("si - no");
                char charConfirmar = ch.confirmarPedido();

                if (charConfirmar == 's') {
                    
                    System.out.println("||Elegiste... " + helados[numElegir - 1] + " ||");
                    NomDeProductosComprados[tamCuenta] += helados[numElegir - 1];
                    cuenta[tamCuenta] += precioHelados[numElegir - 1];
                    tamCuenta++;
                    
                }

            } else System.out.println("Volviste al apartado principal...");
        } while (numElegir != 0);

    }

    protected void elegirGranizados() //Metodo de eleccion de productos que se puede acceder desde menuClientes
    {
        int numElegir = 0;
        do {
            System.out.println(" ");
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");

            for (int a = 0; a < granizado.length; a++) {
                System.out.println((a + 1) + ". " + granizado[a] + " " + precioGranizado[a] + " $");
                System.out.println("-------------------");

            }
            numElegir = ch.pedirNumero();

             if (numElegir > 0 && numElegir < 4) {

                System.out.println("||¿Deseas este producto? " + granizado[numElegir - 1] + " ||");

                System.out.println("si - no");
                char charConfirmar = ch.confirmarPedido();

                if (charConfirmar == 's') {
                    System.out.println("||Elegiste... " + granizado[numElegir - 1] + " ||");
                    NomDeProductosComprados[tamCuenta] += granizado[numElegir - 1];
                    cuenta[tamCuenta] += precioGranizado[numElegir - 1];
                    tamCuenta++;
                  
                    
                }

            } else System.out.println("Volviste al apartado principal...");

        } while (numElegir != 0);
    }


    protected void elegirGofres() //Metodo de eleccion de productos que se puede acceder desde menuClientes
    {
        int numElegir = 0;
        do {
            System.out.println(" ");
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");


            {
                for (int b = 0; b < gofres.length; b++)
                    System.out.println((b + 1) + ". " + gofres[b] + " " + precioGofres[b] + " $");
                System.out.println("-------------------");


            }
            numElegir = ch.pedirNumero();
             if (numElegir > 0 && numElegir < 4) {

                System.out.println("||¿Deseas este producto? " + gofres[numElegir - 1] + " ||");

                System.out.println("si - no");
                char charConfirmar = ch.confirmarPedido();
                if (charConfirmar == 's') {
                    System.out.println("||Elegiste... " + gofres[numElegir - 1] + " ||");
                    NomDeProductosComprados[tamCuenta] += gofres[numElegir - 1];
                    cuenta[tamCuenta] += precioGofres[numElegir - 1];
                    tamCuenta++;
                   

                    
                }

            } else System.out.println("Volviste al apartado principal...");

        } while (numElegir != 0);
    }

    protected void elegirBebidas() //Metodo de eleccion de productos que se puede acceder desde menuClientes
    {
      
        int numElegir = 0;
        do {
            System.out.println(" ");
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");


            {
                for (int c = 0; c < bebidas.length; c++)
                    System.out.println((c + 1) + ". " + bebidas[c] + " " + precioBebidas[c] + " $");
                System.out.println("-------------------");


            }

            numElegir = ch.pedirNumero();
             if (numElegir > 0 && numElegir < 4) {

                System.out.println("||¿Deseas este producto? " + bebidas[numElegir - 1] + " ||");

                System.out.println("si - no");
                char charConfirmar = ch.confirmarPedido();

                if (charConfirmar == 's') {
                 
                    System.out.println("||Elegiste... " + bebidas[numElegir - 1] + " ||");
                    NomDeProductosComprados[tamCuenta] += bebidas[numElegir - 1];
                    cuenta[tamCuenta] += precioBebidas[numElegir - 1];
                    tamCuenta++;
                    
                }

            } else System.out.println("Volviste al apartado principal...");

        } while (numElegir != 0);
    }


    public double getTotalCuenta() //metodo para copiar este valor a otro class o main
    {
        return totalCuenta;
    }

    public int getIdCliente() //metodo para copiar este valor a otro class o main
    {
        return idCliente;
    }
    
    public double getCuentaCliente() //metodo para copiar este valor a otro class o main
    {
        
        return totalCuenta;
    }
}