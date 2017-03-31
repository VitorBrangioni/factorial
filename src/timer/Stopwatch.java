package timer;

public class Stopwatch {
	
	private static long tempInicial;
    private static long tempFinal;
    
    private Stopwatch() {
    }
    
    public static void start(){
        tempInicial = System.currentTimeMillis();  
    }
    public static String stop(){
        tempFinal = System.currentTimeMillis();  
        long dif = (tempFinal - tempInicial);         
        
        return String.format("Tempo de execução: %02d segundos  e %02d milisegundos \n", dif/1000, dif%1000);        
    }
}
