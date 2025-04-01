package objetos2.repaso1;

/**
 * De esta forma crearemos las clases del ejercicio
 **/
public class Spock extends Objeto {
    protected String jugarContraPapel(){
        return "Pierde";
    }
    protected String jugarContraPiedra(){
        return "Gana";
    }
    protected String jugarContraTijera(){
        return "Gana";
    }
    protected String jugarContraLagarto(){
        return "Pierde";
    }
    protected String jugarContraSpock(){
        return "Empate";
    }
    public String jugarContra(Objeto objeto){
        return objeto.jugarContraSpock();
    }
}
