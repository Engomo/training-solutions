package exceptions.polinom;

public class Polynomial {

    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficientsStrs) {
        if (coefficientsStrs == null) {
            throw new NullPointerException("coefficientStrs is null");
        }
        try {
            this.coefficients = convertCoefficientsStrs(coefficientsStrs);
        }catch (NumberFormatException exc) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", exc);
        }
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public double[] convertCoefficientsStrs(String[] coefficientsStrs) {
        double[] coefficients = new double[coefficientsStrs.length];

        for (int i = 0; i < coefficientsStrs.length; i++) {
            coefficients[i] = Double.parseDouble(coefficientsStrs[i]);
        }
        return coefficients;
    }

    public double evaluate(double x) {
        int n = coefficients.length - 1;
        double sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += coefficients[i] * Math.pow(x, (double) n - i);
        }
        return sum;
    }
}
