
public class Main {
	public static void main(String args[]) {
		int numPlaza=0;
		Garaje g = new Garaje("C/Vicenta Margarita, 3");
		Coche c1 = new Coche("2356FEO","Opel","Corsa");
		Coche c2 = new Coche("3424FDFL","Peugeot","207");
		numPlaza=g.aparcar(c1);
		System.out.println(numPlaza);
		numPlaza=g.aparcar(c2);
		System.out.println(numPlaza);
		System.out.println(g.verGaraje());
	}

}
