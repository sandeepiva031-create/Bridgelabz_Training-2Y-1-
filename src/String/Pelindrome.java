package String;

public class Pelindrome {

    static boolean pal(String name , int start,int end ) {


      if(start>=end ){
          return true;
      }

        if(name.charAt(start)!=name.charAt(end)) {
            return false;
        }
       return pal(name,start+1,end-1);
    }

    static void main(String[] args) {
        String name = "lool";
        System.out.println(pal(name,0,name.length()-1));
    }

}
