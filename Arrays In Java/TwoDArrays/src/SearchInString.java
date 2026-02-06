public class SearchInString {
    public static void main(String[] args) {
        String name  = "Vishal";
        char target = 'm';
        System.out.println(Search2(name,target));

    }
    static boolean Search(String name ,char target){
        if(name.length() == 0 ){
            return false;
        }
        for(int i = 0 ; i< name.length() ;i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    //---------------------------------------------------------------
    //for each loop :
    static boolean Search2(String name ,char target){
        if(name.length() == 0 ){
            return false;
        }
       for(char ch  : name.toCharArray()){
           if(target == ch){
               return  true ;
           }
       }
        return false;
    }
}
