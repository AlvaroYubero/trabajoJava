package ejercicios;

public class Ejercicio20 {
    public static void main(String[] args) {
        int a = 152;
        int originalNumero = a;
        int numeroDigitos = (int) Math.log10(a) + 1; // Calcula el número de dígitos
        int suma = 0;

        while (a != 0) {
            int digito = a % 10;
            suma += Math.pow(digito, numeroDigitos);
            a /= 10;
        }
        if (suma == originalNumero) {
            System.out.println(originalNumero + " es un número de Armstrong");
        } else {
            System.out.println(originalNumero + " no es un número de Armstrong");
        }
    }
}