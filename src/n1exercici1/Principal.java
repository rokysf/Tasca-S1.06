package n1exercici1;

public class Principal {

	public static void main(String[] args) {
		
		NoGenericMethods<Integer> noGenericMethods1 = new NoGenericMethods<Integer>(77, 3 , 99);
        System.out.println(noGenericMethods1.getObjecte1());
        System.out.println(noGenericMethods1.getObjecte2());
        System.out.println(noGenericMethods1.getObjecte3());


	}

}
