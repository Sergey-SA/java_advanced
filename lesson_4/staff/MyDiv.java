package staff;

public class MyDiv extends Staff {

    public MyDiv(float num1, float num2) {
        super(num1, num2);
    }

    @Override
    public void operation(float num1, float num2) {
        if (num2 != 0) {
            super.result = num1 / num2;
        }
    }

    @Override
    public String toString() {
        if (super.num2 == 0) {
            return ("Делить на 0 нельзя");
        } else {
            return ("Частное = " + result);
        }

    }
}
