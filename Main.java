public class Main {
    public static void main(String[] args) {
        
        System.out.println("==> A while loop");
        int i = 0; 
        while(i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("==> A do/while loop");
        int j = 0; 
        do {
            System.out.println(j);
            j++;
        }
        while (j < 10);
        
        System.out.println("==> You get the same results, but you went 2 different ways to get there.");
    }
    
}