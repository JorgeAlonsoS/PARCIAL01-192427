import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();
        System.out.println(" ");
        

        int contadorImpares = 0;

        // Contar desde 1 hasta el número ingresado
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 1) { // Verificar si el número es impar
                contadorImpares++;
            }
        }

        System.out.println("Hay " + contadorImpares + " números impares desde 1 hasta " + numero);
    }
}
