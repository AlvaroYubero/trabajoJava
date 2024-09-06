package ejercicios;

public class Ejercicio14 {
    public static void main(String[] args) {
        int a = 45;
        String binario = "";
        //Convierte.
        while (a > 0) {
            int b = a % 2;
            binario = b + binario;
            a /= 2;
        }
        //Muestra el resultado.
        System.out.println("El número decimal " + a + " en binario es: " + binario);
    }
}