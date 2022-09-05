public class Calculator {

    private int a;
    private int b;
    private double c;
    private double d;

    public Calculator(int a, int b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int sumOf(int a, int b) {
        return a + b;
    }

    public int minusTotal(int a, int b){
        return a - b;
    }

    public int timesTotal(int a, int b){
        return a * b;
    }

    public double divideTotal(double d, double c){
        return d / c;
    }

}
