
public class HeightOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left  = null;
            this.right = null;
        }

    }
    //static int ans = 0;
    public static int height(Node root){
        if( root == null){
            return 0;
        }
        int lh  = height(root.left);
        int rh  = height(root.right);
       // ans  = Math.max(ans,lh+rh);//approach 2 of diameter of tree just initialized the global variable ans
        return Math.max(lh,rh)+1;
    }
    //count of nodes;
    public static int count (Node root){
        if( root == null){
            return 0;
        }
        int lCount  = count(root.left) ;
        int rCount  = count(root.right);
        return lCount+rCount+1;
    }
    //sum of nodes
    public static int sum (Node root){
        if( root == null){
            return 0;
        }
        int lSum  = sum(root.left) ;
        int rSum  = sum(root.right);
        return lSum+rSum+root.data;
    }
    //find dimeter by approach 1
    public static int diameter(Node root ){
        if(root == null){
            return 0;
        }
        int lDiam = diameter(root.left);
        int lHeight = height(root.left);
        int rDiam = diameter(root.right);
        int rHeight = height(root.right);
        int selfDiam = lHeight + rHeight +1;
        return Math.max(selfDiam,Math.max(lDiam,rDiam));
//        //approach two:
//        height(root);
//
//        return ans;
    }
    public static void main(String[] args) {
        /*
                1
               /  \
              2    3
             /  \ /  \
            4    5 6  7
        */
    Node root  = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left  = new Node(6);
    root.right.right  = new Node(7);
        //System.out.println(height(root));
       // System.out.println(count(root));
        //System.out.println(sum(root));
        System.out.println(diameter(root));
    }
}