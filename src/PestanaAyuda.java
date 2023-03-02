import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PestanaAyuda extends JFrame {

	private JPanel contentPane;
	private String info;
	private Interfaz paginaWeb1 = new Interfaz();	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PestanaAyuda frame = new PestanaAyuda();
					frame.setVisible(true);
					frame.pack();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JTextArea textArea = new JTextArea(10, 50);
	/**
	 * Create the frame.
	 */
	public void PestanaAyuda() {
        JFrame ventanaAyuda = new JFrame("Ayuda");
        ventanaAyuda.setSize(600, 400);
        ventanaAyuda.setLocationRelativeTo(this);
        ventanaAyuda.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton acercaDeButton = new JButton("Acerca de");
        acercaDeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PestanaAcercaDe acercaDe = new PestanaAcercaDe();
                acercaDe.setVisible(true);
                setLocationRelativeTo(null);
            }
        });
        JTabbedPane pestañasAyuda = new JTabbedPane();

        JPanel panelPing = new JPanel();
        panelPing.setLayout(new BoxLayout(panelPing, BoxLayout.Y_AXIS));
        panelPing.add(new JLabel("Comando Ping"));
        panelPing.add(new JLabel("Este comando permite verificar la conectividad con un host remoto."));
        panelPing.add(new JLabel("Ejemplo: ping www.google.com"));
        pestañasAyuda.addTab("Ping", panelPing);

        JPanel panelTracert = new JPanel();
        panelTracert.setLayout(new BoxLayout(panelTracert, BoxLayout.Y_AXIS));
        panelTracert.add(new JLabel("Comando Tracert"));
        panelTracert.add(new JLabel("Este comando muestra la ruta que sigue un paquete de red hasta un host remoto."));
        panelTracert.add(new JLabel("Ejemplo: tracert www.google.com"));
        pestañasAyuda.addTab("Tracert", panelTracert);

        JPanel panelNslookup = new JPanel();
        panelNslookup.setLayout(new BoxLayout(panelNslookup, BoxLayout.Y_AXIS));
        panelNslookup.add(new JLabel("Comando Nslookup"));
        panelNslookup.add(new JLabel("Este comando permite consultar los registros DNS de un dominio."));
        panelNslookup.add(new JLabel("Ejemplo: nslookup www.google.com"));
        pestañasAyuda.addTab("Nslookup", panelNslookup);

        JPanel panelCurl = new JPanel();
        panelCurl.setLayout(new BoxLayout(panelCurl, BoxLayout.Y_AXIS));
        panelCurl.add(new JLabel("Comando Curl"));
        panelCurl.add(new JLabel("Este comando permite realizar peticiones HTTP a un servidor web."));
        panelCurl.add(new JLabel("Ejemplo: curl www.google.com"));
        pestañasAyuda.addTab("Curl", panelCurl);

        JPanel panelTelnet = new JPanel();
        panelTelnet.setLayout(new BoxLayout(panelTelnet, BoxLayout.Y_AXIS));
        panelTelnet.add(new JLabel("Comando Telnet"));
        panelTelnet.add(new JLabel("Este comando permite conectarse a un servidor remoto utilizando el protocolo Telnet."));
        panelTelnet.add(new JLabel("Ejemplo: telnet www.google.com 80"));
        pestañasAyuda.addTab("Telnet", panelTelnet);

        ventanaAyuda.getContentPane().add(pestañasAyuda);
        ventanaAyuda.add(acercaDeButton, BorderLayout.PAGE_END);
        ventanaAyuda.setVisible(true);

    }
}