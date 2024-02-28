package miPrincipal;
 public class Alfabeto {
 
    public static void main (String []arg){
        System.out.println("");
        metodoA('Z');
        System.out.println("");
    }
    static void metodoA(char c){
        if (c>'A')
        metodoB(c);
        System.out.println(c);
    }
    static void metodoB( char c){
        metodoA(--c);
    }
 }