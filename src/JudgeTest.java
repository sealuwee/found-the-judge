public class JudgeTest {
    public static void main(String[] args) throws Exception {
        // example 5
        int N = 4;
        int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        Judge judge = new Judge(N,trust);
        System.out.print("The judge is represented by the value of : "+judge.findJudge(N,trust));
    }
}
