import java.util.Scanner;

public class MenuAdministrador {
    private int pinAdministrador;
    Scanner sc = new Scanner(System.in);

    public void menuParaElAdministrador() {
        System.out.println("Ingrese el pin");
        pinAdministrador = sc.nextInt();
        if (pinAdministrador == 1233) {
            System.out.println("Acceso válido");
        } else {
            System.out.println("Aceso no válido");
        }
    }
}
