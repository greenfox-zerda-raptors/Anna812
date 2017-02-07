/**
 * Created by Anna on 17/01/17.
 */
public class Generacio {
    public Cell[][] cells;

    public Generacio(int[][] cells) {
        this.cells = new Cell[cells.length][cells[0].length];
        for(int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                this.cells[i][j] = new Cell(cells[i][j]);
            }
        }
    }

    public Generacio createNextGeneration() {
        int[][] numberOfAliveNeigbours = listAliveNeighbours();
        return null;
    }

    public int[][] listAliveNeighbours() {
        int[][] result = new int[cells.length][cells[0].length];
        for(int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                result[i][j] = cells[i][j].countAliveNeighbours();
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        Generacio other = ((Generacio)obj);
        for(int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (!cells[i][j].equals(other.cells[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
}
