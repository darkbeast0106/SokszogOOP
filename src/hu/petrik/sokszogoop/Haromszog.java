package hu.petrik.sokszogoop;

import java.util.Random;

public class Haromszog extends Sokszog {
    private double b;
    private double c;

    private static final Random RND = new Random();

    private static double getVeletlenOldalhossz() {
        return RND.nextDouble() * 1000 + 5;
    }

    public Haromszog() {
        super(getVeletlenOldalhossz());
        this.b = getVeletlenOldalhossz();
        this.c = getVeletlenOldalhossz();
        while (!isSzerkesztheto()) {
            super.setA(getVeletlenOldalhossz());
            this.b = getVeletlenOldalhossz();
            this.c = getVeletlenOldalhossz();
        }
    }

    private boolean isSzerkesztheto() {
        return this.getA() + this.b > this.c &&
                this.getA() + this.c > this.b &&
                this.b + this.c > this.getA();
    }

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        if (!isSzerkesztheto()) {
            throw new IllegalArgumentException("A háromszög nem szerkeszthető");
        }
    }

    @Override
    public double getKerulet() {
        return this.getA() + this.b + this.c;
    }

    @Override
    public double getTerulet() {
        double s = getKerulet() / 2;
        return Math.sqrt(s * (s - this.getA()) * (s - this.b) * (s - this.c));
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %.2f, b = %.2f, c = %.2f, %s",
                this.getA(), this.b, this.c, super.toString());
    }
}
