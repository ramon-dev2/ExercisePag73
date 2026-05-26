import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();

            suma = suma + numero;
        }

        promedio = suma / 10.0;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
        }
    }