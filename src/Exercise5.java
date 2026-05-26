import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] suma = new int[3][3];
        int[][] producto = new int[3][3];

        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nIngrese los valores de la matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nIngrese el número para multiplicar las matrices: ");
        int numero = sc.nextInt();

        System.out.println("\nMatriz A multiplicada por " + numero + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matrizA[i][j] * numero) + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B multiplicada por " + numero + ":");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matrizB[i][j] * numero) + " ");
            }
            System.out.println();
        }

        // Suma de matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("\nSuma de la matriz A + matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        // Producto de matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                producto[i][j] = 0;

                for (int k = 0; k < 3; k++) {
                    producto[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("\nProducto de la matriz A x matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }
    }
}