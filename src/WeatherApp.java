import java.awt.Cursor;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;









public class WeatherApp extends JFrame {
	
	
	

/**
	 * 
	 */
	
 private static final long serialVersionUID = 1L;
 
 
public WeatherApp() {
		
		super("برنامه هواشناسی");
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
		setSize(450,650);
		
		
		setLocationRelativeTo(null);
		
		
		setLayout(null);
		
	
		setResizable(false);
		
		
		addGuiComponents();
	}
	
	

	private void addGuiComponents() {
		
	JTextField searchTextField = new JTextField();
		


		searchTextField.setBounds(15,15,350,45);
		searchTextField.setFont(new Font("Dialog" , Font.PLAIN, 24));
		add(searchTextField);
		
		
		
		
		JLabel weatherConditionImage = new JLabel (loadImage("src/daraei/cloudy.png"));
		weatherConditionImage.setBounds(0 , 120 , 450 ,300);
		add ( weatherConditionImage);
		
		
		
		
		JLabel temperatureText = new JLabel ( "10 C");
		temperatureText.setBounds(0 ,120 ,450 , 300);
		temperatureText.setFont(new Font ( "Dialog "   , Font.BOLD , 48));
		temperatureText.setHorizontalAlignment(SwingConstants.CENTER);
		add(temperatureText);
		
		
		
		
		JLabel weatherConditionDesc = new JLabel ("Cloudy");
		weatherConditionDesc.setBounds(0 , 405 , 450 , 36);
		weatherConditionDesc.setFont( new Font ("Dialog" , Font.PLAIN , 32));
		weatherConditionDesc.setHorizontalAlignment(SwingConstants.CENTER);
		add(weatherConditionDesc);
		
		
		
		
		

		JLabel HumidityImage = new JLabel ("Cloudy");
		HumidityImage.setBounds(15 , 500 , 74 , 69);
		add(HumidityImage);	
		
		
		
		
		
		
		
		JLabel  HumidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
		HumidityText.setBounds(90 , 500 , 85 , 55);
		HumidityText.setFont( new Font ("Dialog" , Font.PLAIN , 16));
		add(HumidityText);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton searchButton = new JButton(loadImage("src/daraei/search.png"));
		searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		searchButton.setBounds( 375, 14 , 45 , 45);
		
		
		
		
		
	}



	
	
	
	
	
	
	
	private ImageIcon loadImage(String resourcePath) {
		
		
	try {
		
		BufferedImage image = ImageIO.read(new File(resourcePath));		
		
		return new ImageIcon(image);
		
	} catch (IOException e) {
		
		e.printStackTrace();
		
	}
		
		System.out.println("could not find resouurce file");
	
		return null ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
