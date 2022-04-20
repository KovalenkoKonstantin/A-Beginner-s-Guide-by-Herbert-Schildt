package chapter16_Swing.listing3;
// Use a text field.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//чтобы объекты типа ButtonDemo могли быть использованы для получения событий действий.
public class ReversText implements ActionListener {

    JTextField jtf;
    //JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    ReversText() {

        // Create a new JFrame container.
        //Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Use a Text Field");

        // Specify FlowLayout for the layout manager.
        //Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(280, 120);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text field.
        //Создание текстового поля шириной 10 символов
        jtf = new JTextField(10);

        // Set the action commands for the text field.
        //Установить команду действия для текстового поля
/**После выполнения этого кода строка команды действия всегда будет содержать
 значение "123", независимо от того, какой именно текст введен в поле.
 Благодаря этому исключаются ситуации, когда команда действия, связанная с
 текстовым полем, может вступать в конфликт с командой действия, связанной
 с кнопкой Reverse*/
        jtf.setActionCommand("123");//со словом myTF выскакивает exception

        // Create the Reverse button.
        JButton jbtnRev = new JButton("Reverse");

        // Add action listeners.
        //Добавить слушателей событий для текстового поля и кнопки
        jtf.addActionListener(this);//слушатель текстового поля
        jbtnRev.addActionListener(this);//слушатель кнопки

        // Create the labels.
        // Создать метки
        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");

        // Add the components to the content pane.
        //Добавить компоненты на панель содержимого
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        // Display the frame.
        jfrm.setVisible(true);
    }

    // Handle action events.
    public void actionPerformed(ActionEvent ae) {

        if(ae.getActionCommand().equals("Reverse")) {
            // The Reverse button was pressed.
            String orgStr = jtf.getText();
            String resStr = "";

            // Reverse the string in the text field.
            for(int i=orgStr.length()-1; i >=0; i--)
                resStr += orgStr.charAt(i);

            // Store the reversed string in the text field.
            jtf.setText(resStr);
        } else
            // Enter was pressed while focus was in the
            // text field.
/**при нажатии клавиши <Enter> в тот момент, когда фокус
 ввода находится в текстовом поле, генерируется событие ActionEvent, которое
 пересылается всем зарегистрированным слушателям событий действий с
 помощью метода actionPerformed(). В программе TFDemo этот метод вызывает
 метод getText(), извлекая текст, содержащийся в компоненте jtf (текстовое
 поле). После этого текст отображается с помощью метки, на которую
 ссылается переменная jlabContents.*/
            jlabContents.setText("You pressed ENTER. Text is: " +
                    jtf.getText());
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ReversText();
            }
        });
    }
}
