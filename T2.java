public class T2 {
        public static void main(String[] args) {
        int[] array = {12,5,28,3,19,7,15,9};
        int largest = array[0];
        int smallest = array[0];
        int largestIndex =0;
        int smallestIndex =0;
        for(int i =0; i < array.length;i++){
            if(array[i] > largest){
                largest = array[i];
                largestIndex = i;
            } else if(array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
        }
        }
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println("\nLargest: " +largest +" at index " + largestIndex);
        System.out.println("Smallest: " +smallest + " at index " + smallestIndex);

    }

}




