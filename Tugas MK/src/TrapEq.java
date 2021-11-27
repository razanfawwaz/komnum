public class TrapEq {

    static double f(double x){
        double fx;
        fx = Math.pow(x,1)*(1.2-x)*(1-Math.exp(20*(x-1)));
        return fx;
    }
    public static void main(String[] args) {
        double h, a = 0, b = 1, x, sum, res;
        int n = 10;
        h = (b-a)/n;
        x = a;
        sum = f(x);
        for (int i = 1; i<n; i++){
            x = x + h;
            sum = sum + 2*f(x);
        }
        sum = sum + f(b);
        res = (b-a)*sum/(2*n);
        System.out.print(res);
    }
}
