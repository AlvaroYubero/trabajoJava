package ejercicios;

public class Ejercicio19 {
    public static void main(String[] args) {
        int a = 28;
        int sumaDivisores = 0;
        // Iteramos desde 1 hasta la mitad del número
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sumaDivisores += i;
            }
        }
        // Se verifica si la suma de los divisores es igual al número
        if (sumaDivisores == a) {
            System.out.println(a + " es un número perfecto.");
        } else {
            System.out.println(a + " no es un número perfecto.");
        }
    }
}