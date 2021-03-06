package ru.politech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import ru.politech.labs.lab1.Main;

public class GUI extends JFrame {

    // Создаем элементы окна
    private JButton button1 = new JButton("lab 1");
    private JButton button2 = new JButton("lab 2");
    private JButton button3 = new JButton("lab 3");
    private JButton button4 = new JButton("lab 4");
    private JPanel main_panel = new JPanel();
    private JPanel panel = new JPanel();
    private JTextField input1 = new JTextField();
    private JTextField input2 = new JTextField();
    private JTextField input3 = new JTextField();
    private JLabel label = new JLabel();
    static public JTextArea textArea = new JTextArea(10,6);
    private JScrollPane scroll = new JScrollPane(textArea);

    /**
     * Вешаем обработчики событий
     */
    private void addListeners()
    {
        button1.addMouseListener(new MouseListener() {
            /**
             * Обрабатыаем событие клика на 1 кнопку
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.setText("");
                String[] args=new String[3];
                args[0]= input1.getText();
                args[1]=input2.getText();
                args[2]=input3.getText();
                Main.main(args);
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        button2.addMouseListener(new MouseListener() {
            /**
             * Обрабатыаем событие клика на 2 кнопку
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.setText("");
                String[] args = new String[1];
                args[0] = input1.getText();
                ru.politech.labs.lab2.Main.main(args);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        button3.addMouseListener(new MouseListener() {
            /**
             * Обрабатыаем событие клика на 3 кнопку
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.setText("");
                String[] args = new String[1];
                args[0] = input1.getText();
                try {
                    ru.politech.labs.lab3.Main.main(args);
                }
                catch (Exception ex) {
                    textArea.setText("Input Error!");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        button4.addMouseListener(new MouseListener() {
            /**
             * Обрабатыаем событие клика на 4 кнопку
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.setText("");
                String[] args = new String[2];
                args[0] = input1.getText();
                args[1] = input2.getText();
                ru.politech.labs.lab4.Main.main(args);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    /**
     * Настраиваем окно и располагаем на нем элементы
     */
    GUI()
    {
        super.setSize(640,480);
        super.setTitle("lab 5");
        main_panel.setVisible(true);
        super.add(main_panel); // Добавляем нашу панель
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        main_panel.setLayout(new GridBagLayout());
        panel.setLayout(new GridBagLayout());
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        textArea.setEditable(false);

        // Регистрируем обработчики
        addListeners();

        // Добавляем кнопки
        main_panel.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 15, 0), 40, 20));

        main_panel.add(button2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 15, 0), 40, 20));

        main_panel.add(button3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 15, 0), 40, 20));

        main_panel.add(button4, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 15, 0), 40, 20));

        main_panel.add(input1, new GridBagConstraints(0,1, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 30, 20));
        main_panel.add(input2, new GridBagConstraints(1,1, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 30, 20));
        main_panel.add(input3, new GridBagConstraints(2,1, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 30, 20));

        // Добавляем скролл
        main_panel.add(scroll, new GridBagConstraints(0,2, 4, 100, 0.0, 0.0, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 40, 20));
        super.setVisible(true); // Делаем видимым окно
        super.setResizable(false); // Запрещаем изменять размер
        main_panel.setVisible(true);

    }
}
