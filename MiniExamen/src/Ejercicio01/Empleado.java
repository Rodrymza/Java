package Ejercicio01;

abstract class Empleado {
    private String nombre;
    private int salarioBase;

    public Empleado(int salarioBase, String nombre) {
        this.salarioBase = salarioBase;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalarioBase() {
        return salarioBase;
    }
    public abstract int calcularSalario();
    public void mostrar_informacion(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario base $" + salarioBase);
    }
}
