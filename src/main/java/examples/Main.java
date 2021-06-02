package pages;

class Main{
    static class Node{
        // declaration of variables
        private final String key;
        private Node left;
        private Node right;
        public Node(String element){
            this.key = element;
            this.left=null;
            this.right=null;

        }

        // getter and setter
        public void setRightChild(Node n){
            this.right=n;
        }
        public void setLeftChild(Node n){
            left=n;
        }
        public Node getLeftChild(){
            return left;
        }
        public  Node getRightChild(){
            return right;
        }
        public String toString(){
            return key;
        }
    }
    // declaration of root
    Node root;
    // constructor to make root as null
    Main(){
        root = null;
    }
    //function for adding key to BST tree
    void add(String key){
        root = addKey(root,key);
    }
    // function to traverse and add key
    Node addKey(Node root,String key){
        // if the root is null, new Node is created and making it root by returning it
        if(root == null){
            root= new Node(key);
            return root;
        }
        //x.compareTo(y) is 0 when x==y, positive when x>y, negative when x<y
        // when the key is less than root key, traversal is done through left
        if(key.compareTo(root.toString())<0){
            root.setLeftChild(addKey(root.left,key));
        }
        // when key is greater than root, key then traverse through right
        else if(key.compareTo(root.toString())>=0){
            root.setRightChild(addKey(root.right,key));
        }
        return root;
    }
    // function for printing elements in tree in inorder fashion
    public static void printTree(Node root){
        if(root!=null){
            printTree(root.getLeftChild());
            System.out.println(root.toString());
            printTree(root.getRightChild());
        }
    }
    // searching the given in value in tree and returning true if present else false
    public static boolean search(Node root,String value){
        while(root!=null){
            if(value.compareTo(root.toString())<0)
                root=root.getLeftChild();
            else if(value.compareTo(root.toString())>0)
                root=root.getRightChild();
            else
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.add("Storm");
        tree.add("boy");
        tree.add("arts");
        tree.add("rabbit");
        printTree(tree.root);
        System.out.println("Finding boy in tree: "+ search(tree.root,"boy"));
        System.out.println("Finding rabbit in tree: "+ search(tree.root,"arts"));
    }
}
