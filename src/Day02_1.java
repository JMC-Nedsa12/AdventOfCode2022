import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Day02_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("Inputs/Day02.txt"));
        char[] opponents = {'A', 'B', 'C'};
        char[] mine = {'X','Y','Z'};
        int score = 0;
        while (sc.hasNext()){
            String line = sc.nextLine();
            char opp = line.charAt(0);
            char me = line.charAt(2);
            int oppIndex = -1;
            int meIndex = -1;
            int result = 0;
            for (int i = 0; i < mine.length;i++){                //acquires index of played move
                if (mine[i]==me){
                    meIndex = i;
                }
                if (opponents[i]==opp){
                    oppIndex = i;
                }
            }                                      //calculates the score according to both played moves
            if(meIndex==oppIndex){
                result=3;
            }
            if(meIndex+2==oppIndex || meIndex-1==oppIndex){
                result=6;
            }
            score += meIndex+1+result;
        }
        System.out.println(score);
    }
}
