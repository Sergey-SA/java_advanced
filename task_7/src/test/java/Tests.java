import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testFunctionСalculatorSum(){
        Сalculator calc = new Сalculator(2,3);
        Assert.assertEquals("Проверка суммы чисел " + calc.getNum1() + " и " + calc.getNum2(), 5, calc.operationSum(), 0);
    }

    @Test
    public void testFunctionСalculatorDif(){
        Сalculator calc = new Сalculator(5,3);
        Assert.assertEquals("Проверка разности чисел " + calc.getNum1() + " и " + calc.getNum2(), 2, calc.operationDif(), 0);
    }

    @Test
    public void testFunctionСalculatorMult(){
        Сalculator calc = new Сalculator(5,3);
        Assert.assertEquals("Проверка произведения чисел " + calc.getNum1() + " и " + calc.getNum2(), 15, calc.operationMult(), 0);
    }

    @Test
    public void testFunctionСalculatorDiv() throws Exception{
        Сalculator calc = new Сalculator(6,3);
        Assert.assertEquals("Проверка частного чисел " + calc.getNum1() + " и " + calc.getNum2(), 2, calc.operationDiv(), 0);
    }

    @Test(expected = Exception.class)
    public void testFunctionСalculatorDivErrorByZero() throws Exception{
        Сalculator calc = new Сalculator(6,0);
        Assert.assertEquals("Проверка деления на 0","Делить на 0 нельзя", calc.operationDiv());
    }
}
