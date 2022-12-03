import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class Day03_1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("Inputs/Day03.txt"));
        int count = 0;
        int sum = 0;
        char[] commons = new char[300];

        while(sc.hasNext()){
            char [] line = sc.nextLine().toCharArray();
            here:                               //find a matching element in each of the halves
            for (int i = 0; i<line.length/2;i++){
                for (int j = line.length/2; j<line.length;j++){
                    if (line[i] == line[j]){
                        commons[count] = line[i];
                        count++;
                        break here;
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
