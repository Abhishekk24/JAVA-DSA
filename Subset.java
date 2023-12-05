import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        // SubseqAscii("", "abc");
        System.out.println(SubSeq("", "abc"));
    }
    static void Subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Subseq(p + ch, up.substring(1));
        Subseq(p, up.substring(1));
    }

    static ArrayList<String> SubSeq(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
       ArrayList<String> left =  SubSeq(p + ch, up.substring(1));
       ArrayList<String> right= SubSeq(p, up.substring(1));

       left.addAll(right);
       return left;

    }
    static void SubseqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        SubseqAscii(p + ch, up.substring(1));
        SubseqAscii(p, up.substring(1));
        SubseqAscii(p + (ch+0), up.substring(1));
    }

}
