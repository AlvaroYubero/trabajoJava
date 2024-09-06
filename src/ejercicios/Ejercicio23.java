package ejercicios;

public class Ejercicio23 {
    public static void main(String[] args) {
        int a = 45;
        // Validamos la divisibilidad por cada número
        if (a % 2 == 0) {
            System.out.println(a + " es divisible por 2.");
        }
        if (a % 3 == 0) {
            System.out.println(a + " es divisible por 3.");
        }
        if (a % 5 == 0) {
            System.out.println(a + " es divisible por 5.");
        }
        // Si no cumple alguna de las condiciones anteriores, entonces no es divisible por ninguno
        if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0) {
            System.out.println(a + " no es divisible por 2, 3 ni 5.");
        }
    }
}
