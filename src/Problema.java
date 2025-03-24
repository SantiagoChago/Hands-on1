import java.util.List;
import java.util.ArrayList;

public class Problema {
    Estado inicial;
    Estado meta;
    char[][] mundo;

    public Problema(Estado inicial, Estado meta, char[][] mundo) {
        this.inicial = inicial;
        this.meta = meta;
        this.mundo = mundo;
    }
    public int calcularHeuristica(Estado estado){
        return Math.abs(estado.x-meta.x)+Math.abs(estado.y-meta.y);
    }
    public List<Estado> sucesores(Estado estado) {
        List<Estado> sucesores = new ArrayList<>();
        int[][] movimientos = {{0,1}, {1,0}, {0,-1}, {-1,0}}; //  Movimientos de Derecha, Abajo, Izquierda, Arriba
        for (int[] mov : movimientos) {
            int nx = estado.x + mov[0];
            int ny = estado.y + mov[1];

            if (nx >= 0 && nx < mundo.length && ny >= 0 && ny < mundo[0].length) {
                char tipo = mundo[nx][ny];
                if (tipo != 'W' && tipo != 'P'){// No se puede mover a muros ni pozos
                    sucesores.add(new Estado(nx, ny, tipo));
                }
            }
        }
        return sucesores;
    }
}