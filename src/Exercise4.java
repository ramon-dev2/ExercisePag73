import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Ingrese el número que desea buscar: ");
        int buscar = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == buscar) {
                System.out.println("Número encontrado en la posición: " + i);
                System.out.println("Posición humana: " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El número no se encuentra en el arreglo.");
        }
    }
}