import java.util.Scanner; /*Importo el Scanner para poder meter datos por teclado*/

public class TestIngles {

    public static void main(String[] args) {
        String matrizIgles[][] = { /*Creo la matríz y la lleno con los valores
            que se dieron en el ejemplo*/
            {"bear", "oso"},
            {"cat", "gato"},
            {"cheetah", "guepardo"},
            {"dog", "perro"},
            {"eagle", "águila"},
            {"fish", "pez"},
            {"frog", "rana"},
            {"horse", "caballo"},
            {"lion", "león"},
            {"lizard", "lagarto"},
            {"meerkat", "suricata"},
            {"monkey", "mono"},
            {"orangutan", "orangután"},
            {"panther", "pantera"},
            {"parrot", "loro"},
            {"pig", "cerdo"},
            {"tiger", "tigre"},
            {"toad", "sapo"},
            {"tortuise", "tortuga"},
            {"mere", "yegua"},
        };
        
        Scanner lector = new Scanner(System.in); /*Creo e inicializo la 
        varialbe que va a almacenar los valores del objeto Scanner*/
        String palabra; /*La variable principal que almacena las palabras 
        que introduce el usuario y las compara con las de la matríz*/
        int aciertos = 0; /*Variable que lleva cuenta de los aciertos*/
        int fallos = 0; /*Variable que lleva cuenta de los fallos*/
        
            
            for (int f=0; f<matrizIgles.length; f++) {  /*for que va recorriendo
                la lista de palabras*/
                   System.out.println("Traduce " + matrizIgles[f][0]); /*Instrucciones
                   y palabra a traducir*/
                   palabra = lector.nextLine(); /*Asignar a la variable palabra 
                   las palabras que vaya introduciendo el usuario*/
                   
                   if (palabra.equals(matrizIgles[f][1])) { /*Si la palabra que introduce
                       el usuario es igual a la contigua a la que se le ha presentado...*/
                       
                       System.out.println("¡Bien!"); /*Escribir felicitación*/
                       aciertos++; /*Aumentar en 1 la variable de los aciertos*/
                       
                   }else { /*En cualqier otro caso*/
                       
                       System.out.println("No, es " + matrizIgles[f][1]); /*Decir que se ha equivo
                       cado y mostrar el valor que debería haber introducido*/
                       fallos++; /*Aumentar el valor de la variable fallos*/
                   }            
            }
            System.out.println("FIN DEL TEST"); /*Imprimir este texto*/
            System.out.println("Has tenido " + aciertos + " aciertos"); /*Mostrar los aciertos*/
            System.out.println("has tenido " + fallos + " fallos"); /*Mostrar los fallos*/
    }
}