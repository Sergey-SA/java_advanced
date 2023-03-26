package staff;

public abstract class Staff {
    public float num1;
    public float num2;
    public float result;

    public Staff(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getResult() {
        return result;
    }

    public abstract void operation(float num1, float num2) throws Exception;
}
