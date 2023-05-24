public class stringarray {
    public static void main(String args[]){
        String name = "Pankaj";
        char Search='p';
        System.out.println(stringserch(name,Search));
    }

    static boolean stringserch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }




        }
        return false;

    }
}
//    static boolean stringserch(String str,char target){
//        if(str.length()==0){
//            return false;
//        }
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==target){
//                return true;
//            }
//
//
//
//
//        }
//        return false;
//
//    }
//}
