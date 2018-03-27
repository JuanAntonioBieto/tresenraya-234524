package tres.en.raya;

public class IA4 extends IA3 {

    //Constructor
    public IA4() {
        super();
    }

    //Métodos
    public void calcularProbabilidadDeGanar(Tablero tablero) {
        this.llenarTablaDePrioridad();
        int valor = 0;
        if (this.getBlancas() == true) {
            valor = 0;

        } else {
            valor = 1;

        }
        //Casilla fila: 0, columna: 0
        if (tablero.casillaVacia(0, 0) == false) {
            this.getTablaPrioridad()[0][0] = 0;
        }
        if ((tablero.casillaVacia(0, 1) == false && tablero.getcasilla(0, 1) != valor) || (tablero.casillaVacia(0, 2) == false && tablero.getcasilla(0, 2) != valor)) {
            if (this.getTablaPrioridad()[0][0] > 0) {
                this.getTablaPrioridad()[0][0]--;
            }
        }
        if ((tablero.casillaVacia(1, 0) == false && tablero.getcasilla(1, 0) != valor) || (tablero.casillaVacia(2, 0) == false && tablero.getcasilla(2, 0) != valor)) {
            if (this.getTablaPrioridad()[0][0] > 0) {
                this.getTablaPrioridad()[0][0]--;
            }
        }
        if ((tablero.casillaVacia(1, 1) == false && tablero.getcasilla(1, 1) != valor) || (tablero.casillaVacia(2, 2) == false && tablero.getcasilla(2, 2) != valor)) {
            if (this.getTablaPrioridad()[0][0] > 0) {
                this.getTablaPrioridad()[0][0]--;
            }
        }
        //Casilla fila: 0, columna: 1
        if (tablero.casillaVacia(0, 1) == false) {
            this.getTablaPrioridad()[0][1] = 0;
        }
        if ((tablero.casillaVacia(0, 0) == false && tablero.getcasilla(0, 0) != valor) || (tablero.casillaVacia(0, 2) == false && tablero.getcasilla(0, 2) != valor)) {
            if (this.getTablaPrioridad()[0][1] > 0) {
                this.getTablaPrioridad()[0][1]--;
            }
        }
        if ((tablero.casillaVacia(1, 1) == false && tablero.getcasilla(1, 1) != valor) || (tablero.casillaVacia(2, 1) == false && tablero.getcasilla(2, 1) != valor)) {
            if (this.getTablaPrioridad()[0][1] > 0) {
                this.getTablaPrioridad()[0][1]--;
            }
        }
        //Casilla fila: 0, columna: 2
        if (tablero.casillaVacia(0, 2) == false) {
            this.getTablaPrioridad()[0][2] = 0;
        }
        if ((tablero.casillaVacia(0, 0) == false && tablero.getcasilla(0, 0) != valor) || (tablero.casillaVacia(0, 1) == false && tablero.getcasilla(0, 1) != valor)) {
            if (this.getTablaPrioridad()[0][2] > 0) {
                this.getTablaPrioridad()[0][2]--;
            }
        }
        if ((tablero.casillaVacia(1, 2) == false && tablero.getcasilla(1, 2) != valor) || (tablero.casillaVacia(2, 2) == false && tablero.getcasilla(2, 2) != valor)) {
            if (this.getTablaPrioridad()[0][2] > 0) {
                this.getTablaPrioridad()[0][2]--;
            }
        }
        if ((tablero.casillaVacia(1, 1) == false && tablero.getcasilla(1, 1) != valor) || (tablero.casillaVacia(2, 0) == false && tablero.getcasilla(2, 0) != valor)) {
            if (this.getTablaPrioridad()[0][2] > 0) {
                this.getTablaPrioridad()[0][2]--;
            }
        }
        //Casilla fila: 1, columna: 0
        if (tablero.casillaVacia(1, 0) == false) {
            this.getTablaPrioridad()[1][0] = 0;
        }
        if ((tablero.casillaVacia(0, 0) == false && tablero.getcasilla(0, 0) != valor) || (tablero.casillaVacia(2, 0) == false && tablero.getcasilla(2, 0) != valor)) {
            if (this.getTablaPrioridad()[1][0] > 0) {
                this.getTablaPrioridad()[1][0]--;
            }
        }
        if ((tablero.casillaVacia(1, 1) == false && tablero.getcasilla(1, 1) != valor) || (tablero.casillaVacia(1, 2) == false && tablero.getcasilla(1, 2) != valor)) {
            if (this.getTablaPrioridad()[1][0] > 0) {
                this.getTablaPrioridad()[1][0]--;
            }
        }
        //Casilla fila: 1, columna: 1
        if (tablero.casillaVacia(1, 1) == false) {
            this.getTablaPrioridad()[1][1] = 0;
        }
        if ((tablero.casillaVacia(0, 0) == false && tablero.getcasilla(0, 0) != valor) || (tablero.casillaVacia(2, 2) == false && tablero.getcasilla(2, 2) != valor)) {
            if (this.getTablaPrioridad()[1][1] > 0) {
                this.getTablaPrioridad()[1][1]--;
            }
        }
        if ((tablero.casillaVacia(0, 2) == false && tablero.getcasilla(0, 2) != valor) || (tablero.casillaVacia(2, 0) == false && tablero.getcasilla(2, 0) != valor)) {
            if (this.getTablaPrioridad()[1][1] > 0) {
                this.getTablaPrioridad()[1][1]--;
            }
        }
        if ((tablero.casillaVacia(0, 1) == false && tablero.getcasilla(0, 1) != valor) || (tablero.casillaVacia(2, 1) == false && tablero.getcasilla(2, 1) != valor)) {
            if (this.getTablaPrioridad()[1][1] > 0) {
                this.getTablaPrioridad()[1][1]--;
            }
        }
        if ((tablero.casillaVacia(1, 0) == false && tablero.getcasilla(1, 0) != valor) || (tablero.casillaVacia(1, 2) == false && tablero.getcasilla(1, 2) != valor)) {
            if (this.getTablaPrioridad()[1][1] > 0) {
                this.getTablaPrioridad()[1][1]--;
            }
        }
        //Casilla fila: 1, columna: 2
        if (tablero.casillaVacia(1, 2) == false) {
            this.getTablaPrioridad()[1][2] = 0;
        }
        if ((tablero.casillaVacia(0, 2) == false && tablero.getcasilla(0, 2) != valor) || (tablero.casillaVacia(2, 2) == false && tablero.getcasilla(2, 2) != valor)) {
            if (this.getTablaPrioridad()[1][2] > 0) {
                this.getTablaPrioridad()[1][2]--;
            }
        }
        if ((tablero.casillaVacia(1, 0) == false && tablero.getcasilla(1, 0) != valor) || (tablero.casillaVacia(1, 1) == false && tablero.getcasilla(1, 1) != valor)) {
            if (this.getTablaPrioridad()[1][2] > 0) {
                this.getTablaPrioridad()[1][2]--;
            }
        }
        //Casilla row: 2, columna: 0
        if (tablero.casillaVacia(2, 0) == false) {
            this.getTablaPrioridad()[2][0] = 0;
        }
        if ((tablero.casillaVacia(0, 0) == false && tablero.getcasilla(0, 0) != valor) || (tablero.casillaVacia(1, 0) == false && tablero.getcasilla(1, 0) != valor)) {
            if (this.getTablaPrioridad()[2][0] > 0) {
                this.getTablaPrioridad()[2][0]--;
            }
        }
        if ((tablero.casillaVacia(2, 1) == false && tablero.getcasilla(2, 1) != valor) || (tablero.casillaVacia(2, 2) == false && tablero.getcasilla(2, 2) != valor)) {
            if (this.getTablaPrioridad()[2][0] > 0) {
                this.getTablaPrioridad()[2][0]--;
            }
        }
        if ((tablero.casillaVacia(0, 2) == false && tablero.getcasilla(0, 2) != valor) || (tablero.casillaVacia(1, 1) == false && tablero.getcasilla(1, 1) != valor)) {
            if (this.getTablaPrioridad()[2][0] > 0) {
                this.getTablaPrioridad()[2][0]--;
            }
        }
        //Casilla row: 2, columna: 1
        if (tablero.casillaVacia(2, 1) == false) {
            this.getTablaPrioridad()[2][1] = 0;
        }
        if ((tablero.casillaVacia(2, 0) == false && tablero.getcasilla(2, 0) != valor) || (tablero.casillaVacia(2, 2) == false && tablero.getcasilla(2, 2) != valor)) {
            if (this.getTablaPrioridad()[2][1] > 0) {
                this.getTablaPrioridad()[2][1]--;
            }
        }
        if ((tablero.casillaVacia(0, 1) == false && tablero.getcasilla(0, 1) != valor) || (tablero.casillaVacia(1, 1) == false && tablero.getcasilla(1, 1) != valor)) {
            if (this.getTablaPrioridad()[2][1] > 0) {
                this.getTablaPrioridad()[2][1]--;
            }
        }
        //Casilla row: 2, columna: 2
        if (tablero.casillaVacia(2, 2) == false) {
            this.getTablaPrioridad()[2][2] = 0;
        }
        if ((tablero.casillaVacia(0, 2) == false && tablero.getcasilla(0, 2) != valor) || (tablero.casillaVacia(1, 2) == false && tablero.getcasilla(1, 2) != valor)) {
            if (this.getTablaPrioridad()[2][2] > 0) {
                this.getTablaPrioridad()[2][2]--;
            }
        }
        if ((tablero.casillaVacia(2, 0) == false && tablero.getcasilla(2, 0) != valor) || (tablero.casillaVacia(2, 1) == false && tablero.getcasilla(2, 1) != valor)) {
            if (this.getTablaPrioridad()[2][2] > 0) {
                this.getTablaPrioridad()[2][2]--;
            }
        }
        if ((tablero.casillaVacia(0, 0) == false && tablero.getcasilla(0, 0) != valor) || (tablero.casillaVacia(1, 1) == false && tablero.getcasilla(1, 1) != valor)) {
            if (this.getTablaPrioridad()[2][2] > 0) {
                this.getTablaPrioridad()[2][2]--;
            }
        }

    }

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

        //recalcular valores
        calcularProbabilidadDeGanar(t);
        //
        int coordenadas[] = this.buscarCasillaPrioridad(t);
        mov.setFila(coordenadas[0]);
        mov.setColumna(coordenadas[1]);
        return mov;

    }

}
