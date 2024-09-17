/**
This is Algorithm 1.3 Exchange Sort
Needs Work

Author: James Lee
Source Code in ReadMe File 
*/

public class exchangeSort{
    
     // This method will return the sum of the given array elements
     public static int exchange(int n, int[] S) {
            
            // for i that is smaller than the length of the array add the current index element to the result counter
            for (int i = 1; i < n; i++){
                for (int j = 1; j < i+1 && j <n+1; j++) {
                    if (S[j] < S[i]) {
                        S[i] = S[j];
                        S[j] = S[i];
                    }
                }
            }

            return S;
        }

        public static void main(String[] args){
            
            // Testing Sample List
            // Answer : 54
            int[] S = {-1, 10, 7, 11, 5, 13, 8};
            int[] Ans;

            Ans = exchange(S.length-1, S);
            System.out.println(Ans);

        }

}