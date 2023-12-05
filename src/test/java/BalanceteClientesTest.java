
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalanceteClienteTest {

    @Test
    void deveContarClientesPresentesPizzaria() {
        Pizzaria pizzaria = new Pizzaria(
                new Cliente("Juarez", true),
                new Cliente("Maria Flor", false),
                new Cliente("Maria Clara", false),
                new Cliente("Maria", true),
                new Cliente("Filipe", true)
        );
        assertEquals(3, Balancete.contarClientePresentePizzaria(pizzaria));
    }

    @Test
    void deveContarTotalClientesPizzaria() {
        Pizzaria pizzaria = new Pizzaria(
                new Cliente("Juarez", true),
                new Cliente("Maria Flor", false),
                new Cliente("Maria Clara", false),
                new Cliente("Maria", true),
                new Cliente("Filipe", true)
        );
        assertEquals(5, Balancete.contarTotalClientesPizzaria(pizzaria));
    }
}
