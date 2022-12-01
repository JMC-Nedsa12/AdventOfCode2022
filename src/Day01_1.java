import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Day01_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("Inputs/Day01.txt"));
        int vMaxCalories = 0;   //current max calories
        int currentSum = 0;     //calories carried by each individual elf
        while(sc.hasNext()){
            String line = sc.nextLine();
            try{
                int cal = Integer.parseInt(line);       //sums all calories carried by a specific elf
                currentSum+=cal;
            }catch(NumberFormatException e){        //if current line is "" compare sum with current max
                if(currentSum>vMaxCalories){
                    vMaxCalories=currentSum;
                }
                currentSum = 0;
            }
        }
        System.out.println(vMaxCalories);
    }
}
