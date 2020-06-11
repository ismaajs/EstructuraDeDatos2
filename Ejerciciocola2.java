
package ejerciciocola;
import java.util.Scanner;
public class Ejerciciocola {

    public static void main(String[] args) {
      
    int opt = 0;

        Ejerciciocola ec = new Ejerciciocola ();

        Scanner texto = new Scanner(System.in);
        
        ec.crearvector();
        
        do {
            System.out.println("1 agregar\n2 mostrar\n3 eliminar\n4 salir");

            switch (opt = texto.nextInt()) {
                case 1:
                    ec.agregar();
                    break;
                case 2:
                    ec.mostrar();
                    break;
                case 3:
                    ec.eliminar();
                    break;
                default:
                    break;
            }
            

        } while (opt != 4);
        
    }
    int a;
    int i;
    String nombre;
    String v1[]; 
    
     public void crearvector() {
        Scanner texto = new Scanner(System.in);
        System.out.println("Digite el tamaño del vector: ");
        a = texto.nextInt(); 
        v1=  new String[a];
    }

  public void agregar() {
   
      if(i<a){
        Scanner texto = new Scanner(System.in);
        System.out.println("Escriba un nombre de 4 letras: ");
        nombre = texto.nextLine();
        if(nombre.length() == 4)
        {     
              System.out.println("nombre valido, agregado a la cola");
        v1[i] = nombre;
        i++; }
        else{
             System.out.println("nombre no valido, intente de nuevo");
            }
        
     
      }else{
          System.out.println("No se pueden agregar mas, la lista esta llena, elimine un nombre: ");
      }
      
       
    }

    public void mostrar(){
        for(int j=0; j<i; j++){
            System.out.println("el nombre es la posicion ["+j+"] es: " + v1[j]);
        
        }
       
        if(i==0){
            System.out.println("la cola esta vacia, agrege un nombre: ");
        }
    }
   
    public void eliminar(){

    for (int j = 0; j < i-1; j++) {
                        v1[j] = v1[j + 1];
                    }
        if(i==0){
            System.out.println("la cola esta vacia, agrege un nombre: ");
        }else{
            i--;
        }
}
}
