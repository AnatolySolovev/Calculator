package calculator;

import java.util.Scanner;

public class RunningCalculator {

    public void start(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] mathExpression = str.split(" ");
        RomanNumerals rn;
        Numbers numbers;
        int flag = -1;
        for (RomanNumerals romanNumerals:RomanNumerals.getAllRomanNumerals()
             ) {
            flag = str.indexOf(romanNumerals.toString());
            if (flag != -1) break;
        }
        if(flag != -1)
            numbers = new RomNumbers();
        else numbers = new ArabNumbers();
        numbers.setVar1(mathExpression[0]);
        numbers.setVar2(mathExpression[mathExpression.length-1]);
        int result = 0;
        switch (mathExpression[1]){
            case "+":
                result = Operations.getSum(numbers.getVar1(),numbers.getVar2());
                break;
            case "-":
                result = Operations.getSubtraction(numbers.getVar1(),numbers.getVar2());
                break;
            case "*":
                result = Operations.getMultiplication(numbers.getVar1(),numbers.getVar2());
                break;
            case "/":
                result = Operations.getDivision(numbers.getVar1(),numbers.getVar2());
                break;
            default:System.out.print("Неверно введены данные");
                break;
        }

        System.out.print(numbers.getResult(result));
    }
}
