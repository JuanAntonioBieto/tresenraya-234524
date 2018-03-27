package tres.en.raya;

public class IA0 extends Jugador {

    //Atributos
    private Tablero tablero;

    //Constructor
    public IA0() {
        super("IA0");
    }

    //Métodos
    public Movimiento mover(Tablero t) {
        Movimiento mov;
        mov = new Movimiento();

        mov.setJugador(this);
        mov.setBlancas(this.getBlancas());

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (t.casillaVacia(fila, columna) == true) {
                    mov.setFila(fila);
                    mov.setColumna(columna);
                    return mov;
                }
            }

        }
        return null;
    }

}
