public class Division implements OperationMathematique {
    @Override
    public int executer(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }
} 