package tres.en.raya;

import java.util.ArrayList;
import java.util.Scanner;

public class Sesion {

    //Atributos
    private Ranking ranking;
    private ArrayList<Partida> partidas;
    private Jugador jugador;
    private Jugador IA;

    //Constructor
    public Sesion() {
        this.partidas = new ArrayList();
        this.IA = new IA0();//Cambiar numero para di
        this.ranking = new Ranking();
    }

    //Métodos
    private void actualizarRanking(Partida p) {

        if (p.getTablero().comprobarEmpate()) {
            //Empate
            System.out.println("Has empatado!");
            System.out.println("");
            this.ranking.addEmpate();
        } else {
            //Alguien gana 
            if (p.ganador()) {
                this.ranking.addVictoria(true);
                System.out.println("");
                System.out.println("Has Ganado!");
                System.out.println("");
                p.getTablero().mostrarTablero();
                System.out.println("");

            } else {
                this.ranking.addVictoria(false);
                System.out.println("");
                System.out.println("Has perdido intentalo de nuevo!");
                p.getTablero().mostrarTablero();
                System.out.println("");

            }
        }
    }

    private void crearJugador() {
        System.out.println("Introduce tu nombre");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        this.jugador = new Jugador(name);

    }

    private void crearPartida() {
        Partida p;

        int sorteo;
        sorteo = this.sorteo();

        if (sorteo == 0) {
            p = new Partida(this.jugador, this.IA);
        } else {
            p = new Partida(this.IA, this.jugador);
        }

        this.partidas.add(p);
        p.jugar();
        this.actualizarRanking(p);

    }

    private void elegirIA() {

        System.out.println("1- IA0");
        System.out.println("2- IA1");
        System.out.println("3- IA2");
        System.out.println("4- IA3");
        System.out.println("5- IA4");
        Scanner sc = new Scanner(System.in);
        int navegar = sc.nextInt();
        switch (navegar) {

            case 1:
                this.IA = new IA0();
                break;
            case 2:
                this.IA = new IA1();
                break;
            case 3:
                this.IA = new IA2();
                break;
            case 4:
                this.IA = new IA3();
                break;
            case 5:
                this.IA = new IA4();
                break;
        }

    }

    private void menu() {
        boolean salir = false;

        while (salir == false) {

            System.out.println("1- Empezar partida");
            System.out.println("2- Elegir IA");
            System.out.println("3- Mostrar ranking");
            System.out.println("4- Salir");
            System.out.println("");
            Scanner sc = new Scanner(System.in);
            int navegar = sc.nextInt();
            switch (navegar) {

                case 1:
                    crearPartida();
                    break;
                case 2:
                    elegirIA();
                    break;
                case 3:
                    this.ranking.mostrarRanking();
                    break;
                case 4:
                    salir = true;
                    break;

            }
        }

    }

    private int sorteo() {
        int sorteo;
        sorteo = (int) (Math.random() * 2);
        if (sorteo == 0) {
            System.out.println("Empieza el Jugador");
        } else {
            System.out.println("Empieza la Máquina");
        }
        return sorteo;
    }

    public static void main(String[] args) {
        Sesion sesion;
        sesion = new Sesion();
        sesion.crearJugador();
        sesion.elegirIA();
        sesion.menu();
    }

}
