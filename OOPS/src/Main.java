public class Main {
    public static void main(String[] args) {
 //----------------------------------------------------------------------------------------------
//    Students A  = new Students();
//    A.id = 5;
//    A.name = "vishal";
//    A.age = 6;
//    A.nos = 6;

//    System.out.println(A.id);
//    System.out.println(A.name);
//    System.out.println(A.age);
//    System.out.println(A.nos);
//-----------------------------------------------------------------------------------------------
        //Parameterised Constructor:
        Students B  = new Students(1, "harsh", 19,4,"harshu");
        System.out.println(B.id);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.nos);
//        System.out.println(B.getFriend()); Example of encapsulation

        B.bunk();
        B.study();
        B.sleep();
//---------------------------------------------------------------------------------------------------
        //Copy Constructor:
//        Students C  = new Students(B);
//        System.out.println(C.id);
//        System.out.println(C.name);
//        System.out.println(C.age);
//        System.out.println(C.nos);
//
//        C.bunk();
//        C.study();
//        C.sleep();
    }
}