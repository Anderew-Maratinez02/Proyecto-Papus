public class Administrador {
    CajaDeHerramientas ch = new CajaDeHerramientas();
    menusClientes menuCliente = new menusClientes();
    Productos productos = new Productos();
    heladosMain main = new heladosMain();
    private int pass_Administrador;
    private String semilla = "papus@";


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
            System.out.println("***Ajustes del sistema***\n"
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
                    //sumaoria de pedido entre la cantidad un contador de ingresos
                    break;
                case 3:
                    System.out.println("Estás viendo la cantidad de pedidos");
                    System.out.println(menuCliente.getCantidadPersonas());
                    System.out.println(menuCliente.getContadorHelados());
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


}

