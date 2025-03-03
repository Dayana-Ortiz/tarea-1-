package org.example;

public class operacionales {
    public static void main(String[] args) {
        // Tipos de datos primitivos
        int entero = 10;
        double decimal = 5.5;
        char caracter = 'A';
        boolean booleano = true;
      
        // Operaciones básicas
        int suma = entero + numeroObjeto;
        double multiplicacion = decimal * decimalObjeto;
        boolean comparacion = (entero > numeroObjeto);

        // Operaciones con caracteres y strings
        char siguienteLetra = (char) (caracter + 1); // 'B'
        String concatenacion = texto + " Bienvenido a Java.";

        // Imprimir resultados
        System.out.println("Operaciones con Tipos de Datos en Java:");
        System.out.println("Suma de enteros: " + suma);
        System.out.println("Multiplicación de decimales: " + multiplicacion);
        System.out.println("Comparación (10 > 20): " + comparacion);
        System.out.println("Caracter siguiente a 'A': " + siguienteLetra);
        System.out.println("Concatenación de Strings: " + concatenacion);
        
        // Operaciones con booleanos
        boolean resultadoAND = booleano && false;
        boolean resultadoOR = booleano || false;
        
        System.out.println("Operación lógica AND: " + resultadoAND);
        System.out.println("Operación lógica OR: " + resultadoOR);
    }
}

}
