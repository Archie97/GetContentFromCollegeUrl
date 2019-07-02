package scriptToHackImages;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import org.w3c.dom.Document;


public class ImageRepoDisplay extends JComponent{
	 private BufferedImage img;

	    
		public ImageRepoDisplay(URL url) throws IOException {
	        this.img = ImageIO.read(url);
	        setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));

	    }
	    @Override protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(img, 0, 0, img.getWidth(), img.getHeight(), this);

	    }
	public static void main(String[] args) throws IOException {
		
		for(int i=0;i<201;++i) {
			int rollNo = 1511981018+i;
			if (rollNo == 1511981022||rollNo == 1511981024 || rollNo == 1511981029||rollNo == 1511981036||
					rollNo == 1511981037||rollNo == 1511981045||rollNo == 1511981047) {continue;}
			String UrlString = "https://hp.chitkara.edu.in//Storage/Images/Student/"+rollNo+".jpg?zz=631";
			  final URL lenna =
				        new URL(UrlString);

				     ImageRepoDisplay image = new ImageRepoDisplay(lenna);

				    JFrame frame = new JFrame("Test");
				    frame.add(new JScrollPane(image));

				    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				    frame.setSize(1550, 1550);
				    frame.setVisible(true);
		}
	}

}
