package Ejercicio01;

public class EmpleadoPorHoras extends  Empleado{
    private int horasTrabajadas;
    public EmpleadoPorHoras(int salarioBase, String nombre, int horasTrabajadas) {
        super(salarioBase, nombre);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public int calcularSalario() {
        return horasTrabajadas * getSalarioBase();
    }
}
