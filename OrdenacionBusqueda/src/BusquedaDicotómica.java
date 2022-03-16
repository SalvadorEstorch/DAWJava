
import java.util.Scanner ;
public class BusquedaDicotómica {
    public static int [] ordenacionBurbuja(int numeros[]) {
        for(int f=0;f<numeros.length;f++) {
            for(int c=0;c<numeros.length-1;c++) {
                if(numeros[c]>numeros[c+1]) {
                    int aux=numeros[c+1];
                    numeros[c+1]=numeros[c];
                    numeros[c]=aux;
                }
            }
        }
        return(numeros);
    }
    static void busquedaDicotomica(int numeros[],int busqueda) {
        int inicio=0;
        int fin=numeros.length-1;
        int posicion=-1;
        while(posicion==-1 && inicio<=fin) {
            int medio=(int)((inicio+fin)/2);
            if(numeros[medio]==numeros[busqueda]) {
                posicion=medio;
            }else {
                if(numeros[busqueda]<numeros[medio]) {
                    fin=medio-1;                   
                }else {
                    inicio=medio+1;
                }
            }
        }
        if(posicion==-1) {
            System.out.println("No encontrado");
        } else {
            System.out.println("Encontrado en posición "+posicion);
        }
    }
    static void imprimir(int []numeros) {
        for(int i=0;i<numeros.length;i++) {
            System.out.print(numeros[i]+"  ");
        }
        System.out.println("  ");
    }
    public static void main(String args []) {
        int numeros[]={2,4,7,5,8,9,3,6,1,10};
        int busqueda;
        Scanner lector=new Scanner(System.in);
        System.out.println("Escribe un número del 1 al 10");
        busqueda=lector.nextInt();
        busquedaDicotomica(ordenacionBurbuja(numeros),busqueda);
        imprimir(ordenacionBurbuja(numeros));
    }   
}
