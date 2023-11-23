
import java.util.Iterator;

public class Balancete {

    public static Integer contarClientePresentePizzaria(Pizzaria pizzaria) {
        int quantidade = 0;
        for (Cliente cliente : pizzaria) {
            if (cliente.isPresente()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalClientesPizzaria(Pizzaria pizzaria) {
        int quantidade = 0;
        for (Iterator a = pizzaria.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
