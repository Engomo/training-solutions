package methodstructure.bmi;

public class BodyMass {
    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double bodyMassIndex() {
        return weight / (Math.pow(height, 2.0));
    }

    public boolean isThinnerThan(BodyMass other) {
        return bodyMassIndex() < other.bodyMassIndex();
    }

    public BmiCategory body() {
        if (bodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        }
        if (bodyMassIndex() > 25) {
            return BmiCategory.OVERWEIGHT;
        }else {
            return BmiCategory.NORMAL;
        }
    }
}