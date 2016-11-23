import javax.swing.*;
import java.awt.*;

/**
 * Created by Anna812 on 11/23/2016.
 */
public class HelloWorld extends JFrame{

    public HelloWorld() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        setSize(400, 400);
        int xPos = (dim.width/2) - (getWidth()/2);
        int yPos = (dim.height/2) - (getHeight()/2);
        setLocation(xPos, yPos);
        setResizable(false);
        setTitle("This is the title");
        setVisible(true);

        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("This is a Label");
        label.setText("Hello You!");
        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
        String textHolder = "";
        for (String temp : hellos) {
            textHolder += temp + "<br>";
        }
        label.setText("<html>" + textHolder + "</html>");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.add(label);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloWorld();
            }
        });
    }
}
