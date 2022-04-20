package chapter16_Swing.tasks;
/**Добавьте в утилиту сравнения файлов, созданную в упражнении 16.1,
 флажок со следующей пояснительной надписью: Показывать позицию
 расхождения.
 Если этот флажок установлен, программа должна отображать
 позицию, в которой обнаружено первое расхождение в содержимом
 сравниваемых файлов.*/

import beginners_guide_schildt.self_annotations.Constructor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Compare implements ActionListener {

    JTextField firstTextField;  // holds the first file name
    JTextField secondTextField; // holds the second file name

    JButton button; // button to compare the files

    JLabel jlbFirst, jlbSecond; // displays prompts
    JLabel jlbResult; // displays results and error messages

    JCheckBox checkBox;

    @Constructor
    Compare() {
        JFrame jfrm = new JFrame("Compare Files");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300, 240);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstTextField = new JTextField("c:\\Users\\k.kovalenko\\1.txt", 14);
        secondTextField = new JTextField("c:\\Users\\k.kovalenko\\2.txt", 14);

        // Set the action commands for the text fields.
        firstTextField.setActionCommand("fileA");
        secondTextField.setActionCommand("fileB");

        // Create the Compare button.
        JButton jbtnComp = new JButton("Compare");
        jbtnComp.addActionListener(this);

        // Create the labels.
        jlbFirst = new JLabel("First file: ");
        jlbSecond = new JLabel("Second file: ");
        jlbResult = new JLabel("");

        //Make Checkbox
        checkBox = new JCheckBox("Показывать позицию расхождения.");

        // Add the components to the content pane.
        jfrm.add(jlbFirst);
        jfrm.add(firstTextField);
        jfrm.add(jlbSecond);
        jfrm.add(secondTextField);
        jfrm.add(jbtnComp);
        jfrm.add(checkBox);
        jfrm.add(jlbResult);

        // Display the frame.
        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int i, j, count = 0;
        if(firstTextField.getText().equals("")) {
            jlbResult.setText("First file name missing.");
            return;
        }
        if(secondTextField.getText().equals("")) {
            jlbResult.setText("Second file name missing.");
            return;
        }
        try (FileInputStream f1 = new FileInputStream(firstTextField.getText());
             FileInputStream f2 = new FileInputStream(secondTextField.getText()))
        {
            // Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;
                count++;
            } while(i != -1 && j != -1);

            if(i != j){
                if (checkBox.isSelected())
                jlbResult.setText("Files differ starting position " + count);
                else
                    jlbResult.setText("Files are not the same");
            }
            else
                jlbResult.setText("Files compare equal.");
        } catch(IOException exc) {
            jlbResult.setText("File Error");
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(Compare::new);
    }
}
