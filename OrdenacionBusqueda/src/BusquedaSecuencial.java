import java.util.Scanner;
public class BusquedaSecuencial {
    
    static void busquedaSecuencial(int[] numeros,int busqueda) {
        int i=0;
        while(i<numeros.length && numeros[i]!=busqueda) {
            i++;
        }
        if(i==numeros.length) {
            System.out.println("No encontrado");
        }else {
            System.out.println("Encontrado en posición "+i);
        }
    }
    static void imprimir(int[] numeros) {
        for(int i=0;i<numeros.length;i++) {
            System.out.print(numeros[i]+"  ");
        }
    }
    public static void main(String args []) {
        int numeros[]={1,8,3,4,6,9,5,2,7};
        int busqueda=0;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca un número del 1 al 10");
        busqueda=lector.nextInt();
        busquedaSecuencial(numeros,busqueda);
        imprimir(numeros);
    }
}
