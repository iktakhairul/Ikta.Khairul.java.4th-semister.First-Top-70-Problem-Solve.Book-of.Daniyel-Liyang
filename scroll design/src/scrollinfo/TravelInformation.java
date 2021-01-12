package scrollinfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.ScrollPane;
import java.awt.Point;
import javax.swing.JScrollPane;

public class TravelInformation {

	private JFrame frmTravelInformationSystem;

	/**
	 ****************** Launch the application by Main function.****************
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravelInformation window = new TravelInformation();
					window.frmTravelInformationSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}///****************** End Main function.****************

	
	
	
	
	
	/**
	 *************Actual java code Start here with JFrame*****************
	
	*/
	
	
	
	
	
	
	
	/**
	****************Call Design Console************
	 * Create the application.
	 */
	public TravelInformation() {
		initialize();
	}

	
	
	
	
	/******************** Create Design Console Properties************
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTravelInformationSystem = new JFrame();
		frmTravelInformationSystem.setForeground(UIManager.getColor("Button.foreground"));
		frmTravelInformationSystem.setTitle("Travel Information System");
		frmTravelInformationSystem.setBackground(UIManager.getColor("Button.disabledText"));
		frmTravelInformationSystem.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frmTravelInformationSystem.getContentPane().setLayout(null);
		frmTravelInformationSystem.setBounds(100, 100, 885, 586);
		frmTravelInformationSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
