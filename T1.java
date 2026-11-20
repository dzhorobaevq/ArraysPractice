public class T1  {
    public static void main(String[] args) {
        int[] array = {5,-3,0,8,-1,0,12,-7,4,2};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i =0; i < array.length;i++){
            if(array[i] > 0){
                positive++;
            }else if(array[i]<0){
                negative++;
            }else{
                zero++;
            }
        }
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println("\nPositive: " +positive);
        System.out.println("Negative: " +negative);
        System.out.println("Zero: " +zero);

    }
}