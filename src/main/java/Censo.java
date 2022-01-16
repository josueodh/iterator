
import java.util.Iterator;

public class Censo {

    public static Integer contarClientePresenteRestaurante(Restaurante restaurante) {
        int quantidade = 0;
        for (Cliente cliente : restaurante) {
            if (cliente.isPresente()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalClientesRestaurante(Restaurante restaurante) {
        int quantidade = 0;
        for (Iterator a = restaurante.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
