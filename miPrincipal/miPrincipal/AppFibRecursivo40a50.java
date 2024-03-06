package miPrincipal;
public class AppFibRecursivo40a50 {

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  Optimizando fibonacci recursivo");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Performance p = new Performance();

        int desde=40;
        int hasta=50;
        double ant=-1;
        for (int i=desde; i<=hasta; i++){
            //comenzamos tomando el tiempo
            p.start();
            //invocamos a la funcion recursiva
            double f=AppFibonacci.fibonacciRec(i);
            //detenemos el tiempo
            p.stop();
            System.out.println("f("+i+")= "+f+", "+p.getMillis()+"ms, "+AppFibonacci.getContador()+" veces");
            if (ant>=0)
            System.out.println("Incr = "+f/ant);
            else
            System.out.println();
            ant=f;
            //ahora el terminó será el que recual calculo (n)
        }
    }
}