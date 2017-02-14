package pma;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class window {

	private JFrame frame;
	private JTextField pharma;
	private JTextField medi;
	private JTextField strength;
	private JTextField barcode;
	private JTextField number;
	private JTextField dosage;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 438, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnPersonalMedicationAdvisor = new JTextPane();
		txtpnPersonalMedicationAdvisor.setBounds(133, 11, 178, 16);
		panel.add(txtpnPersonalMedicationAdvisor);
		txtpnPersonalMedicationAdvisor.setBackground(UIManager.getColor("Button.background"));
		txtpnPersonalMedicationAdvisor.setText("Personal Medication Advisor");
		
		JButton results = new JButton("Results");
		results.setBounds(335, 39, 109, 29);
		panel.add(results);
		
		JButton barcodeButton = new JButton("Barcode Entry");
		barcodeButton.setBounds(227, 39, 109, 29);
		panel.add(barcodeButton);
		
		JButton manualEntry = new JButton("Manual Entry");
		manualEntry.setBounds(123, 39, 109, 29);
		panel.add(manualEntry);
		
		JPanel manual = new JPanel();
		manual.setBounds(6, 69, 438, 191);
		panel.add(manual);
		manual.setLayout(null);
		JLabel lblNewLabel = new JLabel("Pharmaceutical Company:");
		lblNewLabel.setBounds(6, 6, 162, 16);
		manual.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Medication:");
		lblNewLabel_1.setBounds(95, 34, 73, 16);
		manual.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Strength (mg):");
		lblNewLabel_2.setBounds(79, 62, 89, 16);
		manual.add(lblNewLabel_2);
		
		JLabel lblBarcode = new JLabel("Barcode:");
		lblBarcode.setBounds(115, 90, 53, 16);
		manual.add(lblBarcode);
		
		JLabel lblNumberOfTablets = new JLabel("Number of Tablets:");
		lblNumberOfTablets.setBounds(47, 118, 121, 16);
		manual.add(lblNumberOfTablets);
		
		JLabel lblDailyDosage = new JLabel("Daily Dosage:");
		lblDailyDosage.setBounds(79, 146, 89, 16);
		manual.add(lblDailyDosage);
		
		pharma = new JTextField();
		pharma.setBounds(180, 6, 130, 26);
		manual.add(pharma);
		pharma.setColumns(10);
		
		medi = new JTextField();
		medi.setBounds(180, 29, 130, 26);
		manual.add(medi);
		medi.setColumns(10);
		
		strength = new JTextField();
		strength.setBounds(180, 57, 130, 26);
		manual.add(strength);
		strength.setColumns(10);
		
		barcode = new JTextField();
		barcode.setBounds(180, 85, 130, 26);
		manual.add(barcode);
		barcode.setColumns(10);
		
		number = new JTextField();
		number.setBounds(180, 113, 130, 26);
		manual.add(number);
		number.setColumns(10);
		
		dosage = new JTextField();
		dosage.setBounds(180, 141, 130, 26);
		manual.add(dosage);
		dosage.setColumns(10);
		
		JButton manualSubmit = new JButton("Submit");
		manualSubmit.setBounds(190, 162, 117, 29);
		manual.add(manualSubmit);
		
		JPanel profile = new JPanel();
		profile.setBounds(6, 69, 438, 191);
		panel.add(profile);
		
		JPanel barcode_1 = new JPanel();
		barcode_1.setBounds(6, 69, 438, 191);
		panel.add(barcode_1);
		barcode_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(148, 99, 130, 26);
		barcode_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 48, 130, 26);
		barcode_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBarcode_1 = new JLabel("Barcode:");
		lblBarcode_1.setBounds(83, 53, 53, 16);
		barcode_1.add(lblBarcode_1);
		
		JLabel lblDailyDosage_1 = new JLabel("Daily Dosage:");
		lblDailyDosage_1.setBounds(49, 104, 87, 16);
		barcode_1.add(lblDailyDosage_1);
		
		JButton barcodeSubmit = new JButton("Submit");
		barcodeSubmit.setBounds(158, 144, 117, 29);
		barcode_1.add(barcodeSubmit);
		
		JPanel result = new JPanel();
		result.setBounds(6, 69, 438, 191);
		panel.add(result);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBounds(6, 39, 117, 29);
		panel.add(btnProfile);
		results.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}
}