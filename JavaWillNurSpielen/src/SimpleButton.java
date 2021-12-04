import javax.swing.*;
import util.ShowInFrame;

public class SimpleButton extends JPanel{
	JButton b = new JButton("push this button");
	JButton b2 = new JButton("push this button too");
	JButton b3 = new JButton("and push this button");
	JLabel l = new JLabel("000");
	SimpleButton() {
		add(b);
		add(l);
		add(b2);
		add(b3);
	}

	public static void main(String[] args) {
		ShowInFrame.show(new SimpleButton());
	}

}
