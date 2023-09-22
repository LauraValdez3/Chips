
package mx.itson.chips.negocio;

public class Operacion {
    
    /**
     * Esta función toma una cadena de texto como argumento y devuelve una cadena de texto como resultado
     * @param textoIngresado
     * @return 
     */
    
    public static String remplazar ( String textoIngresado){
        /**
         * Almacena el resultado de las sustituciones.
         */
        String textoReemplazado = "";
        /**
         * Almacena la versión invertida de la cadena original.
         */
        String textoAlReves = "";
        /**
         *Realiza una serie de reemplazos y transformaciones en la cadena textoIngresado utilizando el método replace y el método toLowerCase. 
         * Convierte toda la cadena a minúsculas utilizando toLowerCase().
         * Elimina los espacios en blanco con replace(" ", "").Eliminan las comas con replace(",", "").Reemplaza las letras acentuadas "á" por "a", "é" por "e", "í" por "i", "ó" por "o" y "ú" por "u".
         * Elimina los signos de exclamación "!" con replace("!", "").
         */
        textoIngresado = textoReemplazado.toLowerCase().replace(" ", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "").replace("!", "").replace("¡", "");
            
        /**
         * Itera a través de la cadena original cadena en un bucle for que recorre la cadena desde el último carácter hasta el primero. En cada iteración, se toma un carácter de la cadena original y se agrega a la cadena textoAlReves, lo que efectivamente invierte la cadena original.
         */
	for (int indice = textoReemplazado.length() - 1; indice >= 0; indice--) {
           
            textoAlReves += textoReemplazado.charAt(indice);
		}
    
        return textoAlReves;        
    }

}
