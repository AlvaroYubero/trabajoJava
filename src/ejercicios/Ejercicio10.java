package ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        int a = 6;
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + a + " es: " + factorial);
    }
}