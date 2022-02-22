package backtracking;

public class lexioGraphic {
    public static void lexicalPrint(int n,int num){
        if(num>n)
            return;
        System.out.println(num);
        for(int i = 0;i<=9;i++){
            lexicalPrint(n,num*10+i);
        }
    }
    public static void main(String[] args) {
        for(int i = 1;i<=9;i++){
            lexicalPrint(1000,i);
        }
    }
}
