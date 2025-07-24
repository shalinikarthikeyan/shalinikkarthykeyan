import java.util.*;

public class VersionManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int K = sc.nextInt(); 

        Set<Integer> ignored = new HashSet<>();
        Set<Integer> tracked = new HashSet<>();

        for (int i = 0; i < M; i++) {
            ignored.add(sc.nextInt());
        }
        for (int i = 0; i < K; i++) {
            tracked.add(sc.nextInt());
        }
        int bothTrackedAndIgnored = 0;
        int bothUntrackedAndUnignored = 0;
        for (int i = 1; i <= N; i++) {
            boolean isIgnored = ignored.contains(i);
            boolean isTracked = tracked.contains(i);

            if (isIgnored && isTracked) {
                bothTrackedAndIgnored++;
            } else if (!isIgnored && !isTracked) {
                bothUntrackedAndUnignored++;
            }
        }
        
        System.out.println(bothTrackedAndIgnored + " " + bothUntrackedAndUnignored);
    }
}

