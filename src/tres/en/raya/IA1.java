package tres.en.raya;

public class IA1 extends IA0 {

    //Atributos
    private int tablaPrioridad[][] = {{3, 2, 3}, {2, 4, 2}, {3, 2, 3}};

    //Constructor
    public IA1() {
        super();
    }

    //Métodos
    public int[] buscarCasillaPrioridad(Tablero t) {
        int valorMaximo = -1;
        int coordenadas[] = {0, 0};
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (t.casillaVacia(fila, columna) == true && this.getPrioridad(fila, columna) > valorMaximo) {
                    valorMaximo = getPrioridad(fila, columna);
                    coordenadas[0] = fila;
                    coordenadas[1] = columna;
                }
            }
        }
        return coordenadas;
    }

    public int getPrioridad(int fila, int columna) {
        return this.tablaPrioridad[fila][columna];
    }

    public int[][] getTablaPrioridad() {
        return this.tablaPrioridad;
    }

    public void llenarTablaDePrioridad() {
        //Centro
        this.tablaPrioridad[1][1] = 4;
        //Esquinas
        this.tablaPrioridad[0][0] = 3;
        this.tablaPrioridad[0][2] = 3;
        this.tablaPrioridad[2][0] = 3;
        this.tablaPrioridad[2][2] = 3;
        //Aristas
        this.tablaPrioridad[0][1] = 2;
        this.tablaPrioridad[1][0] = 2;
        this.tablaPrioridad[1][2] = 2;
        this.tablaPrioridad[2][1] = 2;
    }

    @Override
    public Movimiento mover(Tablero t) {
        Movimiento mov;
        mov = new Movimiento();
        mov.setJugador(this);
        mov.setBlancas(this.getBlancas());
        int coordenadas[] = this.buscarCasillaPrioridad(t);

        mov.setFila(coordenadas[0]);
        mov.setColumna(coordenadas[1]);

        return mov;

    }

}
