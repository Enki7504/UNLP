package objetos2.repaso;

public class Pasante extends Empleado {

    public Pasante (String nombre, String apellido, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }

    // retorna el sueldo del empleado

    public double sueldo() {
        return super.sueldoBasicoDescontandoImpuestos();
    }
}
