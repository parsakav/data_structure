public class FastExponential{
public static int fastExp(int base,int exponential){
        if(exponential==0){
            return 1;
        } else if(exponential==1){
            return base;
        }
        int R = fastExp(base,exponential/2);
        if(exponential%2==0){
            return R*R;
        }
            return R*base*R;

    }
}
