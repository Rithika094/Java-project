import java.util.Arrays;

public class Assigncookies{
    public static void main(String[] args) {
        int[] greed={1,2,3};
        int[] cookies={1,1};
        Arrays.sort(greed);
        Arrays.sort(cookies);
        int child =0;
        int cookie=0;
        while(child<greed.length && cookie<cookies.length){
            if(cookies[cookie]>=greed[child]){
                child++;
            }
            cookie++;
        }
        System.out.println("Happy chldren "+child);
    }
}