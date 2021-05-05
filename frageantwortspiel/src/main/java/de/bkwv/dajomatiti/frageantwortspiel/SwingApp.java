//package de.bkwv.dajomatiti.frageantwortspiel;
//
//import de.bkwv.dajomatiti.frageantwortspiel.domain.Fach;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import javax.swing.GroupLayout;
//import javax.swing.JButton;
//import javax.swing.JComponent;
//import javax.swing.JFrame;
//import java.awt.EventQueue;
//import java.awt.event.ActionEvent;
//import java.util.ArrayList;
//import java.util.List;
//
//@SpringBootApplication
//public class SwingApp extends JFrame {
//
//	@Autowired
//	FachRepository f;
//
//	public SwingApp() {
//
//		initUI();
//	}
//
//	private void initUI() {
//
//		List<Fach> result = f.findAll();
//		List<JButton> buttons = new ArrayList<>();
//
//		for(Fach fach: result){
//			JButton fachButton = new JButton(fach.getPK_FACH());
//			buttons.add(fachButton);
//		}
//
//		var quitButton = new JButton("Quit");
//
//		buttons.add(quitButton);
//
//		quitButton.addActionListener((ActionEvent event) -> {
//			System.exit(0);
//		});
//
//		JButton[] myArray = new JButton[buttons.size()];
//
//		createLayout(buttons.toArray(myArray));
//
//		setTitle("Quit button");
//		setSize(300, 200);
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
//
//	private void createLayout(JComponent... arg) {
//
//		var pane = getContentPane();
//		var gl = new GroupLayout(pane);
//		pane.setLayout(gl);
//
//		gl.setAutoCreateContainerGaps(true);
//
//		gl.setHorizontalGroup(gl.createSequentialGroup()
//				.addComponent(arg[0])
//		);
//
//		gl.setVerticalGroup(gl.createSequentialGroup()
//				.addComponent(arg[0])
//		);
//	}
//
//	public static void main(String[] args) {
//
//		var ctx = new SpringApplicationBuilder(SwingApp.class)
//				.headless(false).run(args);
//
//		EventQueue.invokeLater(() -> {
//
//			var ex = ctx.getBean(SwingApp.class);
//			ex.setVisible(true);
//		});
//	}
//}