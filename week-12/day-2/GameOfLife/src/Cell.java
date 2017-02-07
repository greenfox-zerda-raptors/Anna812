import java.util.ArrayList;

/**
 * Created by Anna on 17/01/17.
 */
public class Cell {
    private boolean alive;
    private ArrayList<Cell> neighbours;

    public Cell(int i) {
       alive = i == 1;
       this.neighbours = new ArrayList<>();
    }

    public int countAliveNeighbours() {
        int aliveNeighbours = 0;
        for (Cell temp : neighbours) {
            if (temp.alive) {
                aliveNeighbours++;
            }
        }
        return aliveNeighbours;
    }

    @Override
    public boolean equals(Object obj) {
        return alive == ((Cell)obj).alive;
    }

    public void addNeighbour(Cell cell) {
        neighbours.add(cell);
    }
}
