import java.util.Scanner;

class TextCalc{
    
    // letterNum - amount of letters
    // spaceNum - amount of space
    // fenceLen - length of fence
    int letterNum, spaceNum, fenceLen;

    // letterLen - length of a single letter
    // spaceLen - length of a single space
    final int letterLen = 62;
    final int spaceLen = 12;

    TextCalc(int letterNum, int spaceNum, int fenceLen){
        this.letterNum = letterNum;
        this.spaceNum = spaceNum;
        this.fenceLen = fenceLen;
    }

    public void calc(){
        // calculate length of text
        int textLen = letterLen*letterNum + spaceLen*spaceNum;

        // check if text fits and notify
        if(textLen>fenceLen){
            System.out.println("Confession won't fit");
        } else {
            System.out.println("Confession will fit");
        }
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // make class entity and call text check
        int letterNum = 15;
        int spaceNum = 3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the fence in cm:");
        int fenceLen = sc.nextInt();
        TextCalc textCalc = new TextCalc(letterNum, spaceNum, fenceLen);
        textCalc.calc();

    }
}
