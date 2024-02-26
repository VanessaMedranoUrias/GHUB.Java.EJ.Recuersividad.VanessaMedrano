package miPrincipal;
public class AppLadrillos {
    
    public static void menu(){
        System.out.println("Version iterativa");
        dibujarParedIte(10);
        System.out.println("Version recursiva");
        dibujarParedRec(10);
    }
    public static void dibujarParedIte(int n){
        for(int i=10; i>0; i--){
            System.out.println("XXXXXXXXXX");
        }
    }
    public static void dibujarParedRec(int n){
        if (n>0)
        dibujarParedRec(n-1);
        System.out.println("XXXXXXXXXX");
    }
    
}