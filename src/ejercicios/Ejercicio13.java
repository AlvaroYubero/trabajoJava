package ejercicios;

public class Ejercicio13 {
    public static void main(String[] args) {
        int a = 1221;
        int numeroOriginal = a;
        int numeroInvertido = 0;

        // Inversión del número
        while (a != 0) {
            int digito = a % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            a /= 10;
        }
        // Comparamos el número original con el invertido
        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " es un palíndromo.");
        } else {
            System.out.println(numeroOriginal + " no es un palíndromo.");
        }
    }
}