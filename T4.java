public class T4 {
    public static void main(String[] args) {
        int[] array = {3,8,12,5,9,2,7};
        System.out.print("Original: ");
        for(int i=0;i < array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.print("\nReversed: ");
        for(int i=6;i >= 0;i--){
            System.out.print(array[i] + " ");
        }
    }
}
