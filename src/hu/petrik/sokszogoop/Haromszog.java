package hu.petrik.sokszogoop;

import java.util.Random;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    private static final Random RND = new Random();

    private static double getVeletlenOldalhossz() {
        return RND.nextDouble() * 10 + 5;
    }

    public Haromszog() {
        super(getVeletlenOldalhossz());
        this.b = getVeletlenOldalhossz();
        this.c = getVeletlenOldalhossz();
    }

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getKerulet() {
        return this.getA() + this.b + this.c;
    }

    public double getTerulet() {
        double s = getKerulet() / 2;
        return Math.sqrt(s * (s - this.getA()) * (s - this.b) * (s - this.c));
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %f, b = %f, c = %f, K = %f, T = %f",
                this.getA(), this.b, this.c, this.getKerulet(), this.getTerulet());
    }
}
