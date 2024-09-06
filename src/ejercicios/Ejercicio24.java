package ejercicios;

public class Ejercicio24 {
    public static void main(String[] args) {
        int a = 3;
        int rangoIni = 1;
        int rangoFin = 50;
        int suma = 0;
        for (int i = rangoIni; i <= rangoFin; i++) {
            if (i % a == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los múltiplos de " + a + " entre " + rangoIni + " y " + rangoFin + " es: " + suma);
    }
}
