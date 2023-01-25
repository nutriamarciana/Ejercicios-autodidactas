package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		MarcoConFuentes mimarco=new MarcoConFuentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("prueba de dibujo");
		
		LaminaConFuentes milamina=new LaminaConFuentes();
		add(milamina);
		milamina.setForeground(Color.yellow);
		milamina.setBackground(Color.DARK_GRAY);
	}
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente=new Font("Calibri",Font.BOLD,26);
		g2.setFont(mifuente);
		//g2.setColor(Color.blue);
		g2.drawString("Juan",100,100);
		
		g2.setFont(new Font("Verdana",Font.ITALIC,32));
		//g2.setColor(Color.GRAY);
		g2.drawString("Curso de Javista",100,200);
}
	
}