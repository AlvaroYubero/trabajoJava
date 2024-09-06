package ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        int a = 54321;
        int numeroInvertido = 0;

        while (a != 0) {
            int digito = a % 10; // Obtiene el ultimo digito.
            numeroInvertido = numeroInvertido * 10 + digito; // Agrega el digito al numero invertido.
            a /= 10; // Elimina el ultimo digito del numero original.
        }
        //Muestra el numero invertido.
        System.out.println("El número invertido es: " + numeroInvertido);
    }
}