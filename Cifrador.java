public class Cifrador
{

    public String cifrarTexto(String texto, int offset) {
        String resultado = "";

        int contador = 0;
        while (contador < texto.length()) {
            char caracter = texto.charAt(contador);

            if (Character.isLetter(caracter)) {
                //Ciframos los caracteres alfabeticos
                int caracterInicial = Character.isUpperCase(caracter) ? 'A' : 'a';
                int caracterCifrado;

                caracterCifrado = (caracter - caracterInicial + offset) % 26 + caracterInicial;
                resultado = resultado + Character.toString(caracterCifrado);                
            } 
            else {
                // Conservamos los caracteres no alfabéticos sin modificar
                resultado = resultado + Character.toString(caracter);
            }
            contador++;
        }

        return resultado;
    }
    public void mostrarResultadoDeCifrado(int offset) {
        for (int i = 65; i <= 90; i++) { 
            int resultado = (i - 65 + offset) % 26 + 65; 
            System.out.println(i + " (" + (char) i + ") - 65 ('A' - valor base) + " + offset + " (offset) % 26 + 65 ('A') = " + resultado + " ('" + (char) resultado + "')");
        }

        for (int i = 97; i <= 122; i++) {
            int resultado = (i - 97 + offset) % 26 + 97; 
            System.out.println(i + " (" + (char) i + ") - 97 ('a' - valor base) + " + offset + " (offset) % 26 + 97 ('a') = " + resultado + " ('" + (char) resultado + "')");
        }
    }
}
