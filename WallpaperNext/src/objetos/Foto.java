package objetos;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.net.MalformedURLException;
import java.net.URL;

public class Foto {

	public String link;
	public String descricao;
	protected int pastaId; 
	
	public Foto(String link, String descricao) {
		super();
		JPanel panel = new JPanel();
		ImageIcon img;
		
		try {
			img = new ImageIcon(new URL("http://image...."));
			JLabel jlPic = new JLabel(img);
			panel.add(jlPic);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		this.link = link;
		this.descricao = descricao;
	}
	

}
