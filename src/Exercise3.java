import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("No se puede usar cero como divisor.");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                int numero = sc.nextInt();

                if (numero % divisor == 0) {
                    System.out.println(numero + " es múltiplo de " + divisor);
                } else {
                    System.out.println(numero + " no es múltiplo de " + divisor);
                }
            }
        }
    }
}