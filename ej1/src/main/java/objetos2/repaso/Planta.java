package objetos2.repaso;

public class Planta extends Empleado {
    private int cantidadHijos ;

    public Planta (String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cantidadHijos = cantidadHijos;
    }
    // retorna el sueldo del empleado

    public double sueldo() {
        return super.sueldoBasicoDescontandoImpuestos() + (this.cantidadHijos * 2000);
    }
}
