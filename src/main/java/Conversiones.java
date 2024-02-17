import java.util.Scanner;
public class Conversiones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la primer base: ");
        int base1 = sc.nextInt();
        System.out.println("Ingresa la segunda base: ");
        int base2 = sc.nextInt();
        System.out.println("Ingresa el número a convertir: ");
        String numero = sc.next();
        System.out.println(convertidor(base1, base2, numero));
    }

    public static String convertidor(int a, int b, String c) {
        // Misma base
        if (a == b) {
            return c; 
        } else if (a == 2 & b == 10) {
            // Binario a decimal
            return binarioDecimal(c);
        } else if (a == 2 & b == 8) {
            // Binario a octal
            return binarioOctal(c);
        } else if (a == 2 & b == 16) {
            // Binario a hexadecimal
            return binarioHexadecimal(c);
        } else if (a == 8 & b == 10) {
            // Octal a decimal
            return octalDecimal(c);
        } else if (a == 8 & b == 2) {
            // Octal a binario
            return octalBinario(c);
        } else if (a == 8 & b == 16) {
            // Octal a hexadecimal
           return octalHexadecimal(c);
        } else if (a == 10 & b == 2) {
            // Decimal a binario
            return decimalBinario(c);
        } else if (a == 10 & b == 8) {
            // Decimal a octal
            return decimalOctal(c);
        } else if (a == 10 & b == 16) {
            // Decimal a hexadecimal
            return decimalHexadecimal(c);
        } else if (a == 16 & b == 2) {
            // Hexadecimal a binario
            return hexadecimalBinario(c);
        } else if (a == 16 & b == 8) {
            // Hexadecimal a octal
            return hexadecimalOctal(c);
        } else if (a == 16 & b == 10) {
            // Hexadecimal a decimal
            return hexadecimalDecimal(c);
        } else {
            return "no pongas mamadas";
        }
    }
    
    ////////////////////// BINARIOS 

    /**
     * Convierte una cadena de binario a decimal y luego a octal.
     *
     * @param b la cadena que representa a un número binario.
     * @return la representación octal del número ingresado.
     */
    public static String binarioOctal(String b){
        return decimalOctal(binarioDecimal(b));
    }

    /**
     * Convierte una cadena de binario a decimal.
     *
     * @param b la cadena que representa a un número binario.
     * @return la representación decimal del número ingresado.
     */
    public static String binarioDecimal(String b){
        int decimal = 0;
        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == '1') decimal += Math.pow(2, b.length()-1-i);   
        }
        return Integer.toString(decimal);
    }

    /**
     * Convierte una cadena de binario a decimal y luego a hexadecimal.
     *
     * @param b la cadena que representa a un número binario.
     * @return la representación hexadecimal del número ingresado.
     */
    public static String binarioHexadecimal(String b){
        return decimalHexadecimal(binarioDecimal(b)); 
    }

    ////////////////////// DECIMALES 

    /**
     * Convierte una cadena de decimal a binario.
     *
     * @param d la cadena que representa un número decimal.
     * @return la representación binaria del número ingresado.
     */
    public static String decimalBinario(String d){
        int entero = Integer.parseInt(d);
        String binario = "";

        while(entero > 0){
            binario = (entero%2)+binario;
            entero = (int)entero/2;
        }
        return binario;
    }

    /**
     * Convierte una cadena de decimal a octal.
     *
     * @param d la cadena que representa un número decimal.
     * @return la representación octal del número ingresado.
     */
    public static String decimalOctal(String d) {
        int entero = Integer.parseInt(d);
        int residuo = 0;
        String octal = "";
        char[] octales = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while (entero > 0) {
            residuo = entero % 8;
            char caracter = octales[residuo];
            octal = caracter + octal;
            entero = entero / 8;
        }
        return octal;
    }

    /**
     * Convierte una cadena de decimal a hexadecimal.
     *
     * @param d la cadena que representa un número decimal.
     * @return la representación hexadecimal del número ingresado.
     */
    public static String decimalHexadecimal(String d){
        int entero = Integer.parseInt(d);
        String hexadecimal = "";

        while(entero > 0){
            int residuo = entero % 16;
            if(residuo < 10){
                //Caso números
                hexadecimal = residuo+hexadecimal;
            }else{
                //Caso letras
                hexadecimal = (char)(residuo+55)+hexadecimal;
            }
            entero = (int)entero/16;
        }
        return hexadecimal;
    }

    ////////////////////// OCTALES 

    /**
     * Convierte una cadena de octal a decimal.
     *
     * @param octal la cadena que representa un número octal.
     * @return la representación decimal del número ingresado.
     */
    public static String octalDecimal(String o) {
        int entero = Integer.parseInt(o);
        int decimal = 0;
        int potencia = 0;

        while(entero != 0){
            int residuo = entero % 10;
            decimal += residuo * Math.pow(8, potencia);
            entero = entero / 10;
            potencia++;
        }
        return Integer.toString(decimal);
    }
    
    /**
     * Convierte una cadena de octal a decimal y luego a binario.
     *
     * @param octal la cadena que representa un número octal.
     * @return la representación binaria del número ingresado.
     */
    public static String octalBinario(String o){
        return decimalBinario(octalDecimal(o));
    }
    
    /**
     * Convierte una cadena de octal a decimal y luego a hexadecimal.
     *
     * @param octal la cadena que representa un número octal.
     * @return la representación hexadecimal del número ingresado.
     */
    public static String octalHexadecimal(String o){
        return decimalHexadecimal(octalDecimal(o));
    }

    ////////////////////// HEXADECIAMLES 

    /**
     * Convierte una cadena de hexadecimal a decimal y luego a binario.
     *
     * @param h la cadena que representa un número hexadecimal.
     * @return la representación decimal del número ingresado.
     */
    public static String hexadecimalBinario(String h){
        return decimalBinario(hexadecimalDecimal(h));
    }

    /**
     * Convierte una cadena de hexadecimal a decimal y luego a octal.
     *
     * @param h la cadena que representa un número hexadecimal.
     * @return la representación octal del número ingresado.
     */
    public static String hexadecimalOctal(String h){
        return decimalOctal(hexadecimalDecimal(h));
    }

    /**
     * Convierte una cadena de hexadecimal a decimal.
     *
     * @param h la cadena que representa un número hexadecimal.
     * @return la representación decimal del número ingresado.
     */
    public static String hexadecimalDecimal(String h){
        int decimal = 0;

        for(int i = 0; i < h.length(); i++){
            if(h.charAt(i) >= 'A' && h.charAt(i) <= 'F'){
                decimal += (h.charAt(i)-55)*Math.pow(16, h.length()-1-i);
            }else{
                decimal += (h.charAt(i)-48)*Math.pow(16, h.length()-1-i);
            }
        }

        return Integer.toString(decimal);
    }
   
}
