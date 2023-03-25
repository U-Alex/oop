package view;

import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import presenter.Presenter;

public class DesktopUI implements View{
    private Presenter presenter;
    JTextArea ta = null;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        initUI();
    }

    @Override
    public void printText(String text) {
        ta.setText(text);
    }

    public void initUI() {
        JFrame frame = new JFrame("Блокнот");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("файл");
        mb.add(m1);
        JMenuItem m11 = new JMenuItem("Загрузить");
        m11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.load();
                presenter.showAll();
            }
        });
        JMenuItem m12 = new JMenuItem("Сохранить");
        m12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.save();
            }
        });
        m1.add(m11);
        m1.add(m12);

        JMenu m2 = new JMenu("операции");
        mb.add(m2);
        JMenuItem m21 = new JMenuItem("добавить");
        m2.add(m21);

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Введите текст");
        JLabel label2 = new JLabel("Введите срок");
        JTextField textf1 = new JTextField(20);
        JTextField textf2 = new JTextField(10);
        JButton enter = new JButton("ввод");

        panel.add(label1);
        panel.add(textf1);
        panel.add(label2);
        panel.add(textf2);
        panel.add(enter);

        ta = new JTextArea();

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);

        m21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
                enter.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        presenter.addRec(textf1.getText(), inputDate(textf2.getText()));
                        panel.setVisible(false);
                        enter.removeActionListener(this);
                        presenter.showAll();
                    }
                });
            }
        });

        frame.setVisible(true);
        panel.setVisible(false);
    }

    private Date inputDate(String text) {
        SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
        Date pDate = null;
        try {
            pDate = sdf.parse(text);
        } catch (ParseException e) {
            System.out.println("не могу понять дату, принимаю 'отсутствие срока'");
        }
        return pDate;
    }
}
