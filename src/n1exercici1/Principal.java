package n1exercici1;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Joan", 33);
		Persona p2 = new Persona("Ana", 50);
		Persona p3 = new Persona("Lluis", 25);
			
		NoGenericMethods<Persona> n1 = new NoGenericMethods<Persona>(p3, p1 , p2);
        
        System.out.println(n1.getOb1());
        System.out.println(n1.getOb2());
        System.out.println(n1.getOb3());
        		
	}	
}
