public class ListaInvertida {
    static class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static class Lista {
        Nodo cabeza;

        public void agregarAlFinal(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Nodo temp = cabeza;
                while (temp.siguiente != null) {
                    temp = temp.siguiente;
                }
                temp.siguiente = nuevo;
            }
        }

        public void imprimir() {
            Nodo temp = cabeza;
            while (temp != null) {
                System.out.print(temp.dato + " -> ");
                temp = temp.siguiente;
            }
            System.out.println("null");
        }

        public void invertir() {
            Nodo anterior = null;
            Nodo actual = cabeza;
            Nodo siguiente;

            while (actual != null) {
                siguiente = actual.siguiente;
                actual.siguiente = anterior;
                anterior = actual;
                actual = siguiente;
            }

            cabeza = anterior;
        }
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        lista.agregarAlFinal(40);

        System.out.println("Lista original:");
        lista.imprimir();

        lista.invertir();

        System.out.println("Lista invertida:");
        lista.imprimir();
    }
}
