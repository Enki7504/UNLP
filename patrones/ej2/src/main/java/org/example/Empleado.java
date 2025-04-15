package org.example;

public abstract class Empleado {

    public Double sueldo(){
        return this.calcularSueldoBasico()+this.calcularSueldoAdicional()-this.getDescuentos();
    };

    public abstract Double calcularSueldoBasico();

    public abstract Double calcularSueldoAdicional();

    public Double getDescuentos(){
        return calcularSueldoBasico()*0.13+calcularSueldoAdicional()*0.05;
    };

}
