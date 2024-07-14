
public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5.0)
                        .addOperand(15.0)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Calculator.Formula.Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}