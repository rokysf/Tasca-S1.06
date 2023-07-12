package n2exercici2;

public class Principal {

	public static void main(String[] args) {
		

		String llista1[] = {"Hola", "com", "estas","?"};
		Integer llista2[] = {1,2,3,4,5};
		
		GenericMethods.metodeGeneric(llista1);
		System.out.println("----------------------------------");
		GenericMethods.metodeGeneric(llista2);
	}
}
