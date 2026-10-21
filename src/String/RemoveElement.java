package String;

public class RemoveElement {

    static String remove(String s , int index) {

        if(index==s.length()){
            return " ";
        }
      String small =   remove(s,index+1);

        if(s.charAt(index)!='a'){
            return s.charAt(index)+small;
        }
        return small;
    }

    static void main(String[] args) {
        System.out.println(remove("madam",0));
    }
}
