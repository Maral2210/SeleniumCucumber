import java.util.LinkedList;
import java.util.Queue;

public class BBQ {
    // feeding the people with teh meal in order how they come up
    //1st operation will be adding peron
    public static void main(String[] args) {
        Queue <String> bbLine = new LinkedList<String>();
        bbLine.add("1st person");
        bbLine.add("2nd person");
        bbLine.add("3rd person");
        // the most important thing in Queue is that you seeing the person inline and then taking out him from the line

         // pool(); is remove the person from the line
        // peek(); see who is the next or who is the first in the line
// to get the size of the Queue
        System.out.println(bbLine.peek());
        System.out.println(bbLine);
        System.out.println(bbLine.size());
        // not for all times
        System.out.println(bbLine.contains("e"));
        // convert it to array and get certain  el from it
        System.out.println(bbLine.toArray()[1]);
        System.out.println(bbLine.offer("e"));


    }
}
