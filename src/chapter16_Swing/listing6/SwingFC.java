package chapter16_Swing.listing6;
/*Try This 16-1. A Swing-based file comparison utility.*/

import beginners_guide_schildt.self_annotations.Constructor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener {//ActionListener для кнопочки

    JTextField jtfFirst;  // holds the first file name
    JTextField jtfSecond; // holds the second file name

    JButton jbtnComp; // button to compare the files
    JButton jbtnClose;
    JButton jbtnNew;
    JButton jbtnO;

    JLabel jlabFirst, jlabSecond; // displays prompts
    JLabel jlabResult; // displays results and error messages
    JLabel newlable;

    JFrame jfrm;

    @Constructor
    SwingFC() {
        // Create a new JFrame container.
        jfrm = new JFrame("Compare Files");
        // Specify FlowLayout for the layout manager.//компоновка
        jfrm.setLayout(new FlowLayout());
        // Give the frame an initial size.
        jfrm.setSize(200, 320);
        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Create the text fields for the file names..
        jtfFirst = new JTextField("c:\\Users\\k.kovalenko\\Desktop\\Анализы\\ЦАПК\\КБО\\Разработка\\Переписка\\V300_22040501.docx", 14);
        jtfSecond = new JTextField("c:\\Users\\k.kovalenko\\Desktop\\Анализы\\ЦАПК\\КБО\\Разработка\\Переписка\\V300_22040501.docx", 14);

        // Set the action commands for the text fields.
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        // Create the Compare button.
        jbtnComp = new JButton("Compare");
        jbtnClose = new JButton("Close");
        jbtnNew = new JButton("Push the button");
        jbtnO = new JButton("One More");

        // Add action listener for the Compare button.
        jbtnComp.addActionListener(this);
        jbtnClose.addActionListener(this);
        jbtnNew.addActionListener(new ActionListener() {
            @Override
            /**метод actionPerformed() может быть вызван
             в подобной реализации только при наступлении событий, сгенерированных
             компонентом jbtnNew.*/
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(jbtnNew,
                        "Тебе точно это надо?",
                        "Ну что, доигрался?", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION)
                    JOptionPane.showMessageDialog(jbtnNew, "Ладно",
                            ":(", JOptionPane.OK_OPTION);
                else if (result == JOptionPane.NO_OPTION) {
                    int result1 = JOptionPane.showConfirmDialog(jbtnNew,
                            "Тогда - закрываю",
                            "o0", JOptionPane.YES_NO_OPTION);
                    {
                        if (result1 == JOptionPane.YES_OPTION)
                            jfrm.dispose();

                        else if (result1 == JOptionPane.NO_OPTION)
                            JOptionPane.showMessageDialog(jbtnNew, "То-то же",
                                    "OK", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
        //В данном случае лямбда-выражение применяется только к кнопке
        jbtnO.addActionListener((ae) -> newlable.setText("Кнопка нажата"));

        // Create the labels.
        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");
        newlable = new JLabel("");

        // Add the components to the content pane.
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        jfrm.add(jbtnClose);
        jfrm.add(jbtnNew);
        jfrm.add(jbtnO);
        jfrm.add(newlable);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // Compare the files when the Compare button is pressed.
    @Override
    public void actionPerformed(ActionEvent ae) {
        int i, j;

        // First, confirm that both file names have been entered.
        if (jtfFirst.getText().equals("")) {
            jlabResult.setText("First file name missing.");
            return;
        }
        if (jtfSecond.getText().equals("")) {
            jlabResult.setText("Second file name missing.");
            return;
        }

        // Compare files. Use try-with-resources to manage the files.
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            // Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j)
                jlabResult.setText("Files are not the same.");
            else
                jlabResult.setText("Files compare equal.");
        } catch (IOException exc) {
            jlabResult.setText("File Error");
        }

        if (ae.getActionCommand().equals("Close"))
            //jfrm.dispose();
            System.exit(0);
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
/*        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingFC();
            }
        });*/

        SwingUtilities.invokeLater(SwingFC::new);

        /**В случае событий, слушатели которых реализуют функциональный интерфейс,
         обработка событий может быть выполнена с использованием лямбда-
         выражений. Так, лямбда-выражения могут использоваться для обработки
         событий действий, поскольку в интерфейсе ActionListener определен только
         один абстрактный метод — actionPerformed(). Реализация интерфейса
         ActionListener с помощью лямбда-выражений — это более компактная
         альтернатива явному объявлению анонимного внутреннего класса.*/
/*        try {
            SwingUtilities.invokeAndWait(() -> new SwingFC());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/
    }
}
