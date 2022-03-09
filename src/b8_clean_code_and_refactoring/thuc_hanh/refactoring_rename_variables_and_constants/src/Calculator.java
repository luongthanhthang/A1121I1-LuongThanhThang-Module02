package b8_clean_code_and_refactoring.thuc_hanh.refactoring_rename_variables_and_constants.src;
public class Calculator {

    public static int calculate(int firstOperand , int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOperand  + secondOperand;
            case '-':
                return firstOperand  - secondOperand;
            case '*':
                return firstOperand  * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firstOperand  / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}