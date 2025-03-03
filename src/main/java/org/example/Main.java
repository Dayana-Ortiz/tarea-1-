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
            System.out.println("9. Valor absoluto");
            System.out.println("10. Seno (sin)");
            System.out.println("11. Coseno (cos)");
            System.out.println("12. Tangente (tan)");
            System.out.println("13. Logaritmo en base 10 (log10)");
            System.out.println("14. Logaritmo natural (ln)");
            System.out.println("15. Salir");
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
                    resultado = Math.abs(numero);
                    System.out.println("Valor absoluto de " + numero + " = " + resultado);
                    break;
                case 10:
                    System.out.println("Seno de " + numero + " = " + Math.sin(Math.toRadians(numero)));
                    break;
                case 11:
                    System.out.println("Coseno de " + numero + " = " + Math.cos(Math.toRadians(numero)));
                    break;
                case 12:
                    System.out.println("Tangente de " + numero + " = " + Math.tan(Math.toRadians(numero)));
                    break;
                case 13:
                    if (numero > 0) {
                        System.out.println("Logaritmo base 10 de " + numero + " = " + Math.log10(numero));
                    } else {
                        System.out.println("Error: El logaritmo base 10 no está definido para números menores o iguales a 0.");
                    }
                    break;
                case 14:
                    if (numero > 0) {
                        System.out.println("Logaritmo natural (ln) de " + numero + " = " + Math.log(numero));
                    } else {
                        System.out.println("Error: El logaritmo natural no está definido para números menores o iguales a 0.");
                    }
                    break;
            }
        } else if (opcion != 6) {
            System.out.println("Opción no válida. Intente de nuevo.");
        }


    } while (opcion != 9);

        scanner.close();
    }
}
