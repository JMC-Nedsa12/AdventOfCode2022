import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Day01_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader(new File("C:\\Users\\nedsa\\IdeaProjects\\AdventOfCode2022\\Inputs\\Day01.txt")));
        int vMaxCalories = 0;
        int currentSum = 0;
        while(sc.hasNext()){
            String line = sc.nextLine();
            try{
                int cal = Integer.parseInt(line);
                currentSum+=cal;
            }catch(NumberFormatException e){
                if(currentSum>vMaxCalories){
                    vMaxCalories=currentSum;
                }
                currentSum = 0;
            }
        }
        System.out.println(vMaxCalories);
    }
}
