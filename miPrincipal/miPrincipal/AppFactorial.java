package miPrincipal;
public class AppFactorial {
    public static void menu(){
        System.out.println("Version iterativa");
       int n=5;
       System.out.println("Factorial de "+n+"! = "+factorialIte(n));
        System.out.println("Version recursiva");
        
    }
    public static long factorialIte(int n){
        long fac=1;
        for(int i=n; i>0; i--){
            fac=fac*i;
        }
        return fac;
    }
    public static long factorialRec(int n ){
        
        if(n==0) return 1;
        else 
        return factorialRec(n-1)*n;
    
    }
}
