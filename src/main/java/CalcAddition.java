public class CalcAddition implements Calculator{
    private String signPlus;


    @Override
    public double calculate(Number number) {
        return number.getOperand1() + number.getOperand2();
    }

    public String getSignPlus() {
        return "+";
    }
}
