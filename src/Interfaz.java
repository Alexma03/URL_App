import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textoEntrada;
	private CodigoPaginaWeb paginaWeb = new CodigoPaginaWeb();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Dialog", Font.BOLD, 17));
		setTitle("Alejandro Marcos");

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(212, 212, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textoEntrada = new JTextField();
		textoEntrada.setFont(new Font("Tahoma", Font.BOLD, 15));
		textoEntrada.setBounds(22, 34, 688, 41);
		contentPane.add(textoEntrada);
		textoEntrada.setColumns(10);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 105, 867, 413);
		contentPane.add(tabbedPane);

		JPanel Ping = new JPanel();
		tabbedPane.addTab("Ping", null, Ping, null);
		Ping.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_4.setBounds(0, 0, 862, 386);
		Ping.add(scrollPane_4);
		
				JLabel lbl_salidaPing = new JLabel("Ping");
				scrollPane_4.setViewportView(lbl_salidaPing);
				lbl_salidaPing.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lbl_salidaPing.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaPing.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_salidaPing.setBackground(new Color(128, 0, 255));

		JPanel Tracert = new JPanel();
		tabbedPane.addTab("Tracert", null, Tracert, null);
		Tracert.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_3.setBounds(0, 0, 862, 386);
		Tracert.add(scrollPane_3);
		
				JLabel lbl_salidaTracert = new JLabel("Tracert");
				scrollPane_3.setViewportView(lbl_salidaTracert);
				lbl_salidaTracert.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lbl_salidaTracert.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaTracert.setHorizontalAlignment(SwingConstants.LEFT);

		JPanel Nslookup = new JPanel();
		tabbedPane.addTab("Nslookup", null, Nslookup, null);
		Nslookup.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(0, 0, 862, 386);
		Nslookup.add(scrollPane_1);
		
				JLabel lbl_salidaNslookup = new JLabel("NsLookUp");
				scrollPane_1.setViewportView(lbl_salidaNslookup);
				lbl_salidaNslookup.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaNslookup.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_salidaNslookup.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JPanel Curl = new JPanel();
		tabbedPane.addTab("Curl", null, Curl, null);
		Curl.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 0, 862, 386);
		Curl.add(scrollPane);
		
				JLabel lbl_salidaCurl = new JLabel("Curl");
				scrollPane.setViewportView(lbl_salidaCurl);
				lbl_salidaCurl.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaCurl.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_salidaCurl.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JPanel Telnet = new JPanel();
		tabbedPane.addTab("Telnet", null, Telnet, null);
		Telnet.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(0, 0, 862, 386);
		Telnet.add(scrollPane_2);
		
				JLabel lbl_salidaTelnet = new JLabel("Telnet");
				scrollPane_2.setViewportView(lbl_salidaTelnet);
				lbl_salidaTelnet.setVerticalAlignment(SwingConstants.TOP);
				lbl_salidaTelnet.setHorizontalAlignment(SwingConstants.LEFT);
				lbl_salidaTelnet.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PestanaAyuda().PestanaAyuda();
			}
		});
		btnAyuda.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAyuda.setBounds(22, 549, 142, 41);
		contentPane.add(btnAyuda);

		/* Le damos funcionalidad al boton aceptar */
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					lbl_salidaPing.setText(paginaWeb.ping(textoEntrada.getText()));

					lbl_salidaTracert.setText(paginaWeb.tracert(textoEntrada.getText()));
					lbl_salidaTracert.setText(lbl_salidaTracert.getText() + paginaWeb.tracertNombre(textoEntrada.getText()));

					lbl_salidaNslookup.setText(paginaWeb.nslookup(textoEntrada.getText()));
					
					lbl_salidaCurl.setText(paginaWeb.curl(textoEntrada.getText()));
					
					//lbl_salidaTelnet.setText(paginaWeb.telnet(textoEntrada.getText()));

			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAceptar.setBounds(747, 549, 142, 41);
		contentPane.add(btnAceptar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Limpiamos el texto entrada
				textoEntrada.setText("");
				
				//Limpiamos la pesta???a ping
				lbl_salidaPing.setText("");

				//Limpiamos la pesta???a tracert
				lbl_salidaTracert.setText("");
				
				//Limpiamos la pesta???a nslookup
				lbl_salidaNslookup.setText("");
				
				//Limpiamos la pesta???a Curl
				lbl_salidaCurl.setText("");
				
				//Limpiamos la pesta???a Telnet
				lbl_salidaTelnet.setText("");
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpiar.setBounds(747, 34, 142, 41);
		contentPane.add(btnLimpiar);
		

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBounds(568, 549, 142, 41);
		contentPane.add(btnCancelar);
	}

}
