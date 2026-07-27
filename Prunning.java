public class Prunning {
    static void generate(String str,int open,int close,int n) {
        if(open>n||close>n||close>open ){
            return;
        
    }

    if(str.length()==2*n){
        System.out.println(str); 
    return;
   }

   generate(str +"(",open+1,close,n);
   generate(str +")",open,close+1,n);
}
public static void main(String[]args){
    generate("",0,0,2);
}
}
