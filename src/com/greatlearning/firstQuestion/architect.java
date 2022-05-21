package com.greatlearning.firstQuestion;
import java.util.Scanner;
import java.util.Stack;
public class architect {
    public static void main(String[] args) {
        int n, i, size,j;
        System.out.println("Enter the size of building: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // input size from user and store in n
        int[] array = new int[n]; // initialise dynamic array
        int[] array2 = new int[15];
        size = n;                  // saving a copy of n at size. Size will reduce its value by one when a block is fixed.
        for (i = 0; i < n; i++) {
            System.out.println("Enter size of building on day " + (i + 1));
            array[i] = sc.nextInt(); //input size of blocks receiving on each day
        }
        Stack<Integer> data = new Stack<>(); // Initialising a stack
        for (i = 0; i < n; i++) {
            System.out.println("\nWork on day" + (i + 1));
            if (array[i] == size)   //compare if element is equal to size
            {
                System.out.print(array[i] + " "); //if they are equal, then we will print the element directly
                size--; // reduce size by 1
                while (!data.empty()) // checks whether stack is filled or empty
                {
                    if (data.peek() == size) //peek is used to see top element without poping
                    {
                        System.out.print(data.pop() + " "); // Pop the top element and print it
                        size--; // reduce size value by 1
                    } else
                        break;//break is executed if top element not equal to size value
                }
            } else
                data.push(array[i]); // if size not equal to element, then will push the element to stack
        }
        for (i = 0; !data.isEmpty(); i++) // Loop to clear out the values of stack
            array2[i] = data.pop(); // pops the elements of stack, if stack is not empty and save it to an array
        for(j=i-1;j>=0;j--) // Reverse the array by printing elements from last to first index(variable i will have length of array2)
            System.out.print(array2[j]+" ");
    }
}





