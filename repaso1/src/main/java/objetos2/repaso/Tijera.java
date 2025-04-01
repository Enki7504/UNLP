package objetos2.repaso1;

/**
 * De esta forma crearemos las clases del ejercicio
 **/
public class Tijera extends Objeto {
    protected String jugarContraPapel(){
        return "Gana";
    }
    protected String jugarContraPiedra(){
        return "Pierde";
    }
    protected String jugarContraTijera(){
        return "Empate";
    }
    protected String jugarContraLagarto(){
        return "Gana";
    }
    protected String jugarContraSpock(){
        return "Pierde";
    }
    public String jugarContra(Objeto objeto){
        return objeto.jugarContraTijera();
    }
}
