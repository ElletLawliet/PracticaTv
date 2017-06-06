import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Tv2 extends JFrame {
	Tv control = new Tv();
	private JPanel contentPane;
	private JTextField txtCanal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tv2 frame = new Tv2();
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
	public Tv2() {
		setTitle("TELEVISION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTv = new JLabel("TELEVISION");
		lblTv.setBounds(87, 25, 77, 14);
		contentPane.add(lblTv);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 60, 169, 163);
		contentPane.add(panel);
		
		JLabel lblVolumen = new JLabel("VOLUMEN: 0");
		lblVolumen.setForeground(Color.WHITE);
		lblVolumen.setBounds(10, 138, 112, 14);
		
		JLabel lblCanal = new JLabel("CANAL: 1");
		lblCanal.setForeground(Color.WHITE);
		lblCanal.setBounds(10, 11, 76, 14);
		
		JLabel lblOFF = new JLabel("O ON");
		lblOFF.setBounds(128, 138, 41, 14);
		lblOFF.setForeground(Color.RED);
		panel.setLayout(null);
		panel.add(lblCanal);
		panel.add(lblVolumen);
		panel.add(lblOFF);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 169, 163);
		panel.add(label);
		label.setIcon(new ImageIcon(Tv2.class.getResource("/imagen/fondonegro.JPG")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(244, 50, 169, 208);
		contentPane.add(panel_1);
		
		JToggleButton butAE = new JToggleButton("ENCENDER");
		
		JButton btnCambiarCanal = new JButton("Cambiar Canal");
		btnCambiarCanal.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCambiarCanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtCanal.getText().length() > 0){
					control.setCanal(Integer.parseInt(txtCanal.getText()));
					lblCanal.setText("CANAL: " + Integer.toString(control.getCanal()));
				}
				
			}
		});
		
		txtCanal = new JTextField();
		txtCanal.setColumns(10);
		
		JButton butSubirVolumen = new JButton("^");
		butSubirVolumen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				control.subirVolumen();
				lblVolumen.setText("VOLUMEN: " + Integer.toString(control.getVolumen()));
			}
		});
		
		JButton butBajarVolumen = new JButton("v");
		butBajarVolumen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				control.bajarVolumen();
				lblVolumen.setText("VOLUMEN: " + Integer.toString(control.getVolumen()));
			}
		});
		
		JButton butSubirCanal = new JButton("^");
		butSubirCanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				control.subirCanal();
				lblCanal.setText("CANAL: " + Integer.toString(control.getCanal()));
			}
		});
		
		JButton butBajarCanal = new JButton("v");
		butBajarCanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				control.bajarCanal();
				lblCanal.setText("CANAL: " + Integer.toString(control.getCanal()));
			}
		});
		
		JLabel lblVolumen_1 = new JLabel("VOLUMEN");
		
		JLabel lblCanal_1 = new JLabel("CANAL");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(24)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
										.addComponent(butSubirVolumen)
										.addComponent(butBajarVolumen, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(butBajarCanal, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
										.addComponent(butSubirCanal))
									.addGap(15))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(txtCanal, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(btnCambiarCanal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(18)
									.addComponent(lblVolumen_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblCanal_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
							.addGap(20))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(butAE)
							.addGap(42))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(butAE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCambiarCanal)
						.addComponent(txtCanal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCanal_1)
						.addComponent(lblVolumen_1))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(butSubirVolumen)
						.addComponent(butSubirCanal))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(butBajarVolumen)
						.addComponent(butBajarCanal))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblControl = new JLabel("CONTROL");
		lblControl.setBounds(310, 25, 64, 14);
		contentPane.add(lblControl);
		butAE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(butAE.isSelected()){
					butAE.setText("APAGAR");
					lblOFF.setVisible(true);
					lblCanal.setVisible(true);
					lblVolumen.setVisible(true);
					label.setIcon(new ImageIcon(Tv2.class.getResource("/imagen/reuniondn.JPG")));
					lblOFF.setText("O ON");
					lblOFF.setForeground(Color.RED);
					control.encender();
				}
				else{
					butAE.setText("ENCENDER");
					lblOFF.setVisible(false);
					lblCanal.setVisible(false);
					lblVolumen.setVisible(false);
					label.setIcon(new ImageIcon(Tv2.class.getResource("/imagen/fondonegro.JPG")));
					lblOFF.setForeground(Color.WHITE);
					control.apagar();
				}
			}
		});
		lblCanal.setVisible(false);
		lblVolumen.setVisible(false);
		lblOFF.setVisible(false);
	}
}
