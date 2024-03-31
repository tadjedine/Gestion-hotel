package src;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;


public class MyFrame extends JFrame{
    MyFrame(){
        this.setTitle("Guest Hover ");
        this.setResizable(true);
        this.setVisible(true);
        this.setSize(420, 0420);
        ImageIcon logo = new ImageIcon("logo.png");//create an image icon of the file named "logo" in the project folder
        this.setIconImage(logo.getImage());//adds the image to the top of the window
        this.getContentPane().setBackground(Color.GRAY );
    }
}
