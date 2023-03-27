public class Сalculator {

    private float num1;
    private float num2;
    private float result;

    public Сalculator(float num1, float num2) {
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

    public float operationSum() {
        this.result = num1 + num2;
        return  result;
    };

    public float operationDif() {
        this.result = num1 - num2;
        return  result;
    };

    public float operationMult() {
        this.result = num1 * num2;
        return  result;
    };

    public float operationDiv() throws Exception {
        if (num2 != 0) {
            this.result = num1 / num2;
            return result;
        }else{
            throw new Exception("Делить на 0 нельзя");
        }
    }

}
