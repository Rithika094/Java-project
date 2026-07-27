
import java.util.*;

public class recrusionsubset {
    static void generate(int[]arr,int index,ArrayList<Integer>list) {
        if(index==arr.length){
            System.out.println(list);
        return;
            }
        
    
    list.add(arr[index]);
    generate(arr,index+1,list);
    list.remove(list.size()-1);
    generate (arr,index+1,list);    
}
public static void main(String[]args){
    int[]arr={1,2};
    generate(arr,0,new ArrayList<>());


}
}

