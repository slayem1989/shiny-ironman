package client.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome frame = new AdminHome();
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
	public AdminHome() {
		setTitle("Welcome Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBackground(SystemColor.inactiveCaption);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(35, Short.MAX_VALUE)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JPanel welcome = new JPanel();
		welcome.setBackground(SystemColor.inactiveCaption);
		tabbedPane.addTab("Home", null, welcome, null);
		
		JLabel lblCollaborationOfThemasses = new JLabel("Collaboration Of TheMasses");
		welcome.add(lblCollaborationOfThemasses);
		
		JPanel manageProjectPanel = new JPanel();
		manageProjectPanel.setBackground(SystemColor.inactiveCaption);
		tabbedPane.addTab("Manage Projects", null, manageProjectPanel, null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GroupLayout gl_manageProjectPanel = new GroupLayout(manageProjectPanel);
		gl_manageProjectPanel.setHorizontalGroup(
			gl_manageProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_manageProjectPanel.createSequentialGroup()
					.addGap(63)
					.addComponent(btnNewButton)
					.addContainerGap(114, Short.MAX_VALUE))
		);
		gl_manageProjectPanel.setVerticalGroup(
			gl_manageProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_manageProjectPanel.createSequentialGroup()
					.addGap(60)
					.addComponent(btnNewButton)
					.addContainerGap(118, Short.MAX_VALUE))
		);
		manageProjectPanel.setLayout(gl_manageProjectPanel);
		
		JPanel manageAccount = new JPanel();
		manageAccount.setBackground(SystemColor.inactiveCaption);
		manageAccount.setToolTipText("Manage Projects");
		tabbedPane.addTab("Manage Account", null, manageAccount, null);
		GroupLayout gl_manageAccount = new GroupLayout(manageAccount);
		gl_manageAccount.setHorizontalGroup(
			gl_manageAccount.createParallelGroup(Alignment.LEADING)
				.addGap(0, 321, Short.MAX_VALUE)
		);
		gl_manageAccount.setVerticalGroup(
			gl_manageAccount.createParallelGroup(Alignment.LEADING)
				.addGap(0, 201, Short.MAX_VALUE)
		);
		manageAccount.setLayout(gl_manageAccount);
		
		JPanel manageReclamation = new JPanel();
		manageReclamation.setBackground(SystemColor.inactiveCaption);
		tabbedPane.addTab("Manage Reclamation", null, manageReclamation, null);
		GroupLayout gl_manageReclamation = new GroupLayout(manageReclamation);
		gl_manageReclamation.setHorizontalGroup(
			gl_manageReclamation.createParallelGroup(Alignment.LEADING)
				.addGap(0, 321, Short.MAX_VALUE)
		);
		gl_manageReclamation.setVerticalGroup(
			gl_manageReclamation.createParallelGroup(Alignment.LEADING)
				.addGap(0, 201, Short.MAX_VALUE)
		);
		manageReclamation.setLayout(gl_manageReclamation);
		
		JPanel manageCHallenge = new JPanel();
		manageCHallenge.setBackground(SystemColor.inactiveCaption);
		tabbedPane.addTab("Manage Challenge", null, manageCHallenge, null);
		GroupLayout gl_manageCHallenge = new GroupLayout(manageCHallenge);
		gl_manageCHallenge.setHorizontalGroup(
			gl_manageCHallenge.createParallelGroup(Alignment.LEADING)
				.addGap(0, 321, Short.MAX_VALUE)
		);
		gl_manageCHallenge.setVerticalGroup(
			gl_manageCHallenge.createParallelGroup(Alignment.LEADING)
				.addGap(0, 201, Short.MAX_VALUE)
		);
		manageCHallenge.setLayout(gl_manageCHallenge);
		
		JPanel Statistic = new JPanel();
		Statistic.setBackground(SystemColor.inactiveCaption);
		tabbedPane.addTab("Statistic", null, Statistic, null);
		contentPane.setLayout(gl_contentPane);
	}
}
