public class MathCalculatorProxy implements Calculator {
    private MathCalculator mathCalculator;
    public MathCalculatorProxy(){
        this.mathCalculator =new MathCalculator();
    }
    @Override
    public double add(double a, double b) {
        if(a/2+b/2>= Double.MAX_VALUE/2){
            throw new RuntimeException("out of range");
        }else if(a/2+b/2<= Double.MIN_VALUE/2) {
            throw new RuntimeException("out of range");
        }
            return mathCalculator.add(a,b);

    }

    @Override
    public double sub(double a, double b) {
        if(a / 2 - b / 2 >= Double.MAX_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        if(a / 2 - b / 2 <= Double.MIN_VALUE / 2){
            throw new RuntimeException("Out of range");
        }
        return mathCalculator.sub(a, b);
    }

    @Override
    public double mul(double a, double b) {
        double result = mathCalculator.mul(a, b);
        if(a != 0 && result / a != b){
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double div(double a, double b) {
        if(b == 0){
            throw new RuntimeException("Can't divide by zero");
        }
        return mathCalculator.div(a, b);
    }
}
