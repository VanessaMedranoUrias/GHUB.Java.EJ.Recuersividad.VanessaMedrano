package miPrincipal;

import java.util.Scanner;

public class AppSuma {

      public static void menu(){
        System.out.println("_________________________________________");
        System.out.println("           SUMA DIGITOS");
        System.out.println("_________________________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO");
        int num=sc.nextInt();
        System.out.println("VERSION ITERATIVA");
        System.out.println("="+ sumarIte(num));
        System.out.println("VERSION RECURSIVA ");
        System.out.println("="+ sumarRec(num));
    }
    public static int sumarIte(int n){
        
        return n;
    }
    public static int sumarRec(int n){

        return n;
    }
    
}