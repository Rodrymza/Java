package Ejercicio01;

public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(int salarioBase, String nombre) {
        super(salarioBase, nombre);
    }

    @Override
    public int calcularSalario() {
        int bono = 400;
        return getSalarioBase() + bono;
    }
}
