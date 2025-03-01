package org.example;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Calculadora en Java");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potenciación");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Módulo");
            System.out.println("8. Conversión de Celsius a Fahrenheit");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a - b));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a * b));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextDouble();
                    if (b != 0) {
                        System.out.println("Resultado: " + (a / b));
                    } else {
                        System.out.println("No se puede dividir entre cero");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese la base: ");
                    a = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.pow(a, b));
                    break;
                case 6:
                    System.out.print("Ingrese el número: ");
                    a = scanner.nextDouble();
                    if (a >= 0) {
                        System.out.println("Resultado: " + Math.sqrt(a));
                    } else {
                        System.out.println("No se puede calcular la raíz cuadrada de un número negativo");
                    }
                    break;
                case 7:
                    System.out.print("Ingrese el primer número: ");
                    a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    b = scanner.nextDouble();
                    System.out.println("Resultado: " + (a % b));
                    break;
                case 8:
                    System.out.print("Ingrese la temperatura en grados Celsius: ");
                    a = scanner.nextDouble();
                    double fahrenheit = (a * 9 / 5) + 32;
                    System.out.println("Resultado: " + fahrenheit + " °F");
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente");
            }

        } while (opcion != 9);

        scanner.close();
    }
}
