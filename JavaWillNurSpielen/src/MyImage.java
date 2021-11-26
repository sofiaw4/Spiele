import java.awt.Toolkit;
import java.awt.Image;

public class MyImage {
	
	private String name;
	private Image img = null;
	
	public MyImage (String name) {
		this.name = name;
	}
	
	public Image get() {
		if (img == null)
			img = Toolkit.getDefaultToolkit().createImage
				(getClass().getClassLoader().getResource(name));
		return img;
	}
	

}
