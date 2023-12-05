
public class Permutation {
    public static void main(String[] args) {
        PerStr("", "abc");
        
    }
    static void PerStr(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i < p.length()+1 ;i++ ){
            
            String fs = p.substring(0, i);
            String ss = p.substring(i, p.length());
            PerStr(fs+ch+ss, up.substring(1));

        }
    }
}
