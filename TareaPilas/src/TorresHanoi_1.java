public class TorresHanoi {

    public static void hanoi(int n, PilaInt origen, PilaInt destino, PilaInt auxiliar,
                             String nombreO, String nombreD, String nombreA) {
        if (n == 1) {
            int disco = origen.desapilar();
            destino.apilar(disco);
            System.out.println("Mover disco " + disco + " de " + nombreO + " a " + nombreD);
            mostrarTorres(nombreO, origen, nombreD, destino, nombreA, auxiliar);
        } else {
            hanoi(n - 1, origen, auxiliar, destino, nombreO, nombreA, nombreD);
            hanoi(1, origen, destino, auxiliar, nombreO, nombreD, nombreA);
            hanoi(n - 1, auxiliar, destino, origen, nombreA, nombreD, nombreO);
        }
    }

    public static void mostrarTorres(String n1, PilaInt p1, String n2, PilaInt p2, String n3, PilaInt p3) {
        p1.mostrar(n1);
        p2.mostrar(n2);
        p3.mostrar(n3);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        int numDiscos = 3;

        PilaInt origen = new PilaInt();
        PilaInt destino = new PilaInt();
        PilaInt auxiliar = new PilaInt();

        for (int i = numDiscos; i >= 1; i--) {
            origen.apilar(i);
        }

        mostrarTorres("Origen", origen, "Destino", destino, "Auxiliar", auxiliar);
        hanoi(numDiscos, origen, destino, auxiliar, "Origen", "Destino", "Auxiliar");
    }
}