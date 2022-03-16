import java.util.Scanner;

public class OrdenacionBusqueda {

    public static String []ordenacionBurbuja(String nombre[]){
        for (int f=0; f<nombre.length; f++) {
            for (int c=0; c<nombre.length-1; c++) {
                if (nombre[c].compareToIgnoreCase(nombre[c+1])>0) {
                    String aux = nombre[c];
                    nombre[c] = nombre[c+1];
                    nombre[c+1] = aux;
                }
            }
        }
        return (nombre);
    }
    public static int BusquedaSecuencial(String nombre[], String busqueda){
        int i=0;
        while (i<nombre.length && !nombre[i].equals(busqueda)) {
            i=i+1;
        }
        if (i==nombre.length) 
            System.out.println("No encontrado en secuencial");
        else
            System.out.println("Encontrado en posiciòn secuencial  "+i);
                
        for (int f=0; f<nombre.length; f++) 
            System.out.print(nombre[f]+"  ");
                        
        return i;
    }
    public static int BusquedaDicotomica(String nombre[], String buscar){
            // Búsqueda binaria
        int inicio = 0;
        int fin = nombre.length-1;
        int posicion = -1; 
        while (posicion==-1 && inicio <= fin) {
            int medio = (int)((inicio+fin)/2);
            if (nombre[medio].equals(buscar)) {
                posicion = medio;
            }else {
                if (buscar.compareTo(nombre[medio])<0)
                    fin=medio-1;
                else
                    inicio = medio+1;
            }
        }
        if (posicion > -1)
            System.out.println("Encontrado en posición dicotómica "+posicion);
        else
            System.out.println("No encontrado en dicotómica");
        return posicion;
    }
    static void imprimir(String [] nombre){
        for (int c=0; c<nombre.length; c++) {
            System.out.print(nombre[c]+"    ");
        }
        System.out.println("  ");
    }
    public static void main(String[] args) {
        // Declaración del vector.
        String busca="";
        int pos;
        Scanner lector = new Scanner(System.in);
        String nombre[] = new String[10];
        // Inicialización de los valores del vector.
        nombre[0] = "Pepe";
        nombre[1] = "Juan";
        nombre[2] = "Luis";
        nombre[3] = "Pepe";
        nombre[4] = "Rosa";
        nombre[5] = "Carlos";
        nombre[6] = "Pedro";
        nombre[7] = "Lucas";
        nombre[8] = "María";
        nombre[9] = "Alicia";
        do{
            imprimir(ordenacionBurbuja(nombre)); 
            System.out.println("Introduza la cadena a buscar y FIN para terminar");
            busca=lector.nextLine();
            pos=BusquedaSecuencial(nombre,busca);
            System.out.println(pos);
            System.out.println("  ");
            pos=BusquedaDicotomica(nombre, busca);
            System.out.println(pos);
            System.out.println("  ");
            int posicion1=BusquedaDicotomica(ordenacionBurbuja(nombre),busca);
            System.out.println(posicion1);
        }while (busca.compareToIgnoreCase("FIN")!=0);
    }
    
}