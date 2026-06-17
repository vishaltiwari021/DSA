public class Students {
        //Attributes
        public int id;
        public int age;
        public String name ;
        public int nos;
        private String friend;

        //Default Constructor
    public Students(){
        System.out.println("default constructor of Class Student");
    }
    //Parameterised Constructor
    public String getFriend(){
        return this.friend;
    }

    public Students(int id, String name, int age, int nos, String friend){
        System.out.println("Parametrised Constructor");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.friend = friend;
    }
    //Copy Constructor:
    public Students(Students srcobj){
        System.out.println("Copy constructor");
        this.id  = srcobj.id;
        this.name = srcobj.name;
        this.age = srcobj.age;
        this.nos = srcobj.nos;
    }


    //behaviours:
    public void study(){
        System.out.println(name + "studying");
    }
    public void bunk(){
        System.out.println(name  + "bunking");
    }
    public void sleep(){
        System.out.println(name + "sleeping");
    }
}


//Encapsulation meaning things private cut off from the outer world making the bundle of information