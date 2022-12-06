import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Day06_2 {
    public static void main(String[] args) throws IOException {
        String line = new Scanner((new FileReader("Inputs/Day06.txt"))).nextLine();
        char [] chars = new char [14];
        for(int i = 0; i<chars.length;i++){
            chars[i]=line.charAt(i);
        }
        for (int i=14; i < line.length();i++){
            if(!checkDuplicates(chars)){
                System.out.println(i);
                break;
            }
            chars = addNew(chars,line.charAt(i));
        }


    }

    /**
     * shuffles old element to the left and adds a new element
     * @param chars array to be modified
     * @param c char to be added to the array
     * @return modified array
     * */
    private static char[] addNew(char[] chars,char c){
        for(int i = 0; i< chars.length-1;i++){
            chars[i]=chars[i+1];
        }
        chars[chars.length-1]=c;
        return chars;
    }
    /**
     * finds duplicates in specified array
     * @param chars array to check for duplicates
     * @return true if duplicates found; otherwise false
     * */
    private static boolean checkDuplicates(char [] chars){
        for(int i = 0; i < chars.length; i++){
            for (int j = i+1; j < chars.length;j++){
                if (chars[i]==chars[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
