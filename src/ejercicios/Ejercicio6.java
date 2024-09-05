package ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 13;
        // Suma de los tres números.
        int suma = a + b + c;
        // Cálculo de Promedio (suma dividido entre la cantidad de números)
        double promedio = (double) suma / 3;
        //Resultado.
        System.out.println("El promedio de " + a + ", " + b + " y " + c + " es: " + promedio);
    }
}
