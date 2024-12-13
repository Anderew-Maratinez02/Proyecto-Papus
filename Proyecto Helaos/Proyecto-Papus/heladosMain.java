public class heladosMain {
    public static void main(String[] args) {
        CajaDeHerramientas ch = new CajaDeHerramientas();
        menusClientes menuClientes1 = new menusClientes();
        Administrador menuAdministrador = new Administrador();
       
        
   
        int contador = 0; // estos tres atributos sirven para transportar los registros de menuClientes al main y luego a Administrador
        double historialPrecioCompra[] = new double[20] ;
        int historialIdCliente[] = new int[20] ;


        menuMain( contador,ch, menuClientes1, menuAdministrador,historialPrecioCompra,historialIdCliente);
         
    }

    
    /** 
     * @param contador
     * @param ch
     * @param menuClientes1
     * @param menuAdministrador
     * @param productos
     * @param historialPrecioCompra[]
     * @param historialIdCliente[]
     * 
     * Este método es como el corazón del programa el cual conecta los dos apartados del software el cual une el apartado de 
     * clientes y administrador en dos menús y con sus respectivos metodos.
     * El apartado administrador actuará sobre los productos pedidos en el menuDeClientes y se guardan los registros pedidos. 
     */
    public static void menuMain( int contador,CajaDeHerramientas ch, menusClientes menuClientes1, Administrador menuAdministrador, double historialPrecioCompra[], int historialIdCliente[]) {
        int numPedido = 0;
        
        System.out.println();
        System.out.println("¡Bienvenido a Heladería Papús!");

        do {
            System.out.println(" ");
            System.out.println("Elige un apartado del menú del 1 al 3");
            System.out.println(" ");

            System.out.println("1.Menú para clientes");
            System.out.println("---------------");
            System.out.println("2.Administrador");
            System.out.println("---------------");
            System.out.println("3.Salir del menú");

            numPedido = ch.pedirNumero();
            if (numPedido > 3 || numPedido < 0) 
            {
                System.out.println("Opción inválida");
            }
            
           
            elegirMenuMain( ch, numPedido, menuClientes1, menuAdministrador);
            obtenerInformacion(historialPrecioCompra, historialIdCliente, contador, menuClientes1);
            
            contador ++;

            menuClientes1.productos2.resetearCuenta();
            menuAdministrador.setnumeroDeClientes(contador);
            menuAdministrador.setHistorialIdClienteAdmin(historialIdCliente);
            menuAdministrador.setHistorialPrecioCompraAdmin(historialPrecioCompra);

        } while (numPedido != 3 && numPedido < 3 && numPedido > 0);

    }

    
    /** 
     * @param ch
     * @param numPedido
     * @param menuClientes1
     * @param menuAdministrador
     * 
     * Submetodo del metodo principal que clasifica que opciones vas a poder usar para dirigirte a menuClietes o administrador
     */
    public static void elegirMenuMain(CajaDeHerramientas ch, int numPedido, menusClientes menuClientes1, Administrador menuAdministrador) {
        switch (numPedido) {
            case 1:
                menuClientes1.mostrarMenu();
            break;
            case 2:
                System.out.println("Ingrese el pin de acceso");
                menuAdministrador.ingresoAdministrador(menuClientes1);
                
                break;
            case 3:
                System.out.println("Saliendo del menú");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    
    /** 
     * @param historialPrecioCompra[]
     * @param historialIdCliente[]
     * @param contador
     * @param productos
     * @param menuClientes1
     * 
     * Metodo importante el cual copiará el total del pedido y el id del cliente a una variable temporal en el main
     * y luego las variables a su vez se copiarán al administrado para poder realizar funciones y guardar su información
     */
    public static void obtenerInformacion(double historialPrecioCompra[], int historialIdCliente[],int contador, menusClientes menuClientes1) {
        historialPrecioCompra[contador] = menuClientes1.productos2.getTotalCuenta();
        historialIdCliente[contador] = menuClientes1.productos2.getIdCliente();

    }  
}