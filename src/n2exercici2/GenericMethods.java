package n2exercici2;

public class GenericMethods {

public static <T> void metodeGeneric(T...arguments) {
		
		for (T t : arguments) {
			System.out.println(t);
		}
	}
}
