package ejercicios;

public class Ejercicio18 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int resultado = 1;
        // Multiplicar la base por sí misma el número de veces indicado por el exponente
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        System.out.println(a + " elevado a " + b + " es: " + resultado);
    }
}