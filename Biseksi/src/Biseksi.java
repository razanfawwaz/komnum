import java.lang.Math;

public class Biseksi {

    public static double hitungXr(double a, double b){
        double nilaiXr;
        nilaiXr = (a + b) / 2;
        return nilaiXr;
    }

    public static double hitungFungsi (double x){
        double nilaiFungsi;
        nilaiFungsi = Math.pow(x, 3) - (10 * x) + 8;

        return nilaiFungsi;

    }

    public static void main(String[] args) {
        double a = 2.4;
        double b = 2.7;
        double e = 0.02;
        int n = 5;
        int i = 0;
        double fA;
        double fB;
        double Xr = 0.0;
        double fXr;
        double m;
        boolean cond = true;

        fA = hitungFungsi(a);
        fB = hitungFungsi(b);

        if(fA*fB > 0){
            System.out.println("Tidak Ada Akar");
        }
        else{
            while (cond = true){
                i++;

                Xr = hitungXr(a, b);
                fXr = hitungFungsi(Xr);

                m = Math.abs(b-a);

                if(m < e || i > n){
                    cond = false;
                }
                else{
                    if(fXr * fA < 0){
                        b = Xr;
                        fB = fXr;
                    }
                    else{
                        a = Xr;
                        fA = fXr;
                    }
                }
            }
            System.out.println("Nilai Akar = " + Xr);
        }
    }
}
