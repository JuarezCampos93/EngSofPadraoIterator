
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalanceteClientesTest {

    @Test
    void deveContarClientesPresentesPizzaria() {
        Pizzaria pizzaria = new Pizzaria(
                new Cliente("Juarez", true),
                new Cliente("Maria Flor", false),
                new Cliente("Maria Clara", false),
                new Cliente("Maria", true),
                new Cliente("Filipe", true)
        );
        assertEquals(3, BalanceteClientes.contarClientePresentePizzaria(pizzaria));
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
        assertEquals(5, BalanceteClientes.contarTotalClientesPizzaria(pizzaria));
    }
}