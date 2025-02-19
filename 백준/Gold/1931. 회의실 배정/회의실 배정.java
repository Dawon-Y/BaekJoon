import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<int[]> meeting = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            meeting.add(new int[]{start, end});
        }

        meeting.sort((a, b) -> a[1] == b[1] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));

        int count = 0;
        int endTime = 0;

        for (int i = 0; i < meeting.size(); i++) {
            int[] meetingTime = meeting.get(i);
            if (meetingTime[0] >= endTime) {
                count++;
                endTime = meetingTime[1];
            }
        }
        System.out.println(count);
    }
}