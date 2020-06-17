
package e.c3;

import java.util.Scanner;

public class EC3 {

    public static void main(String[] args) {
        int opt = 0;

        EC3 ec = new EC3();

        Scanner texto = new Scanner(System.in);

        ec.crearvector();

        do {
            System.out.println("1 agregar\n2 mostrar\n3 ordenar\n4 eliminar\n5 salir");

            switch (opt = texto.nextInt()) {
                case 1:
                    ec.agregar();
                    break;
                case 2:
                    ec.mostrar();
                    break;
                case 3:
                    ec.ordenar();
                    break;
                case 4:
                    ec.eliminar();
                    break;
                default:
                    break;
            }

        } while (opt != 5);

    }
    int a = 10;
    int i, j, k, aux,z, rango = 100;
    int v1[];

    public void crearvector() {

        System.out.println("El tamaño del vector es 10");
        v1 = new int[a];
    }

    public void agregar() {
        if (i < a) {
            v1[i] = (int) (Math.random() * rango);
            i++;
        } else {
            System.out.println("No se pueden agregar mas numeros a la cola, elimine un numero: ");
        }
    }

    public void mostrar() {
        for (k = 0; k < i; k++) {
            System.out.println("el numero en la posicion [" + k + "] es: " + v1[k]);

        }

        if (i == 0) {
            System.out.println("la cola esta vacia, agrege un numero: ");
        }
    }

    public void ordenar() {

        for (j = 1; j < i; j++) {
            for (z = 0; z < i-1; z++) {
                if (v1[z] > v1[z + 1]) {
                    aux = v1[z];
                    v1[z] = v1[z + 1];
                    v1[z + 1] = aux;
                }
            }
        }

    }

    public void eliminar() {

        for (int j = 0; j < i - 1; j++) {
            v1[j] = v1[j + 1];
        }
        if (i == 0) {
            System.out.println("la cola esta vacia, agrege un numero: ");
        } else {
            i--;
        }
    }
}
