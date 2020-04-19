/*
Special Pythagorean triplet
   
Problem 9
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class EulerProblem9 {

    public static void main(String[] args){
        int abc = 0;
        for (int i = 1; i <= 998; i++) {
            for (int j = 1; j <= 998; j++) {
                for (int k = 1; k <= 998; k++) {
                    if( i + j + k == 1000){
                        if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2))
                            abc = i*j*k;
                            break;
                    }
                }
            }
            
        }

        System.out.println("The product is " + abc + ".");

    }
}
