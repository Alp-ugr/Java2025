import java.util.*;

public class EvenTree {
    static Map<Integer, List<Integer>> tree = new HashMap<>();
    static int kenarlar = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodes = scanner.nextInt();
        int edges = scanner.nextInt();
        for (int i = 1; i <= nodes ; i++) {
            tree.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            tree.get(n).add(m);
            tree.get(m).add(n);
        }
        dfs(1, -1);
        System.out.println(kenarlar);
    }
    static int dfs(int node, int parent){
        int size = 1;
        for (int child : tree.get(node)){
            if (child != parent){
                size += dfs(child, node);
            }
        }
        if (size % 2 == 0 && parent != -1){
            kenarlar++;
        }
        return size;
    }

        }

