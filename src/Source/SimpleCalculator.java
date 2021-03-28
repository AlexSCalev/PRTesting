package Source;

public class SimpleCalculator<T extends Number> implements Calculator <T> {
    @Override
    public int summNumbers(T number1, T number2) {
        return number1.intValue()+number2.intValue();
    }

    @Override
    public int multiplyNumbers(T number1, T number2) {
        return number1.intValue()*number2.intValue();
    }

    @Override
    public int devideNumbers(T number1, T number2) {
        return number1.intValue() / number2.intValue();
    }
}
