package miPrincipal;
import java.util.Scanner;
 public class AppNaturales {
    public static void menu(){
        System.out.println("_________________________________________");
        System.out.println("           NUMEROS NATURALES ");
        System.out.println("_________________________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA UN NUMERO");
        int num=sc.nextInt();
        System.out.println("VERSION ITERATIVA");
        mostrarNaturalesIte(num);
        System.out.println("VERSION RECURSIVA ");
        mostrarNaturalesRec(num);
    }
    public static void mostrarNaturalesIte(int n){
        for (int i=0; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void mostrarNaturalesRec(int n){
        if (n>0)
        mostrarNaturalesRec(n-1);
        System.out.print(n+" ");
    }
 }