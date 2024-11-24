package Ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> lista_empleados = new ArrayList<>();

    }
    public static Empleado crear_empleado_temporal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String nombre = input.nextLine();
        System.out.println("Ingrese horas trabajadas");
        int horas = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese tarifa por hora");
        int tarifa = Integer.parseInt(input.nextLine());
        EmpleadoPorHoras empleado = new EmpleadoPorHoras(tarifa, nombre, horas);
        return empleado;
    }
    public static Empleado crear_empleado_completo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String nombre = input.nextLine();
        System.out.println("Ingrese salario base");
        int base = Integer.parseInt(input.nextLine());
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto(base, nombre);
        return empleado;
    }
}
