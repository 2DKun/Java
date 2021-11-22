package pac;

public class reflection {
    public static int rec(int n, int i) {
        if(n==0){
            return i;
        } else{
            return rec( n/10, i*10 + n%10 );
        }

    }

}
