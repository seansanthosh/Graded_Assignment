package secondQuestion;

public class Main
{
        Node node;
        static Node newroot, current;
        public static class Node // defining the class Node (tree)
        {
            Node left,right;
            int data;
            Node(int value) //constructor
            {
                this.data = value;
                this.left = null;
                this.right = null;
            }
        }
        public void Skew(Node root) // Function which converts BST to Skew tree
        {
            if(root==null) //if root has no value then will return null
            {
                return ;
            }
            Skew(root.left); // Recursive call to reach left node
            if(current ==null)
            {
                current =root;
                newroot = root;
            }
            else
            {
                current.right=root;
                current.left=null;
                current = current.right;
            }
            Skew(root.right); // Recursive call to reach right node
        }
        public static void main(String[] args)
        {
            Main tree = new Main();
            tree.node =new Node(50);
            tree.node.left = new Node(30);
            tree.node.right = new Node(60);
            tree.node.left.left = new Node(10);
            tree.node.right.left = new Node(55); //hardcode the tree
            current =null;
            tree.Skew(tree.node); // Invoking function which converts BST to Skew tree
            tree.node = newroot;
            while(newroot!=null)
            {
                System.out.print(newroot.data+" ");//prints the root data
                newroot=newroot.right;
            }
        }
}

