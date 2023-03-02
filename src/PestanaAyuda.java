import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;


public class PestanaAyuda extends JFrame {

	private JPanel contentPane;
	//private InterfazPaginaWeb paginaWeb1 = new InterfazPaginaWeb();	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PestanaAyuda frame = new PestanaAyuda();
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
	public PestanaAyuda() {
		setTitle("Ayuda");
		setFont(new Font("Dialog", Font.BOLD, 16));
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 272, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_salidaAyuda = new JLabel();
		lbl_salidaAyuda.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_salidaAyuda.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_salidaAyuda.setBounds(10, 10, 238, 200);
		contentPane.add(lbl_salidaAyuda);
		setLocationRelativeTo(null);
		lbl_salidaAyuda.setText(""); //Aqui a�adiremos el texto de la pesta�a ayuda
		
		JButton btnAcercaDe = new JButton("Acerca de");
		btnAcercaDe.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PestanaAcercaDe acercaDe = new PestanaAcercaDe();
				acercaDe.setVisible(true);
				setLocationRelativeTo(null);
			}
		});
		btnAcercaDe.setBounds(75, 223, 98, 38);
		contentPane.add(btnAcercaDe);
	}
}
