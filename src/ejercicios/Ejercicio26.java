package ejercicios;

public class Ejercicio26 {
    public static void main(String[] args) {
        int a = -15;
        // Validando valor absoluto
        int valorAbsolutoPersonalizado = (a < 0) ? -a : a;
        System.out.println("El valor absoluto de " + a + " es: " + valorAbsolutoPersonalizado);
    }
}
