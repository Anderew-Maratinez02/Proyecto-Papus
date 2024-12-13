public class Administrador {
    CajaDeHerramientas ch = new CajaDeHerramientas();
   // menusClientes menuCliente = new menusClientes(); da error
    Productos productos = new Productos();
    menusClientes mc = new menusClientes(); 
    heladosMain main = new heladosMain();

    private int pass_Administrador;
    private String semilla = "papus@";

    

    private int contador = 0;

    private double historialPrecioCompra[] ;
    private int historialIdCliente[] ;

    

    
    public Administrador() {
        this.contador = 0;
        this.historialPrecioCompra = historialPrecioCompra = new double[100] ;
        this.historialIdCliente = historialIdCliente = new int [100];
    }

    public void ingresoAdministrador() {
        pass_Administrador = ch.pedirNumero();
        if (pass_Administrador == 1233) {
            System.out.println("Acceso válido");
            menuOpcionesAdministrador();
        } else {
            System.out.println("Accseso no válido");
        }
    }

    public void menuOpcionesAdministrador() {
        int opcion;
        String palabraSegura;
        do {
            System.out.println("Ajustes del sistema\n"
                    + "1. cambiar precios \n"
                    + "2. Mostrar promedio \n"
                    + "3. total pedidos \n"
                    + "4. Modificar inventario \n"
                    + "5. Salir");
            opcion = ch.pedirNumero();
            ch.evitarSaltoDeEnteros();
            switch (opcion) {
                case 1:
                    System.out.println("Estas modificando los precios");
                    System.out.println("Ingresa la palabra clave para continuar");

                    palabraSegura = ch.pedirString();

                    if (semilla.equals(palabraSegura)) {
                        System.out.println("Mostrando inventario");
                        System.out.println("Seleccione lo que desea cambiar");

                        productos.cambiarPrecioProductos();

                    } else {
                        System.out.println("Ingrese la palabra segura (semilla)");
                    }


                    break;
                case 2:
                    System.out.println("Estás viendo el promedio");
                    //sumatoria de pedidos entre la cantidad de personas y un futuro un contador de ingresos
                    break;
                case 3:
                    System.out.println("Estás viendo la cantidad de pedidos");
                   // da error System.out.println(menuCliente.getCantidadPersonas());
                    System.out.println("para pensar");
                    break;
                case 4:
                    System.out.println("Estas modificando el inventario");
                    System.out.println("Ingresa la palabra clave para continuar");

                    palabraSegura = ch.pedirString();

                    if (semilla.equals(palabraSegura)) {
                        System.out.println("Mostrando inventario");
                        System.out.println("Seleccione lo que desea cambiar");

                        productos.cambiarNombreProductos();

                    } else {
                        System.out.println("Ingrese la palabra segura (semilla)");
                    }
                    break;
                case 5:
                    System.out.println("Estás saliendo del apartado del administrador");
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        } while (opcion != 5);


    }

    

    public void obtenerInformacion() {
        for (int j = 0; j < 10;j++)
        {
            historialPrecioCompra[contador] = mc.productos2.getTotalCuenta();
            historialIdCliente[contador] =  mc.productos2.getIdCliente();
            
            System.out.println(contador);

            if (historialIdCliente[j] != 0)
            { 
                System.out.println("Ciente #ID " + historialIdCliente[j] + " " + historialPrecioCompra[j] + " $");
        
            }

       
        }
        contador++;
    }

    public void mostrarHistorialDeVentas() {
        for (int i = 0; i < historialIdCliente.length; i++) {
            System.out.println("Ciente ID " + historialIdCliente[i] + " " + historialPrecioCompra[i] + " $");

        }
    }
}

