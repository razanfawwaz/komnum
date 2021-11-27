public class soalTiga {
    public static void main(String[] args){
        Double x0, fx, xAtas, xBawah, x1, err;
        err = 0.001;
        int i;
        x0 = 1.0;
        System.out.printf("n         X0            f(X0)          f'(X0)          X1\n");
        System.out.print("-------------------------------------------------------------");
        for(i = 1; i <= 10; i++){
            xAtas = ((x0*x0*x0*x0*x0) + (2*(x0*x0)) - 4);
            xBawah = ((5*(x0*x0*x0*x0)) + (4*x0));
            fx = xAtas/xBawah;
            x1 = (x0 - fx);
            System.out.println("");
            System.out.printf("%d", i);
            System.out.printf("%,15.5f", x0);
            System.out.printf("%,15.5f", xAtas);
            System.out.printf("%,15.5f", xBawah);
            System.out.printf("%,15.5f", x1);
            x0 = x1;
            if(fx < err){
                System.out.printf("\n\nIterasi berhenti dengan akar-akar adalah: %.5f", x0);
                System.out.printf("\nNilai f(x) adalah: %.4f\n", fx);
                break;
            }
            
            
        }
    }
}
