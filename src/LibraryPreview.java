import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryPreview {
    public static void main(String[] args) {
        // 创建主窗口
        JFrame frame = new JFrame("图书管理系统预览");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // 顶部标题
        JLabel titleLabel = new JLabel("图书管理系统", JLabel.CENTER);
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 40));
        titleLabel.setForeground(Color.BLUE);
        frame.add(titleLabel, BorderLayout.NORTH);

        // 中央面板 - 图书列表
        String[] columnNames = {"书名", "作者", "状态"};
        String[][] data = {
                {"Java编程思想", "付强", "可借"},
                {"数据结构与算法", "付强", "已借出"},
                {"数据库系统概念", "付强", "可借"}
        };

        JTable bookTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(bookTable);
        frame.add(scrollPane, BorderLayout.CENTER);

        // 底部按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // 创建多个功能按钮
        JButton addButton = new JButton("添加图书");
        JButton deleteButton = new JButton("删除图书");
        JButton borrowButton = new JButton("借阅图书");
        JButton returnButton = new JButton("归还图书");
        JButton searchButton = new JButton("查询图书");

        // 设置按钮样式
        Color buttonColor = new Color(70, 130, 180);
        Font buttonFont = new Font("微软雅黑", Font.PLAIN, 14);

        addButton.setBackground(buttonColor);
        addButton.setForeground(Color.WHITE);
        addButton.setFont(buttonFont);

        deleteButton.setBackground(buttonColor);
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFont(buttonFont);

        borrowButton.setBackground(buttonColor);
        borrowButton.setForeground(Color.WHITE);
        borrowButton.setFont(buttonFont);

        returnButton.setBackground(buttonColor);
        returnButton.setForeground(Color.WHITE);
        returnButton.setFont(buttonFont);

        searchButton.setBackground(buttonColor);
        searchButton.setForeground(Color.WHITE);
        searchButton.setFont(buttonFont);

        // 添加按钮点击事件
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "添加图书功能");
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "删除图书功能");
            }
        });

        borrowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "借阅图书功能");
            }
        });

        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "归还图书功能");
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "查询图书功能");
            }
        });

        // 将按钮添加到面板
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(borrowButton);
        buttonPanel.add(returnButton);
        buttonPanel.add(searchButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // 显示窗口
        frame.setVisible(true);

        System.out.println("图形界面已启动，请在屏幕上查找窗口！");
    }
}