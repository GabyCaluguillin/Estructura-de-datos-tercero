import java.util.*;

public class ListasPrimosArmstrong {
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

        public void agregarInicio(int dato) {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        }

        public void agregarFinal(int dato) {
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

        public int contarElementos() {
            int count = 0;
            Nodo temp = cabeza;
            while (temp != null) {
                count++;
                temp = temp.siguiente;
            }
            return count;
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean esArmstrong(int num) {
        int original = num, suma = 0, digitos = String.valueOf(num).length();
        while (num != 0) {
            int digito = num % 10;
            suma += Math.pow(digito, digitos);
            num /= 10;
        }
        return suma == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista primos = new Lista();
        Lista armstrong = new Lista();

        System.out.print("Ingrese cuántos números desea evaluar: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();

            if (esPrimo(num)) {
                primos.agregarFinal(num);
            }
            if (esArmstrong(num)) {
                armstrong.agregarInicio(num);
            }
        }

        // Mostrar resultados
        System.out.println("\nLista de números primos:");
        primos.imprimir();
        System.out.println("Total primos: " + primos.contarElementos());

        System.out.println("\nLista de números Armstrong:");
        armstrong.imprimir();
        System.out.println("Total Armstrong: " + armstrong.contarElementos());

        if (primos.contarElementos() > armstrong.contarElementos()) {
            System.out.println("La lista de primos tiene más elementos.");
        } else if (primos.contarElementos() < armstrong.contarElementos()) {
            System.out.println("La lista de Armstrong tiene más elementos.");
        } else {
            System.out.println("Ambas listas tienen la misma cantidad de elementos.");
        }
    }
}
