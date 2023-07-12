package n2exercici2;

public class GenericMethods {

	public static <T> void metodeGeneric(T llista[]) {

		for (T t : llista) {
			System.out.println(t);
		}
	}
}
