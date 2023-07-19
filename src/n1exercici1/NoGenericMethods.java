package n1exercici1;

public class NoGenericMethods<T> {

	private Persona ob1;
	private Persona ob2;
	private Persona ob3;
	
	public NoGenericMethods(Persona ob1, Persona ob2, Persona ob3) {
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}

	public Persona getOb1() {
		return ob1;
	}

	public void setOb1(Persona ob1) {
		this.ob1 = ob1;
	}

	public Persona getOb2() {
		return ob2;
	}

	public void setOb2(Persona ob2) {
		this.ob2 = ob2;
	}

	public Persona getOb3() {
		return ob3;
	}

	public void setOb3(Persona ob3) {
		this.ob3 = ob3;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [ob1=" + ob1 + ", ob2=" + ob2 + ", ob3=" + ob3 + "]";
	}
}
