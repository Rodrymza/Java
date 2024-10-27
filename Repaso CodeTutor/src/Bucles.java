import java.util.ArrayList;
import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        sumarHastaNegativo();
    }
    public static void primerosDiez() {
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
    }
    public static void tablaMultiplicar(int numero) {
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + "x" + i + " = " + i*numero);
        }
    }
    public static void sumarPares(int limite) {
        int i = 0, suma = 0;
        while (i <= limite) {
            if (i%2 == 0) {
                suma += i;
            }
            i++;
        }
        System.out.println("La suma de numeros pares hasta " + limite + " es " + suma);
    }
    public static void sumarHastaNegativo() {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> lista_numeros = new ArrayList<>();
        int numero = 0, suma = 0;
        while (numero >= 0) {
            suma += numero;
            System.out.println("Ingrese un numero");
            numero = Integer.parseInt(input.nextLine());
            if (numero > 0) {
                lista_numeros.add(numero);
            }
        }
        System.out.println("La suma de numeros ingresados fue " + suma);
        System.out.println("Numeros ingresados " + lista_numeros);
    }
}
