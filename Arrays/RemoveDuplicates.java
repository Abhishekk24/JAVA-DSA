import java.util.*;

public class RemoveDuplicates {
    static List<Object> remove(int[] arr) {
        ArrayList<Object> list = new ArrayList<>();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
                count++;}
        }
        for (int i = 0; i < arr.length - count; i++) {
            list.add('_');
        }
        System.out.println("Lenght "+count);
        return list;
    }

    static int removeduplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        int j=0,k=0;
        while(j<arr.length && k<set.size()){
            if(!set.contains(arr[j])){
                set.add(arr[j++]);
            }else{
                arr[k]=arr[j];
                k++;
                j++;
            }
        }
        return k;
    
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
        System.out.println("Original Array: " + Arrays.toString(arr));

        List<Object> modifiedList = remove(arr);

        System.out.println("Array with Duplicates Replaced by '_': " + modifiedList);
        
    }
}
