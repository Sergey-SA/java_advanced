package staff;

public class MyDiv extends Staff {

    public MyDiv(float num1, float num2) {
        super(num1, num2);
    }

    @Override
    public void operation(float num1, float num2) throws Exception{
        if (num2 != 0) {
            super.result = num1 / num2;
        }else{
            throw new Exception("Нельзя делить на 0");
        }
    }

    @Override
    public String toString() {
        if (super.num2 != 0) {
            return ("Частное = " + result);
        }else {
            return "";
    }

}
}
