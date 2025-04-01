package objetos2.repaso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PersonaTest {

	Usuario james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Usuario("james");
		guido = new Usuario("guido");
		james.setApellido("Gosling");
		james.setNombre("James");
		guido.setApellido("van Rossum");
		guido.setNombre("Guido");
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("Gosling, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
    }
}
