public class MundoLaberinto{
    private char[][] mundo;
    public MundoLaberinto(){
        mundo = new char[][]{
                {'T','S','S','P'},//fila 0
                {'S','S','S','W'},//fila 1
                {'P','S','S','E'},//fila 2
                {'W','P','S','A'}//fila 3
        };
        //T cordenada de meta
        //A cordenada inicial
    }
    public char[][] getMundo(){
        return mundo;
    }
    public Estado getEstadoInicial(){
        return new Estado(3,3,'A'); //Agente  Inicio en (3,3)
    }
    public Estado getEstadoMeta(){
        return new Estado(0,0,'T'); // Treasure  Meta en (0,0)
    }
}
