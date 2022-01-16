
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarClientesPresentesRestaurante() {
        Restaurante restaurante = new Restaurante(
                new Cliente("Marco", true),
                new Cliente("Antonio", true),
                new Cliente("Jose", false),
                new Cliente("Maria", true)
        );
        assertEquals(3, Censo.contarClientePresenteRestaurante(restaurante));
    }

    @Test
    void deveContarTotalClientesRestaurante() {
        Restaurante restaurante = new Restaurante(
                new Cliente("Marco", true),
                new Cliente("Antonio", true),
                new Cliente("Jose", false),
                new Cliente("Maria", true)
        );
        assertEquals(4, Censo.contarTotalClientesRestaurante(restaurante));
    }
}