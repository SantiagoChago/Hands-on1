import java.util.List;


public class Main {
    public static void main(String[] args) {
        MundoLaberinto mundoLaberinto =new MundoLaberinto();
        char[][] mundo =mundoLaberinto.getMundo();
        Estado inicio =mundoLaberinto.getEstadoInicial();// Definir estado inicial y meta
        Estado meta =mundoLaberinto.getEstadoMeta();
        Problema problema =new Problema(inicio, meta, mundo);
        BusquedaDFS dfs =new BusquedaDFS();//realiza busqueda
        List<String> solucionDFS =dfs.buscar(problema);
        System.out.println("Solucion de profundidad: "+(solucionDFS!=null?solucionDFS:"No encontrada"));
        // Realizar búsqueda en de anchura
        BusquedaBFS bfs =new BusquedaBFS();
        List<String> solucionBFS=bfs.buscar(problema);
        System.out.println("Solucion de anchura : "+(solucionBFS!=null?solucionBFS:"No encontrada"));
        BusquedaHillClimbing hillClimbing= new BusquedaHillClimbing();
        List<Estado> solucionHC= hillClimbing.buscar(problema);
        System.out.println("Solucion Hill Climbing: " + solucionHC);
    }
}
