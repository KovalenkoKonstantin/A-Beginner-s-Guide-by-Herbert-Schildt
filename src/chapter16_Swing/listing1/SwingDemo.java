package chapter16_Swing.listing1;
// A simple Swing program.
/**Swing-программы должны импортировать
 пакет javax. swing*/
import beginners_guide_schildt.self_annotations.Constructor;

import javax.swing.*;
import javax.swing.JFrame;//контейнер верхнего уровня

public class SwingDemo {

    @Constructor
    SwingDemo() {
//Инструкции:
        // Create a new JFrame container.
        // Создание контейнера
        /**setSize() устанавливает размеры окна в пикселях*/
        JFrame jfrm = new JFrame("Простое приложение Swing");

        // Give the frame an initial size.
        //Настройка размеров контейнера
        jfrm.setSize(375, 100);

        // Terminate the program when the user closes the application.
        // Прекращение выполнения риложения при закрытии окна
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label.
        //Добавление метки Swing
        JLabel jlab = new JLabel(" Программирование интерфейса\n" +
                " с помощью Swing."); //\n не переносит на новую строку

        // Add the label to the content pane.
        // Добавление метки на панель содержимого
        jfrm.add(jlab);

        // Display the frame.
        //Отображение фрейма/контейнера/окна
        /**По умолчанию фрейм (объект типа JFrame) не виден,
         * поэтому для его отображения требуется вызов метода setvisible(true).*/
        jfrm.setVisible(true);
    }
/**Когда пользователь активизирует GUI-компонент, генерируется соответствующее событие.
 * Событие передается приложению путем вызова обработчика событий, определяемого приложением.
 Однако данный обработчик выполняется не в главном потоке приложения, а в
 потоке диспетчеризации событий, предоставляемом библиотекой Swing. Таким
 образом, несмотря на то что обработчики событий определяются в программе,
 они выполняются в потоке, создаваемом вне программы.
 Чтобы избежать возможных проблем (например, попытки двух потоков одновременно обновить
 один и тот же компонент), все компоненты GUI библиотеки Swing должны
 создаваться и обновляться в потоке диспетчеризации событий, а не в главном
 потоке приложения. Однако метод main() выполняется в основном потоке и
 поэтому не может напрямую создавать экземпляры класса SwingDemo. Что он
 может, так это создать объект типа Runnable, выполняющийся в потоке диспетчеризации
 событий, и поручить создание GUI этому объекту.*/
    public static void main(String args[]) {
        // Create the frame on the event dispatching thread.
        //  Фрейм SwingDemo должен создаваться в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //создается объект типа SwingDemo
                new SwingDemo();
            }
        });
    }
}
