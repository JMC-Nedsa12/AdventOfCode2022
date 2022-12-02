import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Day02_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("Inputs/Day02.txt"));
        char[] opponents = {'A', 'B', 'C'};
        int score = 0;
        while (sc.hasNext()){
            String line = sc.nextLine();
            char opp = line.charAt(0);
            char outcome = line.charAt(2);
            int oppIndex = -1;
            int meIndex = -1;
            int result = 0;
            for (int i = 0; i < opponents.length;i++){          //acquires index of played move
                if (opponents[i]==opp){
                    oppIndex = i;
                }
            }                                           //calculates the score and best move accordingly
            if(outcome=='Y'){
                result=3;
                meIndex = oppIndex;
            }
            if (outcome=='X'){
                meIndex=(oppIndex == 0 ? 2:oppIndex-1);     //accounts for rock vs scissors
            }
            if(outcome == 'Z'){
                result = 6;
                meIndex=(oppIndex == 2 ? 0:oppIndex+1);    //accounts for rock vs scissors
            }
            score += meIndex+1+result;
        }
        System.out.println(score);
    }
}
