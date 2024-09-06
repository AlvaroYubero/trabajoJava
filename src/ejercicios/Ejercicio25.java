package ejercicios;

public class Ejercicio25 {
    public static void main(String[] args) {
        int a = 7;
        int limite = 10; // Este valor se puede cambiar para modificar el límite de la tabla
        System.out.println("Tabla de multiplicar del " + a);
        for (int i = 1; i <= limite; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
