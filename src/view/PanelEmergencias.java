package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelEmergencias extends JPanel{

	private Image imagen;
	public PanelEmergencias() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder("panel de Emergencias"));
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			imagen=ImageIO.read(new File("src/imagenes/emergencias.jpeg"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"no se encontro la imagen");
			
		}
		g.drawImage(imagen,0,0,this);

	}
}
