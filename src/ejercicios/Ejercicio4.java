package ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a = 29;
        boolean nPrimo = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                nPrimo = false;
                break;
            }
        }
        //Resultado
        if (nPrimo) {
            System.out.println(a + " es un número primo");
        } else {
            System.out.println(a + " no es un número primo");
        }
    }
}
