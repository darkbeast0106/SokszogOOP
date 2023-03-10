package hu.petrik.sokszogoop;

public class Teglalap extends Sokszog{
    private double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getKerulet() {
        return 2 * (this.getA() + this.b);
    }

    @Override
    public double getTerulet() {
        return this.getA() * this.b;
    }
    @Override
    public String toString() {
        return String.format("Téglalap: a = %.2f, b = %.2f, %s",
                this.getA(), this.b, super.toString());
    }
}
