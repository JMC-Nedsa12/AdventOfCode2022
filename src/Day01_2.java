import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day01_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader(new File("C:\\Users\\nedsa\\IdeaProjects\\AdventOfCode2022\\Inputs\\Day01.txt")));
        int[] top3 = new int[3];
        int vMaxCalories = 0;
        int currentSum = 0;
        while(sc.hasNext()){
            String line = sc.nextLine();
            try{
                int cal = Integer.parseInt(line);
                currentSum+=cal;
            }catch(NumberFormatException e){
                for (int cals : top3){
                    if(currentSum>cals){
                        top3[0]=currentSum;
                        Arrays.sort(top3);
                        break;
                    }
                }
                currentSum = 0;
            }
        }
        int sum =0;
        for (int cals : top3){
            sum += cals;
        }
        System.out.println(sum);
    }
}
