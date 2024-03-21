public class BST {
    static class Node{
        Node right, left;
        int data;

        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data==key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int key){
        if(root.data > key){
            root.left = delete(root.left, key);
        }
        else if(root.data < key){
            root.right = delete(root.right, key);
        }
        else{
            //case 1 leaf node
            if(root.left == null && root.right==null){
                return null;
            }
            //case 2 - single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3
            Node IS = findinordersuccessor(root.right); //find right subtree successor
            root.data = IS.data; // value is been replaced
            root.right = delete(root.right, IS.data); //delete
        }
        return root;
    }

    private static Node findinordersuccessor(Node root) {
        while(root.left!=null){
            root= root.left;
        }
        return root;
    }


    public static void main(String[] args) {
        int [] values ={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for(int i=0; i<values.length; i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

//        if(search(root,5)){
//            System.out.println("found");
//        }
//        else{
//            System.out.println("Not Found");
//        }

        root = delete(root,11);
        System.out.println();
        inorder(root);
    }
}

