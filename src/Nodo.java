public class Nodo {
    Estado estado;
    Nodo padre;
    int costo;
    int heuristica;

    public Nodo(Estado estado, Nodo padre, int costo,int heuristica) {
        this.estado = estado;
        this.padre = padre;
        this.costo = costo;
        this.heuristica= heuristica;
    }
}