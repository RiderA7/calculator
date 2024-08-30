public class Calculator {

    public double add(double a1, double a2){
        return a1 + a2;
    }

    public double subtract(double a1, double a2){
        return a1 - a2;
    }

    public double multiply(double a1, double a2){
        return a1 * a2;
    }

    public double divide(double a1, double a2) throws IllegalArgumentException{
        if (a2 == 0) throw new IllegalArgumentException("The divisor cannot be equal to 0");
        return a1 / a2;
    }

}