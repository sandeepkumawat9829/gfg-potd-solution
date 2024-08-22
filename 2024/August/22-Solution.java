class Solution {
    public String findOrder(String[] dict, int n, int k) {
        List<List<Integer>> adj = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            buildGraph(adj, dict[i - 1], dict[i]);
        }

        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[k];
        for (int i = 0; i < k; i++) {
            if (!visited[i]) {
                topologicalSort(i, adj, visited, st);
            }
        }

        StringBuilder order = new StringBuilder();
        while (!st.isEmpty()) {
            order.append((char) (st.pop() + 'a'));
        }
        return order.toString();
    }

    private void buildGraph(List<List<Integer>> adj, String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                adj.get(str1.charAt(i) - 'a').add(str2.charAt(i) - 'a');
                break;
            }
        }
    }

    private void topologicalSort(int node, List<List<Integer>> adj, boolean[] visited, Stack<Integer> st) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                topologicalSort(neighbor, adj, visited, st);
            }
        }
        st.push(node);
    }
}