import java.util.*;
class Function
{
    public static int[] even_or_odd(int n, int arr[], int x) 
    {
        // Declare variables to hold the index of the next available position in the even and odd arrays
        int a, b;
        a = b = 0;    
        // Declare arrays to hold the even and odd elements of the input array
        int odd[] = new int[n];
        int even[] = new int[n];
        // Loop through the input array
        for (int i = 0; i < n; i++) {
            // If the current element is even, add it to the even array
            if (arr[i] % 2 == 0) {
                even[a] = arr[i];
                a++;
            }
            // Otherwise, add it to the odd array
            else {
                odd[b] = arr[i];
                b++;
            }
        }
        // If x is 1, return the even array; otherwise, return the odd array
        if (x == 1)
        return even;
        else
        return odd;
    }
    static void neighobor(int n, int arr[]) 
    {
        // Initialize variables to hold the minimum difference value and its corresponding index
        int x = 984456548;
        int index = 0;    
        // Loop through the input array up to the second-to-last element
        for (int i = 0; i < n - 1; i++) {
            // Calculate the absolute difference between the current element and the next element
            int temp = Math.abs(arr[i] - arr[i + 1]);
            // If the absolute difference is smaller than the current minimum value, update the minimum value and index
            if (temp < x) {
                x = temp;
                index = i;
            }
        }
        // Print the index of the pair of neighboring elements with the smallest absolute difference
        System.out.println("index = " + index);
    }
}