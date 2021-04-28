public class JudgeFaster {
    // people represents vertices
    protected int people;
    // trust is a 2d array of pairs of people that trust each other in the town
    protected int[][] trust;
    public JudgeFaster(int people, int[][] trust) {
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
        // in the class lecture slides we learned about how to cast a boolean array
        // to represent positions and connections on the graph.
        // we can try that and see if it's faster?
        boolean[] connected = new boolean[N+1];
        // short hand for iterating through an array
        for (int[] x: trust){
            connected[x[0]] = true;
        }
        for (int i=1;i<N+1;i++) {
            if (!connected[i]) {
                int count = 0;
                for (int[] x: trust) {
                    if (i==x[1]) {
                        count++;
                    }
                }
                if (count==N-1) {
                    return i;
                }
                count = 0;
            }
        }
        return -1;
    }

}
