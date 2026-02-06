package Loops;

public class Question {
    public static void main(String[] args) {
        int  x =4,y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y){
                continue;
            }
            else {
                System.out.print(x+" "+y+" ");
            }
        }
    }
}
