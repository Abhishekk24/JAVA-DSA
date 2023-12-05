

public record Find() {
    public static void main(String[] args) {
      int[] num = {1,2,34,22,343,13,23,42,12};
      int target = 101;
      boolean ans = LinerSearch(num, target);
      System.out.println(ans);
}
public static boolean LinerSearch(int[] arr, int target){
    if(arr.length == 0){
        return false;
    }

    for(int i = 0; i<= arr.length ; i++){
        if(arr[i] == target){
            return true;
        }

    }
    return false;
}
}



