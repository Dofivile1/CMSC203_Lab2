


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button button_1=new Button("Hello");
	Button button_2=new Button("Howdy");
	Button button_3=new Button("Selam");
	Button button_4=new Button("Chinese");
	Button button_5=new Button("Clear");
	Button button_6=new Button("Exit");
	
	 
	
	Label myLabel=new Label("Feedback");
	
	TextField myTextField=new TextField();
	
	//  declare two HBoxes
	HBox hbox_1=new HBox();
	HBox hbox_2=new HBox();
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager data=new DataManager();
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		button_1.setOnAction(new ButtonHandler()); 
		button_2.setOnAction(new ButtonHandler()); 
		button_3.setOnAction(new ButtonHandler()); 
		button_4.setOnAction(new ButtonHandler()); 
		button_5.setOnAction(new ButtonHandler()); 
		button_6.setOnAction(new ButtonHandler()); 
		hbox_2.getChildren().addAll(myLabel,myTextField );
		
		//  add the buttons to the other HBox
		hbox_1.getChildren().addAll(button_1,button_2,button_3,button_4,button_5, button_6);
		
		hbox_1.setMargin(button_1, new Insets(6)); 
		hbox_1.setMargin(button_2, new Insets(6)); 
		hbox_1.setMargin(button_3, new Insets(6)); 
		hbox_1.setMargin(button_4, new Insets(6)); 
		hbox_1.setMargin(button_5, new Insets(6)); 
		hbox_1.setMargin(button_6, new Insets(6));
		hbox_1.setAlignment(Pos.CENTER);
		hbox_2.setAlignment(Pos.CENTER);
		
		
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hbox_1,hbox_2);
		
	}


	//Task #4:
	//  create a private inner class to handle the button clicks
	
	
	private class ButtonHandler implements EventHandler<ActionEvent>{
		

		@Override
		public void handle(ActionEvent event) {
	
		
			
			if(event.getTarget()== button_1 ) {
				myTextField.setText(data.getHello());
				
			}else if(event.getTarget()== button_2) {
				myTextField.setText(data.getHowdy());
				
			}else if(event.getTarget()== button_3) {
				myTextField.setText(data.getAhmaric());
				
			}
			else if(event.getTarget()== button_4) {
				myTextField.setText(data.getChinese());
			}
			else if(event.getTarget()==button_5) {
				myTextField.setText("");
			}else if(button_6==event.getTarget()){
				Platform.exit();
				System.exit(0); 
			}
		

					
		}
		
		
	}
}
	
