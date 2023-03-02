import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PestanaAcercaDe extends JFrame {

	private JPanel contentPane;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PestanaAcercaDe frame = new PestanaAcercaDe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PestanaAcercaDe() {
		setTitle("Acerca de");
		setFont(new Font("Dialog", Font.BOLD, 16));
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 272, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_salidaAyuda = new JLabel();
		lbl_salidaAyuda.setVerticalAlignment(SwingConstants.TOP);
		lbl_salidaAyuda.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_salidaAyuda.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_salidaAyuda.setBounds(10, 10, 238, 145);
		contentPane.add(lbl_salidaAyuda);
		setLocationRelativeTo(null);
		lbl_salidaAyuda.setText("<html><body>"
				+ "<p>Nombre de la app: SwingPaginaWeb</p>"
				+ "<p>Version: 2.0</p>"
				+ "<p>Copyright: (C) Victor Fern�ndez</p>"
				+ "<p>Autoria: Victor Fern�ndez / Cesur</p>"
				+ "</body></html>"); //Aqui a�adiremos el texto de la pesta�a ayuda
		
	}
}

