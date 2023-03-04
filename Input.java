import java.util.*;
class Input extends Function
 {
    // This method prompts the user to enter an integer array and returns the resulting array.
    public static int[] input() 
    {
        // Create a Scanner object to read input from standard input.
        Scanner so = new Scanner(System.in);
        // Declare variables to hold the size of the array and the array itself.
        int arr[];
        System.out.println("enter the size of the array");
        int n = so.nextInt();
        arr = new int[n];
        // Read in the elements of the array from standard input.
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = so.nextInt();
        }
        // Return the resulting integer array.
        return arr;
    }
}
