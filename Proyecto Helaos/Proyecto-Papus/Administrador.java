

public class Administrador {
    CajaDeHerramientas ch = new CajaDeHerramientas();
   menusClientes mc = new menusClientes();

    private int pass_Administrador;
    private boolean confirmacionDeAcceso;
    
    Productos productos = new Productos();


    public void ingresoAdministrador() {
        pass_Administrador = ch.pedirNumero();
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

        do {
            System.out.println("***Ajustes del sistema***\n"
                    + "1. ver ventas \n"
                    + "2. Mostrar promedio \n"
                    + "3. total pedidos \n"
                    + "4. Modificar inventario \n"
                    + "5. Salir");
            opcion = ch.pedirNumero();
            switch (opcion){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        } while (opcion != 5);


    }

}




