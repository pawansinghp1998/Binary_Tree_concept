public class BinaryTree_Traversal {
        public static class Node{
            int data;
            Node left,right;
            Node(int val, Node left, Node right){
                this.data=val;
                this.left=left;
                this.right=right;
            }
        }

        //Preorder traversal of the given binary tree
        public void displayPreorder(Node root){
            if (root==null)
                return;
            System.out.print(root.data+"-->");
            displayPreorder(root.left);
            displayPreorder(root.right);
        }

        //Inorder traversal of the given binary tree
    public void displayInorder(Node root){
        if (root==null)
            return;
        displayInorder(root.left);
        System.out.print(root.data+"-->");
        displayInorder(root.right);
    }

    //Post order traversal of the given binary tree
    public void displayPostorder(Node root){
        if (root==null)
            return;
        displayPostorder(root.left);
        displayPostorder(root.right);
        System.out.print(root.data+"-->");
    }

        public  static  void  main(String args[]){
            Node node5=new Node(5,null,null);
            Node node6=new Node(6,null,null);
            Node node9=new Node(9,null,null);
            Node node12=new Node(12,node5,node6);
            Node root=new Node(1,node12,node9);

            BinaryTree_Traversal bt=new BinaryTree_Traversal();
            bt.displayPreorder(root);
            System.out.println();
            bt.displayInorder(root);
            System.out.println();
            bt.displayPostorder(root);
            System.out.println();
        }
    }


