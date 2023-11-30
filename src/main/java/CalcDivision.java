public class CalcDivision implements Calculator{

    private String signDiv;

    @Override
    public double calculate(Number number) {
        if(number.getOperand2() == 0){
            throw new RuntimeException("На ноль делить нельзя!!!");
        }
        return number.getOperand1() / number.getOperand2();
    }

    public String getSignDiv() {
        return "/";
    }
}
