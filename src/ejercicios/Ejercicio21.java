package ejercicios;

public class Ejercicio21 {
    public static void main(String[] args) {
        double a = 49;
        double error = 0.00001; // Margen de error
        double x = a / 2; // Valor inicial
        while (Math.abs(x * x - a) > error)
        {
            x = 0.5 * (x + a / x);
        }
        System.out.println("La raíz cuadrada aproximada de " + a + " es: " + x);
    }
}
