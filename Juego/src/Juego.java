
import java.util.Scanner;
public class Juego {

    public static void main(String[] args) {
        int suerte;
        int usuario;
        int n=1;
        suerte=(int)(Math.random()*100+1);
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduzca un n�mero: ");
        usuario=lector.nextInt();
        while(suerte!=usuario){
            if(usuario>suerte)
                System.out.println("M�s peque�o -");
            else
                System.out.println("M�s grande +");
        System.out.print("Intorduzca un n�mero: ");
        usuario=lector.nextInt();
        n++;
        }
    System.out.println("�Bien Yago! �Lo has conseguido!");
    System.out.println("N�mero de intentos: "+n);
    }
    
}
