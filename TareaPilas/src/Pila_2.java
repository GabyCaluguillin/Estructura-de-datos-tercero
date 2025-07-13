public class Pila {
    private Nodo tope;

    public Pila() {
        tope = null;
    }

    public void apilar(char dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public char desapilar() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        char valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    public boolean estaVacia() {
        return tope == null;
    }
}