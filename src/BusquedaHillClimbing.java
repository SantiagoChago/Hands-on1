import java.util.List;
import java.util.ArrayList;
class BusquedaHillClimbing {
public List<Estado> buscar(Problema problema) {
    Nodo actual = new Nodo(problema.inicial, null, 0, problema.calcularHeuristica(problema.inicial));
    List<Estado> trayectoria = new ArrayList<>();
    trayectoria.add(actual.estado);

    while (!actual.estado.equals(problema.meta)) {
        List<Estado> sucesores = problema.sucesores(actual.estado);
        Nodo mejorNodo = actual;

        for (Estado sucesor : sucesores) {
            int heuristica = problema.calcularHeuristica(sucesor);
            if (heuristica < mejorNodo.heuristica) {
                mejorNodo = new Nodo(sucesor, actual, actual.costo + 1, heuristica);
            }
        }

        if (mejorNodo == actual) break;
        actual = mejorNodo;
        trayectoria.add(actual.estado);
    }

    return trayectoria;
}
}