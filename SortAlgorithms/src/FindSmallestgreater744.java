public class FindSmallestgreater744 {
    public static void main(String[] args) {
        char [] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
            int st  = 0 ;
            int end  = letters.length-1;
            while(st<=end){
                int mid  = st + (end - st)/2;
                // if (target == letters[mid]){
                //     return mid;
                // }
                if(target<letters[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            return letters[st%letters.length];

        }
    }
