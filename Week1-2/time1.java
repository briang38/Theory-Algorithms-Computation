//Week 1-2 
//Brian Gutt

public class time1 {
    public static void main(String[] args) {
        //This starts the counter in ns
        long startTime = System.nanoTime(); // Start time

        int sum = 0;
        int value = 1;
        while (value <= 1048576) {
            sum += value;
            value *= 2;
        }

        long endTime = System.nanoTime(); // End time
        long elapsedTime = endTime - startTime; // Calculate elapsed time



        // print statement
        System.out.println("Sum (Loop): " + sum);
        System.out.println("Elapsed Time (Loop): " + elapsedTime + " ns");
    }
}