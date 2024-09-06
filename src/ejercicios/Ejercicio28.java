package ejercicios;

public class Ejercicio28 {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("Calculando el MCD de: " + a + " y " + b);
        // Algoritmo de Euclides
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("El MCD es: " + a);
    }
}
