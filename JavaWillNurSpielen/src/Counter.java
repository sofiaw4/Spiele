import javax.swing.*;
import util.ShowInFrame;
import java.awt.event.*;

public class Counter extends SimpleButton {
	int i = this.i;

	public Counter() {

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				l.setText("" + i);
			}

		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i--;
				l.setText("" + i);
			}

		});

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = 0;
				l.setText("" + i);
			}

		});

	}

	public static void main(String[] args) {
		ShowInFrame.show(new Counter());

	}

}