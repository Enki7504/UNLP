package objetos2.repaso1;

/**
 * De esta forma crearemos las clases del ejercicio
 **/
public class Lagarto extends Objeto {
    protected String jugarContraPapel(){
        return "Gana";
    }
    protected String jugarContraPiedra(){
        return "Pierde";
    }
    protected String jugarContraTijera(){
        return "Pierde";
    }
    protected String jugarContraLagarto(){
        return "Empate";
    }
    protected String jugarContraSpock(){
        return "Gana";
    }
    public String jugarContra(Objeto objeto){
        return objeto.jugarContraLagarto();
    }
}
