import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class UserInfoGUI
{
private JFrame frame;
private JTextField nameField, classField;
private JCheckBox hobby1, hobby2, hobby3;
private JTextArea displayArea;
private JButton applyButton;
public UserInfoGUI() {
frame = new JFrame("User Information");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400, 400);
JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
JLabel nameLabel = new JLabel("Name: ");
nameField = new JTextField();
panel.add(nameLabel);
panel.add(nameField);
JLabel classLabel = new JLabel("Class: ");
classField = new JTextField();
panel.add(classLabel);
panel.add(classField);
 JLabel hobbiesLabel = new JLabel("Hobbies: ");
JPanel hobbiesPanel = new JPanel(new FlowLayout());
hobby1 = new JCheckBox("Reading");
hobby2 = new JCheckBox("Sports");
hobby3 = new JCheckBox("Music");
hobbiesPanel.add(hobby1);
hobbiesPanel.add(hobby2);
hobbiesPanel.add(hobby3);
panel.add(hobbiesLabel);
panel.add(hobbiesPanel);
displayArea = new JTextArea(5, 30);
displayArea.setEditable(false);
JScrollPane scrollPane = new JScrollPane(displayArea);
applyButton = new JButton("Apply");
applyButton.addActionListener(new ApplyButtonListener());
frame.add(panel, BorderLayout.NORTH);
frame.add(scrollPane, BorderLayout.CENTER);
frame.add(applyButton, BorderLayout.SOUTH);
frame.setVisible(true);
}
 class ApplyButtonListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String name = nameField.getText();
String className = classField.getText();
String hobbies = "";
if (hobby1.isSelected()) hobbies += "Reading ";
if (hobby2.isSelected()) hobbies += "Sports ";
if (hobby3.isSelected()) hobbies += "Music ";
displayArea.setText("Name: " + name + "\nClass: " + className
+ "\nHobbies: " + hobbies.trim());
}
}
public static void main(String[] args) {
SwingUtilities.invokeLater(UserInfoGUI::new);
}
}
