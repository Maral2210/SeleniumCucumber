package utilities;

import java.util.Scanner;

public class RecursionString {
    public static void main(String[] args) {
        System.out.println("Enter a list of word ");
        System.out.println("Final word should be (.)");
        StackWord();
        sayHi(7);
    }

    private static void sayHi(int n ) {
        if (n == 0) {
            System.out.println("done! ");
        }
        else{
            System.out.println("something");
            n--;
            sayHi(n);
        }
    }

    private static void StackWord() {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        if (word.equals(".")){
            System.out.println();
        }
        else {
            StackWord();
            System.out.println(word);
        }
    }
}
