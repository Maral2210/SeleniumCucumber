import java.util.Scanner;

//create class

//class used for random value creation
class RandomizedBinarySearchTree extends Nodes
{
    //initialize node class
    private static Nodes nil = new Nodes();
    private Nodes root;
    //default constructor
    public RandomizedBinarySearchTree()
    {
        root = nil;
    }
    //method used to insert data into tree by calling another method
    public void insertData(int X)
    {
        //initialize Node
        root = insertData(X, root);
    }
    //method called by insertData(int X) to insert data into tree
    private Nodes insertData(int X, Nodes T)
    {
        //check the Nodes class is empty
        if (T == nil)
            //initialize as root value
            return new Nodes(X, nil, nil);
            //less than root insert into left side
        else if (X < T.data)
        {
            T.left = insertData(X, T.left);
            //compares the priority
            if (T.left.priority < T.priority)
            {
                Nodes L = T.left;
                T.left = L.right;
                L.right = T;
                return L;
            }
        }
        //greater than root insert into right side
        else if (X > T.data)
        {
            T.right = insertData(X, T.right);
            //compares the priority
            if (T.right.priority < T.priority)
            {
                Nodes R = T.right;
                T.right = R.left;
                R.left = T;
                return R;
            }
        }
        return T;
    }
    //method used to search the data by calling another method
    public boolean searchData(int value)
    {
        return searchData(root, value);
    }
    //the method was called by searchData(int value)
    private boolean searchData(Nodes rt, int value)
    {
        //initialize variable
        boolean found = false;
        //Iterate the tree
        while ((rt != nil) && !found)
        {
            //check the given data is present in the tree
           int interval = rt.data;
            int rval = 0;
            if (value < rval)
                rt = rt.left;
            else if (value > rval)
                rt = rt.right;
            else
            {
                found = true;
                break;
            }
            //recursive call
            found = searchData(rt, value);
        }
        return found;
    }
    //method used to display data by calling display(Nodes r)
    public void display()
    {
        display(root);
    }
    //method used to print the tree elements
    private void display(Nodes r)
    {
        //check the tree is not empty
        if (r != nil)
        {
            display(r.left);
            //print the data
            System.out.print(r.data +" ");
            display(r.right);
        }
    }
    //main method
    public static void main(String[] args) {
        //initialize class
        RandomizedBinarySearchTree rt = new RandomizedBinarySearchTree();
        int ch;
        System.out.println("Randomized Binary Search Tree");
        do {
            //print the choices
            System.out.println("\n1.Insert\n2.Search\n3.Exit");
            Scanner sc = new Scanner(System.in);
            //get user choice
            ch = sc.nextInt();
            //get value from user
            System.out.println("Enter Value");
            int v=sc.nextInt();
            //compare the choice with case value
            switch (ch) {
                case 1 :
                    //insert into tree
                    rt.insertData(v);
                    break;
                case 2 :
                    //search in the tree
                    if(rt.searchData(v))
                    { System.out.println("Search element found");
                    }
                    else
                    {
                        System.out.println("Search element not found");
                    }
                    break;
                case 3:
                    //terminate execution
                    System.exit(0); }
            //print tree elements
            System.out.print("\nTree Elements : ");
            rt.display();
            System.out.println();
        } while (true); }}