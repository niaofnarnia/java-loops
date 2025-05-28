import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber

        int randomNumber1 = 0;
        while (randomNumber1 != 7) {
            randomNumber1 = getRandomNumber(10);
            System.out.println("Número generado: " + randomNumber1);
        }
        System.out.println("¡Aquí está el número 7!");


        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber

        int randomNumber2 = 0;
        while (randomNumber2 <= 70) {
            randomNumber2 = getRandomNumber(100);
            System.out.println("Número generado: " + randomNumber2);
        }
        System.out.println("¡Aquí está el número mayor a 70!");

        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber

        Scanner scanner = new Scanner(System.in);

        int secretNumber = getRandomNumber(100);
        int guess;

        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Demasiado bajo.");
            } else if (guess > secretNumber) {
                System.out.println("Demasiado alto.");
            } else {
                System.out.println("¡Correcto! El número era " + secretNumber);
            }
        } while (guess != secretNumber);

        scanner.close();
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){

        return (int)(Math.random() * number) + 1;
    }
}
