public class Main{

    static void sort(int[] T){
        for(int i=0;i<T.length;i++){
            for(int j=i+1;j<T.length;j++){
                if(T[i]>T[j]){
                    int k =T[i];
                    T[i]=T[j];
                    T[j]=k;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] k= {1,2,3,65,4,8,9};
        sort(k);
        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+" ");
        }        
    }


}