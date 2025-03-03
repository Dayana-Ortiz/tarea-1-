package org.example;

public class datos_primitivos {
    public class CarritoCompras {
        public static void main(String[] args) {
            int numeroDeManzanas = 5;
            int numeroDeNaranjas = 3;
            int totalArticulos = numeroDeManzanas + numeroDeNaranjas;

            System.out.println("Tienes " + totalArticulos + " artículos en tu carrito.");
        }
    }public class TemperaturaPromedio {
        public static void main(String[] args) {
            double temperaturaLunes = 25.5;
            double temperaturaMartes = 27.0;
            double temperaturaMiercoles = 26.3;
            double promedio = (temperaturaLunes + temperaturaMartes + temperaturaMiercoles) / 3;

            System.out.println("La temperatura promedio es: " + promedio + " grados Celsius.");
        }
    }public class ElegibilidadVoto {
        public static void main(String[] args) {
            int edad = 20;
            boolean esElegible = edad >= 18;

            if (esElegible) {
                System.out.println("Eres elegible para votar.");
            } else {
                System.out.println("No eres elegible para votar.");
            }
        }
    }public class InicialNombre {
        public static void main(String[] args) {
            char primeraInicial = 'A';
            char segundaInicial = 'B';

            System.out.println("Tus iniciales son: " + primeraInicial + segundaInicial);
        }
    }public class AreaCirculo {
        public static void main(String[] args) {
            double radio = 5.0;
            double area = Math.PI * radio * radio;

            System.out.println("El área del círculo es: " + area);
        }
    }public class NumeroPar {
        public static void main(String[] args) {
            int numero = 10;
            boolean esPar = numero % 2 == 0;

            if (esPar) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
        }
    }public class CalificacionEstudiante {
        public static void main(String[] args) {
            char calificacion = 'A';

            System.out.println("La calificación del estudiante es: " + calificacion);
        }
    }
}
