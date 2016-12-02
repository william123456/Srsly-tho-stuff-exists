import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RosettaStone implements ActionListener {
	static HashMap<String, String> dictionary = new HashMap<String, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton nextButton = new JButton();
	String randomKey;
	ActionListener l;

	public static void main(String[] args) {
		dictionary.put("Hello", "Mholo");
		dictionary.put("How are you?", "Unjani?");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		dictionary.put("Hello", "Mholo");
		RosettaStone rS = new RosettaStone();
		rS.UI();

	}

	String getRandomKey(HashMap<String, String> map) {
		int randomNumber = new Random().nextInt(map.size());
		ArrayList<String> list = new ArrayList<>(map.keySet());
		return list.get(randomNumber);
	}

	public void UI() {
		frame.add(panel);
		panel.add(button);
		panel.add(nextButton);
		frame.setVisible(true);
		randomKey = getRandomKey(dictionary);
		button.setText(dictionary.get(randomKey));
		nextButton.setText("Next word");
		button.addActionListener(l);
		nextButton.addActionListener(l);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(nextButton)) {
			System.out.println("test");
			button.setText(dictionary.get(randomKey));

		} else if (e.getSource().equals(button)) {
			System.out.println("test again");
			button.setText(randomKey);
		}

	}

}
