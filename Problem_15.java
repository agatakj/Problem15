


/*
@author Agata

Notes:
The number of binomial - number of orderings = (A + B)!/(A! * B!)

6  =  3 +  3
10 =  6 +  4
15 = 10 +  5

     (d+r)!
F = ---------  , where |D| = d and |R| = r
      d!*r!

 https://www.mathsisfun.com/combinatorics/combinations-permutations.html
*/

public class Problem_15 {
    public static void main(String[] args) {
        int j = 20;
        long result = 1;
        for (int i = 1; i <= j; i++) {
            result *= (i + j);
            result /= i;
        }
        System.out.println(result);
    }

}




