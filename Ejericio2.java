import java.util.Scanner;

public class Ejericio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        char[] caracteres = texto.toCharArray();

        // Reemplazar vocales por un símbolo (por ejemplo, '*')
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' ||
                caracteres[i] == 'o' || caracteres[i] == 'u') {
                caracteres[i] = '*';
            }
        }

        String resultado = new String(caracteres);  // Convertir de arreglo a cadena
        System.out.println("Cadena modificada: " + resultado);
    }
}
