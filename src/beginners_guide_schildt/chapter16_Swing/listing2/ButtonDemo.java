package beginners_guide_schildt.chapter16_Swing.listing2;
// Demonstrate a push button and handle action events.

import java.awt.*; //java.awt необходим потому, что он содержит класс менеджера компоновки
//FlowLayout
import java.awt.event.*; //пакет java.awt.event необходим потому, что в нем определены интерфейс
//ActionListener и класс ActionEvent
import javax.swing.*;

public class ButtonDemo implements ActionListener {//чтобы объекты типа ButtonDemo
    //могли быть использованы для получения событий действий.

    JLabel jlab;//потому как используется в обоих методах

    ButtonDemo() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("Пример кнопки");

        // Specify FlowLayout for the layout manager.
        //Задать объект FlowLayout для менеджера компоновки
        /**по умолчанию на панели содержимого в качестве менеджера
         компоновки используется BorderLayout, но для многих приложений
         лучше подходит менеджер компоновки FlowLayout. Он располагает компоненты
         построчно: слева направо и сверху вниз.*/
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size.
        jfrm.setSize(250, 120);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons.
        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");
        JButton close = new JButton("Close");

        // Add the buttons to the content pane.
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);
        jfrm.add(close);

        // Create a label.
        // Создать метку
        jlab = new JLabel("Жмакай");

        // Add the label to the frame.
        // Добавить метку во фрейм
        jfrm.add(jlab);

        // Display the frame.
        // Отобразить фрейм
        jfrm.setVisible(true);

        // Add action listeners.
        /**экземпляр класса ButtonDemo, для ссылки на который используется
         ключевое слово this, добавляется в качестве слушателя событий для кнопок*/
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);
        close.addActionListener(this);
        /**В результате выполнения этого кода объект, создающий кнопки, будет получать
         также уведомления об их нажатии.*/
    }

    // Handle button events.
    // Обработка событий кнопки
    /**Всякий раз, когда кнопка нажимается, генерируется событие действия,
     о котором зарегистрированные слушатели уведомляются посредством вызова
     метода actionPerformed(). Объект типа ActionEvent, представляющий
     событие кнопки, передается этому методу в качестве параметра.*/
    public void actionPerformed(ActionEvent ae) {
        //Использование команды действия для определения состояния кнопки
        if(ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed Up.");
        else if (ae.getActionCommand().equals("Down"))
            jlab.setText("You pressed down. ");
        else jlab.setText("You pressed close. ");
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
