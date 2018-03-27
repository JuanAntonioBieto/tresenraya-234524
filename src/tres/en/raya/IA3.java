package tres.en.raya;

public class IA3 extends IA2 {

    //Constructor
    public IA3() {
        super();
    }

    //Metodos
    @Override
    public Movimiento mover(Tablero t) {
        Movimiento mov;
        int valor = -1;
        int valor2 = -1;
        mov = new Movimiento();
        mov.setJugador(this);
        mov.setBlancas(this.getBlancas());
        if (this.getBlancas() == true) {
            valor = 0;
            valor2 = 1;
        } else {
            valor = 1;
            valor2 = 0;
        }
        if (movimientoGanador(t, valor) != null) {

            int coordenadas[] = movimientoGanador(t, valor);
            mov.setFila(coordenadas[0]);
            mov.setColumna(coordenadas[1]);
            return mov;

        }
        if (movimientoGanador(t, valor2) != null) {

            int coordenadas[] = movimientoGanador(t, valor2);
            mov.setFila(coordenadas[0]);
            mov.setColumna(coordenadas[1]);
            return mov;

        }
        int coordenadas[] = this.buscarCasillaPrioridad(t);
        mov.setFila(coordenadas[0]);
        mov.setColumna(coordenadas[1]);
        return mov;

    }

}
