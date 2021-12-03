import javax.swing.*;
import util.ShowInFrame;

public class SimpleButton extends JPanel{
	JButton b = new JButton("push this button");
	JButton b2 = new JButton("push this button too");
	JLabel l = new JLabel("000");
	JLabel l2 = new JLabel("999");
	SimpleButton() {
		add(b);
		add(l);
		add(b2);
		add(l2);
	}

	public static void main(String[] args) {
		ShowInFrame.show(new SimpleButton());
	}

}
