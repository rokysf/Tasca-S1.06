package n1exercici1;

public class Persona {

	private String nom;
	private int edat;
	
	public Persona(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", edat=" + edat + "]";
	}
	
}
