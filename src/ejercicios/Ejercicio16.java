package ejercicios;

public class Ejercicio16 {
    public static void main(String[] args) {
        int a = 5678;
        int suma = 0;
        while (a != 0) {
            int digito = a % 10; // Obtenemos el último dígito
            suma += digito; // Sumamos el dígito a la suma total
            a /= 10; // Eliminamos el último dígito del número
        }
        System.out.println("La suma de los dígitos de " + a + " es: " + suma);
    }
}