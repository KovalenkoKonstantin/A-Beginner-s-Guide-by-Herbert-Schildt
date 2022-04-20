package chapter16_Swing.listing5;
// Demonstrate a simple JList.

import beginners_guide_schildt.self_annotations.Constructor;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ListDemo implements ListSelectionListener {

    JList<String> jlst;
    JList<Integer> jlst1;
    JList<Boolean> jlstb;
    JLabel jlab;
    JLabel jlab1;
    JLabel jlabb;
    JScrollPane jscrlp;
    JScrollPane jscrlp1;
    JScrollPane jscrlpb;

    // Create an array of names.
    String names[] = { "Sherry", "Jon", "Rachel",
            "Sasha", "Josselyn",  "Randy",
            "Tom", "Mary", "Ken",
            "Andrew", "Matt", "Todd" };
    Integer integers[] = {1,2,3,4,5,6,7,8,9,10};
    Boolean booleans[] = {false, true};
    @Constructor
    ListDemo() {
        // Create a new JFrame container.
        JFrame jfrm = new JFrame("JList");
        // Specify a flow Layout.
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 560);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JList.
        /**Конструктор, которому в качестве параметра передается массив,
         автоматически создает экземпляр класса JList,*/
        jlst = new JList<String>(names);
        jlst1 = new JList<Integer>(integers);
        jlstb = new JList<Boolean>(booleans);

        // Set the list selection mode to single-selection.
        jlst.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jlst1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jlst1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add list to a scroll pane.
        jscrlp = new JScrollPane(jlst);
        jscrlp1 = new JScrollPane(jlst1);
        jscrlpb = new JScrollPane(jlstb);

        // Set the preferred size of the scroll pane.
        jscrlp.setPreferredSize(new Dimension(120, 90));
        jscrlp1.setPreferredSize(new Dimension(120, 90));
        jscrlpb.setPreferredSize(new Dimension(120, 90));

        // Make a label that displays the selection.
        jlab = new JLabel("Please choose a name");
        jlab1 = new JLabel("Please choose an integer");
        jlabb = new JLabel("Please choose logic");

        // Add list selection handler.
        jlst.addListSelectionListener(this);
        jlst1.addListSelectionListener(this);
        jlstb.addListSelectionListener(this);

        // Add the list and label to the content pane.
        jfrm.add(jscrlp);
        jfrm.add(jlab);
        jfrm.add(jscrlp1);
        jfrm.add(jlab1);
        jfrm.add(jscrlpb);
        jfrm.add(jlabb);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // Handle list selection events.
    public void valueChanged(ListSelectionEvent le) {
        // Get the index of the changed item.
        int idx = jlst.getSelectedIndex();
        int idx1 = jlst1.getSelectedIndex();
        int idxb = jlstb.getSelectedIndex();

        // Display selection, if item was selected.
        /**значение -1 возвращается в том случае,
         * если не был выбран ни один элемент.
         * Именно это происходит в ситуациях, когда событие генерируется
         * в результате отмены пользователем своего выбора.*/
        if(idx != -1)
            jlab.setText("Current selection: " + names[idx]);
        else // Othewise, reprompt.
            jlab.setText("Please choose a name");
//Индексирование начинается с нуля
        if(idx1 != -1)
            jlab1.setText("Current selection: " + integers[idx1]);
        else // Othewise, reprompt.
            jlab1.setText("Please choose an integer");

        if(idxb != -1)
            jlabb.setText("Current selection: " + booleans[idxb]);
        else // Othewise, reprompt.
            jlabb.setText("Please choose logic");
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListDemo();
            }
        });
    }
}