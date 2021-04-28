public class JudgeTest {
    public static void main(String[] args) throws Exception {
        // example 5
        long startTime1 = System.currentTimeMillis();
        int N = 4;
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        Judge judge = new Judge(N,trust);
        System.out.println("The judge is represented by the value of : "+judge.findJudge(N,trust));
        long endTime1 = System.currentTimeMillis();
        long totalTime1 = (endTime1-startTime1);
        String output1 = String.format("%s",totalTime1);
        System.out.println(output1+" MS is the total runtime of Judge class");
        long startTime2 = System.currentTimeMillis();
        int N_ = 4;
        int[][] trust_ = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        JudgeFaster judgeFaster = new JudgeFaster(N,trust);
        System.out.println("The judge is represented by the value of : "+judgeFaster.findJudge(N_,trust_));
        long endTime2 = System.currentTimeMillis();
        long totalTime2 = (endTime2-startTime2);
        String output2 = String.format("%s",totalTime2);
        System.out.println(output2+" MS is the total runtime of Judge class");
    }
}
