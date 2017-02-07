/**
 * Created by Anna on 17/02/07.
 */
public class QuickUnion {

    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for(int i =  0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int input) {
        while(input != id[input]) {
            input = id[input];
        }
        return input;
    }

    public boolean connected (int pointA, int pointB) {
        return root(pointA) == root(pointB);
    }

    public void union(int pointA, int pointB) {
        int i = root(pointA);
        int j = root(pointB);
        id[i] = j;
    }
}
