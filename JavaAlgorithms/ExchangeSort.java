/**
This is Algorithm 1.3 Exchange Sort
This class will perform exchange sort by comparing the number to its next until the array has been sorted into order.

Author: James Lee
Source Code in ReadMe File 
*/

import java.util.Arrays;


public class exchangeSort{
    
    // This method will sort the given array using exchange sort 
    public static int[] exchange(int n, int[] S) {
        
        // for i and j values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                // if the index j element is bigger switch
                if (S[j] > S[j + 1]) {
                    int temp = S[j];
                    S[j] = S[j + 1];
                    S[j + 1] = temp;
                }
            }
        }
        
        return S;
    }

    public static void main(String[] args) {
        
        // Testing Sample List
        // Answer = 
        int[] S = {-1, 10, 7, 11, 5, 13, 8};
        int[] Ans;

        Ans = exchange(S.length, S);
        System.out.println(Arrays.toString(Ans)); 
    }

}