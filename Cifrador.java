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
    
}
