package beginners_guide_schildt.chapter16_Swing.listing0;
// Hello.java (Java SE 8)
import beginners_guide_schildt.self_annotations.Constructor;

import javax.swing.*;

public class Hello extends JFrame {
    @Constructor
    public Hello() {
        super("hello");//from JFrame
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(new JLabel("Hello, world!"));
        this.pack();
        this.setVisible(true);
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(Hello::new);
    }
}
