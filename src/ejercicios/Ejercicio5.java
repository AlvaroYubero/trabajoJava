package ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 9;
        int maximo;

        // Buscando el número mayor
        if (a >= b && a >= c) {
            maximo = a;
        } else if (b >= a && b >= c) {
            maximo = b;
        } else {
            maximo = c;
        }

        System.out.println("El número mayor es: " + maximo);
    }
}
