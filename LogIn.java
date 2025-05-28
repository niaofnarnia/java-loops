import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una contraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";

        String username;
        String password;

        while (true) {
            System.out.print("Nombre de usuario: ");
            username = scanner.nextLine();

            System.out.print("Contraseña: ");
            password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("¡Acceso concedido!");
                break;
            } else {
                System.out.println("Datos incorrectos, por favor vuelve a intentar.");
            }
        }

        scanner.close();
        //Cuando el usuario y la contraseña sean correctos imprime en terminal: ¡Acceso concedido!

        //String correctUsername = "Pepita";
        //String correctPassword = "pepi123";

    }
}
