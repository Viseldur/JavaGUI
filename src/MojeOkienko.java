import javax.swing.*;

public class MojeOkienko extends JFrame {
    public MojeOkienko()
    {
        setSize(300, 200);
        setTitle("Moje pierwsze okienko");
    }
    public static void main(String args []){
        MojeOkienko okno = new MojeOkienko();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }
}
