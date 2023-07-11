package n1exercici1;

public class NoGenericMethods<T> {

	private T ob1;
	private T ob2;
	private T ob3;
	
	public NoGenericMethods(T ob1, T ob2, T ob3) {
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}

	public T getOb1() {
		return ob1;
	}

	public void setOb1(T ob1) {
		this.ob1 = ob1;
	}

	public T getOb2() {
		return ob2;
	}

	public void setOb2(T ob2) {
		this.ob2 = ob2;
	}

	public T getOb3() {
		return ob3;
	}

	public void setOb3(T ob3) {
		this.ob3 = ob3;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [ob1=" + ob1 + ", ob2=" + ob2 + ", ob3=" + ob3 + "]";
	}

	
}
