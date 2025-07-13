public class PilaInt {
    private NodoInt tope;

    public PilaInt() {
        tope = null;
    }

    public void apilar(int dato) {
        NodoInt nuevo = new NodoInt(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public int desapilar() {
        if (estaVacia()) {
            throw new RuntimeException("Pila vacía");
        }
        int valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void mostrar(String nombre) {
        System.out.print(nombre + ": ");
        NodoInt actual = tope;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}