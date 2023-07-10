package n1exercici1;

public class NoGenericMethods {

	private Object objecte1;
    private Object objecte2;
    private Object objecte3;

    public NoGenericMethods(Object objecte1, Object objecte2, Object objecte3) {
        this.objecte1 = objecte1;
        this.objecte2 = objecte2;
        this.objecte3 = objecte3;
    }

    public void setObjecte1(Object objecte1) {
        this.objecte1 = objecte1;
    }

    public void setObjecte2(Object objecte2) {
        this.objecte2 = objecte2;
    }

    public void setObjecte3(Object objecte3) {
        this.objecte3 = objecte3;
    }

    public Object getObjecte1() {
        return objecte1;
    }

    public Object getObjecte2() {
        return objecte2;
    }

    public Object getObjecte3() {
        return objecte3;
    }
    
}
