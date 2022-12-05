import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Day04_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("Inputs/Day04.txt"));
        int sum = 0;
        while(sc.hasNext()){
            String[] pairs = sc.nextLine().split(",");    //get a range of assignments of each elf
            String[] elf1 = pairs[0].split("-");
            String[] elf2 = pairs[1].split("-");                                       //check for overlapping
            if(Integer.parseInt(elf1[1]) >= Integer.parseInt(elf2[0]) && Integer.parseInt(elf1[1]) <= Integer.parseInt(elf2[1])){
                sum++;
            }else if(Integer.parseInt(elf1[0]) >= Integer.parseInt(elf2[0]) && Integer.parseInt(elf1[0]) <= Integer.parseInt(elf2[1])){
                sum++;
            }else if(Integer.parseInt(elf2[0]) >= Integer.parseInt(elf1[0]) && Integer.parseInt(elf2[0]) <= Integer.parseInt(elf1[1])){
                sum++;
            }else if(Integer.parseInt(elf2[1]) >= Integer.parseInt(elf1[0]) && Integer.parseInt(elf2[1]) <= Integer.parseInt(elf1[1])){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
