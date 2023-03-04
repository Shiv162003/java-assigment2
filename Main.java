// name Shivansh Nautiyal
// class AI-ML-B1
// prn 21070126086


// Import necessary packages
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
// Main class that extends Input class
public class Main extends Input
{
    // Main method
    public static void main(String[] args)
    {
        // Create a scanner object to read user input
        Scanner so=new Scanner(System.in);    
        // Call the input method from Input class to get an array from the user
        int arr[]=input();
        // Get the length of the array
        int n=arr.length;
        // Ask the user if they want even or odd numbers from the array
        System.out.println("Enter 1 if you want to get the even numbers in the array and 2 for odd:");
        int x=so.nextInt();
        // Call the even_or_odd method from Function class to get the required numbers from the array
        int arr1[]=even_or_odd(n,arr,x);
        // Print the even or odd numbers obtained from the array
        for(int i=0;i<arr1.length;i++)
            System.out.println(arr1[i]);
        // Call the neighobor method from Function class to find the pair of neighboring elements with the smallest absolute difference
        neighobor(n,arr);
        // Convert array to ArrayList
        // Converting array to ArrayList
        String[] array = {"apple", "banana", "cherry", "date"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + arrayList);
        // Converting ArrayList to array
        String[] newArray = arrayList.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(newArray));
    }
}
