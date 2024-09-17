/**
This is Algorithm 1.1 Sequentual Search 
Eseentially it search through the array for that integer sequentially.
If such element exists than it will return with the index with the element inside the array if not, it will return a zero

Author: James Lee
Source Code in ReadMe File 
*/

public class sequentialSearch{
    
     // This method will return the index of a specific number in the array if it exists
     public static int seqSearch(int n, int[] S, int x) {
            
            // Define location counter
            int location = 1;
            
            // while location is smaller than the length of the array and the number in the array is not equal to the desired element
            while(location <= n && S[location] != x) {
                
                // add one
                location += 1;
            }
            
            // if location gets bigger than n return a 0 indicating no such element in the array
            if (location > n) {
                location = 0;
            }

            return location;
        }

        public static void main(String[] args){
            
            // Testing Sample List
            // Answer : 4, 0
            int[] S = {0, 10, 7, 11, 5, 13, 8};
            int x = 5;
            int Ans1;
            int Ans2;
            
            Ans1 = seqSearch(S.length-1, S, x);
            System.out.println(Ans1);

            int y = 4;
            
            Ans2 = seqSearch(S.length-1, S, y);
            System.out.println(Ans2);

        }

}