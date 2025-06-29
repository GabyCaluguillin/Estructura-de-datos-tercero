package listas;

public class Main {
    public static void main(String[] args) {
        Listas lista = new Listas();

        lista.leerNumeros();
        lista.mostrarLista();

        lista.mostrarInverso();
        System.out.println("Promedio: " + lista.calcularPromedio());
        System.out.println("Máximo: " + lista.obtenerMaximo());
        System.out.println("Mínimo: " + lista.obtenerMinimo());
        System.out.println("¿La lista está ordenada? " + (lista.estaOrdenada() ? "Sí" : "No"));
        lista.eliminarDuplicados();
    }
}
