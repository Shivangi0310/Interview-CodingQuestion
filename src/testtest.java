import java.util.Arrays;
import java.util.List;

public class testtest {

    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {

        int time = 0;
        int totalEvents = arrival.size();
        int [][] intervals = new int[totalEvents][2];

        for (int i = 0; i < totalEvents; i++) {
            intervals[i] = new int[] {arrival.get(i), arrival.get(i) + duration.get(i)};
        }

        Arrays.sort(intervals, (a, b) ->(a[1] - b[1]));
        int curTime = intervals[0][1];

        for (int i = 1; i < totalEvents; i++) {
            int [] pptToBeScheduled = intervals[i];
            if (pptToBeScheduled[0] < curTime)
                time++;
            else {
                curTime = pptToBeScheduled[1];
            }
        }
        return totalEvents - time;

        // Write your code here

    }

    public static void main(String[] args) throws InterruptedException{
        String str = new String("Gerk");
        str=null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("end end");

    }
    @Override
    protected void finalize(){
        System.out.println("finalize called");
    }
}
