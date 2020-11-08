public class Uke1_1_1_2 {
    public static void main(String[] args){
        int[] a = {9,8,7,3,2,1};
        System.out.print(min(a));
    }
    public static int min(int[] a){
        //finner minste verdi
        int min_index = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]<a[min_index]){
                min_index = i; //indeksen oppdateres
            }
        }
        return min_index; //returnerer indeksen
    }
}

