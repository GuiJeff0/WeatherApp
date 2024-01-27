package assets;

import javax.swing.SwingUtilities;

public class AppLauncher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				///Display our weather app gui
				
				new WeatherAppGui().setVisible(true);
				
			}
			
		});
	}
}
