package colanodo;

import java.util.Scanner;

public class Colanodo {

    public static void main(String[] args) {
        int opt = 0;
        Scanner texto = new Scanner(System.in);
        cola c = new cola();
        do {
            System.out.println("1 agregar\n2 mostrar\n3 eliminar\n4 salir");

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
                
                default:
                    break;
            }

        } while (opt != 4);

    }

}
