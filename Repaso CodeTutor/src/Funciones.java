import java.util.ArrayList;

public class Funciones {
    public static void main(String[] args) {
        int[] lista = {2,3,5,6,7};
        //System.out.println(promedio(lista));
        System.out.println(factorialRecursivo(4));
    }
    public static void mayorDos (int num1, int num2) {
        int mayor =  0;
        mayor = (num1>num2) ? num1:num2;
        System.out.println("El numero mayor entre " + num1 + " y " + num2 + " es " + mayor);
    }
    public static boolean esPrimo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                    return false;
            }
        }
        return true;
    }
    public static double promedio(int[] lista_numeros) {
        double suma = 0;
        for (int elemento: lista_numeros) {
            suma += elemento;
        }
        return suma/lista_numeros.length;
    }
    public static int factorialRecursivo(int numero) {
        if (numero<=2) {
            return numero;
        } else {
            return numero * factorialRecursivo(numero-1);
        }

    }
}
