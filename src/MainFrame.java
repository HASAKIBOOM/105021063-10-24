import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame{
private int screenW = Toolkit.getDefaultToolkit().getScreenSize().width;
private int screenH = Toolkit.getDefaultToolkit().getScreenSize().height;
private JMenuItem jMenuItemFExit = new JMenuItem("Exit");
private JMenuBar jmb = new JMenuBar();
private JMenu jmF = new JMenu("File");
    private JMenu jmF2 = new JMenu("GOOD");
private int frmW = 500, frmH = 450;
public  MainFrame(){
initComp();
}
private void initComp(){
    this.setBounds(screenW/2 - frmW/2,screenH/2 - frmH/2, frmW ,frmH);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
this.setJMenuBar(jmb);
jmb.add(jmF);
jmF.add(jMenuItemFExit);
jmb.add(jmF2);
jMenuItemFExit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});

}
}











