import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<Integer>[] graph = new ArrayList[n + 1]; // 노드마다 연결된 노드들을 저장하는 리스트

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보를 이용하여 그래프 구성
        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];
            graph[a].add(b);
            graph[b].add(a);
        }

        // BFS를 이용하여 1번 노드에서부터 각 노드까지의 최단거리 계산
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1); // 배열의 값을 -1로 채워줌
        dist[1] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int next : graph[curr]) {
                if (dist[next] == -1) {
                    dist[next] = dist[curr] + 1;
                    queue.offer(next);
                }
            }
        }

        // 최단거리가 가장 먼 노드의 개수 구하기
        int maxDist = 0;
        int answer = 0;
        for (int d : dist) {
            if (d > maxDist) {
                maxDist = d;
                answer = 1;
            } else if (d == maxDist) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        System.out.println(sol.solution(n, edge));
    }
}