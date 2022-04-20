package chapter16_Swing.tasks;
/**Измените программу List Demo таким образом, чтобы она допускала выбор
 нескольких элементов списка.*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ListDemoRebuild implements ListSelectionListener {

    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    String names[] = { "Sherry", "Jon", "Rachel",
            "Sasha", "Josselyn",  "Randy",
            "Tom", "Mary", "Ken",
            "Andrew", "Matt", "Todd" };

    ListDemoRebuild() {
        JFrame jfrm = new JFrame("JList Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlst = new JList<String>(names);
        jlst.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add list to a scroll pane.
        jscrlp = new JScrollPane(jlst);
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // Make a label that displays the selection.
        jlab = new JLabel("Please choose a name");
        jlst.addListSelectionListener(this);

        // Add the list and label to the content pane.
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // Handle list selection events.
    public void valueChanged(ListSelectionEvent le) {
        // Get the index of all selectred positions.
        int[] idx = jlst.getSelectedIndices();

        // Display selection, if item was selected.
        if(idx.length != 0){
            String str = "";
            //Construct a string of names
            for (int i : idx) {
                str += names [i]+ " ";
            jlab.setText("Current selection: " + str);
            }
        }
        else // Othewise, reprompt.
            jlab.setText("Please choose a name");
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(ListDemoRebuild::new);
    }
}
