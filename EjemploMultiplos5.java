public class EjemploMultiplos5 {
    public static void main(String[] args) {
    
        for (int i = 1; i <= 25; i++) {
            
            if (i % 5 != 0)
                continue;

            System.out.println(i);              
        }
    }
}
