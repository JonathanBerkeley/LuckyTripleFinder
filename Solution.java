package googlechallenge3q1pt2;

/**
 *
 * @author Jonathan
 */
public class Solution {

    public static int solution(int[] l) {
        
        if (l.length > 2) {
            int magicTriples = 0;
            for (int i = 0; i < l.length; ++i) {

                for (int j = i + 1; j < l.length; ++j) {

                    for (int k = j + 1; k < l.length; ++k) {

                        //System.out.println("i : " + i + " j: " + j + " k: " + k);
                        //System.out.println("v : " + l[i] + " v: " + l[j] + " v: " + l[k] + "\n");

                        if (i < j && j < k) {
                            
                            if ((double) l[j] % (double) l[i] == 0) {

                                if ((double) l[k] % (double) l[j] == 0) {
                                    System.out.println("Magic triple found: [" + l[i] + ", " + l[j] + ", " + l[k] + "]");
                                    ++magicTriples;

                                }

                            }

                        }

                    }

                }

            }
            return magicTriples;
        } else {
            return 0;
        }
    }
}
