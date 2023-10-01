
public class RecursiveFactorial{
    int n;
    
    int factorial(int n){
        if ((n==1) or (n==0)){
            return 1;
        }    
        else{
            return ( n*factorial(n-1) );
        }
    }
}

public static void main(String[] args) {
    RecursiveFactorial x = new RecursiveFactorial();
    // Interger.parseint used for parsing a string as signed decimal
    x.n= Interger.parseInt(args[0]);
    System.out.println("Factorial of "+ x.n +" is "+x.factorial(n) );
}
