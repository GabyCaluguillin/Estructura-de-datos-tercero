package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Listas {
    private List<Integer> numeros;

    public Listas() {
        this.numeros = new ArrayList<>();
    }

    public void leerNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números vas a ingresar? ");
        int cantidad = scanner.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numeros.add(num);
        }
    }

    public void mostrarInverso() {
        System.out.println("Lista en orden inverso:");
        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println();
    }

    public double calcularPromedio() {
        if (numeros.isEmpty()) return 0;
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.size();
    }

    public int obtenerMaximo() {
        return Collections.max(numeros);
    }

    public int obtenerMinimo() {
        return Collections.min(numeros);
    }

    public boolean estaOrdenada() {
        for (int i = 0; i < numeros.size() - 1; i++) {
            if (numeros.get(i) > numeros.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void eliminarDuplicados() {
        Set<Integer> conjunto = new LinkedHashSet<>(numeros);
        numeros = new ArrayList<>(conjunto);
        System.out.println("Lista sin duplicados: " + numeros);
    }

    public void mostrarLista() {
        System.out.println("Lista actual: " + numeros);
    }
}
