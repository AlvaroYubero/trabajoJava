package ejercicios;

public class Ejercicio29 {
    public static void main(String[] args) {
        int a = 64;
        double raizCuadrada = Math.sqrt(a);
        // Usamos Math.floor para truncar la parte decimal
        if (raizCuadrada - Math.floor(raizCuadrada) == 0) {
            System.out.println(a + " es un cuadrado perfecto.");
        } else {
            System.out.println(a + " no es un cuadrado perfecto.");
        }
    }
}
