import java.util.*;

public class Hashing {
    
    public static int size;
    static int hashv;
    static Scanner scn = new Scanner(System.in);
    static int arr[];

    public static void init(int[] arr)
    {   
        System.out.println("Intializing the array with -1 as all the elements");      // Assigning the values to -1 for easy identification

        for(int i=0;i<size;i++)
        {
            arr[i] = -1;
        }

    }
    
    public static void start()
    {   
    
        arr = new int[size];

        init(arr); // initilizing the array with all elements as -1
        disp();   //  Displaying the initilized array
        
        System.out.println();
        for (int i = 0; i < size; i++) {
            int temp = 0;
            System.out.println("Enter the key " + (i));
            temp = scn.nextInt();
            hashv = (temp) % size;
            System.out.println(temp + " % "+ size + " = "+ hashv + "\n");
            iscollided();
            arr[hashv] = temp;
        }
        disp();
    }

    public static int iscollided()    //Collision this not working (Linear Probing method)
    {   
        if(hashv == size)            // If the hasv of the key is the last element of the array, we need to trace back the pointer to the first position and travrse.
        {                             // Was helpful a lot coz in linear probing we cant exceed the array
            hashv =0;                 // Setting the hashv to 0 to traverse from the begining 
            iscollided();             // Recurring the same method to avoid the collision
        }

        if(arr[hashv] != -1)
        {
            hashv = (hashv +1) % 10;   // If collided the hashv will be incremented 
            iscollided();              // We have used the recursion to loop the array.
        }
           
        return hashv;              // Returns the hashv after checking the collison concept        
    }

    public static void disp()               // A method to display the array 
    {
        for (int i = 0; i < size; i++)
        {   
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size");   // Taking the input size of the array
        size = scn.nextInt();
        start();                                //Triggering the start() to run the code 
    }
}

// Values taken : 37,28,11,14,25
// Code made by SSR