public class T3 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        int sum = 0;
        double average;
        int aboveAverage = 0;

        for(int i =0; i < array.length;i++){
            sum +=array[i];
        }
        average = (double) sum/6;
        for(int i =0;i < array.length;i++){
            if(array[i]>average){
                aboveAverage++;
            }
        }
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println("\nAverage " + average);
        System.out.println("Numbers above average: " + aboveAverage);

    }
}
