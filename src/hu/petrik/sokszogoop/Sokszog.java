package hu.petrik.sokszogoop;

public abstract class Sokszog {
    private double a;

    public Sokszog(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public abstract double getKerulet();

    public abstract double getTerulet();

    @Override
    public String toString() {
        return String.format("K = %.2f, T = %.2f", getKerulet(), getTerulet());
    }
}
