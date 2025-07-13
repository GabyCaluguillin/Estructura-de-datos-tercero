import java.util.Scanner;

public class BalanceoParentesis {

    public static boolean estaBalanceado(String expresion) {
        Pila pila = new Pila();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                pila.apilar(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.estaVacia()) {
                    return false;
                }

                char tope = pila.desapilar();

                if ((c == ')' && tope != '(') ||
                    (c == ']' && tope != '[') ||
                    (c == '}' && tope != '{')) {
                    return false;
                }
            }
        }

        return pila.estaVacia();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la expresión: ");
        String expresion = scanner.nextLine();

        if (estaBalanceado(expresion)) {
            System.out.println("Fórmula balanceada.");
        } else {
            System.out.println("Fórmula desbalanceada.");
        }
    }
}