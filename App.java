import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el texto a cifrar:");
        String texto = scanner.nextLine();

        System.out.println("Introduce el offset:");
        int offset = scanner.nextInt();

        Cifrador cifrador = new Cifrador();

        String textoCifrado = cifrador.cifrarTexto(texto, offset);
        System.out.println("Texto cifrado: " + textoCifrado);

        scanner.close();
    }
}
