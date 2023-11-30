public class CalcMultiplication implements Calculator{
    private String signMulti;

    @Override
    public double calculate(Number number) {
        return number.getOperand1() * number.getOperand2();
    }

    public String getSignMulti() {
        return "*";
    }
}
