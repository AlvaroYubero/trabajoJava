package ejercicios;

public class Ejercicio22 {
    public static void main(String[] args) {
        int a = 987654;
        int contador = 0;
        // Caso especial para el número 0
        if (a == 0) {
            contador = 1;
        } else {
            // Se divide entre 10 de manera repetida hasta que el número sea 0
            while (a != 0) {
                a /= 10;
                contador++;
            }
        }
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
