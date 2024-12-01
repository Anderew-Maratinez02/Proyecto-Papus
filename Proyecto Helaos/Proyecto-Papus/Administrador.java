import java.util.Scanner;

public class Administrador {
    Scanner sc = new Scanner(System.in);
    private int pass_Administrador;
    private boolean confirmacionDeAcceso;

    public void ingresoAdministrador() {
        System.out.println("Ingrese el pin de acceso");
        pass_Administrador = sc.nextInt();
        if (pass_Administrador == 1233) {
            System.out.println("Acceso válido");
            confirmacionDeAcceso = true;
        } else {
            System.out.println("Accseso no válido");
            confirmacionDeAcceso = false;
        }
    }
}




