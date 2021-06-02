import java.util.Scanner;

public class Examples{
    public static void main(String[] args) {

        String str = new String(String.valueOf(System.in));
        Scanner str1 = null;
        str = str1.nextLine();

    }





      String strRev1(String str){
         StringBuilder revere = new StringBuilder(" ");
         for (int i = 0; i < str.length()-1; i--) {
             revere.append(str.charAt(i));
          //   System.out.println(revere);


         }

         return revere.toString();
    }
    String strRev(String str){
        String revere = "abc ";
        for (int i = 0; i < str.length()-1; i--) {
            revere+=str.charAt(i);


        }
return revere;
}
}