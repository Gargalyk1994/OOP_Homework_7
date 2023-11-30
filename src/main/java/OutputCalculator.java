import java.util.Scanner;

public class OutputCalculator {

    private double result;
    Number number = new Number();
    private String sign;
    CalcAddition calcAddition = new CalcAddition();
    CalcSubtraction calcSubtraction = new CalcSubtraction();
    CalcMultiplication calcMultiplication =new CalcMultiplication();
    CalcDivision calcDivision = new CalcDivision();

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double createCalc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        number.setOperand1(scanner.nextDouble());
        System.out.println("Выберите операцию(введите знак операции): ");
        sign = scanner.next();
        System.out.println("Введите второе число: ");
        number.setOperand2(scanner.nextDouble());
        if(sign.equals(calcAddition.getSignPlus())){
            result = calcAddition.calculate(number);
            System.out.printf("Результат операции сложения равен: %s", result);
        }else if(sign.equals(calcSubtraction.getSignMinus())){
            result = calcSubtraction.calculate(number);
            System.out.printf("Результат операции вычитания равен: %s", result);
        }else if(sign.equals(calcMultiplication.getSignMulti())){
            result = calcMultiplication.calculate(number);
            System.out.printf("Результат операции умножения равен: %s", result);
        }else if(sign.equals(calcDivision.getSignDiv())){
            result = calcDivision.calculate(number);
            System.out.printf("Результат операции деления равен: %s", result);
        }else{
            throw new RuntimeException("Введен неверный знак операции.");
        }
        return result;
    }

//    public void continueCalc(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Хотите продолжить c результатом?");
//        System.out.println("1.Да\n 2.Нет\n");
//        int choice = in.nextInt();
//        switch (choice){
//            case 1:
//
//        }
//    }


}
