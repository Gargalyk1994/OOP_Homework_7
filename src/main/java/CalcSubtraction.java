public class CalcSubtraction implements Calculator{
    private String signMinus;

    @Override
    public double calculate(Number number) {
        return number.getOperand1() - number.getOperand2();
    }

    public String getSignMinus() {
        return "-";
    }
}
