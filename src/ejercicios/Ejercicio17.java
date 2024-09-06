package ejercicios;

public class Ejercicio17 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int sumaPares = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("La suma de números pares entre " + a + " y " + b + " es: " + sumaPares);
    }
}