package staff;

public class MyDif extends Staff {

    public MyDif(float num1, float num2) {
        super(num1, num2);
    }

    @Override
    public void operation(float num1, float num2) {
        super.result = num1 - num2;
    }

    @Override
    public String toString() {
        return ("Разность = " + result);
    }
}
