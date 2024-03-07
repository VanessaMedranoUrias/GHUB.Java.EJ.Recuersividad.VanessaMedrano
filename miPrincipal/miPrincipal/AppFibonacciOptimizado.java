package miPrincipal;
import java.util.Hashtable;
import java.util.Scanner;

public class AppFibonacciOptimizado{
    public static void menu(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("       Fibonacci Optimizado");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //inicializar tabla
        Hashtable<Integer,Double>t=new Hashtable<Integer,Double>();
        t.put(1,1d); //1d ->1 convertido a doble
        t.put(2,1d); //1d ->1 convertido a doble
        //solicitar ingresar el valor de n 
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuantos terminos quiere ver?");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++)

    }
}