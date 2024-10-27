import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
    numerosOrden();
    }
    public static int ingresarNumero(String mensaje) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        System.out.println(mensaje);
        while (true) {
            String ingreso = input.nextLine();
            try {
                numero = Integer.parseInt(ingreso);
                break;

            } catch (NumberFormatException e){
                System.out.println("No ingresaste un numero valido");
            }
        }
        return numero;
    }
    public static void positivoNegativo() {
        int numero = 0;
       numero = ingresarNumero("Ingrese un numero cualquiera");
        if (numero >= 0) {
            System.out.println("El numero ingresado es positivo");
        } else {
            System.out.println("El numero ingresado es negativo");
        }
    }
    public static void puedeVotar() {
        int edad = 0;
        edad = ingresarNumero("Ingresa tu edad");
        if (edad >=18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }
    }
    public static void numerosOrden() {
        int num1 = 0, num2 = 0, num3 = 0;
        num1 = ingresarNumero("Ingrese el primer numero");
        num2 = ingresarNumero("Ingrese el segundo numero");
        num3 = ingresarNumero("Ingrese el tercer numero");
        if (num1 > num2) {
            if (num3 > num1) {
                System.out.println(num3 + " " + num1  + " " + num2);
            } else {
                if (num3 > num2) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                } else {
                    System.out.println(num1 + " " + num2 + " " + num3);
                }
            }
        } else {
            if (num2 > num3) {
                if (num1 > num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else {
                    System.out.println(num2 + " " + num3 + " " + num1);
                }

            } else {
                System.out.println(num3 + " " + num2 + " " + num1);

            }
        }
    }

}
