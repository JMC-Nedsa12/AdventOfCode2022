import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day01_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("Inputs/Day01.txt"));
        int[] top3 = new int[3];            //Array holding 3 highest sums of calories
        int currentSum = 0;                 //calories carried by each individual elf
        while(sc.hasNext()){
            String line = sc.nextLine();
            try{
                int cal = Integer.parseInt(line);        //sums all calories carried by a specific elf
                currentSum+=cal;
            }catch(NumberFormatException e){            //if current line is "" compare sum with the highest sums in the array
                for (int cals : top3){                  //and replace the lowest if current is bigger than any of them
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
