package colanodo;

import java.util.Scanner;

public class cola {

    nodo primero;
    nodo ultimo;
    Scanner teclado = new Scanner(System.in);
    int contador =0;

    public cola() {
        primero = null;
        ultimo = null;

    }

    public void insertarnodo() {
        System.out.println("ingrese el dato: ");
        nodo nuevo = new nodo();
        nuevo.dato = teclado.nextInt();
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;
        } else {

            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.println("Nodo agregado broo :) ");
    }

    public void mostrar() {
        nodo actual = new nodo();
        actual = primero;
        if (primero != null) {
            while (actual != null) {
                System.out.println("" + actual.dato);
                actual = actual.siguiente;
            }
        } else {
            System.out.println("La cola se encuentra vacia");
        }
    }

    public void eliminar() {
        nodo actual = new nodo();
        actual = primero;
        nodo anterior = new nodo();
        anterior = null;
        boolean encontrado = false;
        System.out.println("ingrese el valor del dato a eliminar broo: ");
        int nodobuscado = teclado.nextInt();
        if (primero != null) {
            while (actual != null && encontrado != true) {
                if (actual.dato == nodobuscado) {
                    if (actual == primero) {
                        primero = primero.siguiente;
                    } else if (actual == ultimo) {
                        anterior.siguiente = null;
                        ultimo = anterior;
                    } else {
                        anterior.siguiente = actual.siguiente;

                    }
                    System.out.println("nodo eliminado broo");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if (!encontrado) {
                System.out.println("nodo no encontrado broo :c");

            }
        } else {
            System.out.println("la cola esta vacia brooo :c");
        }
    }
    public void buscar(){
        nodo actual = new nodo();
        actual = primero;
        boolean encontrado = false;
        System.out.print(" Ingrese el dato del nodo a buscar: ");
        int nodoBuscado = teclado.nextInt();
        if(primero != null && encontrado != true){
            contador=0;
            while(actual != null){
                if(actual.dato == nodoBuscado){
                    System.out.println("\n Nodo con el dato " + actual.dato + " Encontrado en la posicion: " + contador  );
                    encontrado = true;
                }
                actual = actual.siguiente;
                contador++;
            }
            if(!encontrado){
                System.out.println("\n Nodo no encontrado\n");
            }
        }else{
            System.out.println("\n La pila se encuentra vacia\n");
        } 
 
    }
}
