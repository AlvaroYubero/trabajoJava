package ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int resultado = sumar(a,b);

        System.out.println ("La suma de: " + a + " y " + b + " es " + resultado);

    }

    public static int sumar(int a, int b) {
        return a +b;
    }
}
