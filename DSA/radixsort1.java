import java.util.*;
public class radixsort1{
    public static int passes(){
        
        
        return 0;
    }
    /*
    public static int get_lsb(int a){

        return a%10;
    }
    */
   
    public static void sort(int arr[], int n){
        if (n <= 0){
            System.out.println("Nothing to sort");
        }

        Vector<Integer>[] buckets = new Vector[n];
  
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Integer>();
        }

        for (int i = 0; i < n; i++) {
            float idx = (arr[i]) %n;
            buckets[(int)idx].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }
    public static void main(String[] args) {
        // Give n as input
        int n;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter Number of Integers to be sorted");
        n=k.nextInt();
        // initialized an array to store the numbers to be sorted.
        int arr[] = new int [n];
        for (int i = 0; i < arr.length; i++) {
            Scanner numbers = new Scanner(System.in);
            System.out.println("Enter the Integer: ");
            int num =numbers.nextInt();
            arr[i]=num;
        }

        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        
        
        int p=1;
        while(mx/10 != 0){
            mx=mx/10;
            p++;   
        }
        System.out.println( "Number of passes: "+p);
        

        /*
        System.out.println( );
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i]);
        }
        */
        // number of passes..
        
        for(int i=0; i<p;i++){
            sort(arr, n);
        }
  
        System.out.println("Sorted array is ");
        for (int el : arr) {
            System.out.print(el + " ");

    }
    
}
}