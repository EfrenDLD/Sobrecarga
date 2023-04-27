import OpAritmeticas.OpDiv;
import OpAritmeticas.OpMult;
import OpAritmeticas.OpResta;
import OpAritmeticas.OpSuma;

import java.util.Scanner;

public class Menu {
    public Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }
    public void mostrarMenu() {
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\nMENU");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.println("5.- Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            System.out.println();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el primer número:");
                    double a1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    double b1 = scanner.nextDouble();

                    double resultadoSuma = OpSuma.suma(a1, b1);
                    Imprimir.resultado(resultadoSuma);
                    break;

                case 2:
                    System.out.println("Ingrese el primer número:");
                    double a2 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    double b2 = scanner.nextDouble();

                    double resultadoResta = OpResta.resta(a2, b2);
                    Imprimir.resultado(resultadoResta);
                    break;

                case 3:
                    System.out.println("Ingrese el primer número:");
                    double a3 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    double b3 = scanner.nextDouble();

                    double resultadoMultiplicacion = OpMult.multiplicacion(a3, b3);
                    Imprimir.resultado(resultadoMultiplicacion);
                    break;

                case 4:
                    System.out.println("Ingrese el primer número:");
                    double a4 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    double b4 = scanner.nextDouble();

                    double resultadoDivision = OpDiv.division(a4, b4);
                    Imprimir.resultado(resultadoDivision);
                    break;

                case 5:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}