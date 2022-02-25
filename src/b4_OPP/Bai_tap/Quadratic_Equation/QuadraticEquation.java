package b4_OPP.Bai_tap.Quadratic_Equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){};
    public QuadraticEquation(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    //getter setter

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
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

    //tính delta
    public double getDiscriminant(){
        double delta=Math.pow(getB(),2)-4*getA()*getC();
        return delta;
    }

    //tính nghiệm thứ 1
    public double getRoot1() {
        if(getDiscriminant()>=0) {
            double r1 = (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
            return r1;
        } else {
            return 0;
        }
    }

    //tính nghiệm thứ 2
    public double getRoot2() {
        if(getDiscriminant()>=0) {
            double r2 = (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
            return r2;
        } else {
            return 0;
        }
    }
}
