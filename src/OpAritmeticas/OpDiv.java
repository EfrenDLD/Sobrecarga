package OpAritmeticas;

public class OpDiv {
    // Método división para enteros
    public static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: división por cero");
            return 0;
        } else {
            return a / b;
        }
    }
    // Método sobrecargado división para decimales
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: división por cero");
            return 0;
        } else {
            return a / b;
        }
    }
}
