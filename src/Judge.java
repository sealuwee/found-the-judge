import java.util.ArrayList;
import java.util.List;

public class Judge {
    // people represents vertices
    protected int people;
    // trust is a 2d array of pairs of people that trust each other in the town
    protected int[][] trust;

    // constructor for the Judge class
    public Judge(int people, int[][] trust) {
        this.people = people;
        this.trust = trust;
    }

    public int findJudge(int N, int[][] trust) throws Exception {
        if (N==0){
            throw new Exception("N must be greater than or equal to 1.");
        }
        if (N==1 || trust.length == 0){
            return N;
        }
        // instantiate new 1D array for a & b, then iterate through trust
        int[] a = new int[N+1];
        int[] b = new int[N+1];
        // iterate through trust, pull out our a and b people
        // there might be a better operation to make this implementation faster and require
        // less memory.
        for (int i=0;i<trust.length;i++) {
            // separate a from b, positions in the two arrays will represent their trust
            // such that a[0] trusts b[0] so on so forth
            a[trust[i][0]]++;
            b[trust[i][1]]++;
        }
        // for loop starts at 1 < N+1 because we could miss the edge if we start at 0<N
        for (int i=1;i<N+1;i++){
            if (b[i]==N-1 && a[i]==0){
                return i;
            }
        }
        // return -1 if the judge is not found
        return -1;
    }



}
