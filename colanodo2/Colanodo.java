package colanodo;

import java.util.Scanner;

public class Colanodo {

    public static void main(String[] args) {
        int opt = 0;
        Scanner texto = new Scanner(System.in);
        cola c = new cola();
        do {
            System.out.println("1 agregar");
            System.out.println("2 mostrar");
            System.out.println("3 eliminar");
            System.out.println("4 buscar");
            System.out.println("5 salir");

            switch (opt = texto.nextInt()) {
                case 1:
                    c.insertarnodo();
                    break;
                case 2:
                    c.mostrar();
                    break;
                case 3:
                    c.eliminar();
                    break;
                case 4:
                    c.buscar();
                    break;
                
                default:
                    System.out.println("opcion no valida, try again broo"); 
                    break;
            }

        } while (opt != 5);

    }

}
