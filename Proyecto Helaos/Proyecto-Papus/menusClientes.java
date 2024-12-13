public class menusClientes {
    CajaDeHerramientas ch = new CajaDeHerramientas();
    Productos productos2 = new Productos();

   
   
    /** 
     * setHistorialIdClienteAdmin
     * 
     * 
     * En este metodo se mostrará el menu de los clientes que se puede acceder a traves del menu principal del main
     * dando la opcion de elegir entre distintos productos dando un resultado modificable (registro de cliente).
     */

    public void mostrarMenu() {
       
        productos2.darIdCliente();
        int numPedido = 0;
    
            do {
                System.out.println(" ");
                System.out.println("Elige un apartado del menú del 1 al 5");
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

                elegirMenuClientes(numPedido, productos2);

            } while (numPedido != 6 && numPedido < 6 && numPedido > 0);

            productos2.sumarTotalCuenta();
            

        }
    
    /** 
     * elegirMenuClientes
     * 
     * 
     * Submetodo del menuClientes que te da a elegir entre una serie de productos 
     */


    public static void elegirMenuClientes(int numPedido, Productos productos2) 
    {
        switch (numPedido) {
            case 1:
                productos2.elegirHelados(); //metodo de productos que muestra todos los productos de una categoría para comprarlo
                
                break;

            case 2:
                productos2.elegirGranizados(); //metodo de productos que muestra todos los productos de una categoría para comprarlo
                break;

            case 3:
                productos2.elegirGofres(); //metodo de productos que muestra todos los productos de una categoría para comprarlo
                break;

            case 4:
                productos2.elegirBebidas(); //metodo de productos que muestra todos los productos de una categoría para comprarlo
                break;

            case 5:
            productos2.soloMostrarCuenta(); //metodo de productos que muestra todos los productos de una categoría para comprarlo
           
                break;
            default:
                break;
        }
    }

  
}
   
    
    


