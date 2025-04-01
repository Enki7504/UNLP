package objetos2.repaso1;

/**
 * De esta forma crearemos las clases del ejercicio
 **/
public class Piedra extends Objeto {
    protected String jugarContraPapel(){
        return "Pierde";
    }
    protected String jugarContraPiedra(){
        return "Empate";
    }
    protected String jugarContraTijera(){
        return "Gana";
    }
    protected String jugarContraLagarto(){
        return "Gana";
    }
    protected String jugarContraSpock(){
        return "Pierde";
    }
    public String jugarContra(Objeto objeto){
        return objeto.jugarContraPiedra();
    }
}
