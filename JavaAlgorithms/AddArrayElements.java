/**
This is Algorithm 1.2 addArrayElements
This class utilizes a method that essentially adds all the elements in the array

Author: James Lee
Source Code in ReadMe File 
*/

public class addArrayElements{
    
     // This method will return the sum of the given array elements
     public static int sum(int n, int[] S) {
            
            // Define result counter
            int result = 0;
            
            // for i that is smaller than the length of the array add the current index element to the result counter
            for (int i = 1; i < n+1; i++){
                result = result + S[i];
            }

            return result;
        }

        public static void main(String[] args){
            
            // Testing Sample List
            // Answer : 54
            int[] S = {-1, 10, 7, 11, 5, 13, 8};
            int Ans;

            Ans = sum(S.length-1, S);
            System.out.println(Ans);

        }

}