import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class Day03_2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("Inputs/Day03.txt"));
        int count = 0;
        int sum = 0;
        char[] commons = new char[100];

        while(sc.hasNext()){
            char [] line1 = sc.nextLine().toCharArray();
            char [] line2 = sc.nextLine().toCharArray();
            char [] line3 = sc.nextLine().toCharArray();
            here:                   //find a matching element in each group
            for (int i = 0; i<line1.length;i++){
                for (int j = 0; j<line2.length;j++){
                    if (line1[i] == line2[j]){
                        for(int k = 0; k<line3.length;k++){
                            if (line1[i]==line3[k]){
                                commons[count] = line1[i];
                                count++;
                                break here;
                            }
                        }
                    }
                }
            }
        }
        for(char c : commons){                  //calculate priority value for each element
            if (Character.isLowerCase(c)){
                sum+=c-'a'+1;
            }else{
                sum+=c-'A'+27;
            }
        }
        System.out.println(sum);
    }
}
