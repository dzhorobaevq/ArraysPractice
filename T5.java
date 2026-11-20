import java.util.Scanner;
public class T5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int passed =0;
        int failed =0;
        int[] score = new int[5];
        for(int i=0;i<score.length;i++){
            System.out.println("Enter "+ (i+1) +" score(0-100):");
            score[i]=sc.nextInt();
            while(score[i]<0 || score[i]>100){
                System.out.println("Invalid score! Enter again");
                score[i]=sc.nextInt();
            }
            sum += score[i];
            if(score[i]>60){passed++;
            }else {failed++;
            }
        }
        System.out.print("\nScores: ");
        for(int i = 0;i<score.length;i++){
            System.out.print(score[i]+" ");
        }
        double average = sum/5;
        System.out.println("\nPassed: "+passed);
        System.out.println("Failed: "+failed);
        System.out.println("Average: "+average);
        sc.close();
    }
}
