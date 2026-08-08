import javax.swing.JFrame; //importing window

public class App {

    public static void main(String[] args) throws Exception {
        
        int rowCount = 21; //21 rows
        int columnCount = 19; //19 cols
        int tileSize = 32; //each tile will be 32 pix
        int boardWidth = columnCount * tileSize; 
        int boardHeight = rowCount * tileSize;

        //now we're gonna create the window here
        JFrame frame = new JFrame("PacMan");
        //frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); //puts window in center
        frame.setResizable(false); //so player can't change window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits if player hits x


        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);
    }
}
