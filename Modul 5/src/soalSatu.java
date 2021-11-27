import java.lang.Math;

public class soalSatu {
    public static void main(String[] args){
        Double x0, fx, y0, y1, x1, err, er;
        err = 0.002;
        er = 0.275566;
        int i;
        x0 = 1.700000000;
        x1 = 1.840000000;
        y0 = 0.055020889;
        y1 = -0.220545243;

        for(i = 0; i < 5; i++){
            if(i == 0){
                System.out.println("");
                System.out.printf("%d", i);
                System.out.printf("%,15.9f", x0);
                System.out.printf("%,15.9f", y0);
                System.out.printf("%,15.9f", y0);
                System.out.printf("");
                System.out.printf("");
            }
            else if(i == 1){
                System.out.println("");
                System.out.printf("%,d", i);
                System.out.printf("%,15.9f", x1);
                System.out.printf("%,15.9f", y1);
                System.out.printf("%,15.9f", y1);
                System.out.printf("%,15.6f", er);
                System.out.printf("False");
            }
            else{
                x0 = x1-y1*((x1-x0)/(y1-y0));
                y0 = (x1*((Math.exp(-x1))+(Math.sin(2*x1))));
                fx = (x0*((Math.exp(-(x0)))+(Math.sin((2*x0)))));
                er =  Math.abs(fx-y0);
                System.out.println("");
                System.out.printf("%d", i);
                System.out.printf("%,15.9f", x0);
                System.out.printf("%,15.9f", y0);
                System.out.printf("%,15.9f", fx);
                System.out.printf("%,15.6f", er);
                if(er < err){
                    System.out.println("TRUE");
                }
                else{
                    System.out.println("FALSE");
                }
            }
        }
        x0 = x1;
        y0 = y1;
        i++;
    }
}
