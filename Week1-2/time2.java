//Week 1-2 
//Brian Gutt

public class time2 {
    public static void main(String[] args) {
        //This starts the counter in ns
        long startTime = System.nanoTime(); // Start time

        int r = 2;
        int n = 21; // 1,048,576 is 2^20, so we take 2^(n+1) to include the last term
        int sum = (int) ((Math.pow(r, n) - 1) / (r - 1));

        long endTime = System.nanoTime(); // End time
        long elapsedTime = endTime - startTime; // Calculate elapsed time

        System.out.println("Sum (Formula): " + sum);
        System.out.println("Elapsed Time (Formula): " + elapsedTime + " ns");
        
    }
}

