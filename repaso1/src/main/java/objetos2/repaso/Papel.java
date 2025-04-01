package objetos2.repaso1;

/**
 * De esta forma crearemos las clases del ejercicio
 **/
public class Papel extends Objeto {
    protected String jugarContraPapel(){
        return "Empate";
    }
    protected String jugarContraPiedra(){
        return "Gana";
    }
    protected String jugarContraTijera(){
        return "Pierde";
    }
    protected String jugarContraLagarto(){
        return "Pierde";
    }
    protected String jugarContraSpock(){
        return "Gana";
    }
    public String jugarContra(Objeto objeto){
        return objeto.jugarContraPapel();
    }
}
