public class Сalculator {
    private float num1;
    private float num2;

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

    public float operationSum() {
        return (num1 + num2);
    }

    ;

    public float operationDif() {
        return (num1 - num2);
    }

    ;

    public float operationMult() {
        return (num1 * num2);
    }

    ;

    public float operationDiv() throws Exception {
        float result;
        if (num2 != 0) {
            result = num1 / num2;
            return result;
        }else{
            throw new Exception("Делить на 0 нельзя");
        }
    }

    public void operationChoice(int choice) throws Exception{
        float result;

        switch (choice){
            case 1:
                result = this.operationSum();
                System.out.println("Сумма чисел " + num1 + " и " + num2 + " = " + result);
                break;
            case 2:
                result = this.operationDif();
                System.out.println("Разность чисел " + num1 + " и " + num2 + " = " + result);
                break;
            case 3:
                result = this.operationMult();
                System.out.println("Произведение чисел " + num1 + " и " + num2 + " = " + result);
                break;
            case 4:
                result = this.operationDiv();
                System.out.println("Частное чисел " + num1 + " и " + num2 + " = " + result);
                break;
            default:
                System.out.println("Неверно выбран код операции");
                break;

        }

    }
}
