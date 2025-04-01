package objetos2.repaso;

public class Temporario extends Empleado {
    private double horasTrabajadas;
    private int cantidadHijos;

    public Temporario (String nombre, String apellido, double sueldoBasico, double horasTrabajadas, int cantidadHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.horasTrabajadas = horasTrabajadas;
        this.cantidadHijos = cantidadHijos;
    }

    // retorna el sueldo del empleado

    public double sueldo() {
        return super.sueldoBasicoDescontandoImpuestos() + (this.horasTrabajadas * 500) + (this.cantidadHijos * 1000);
    }
}
