public class Administrador {
    CajaDeHerramientas sc = new CajaDeHerramientas();
    menusClientes mc = new menusClientes();

    private int pass_Administrador;
    private boolean confirmacionDeAcceso;
    private String semilla = "papus@";
    Productos productos = new Productos();


    public void ingresoAdministrador() {
        pass_Administrador = sc.pedirNumero();
        if (pass_Administrador == 1233) {
            System.out.println("Acceso válido");
            confirmacionDeAcceso = true;
            menuOpcionesAdministrador();
        } else {
            System.out.println("Accseso no válido");
            confirmacionDeAcceso = false;
        }
    }

    public void menuOpcionesAdministrador() {
        int opcion;
        String palabraSegura;
        do {
            System.out.println("***Ajustes del sistema***\n"
                    + "1. ver ventas \n"
                    + "2. Mostrar promedio \n"
                    + "3. total pedidos \n"
                    + "4. Modificar inventario \n"
                    + "5. Salir");
            opcion = sc.pedirNumero();
            sc.evitarSaltoDeEnteros();
            switch (opcion) {
                case 1:
                    System.out.println("Estás viendo el historial de compra");
                    break;
                case 2:
                    System.out.println("Estás viendo el promedio");
                    break;
                case 3:
                    System.out.println("Estás viendo la cantidad de pedidos");
                    break;
                case 4:
                    System.out.println("Estas modificando el inventario");
                    System.out.println("Ingresa la palabra clave para continuar");

                    palabraSegura = sc.pedirString();

                    if (semilla.equals(palabraSegura)) {
                        System.out.println("Mostrando inventario");
                        System.out.println("Seleccione lo que desea cambiar");

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




