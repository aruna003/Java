import java.lang.Math;

class sq_rt{
    double rt;

    double square_rt (int i){
        rt= Math.sqrt(i);
        return rt;
    }
}


public class Squareroot {

    public static void main(String args[]){
        sq_rt s = new sq_rt();
        double r=s.square_rt(25);
        System.out.print(r);

    }
    
}
