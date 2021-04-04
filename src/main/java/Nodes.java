//class used to get input
import java.util.Random;
//create class
class Nodes
{
    //initialization
    Nodes left, right;
    int priority, data;
    //default constructor
    public Nodes()
    {
        //initialize default values
        this.data = 0;
        this.left = this;
        this.right = this;
        this.priority = Integer.MAX_VALUE;
    }
    //parameterized constructor
    public Nodes(int ele)
    {
        //initialize data
        this(ele, null, null);
    }
    //parameterized constructor
    public Nodes(int ele, Nodes left, Nodes right)
    {
        //initialize all the values
        this.data = ele;
        this.left = left;
        this.right = right;
        this.priority = new Random().nextInt( );
    }
}
