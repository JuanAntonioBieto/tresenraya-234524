package tres.en.raya;

public class IA2 extends IA1 {

    public IA2() {
        super();
    }

    @Override
    public Movimiento mover(Tablero t) {
        Movimiento mov;
        int valor = -1;
        mov = new Movimiento();
        mov.setJugador(this);
        mov.setBlancas(this.getBlancas());
        if (this.getBlancas() == true) {
            valor = 0;

        } else {
            valor = 1;
        }
        if (movimientoGanador(t, valor) != null) {

            int coordenadas[] = movimientoGanador(t, valor);
            mov.setFila(coordenadas[0]);
            mov.setColumna(coordenadas[1]);
            return mov;

        }
        int coordenadas[] = this.buscarCasillaPrioridad(t);
        mov.setFila(coordenadas[0]);
        mov.setColumna(coordenadas[1]);
        return mov;

    }

    public int[] movimientoGanador(Tablero t, int valor) {
        int coordenadas[] = {0, 0};
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (t.casillaVacia(fila, columna) == true) {
                    t.setCasilla(fila, columna, valor);
                    if (t.comprobarGanador() == valor) {
                        coordenadas[0] = fila;
                        coordenadas[1] = columna;
                        t.vaciarCasilla(fila, columna);
                        return coordenadas;
                    }
                    t.vaciarCasilla(fila, columna);
                }
            }
        }
        return null;
    }

}
