package desafio;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

    public EqXn(double a, double b, double c) {
        super.setA(a);
        super.setB(b);
        super.setC(c);
    }

    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public double calculaXn(double delta) {
        setXn((-getB() - (Math.sqrt(delta))) / (2 * getA()));
        return getXn();
    }

    public double calculaXp(double delta) {
        setXp((-getB() + (Math.sqrt(delta))) / (2 * getA()));
        return getXp();
    }
}
