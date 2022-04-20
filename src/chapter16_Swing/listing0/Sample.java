package chapter16_Swing.listing0;
import javax.swing.JFrame;//контейнер верхнего уровня
import javax.swing.JButton;
import javax.swing.JOptionPane;//легковестный контейнер
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.ActionListener; //менеджеры компоновки
import java.awt.event.ActionEvent;//менеджеры компоновки
import java.lang.reflect.InvocationTargetException;

public class Sample extends JFrame {
    private final JButton b = new JButton();

    public Sample() {
        super();
        this.setTitle("Приложенька");
        //this.getContentPane().setLayout(null);
        this.getContentPane().setLayout(new FlowLayout());
        //this.setBounds(100, 100, 280, 140);
        this.setSize(280, 100);
        this.add(makeButton());
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JButton makeButton() {
        b.setText("Нажми на меня");
        //b.setBounds(60, 40, 150, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(b, "Работает!");
            }
        });
        return b;
    }

    public static void main(String[] args) {
        // Swing calls must be run by the event dispatching thread.
        try {
            SwingUtilities.invokeAndWait(() -> new Sample());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
