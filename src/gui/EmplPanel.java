package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EmplPanel extends JPanel {
  private static final long serialVersionUID = 1L;

  private JPanel jp1,jp2;
  private JLabel jLabel1;
  private JTable jTable;
  private JScrollPane jScrollPane;
  private JButton jButton1,jButton2,jButton3;

  public EmplPanel(){
    this.setLayout(new BorderLayout());
    jp1 = new JPanel();
    jp2 = new JPanel();
    jLabel1 = new JLabel("Empl management interface");
    jButton1 = new JButton("Add Empl");
    jButton2 = new JButton("Delete Empl");
    jButton3 = new JButton("Update Empl");
    jp1.add(jLabel1);
    jp2.add(jButton1);
    jp2.add(jButton2);
    jp2.add(jButton3);
    this.add(jp1,BorderLayout.NORTH);
    this.add(jp2,BorderLayout.SOUTH);

  }
}
