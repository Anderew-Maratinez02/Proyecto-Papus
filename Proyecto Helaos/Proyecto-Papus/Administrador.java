public class Administrador {
    CajaDeHerramientas ch = new CajaDeHerramientas();
    //menusClientes menuCliente = new menusClientes();
    Productos productos = new Productos();
    //heladosMain main = new heladosMain(); //??? aun no se usa
    private int pass_Administrador;
    private String semilla = "papus@";


    public void ingresoAdministrador(menusClientes menuCliente) {
        pass_Administrador = ch.pedirNumero();
        if (pass_Administrador == 1233) {
            System.out.println("Acceso válido");
            menuOpcionesAdministrador(menuCliente);
        } else {
            System.out.println("Acceso no válido");
        }
    }

    public void menuOpcionesAdministrador(menusClientes menuCliente) {
        int opcion;
        String palabraSegura;
        do {
            System.out.println("Ajustes del sistema\n"
                    + "1. Cambiar precios \n"
                    + "2. Mostrar promedio \n"
                    + "3. Total pedidos \n"
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
                    System.out.println("El promedio de las ganancias es \n"); //Esto falta

                    break;
                case 3:
                    System.out.println("1");
                    System.out.println("Estás viendo la cantidad de clientes");
                    System.out.println(menuCliente.getCantidadPersonas());
                    System.out.println("para pensar");
                    /// /quitar esto xd commit por commit erroneous
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
                    /// /quitar esto xd commit por commit erroneous
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);

    }
}

