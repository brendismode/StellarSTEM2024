import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.text.FontWeight;
import java.util.ArrayList;

import javafx.scene.layout.VBox;

import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;

// Project Team Members: Yasmin Sawaf, Yasmin Sanchez-calderon, Hayley Nguyen, Brenda Levya
// Date : 2-10-2024
// Description: this is StellarSTEM

// Main class that extends the Application class provided by JavaFX
public class JavaFXmain extends Application {
	VBox homeScene;// was startScene
	VBox storiesScene;
	VBox eventsScene;
	VBox gamesScene;
	Integer score = 0 ;
// menu bar .../
    Button storyButton = new Button("story");
	Button gamesButton = new Button("games");
	Button eventsButton = new Button ("events");
	Button homeButton = new Button("home");

	Button q1ChoiceA = new Button();
	Button q1ChoiceB = new Button();
	Button q1ChoiceC = new Button();
	Button q2ChoiceA = new Button();
	Button q2ChoiceB = new Button();
	Button q2ChoiceC = new Button();
	Button q3ChoiceA = new Button();
	Button q3ChoiceB = new Button();
	Button q3ChoiceC = new Button();

	String correctAnswer1 ="b) The scientific explanation for the origin of the universe";
	String correctAnswer2 ="c) Billions of years ago";
	String correctAnswer3 ="b) Extremely hot and dense";

	// 1.Add a button that has an image here
	// Load the image for the button
	Image buttonImage = new Image("stellar.png");  // Replace with the path to your image

	// Create an ImageView for the image
	ImageView buttonImageView = new ImageView(buttonImage);
	// Create a Button with the ImageView as its graphic
	// Add the button to your HBox

	HBox fakeMenuBar = new HBox(buttonImageView, homeButton, eventsButton, gamesButton, storyButton);

	BorderPane borderPane = new BorderPane();
	VBox mainPane;
	ArrayList<String> faqs = new ArrayList<String>();
	public void addToFAQs(String Question, String Answer){
		faqs.add(Question);
		faqs.add(Answer);

	}
	// Create a ListView to display the FAQs
	ListView<String> faqListView = new ListView<>();

	// The main method to launch the JavaFX application
	public static void main(String[] args) {
		launch(args);
	}


	// Method to create the start screen layout
	public VBox homeScreen() {
		storiesScene = storiesScreen();
		storyButton.setOnAction(new StoriesButtonHandler());
		gamesButton.setOnAction(new GamesButtonHandler());
		homeButton.setOnAction(new HomeButtonHandler());
		eventsButton.setOnAction(new EventsButtonHandler());


		addToFAQs("Who are we?","We are a group of computer Science students and enthusiasts who love using our knowledge to empower women in STEM!");
		addToFAQs("Why StellarSTEM?","Allot of intelligent women in stem go unrecognised for their impressive achievements, We would love to use this platform shed some light onto those amazing people! ");
		addToFAQs("Who can join?","Women or non-binary students/professionals are more than welcomed to join. ");
		addToFAQs("If I am not pursuing a degree in STEM, can I still join?","YESS!");
        for (String faq : faqs) {
            faqListView.getItems().add(faq);
        }
		Image slideShowGif = new Image("womenGIF.gif");
		ImageView slideShowImageView = new ImageView(slideShowGif);
		Image aboutUsGif = new Image("aboutUs.gif");
		ImageView aboutUsImageView = new ImageView(aboutUsGif);
		aboutUsImageView.setFitWidth(550);  // Set the desired width
		aboutUsImageView.setPreserveRatio(true);  // Preserve the aspect ratio
		aboutUsImageView.setSmooth(true);
		aboutUsImageView.setCache(true);
		//to run: mvn clean compile exec:java

        HBox hBox= new HBox(50,aboutUsImageView,faqListView  );
		hBox.setAlignment(Pos.CENTER);
		VBox vbox = new VBox(20, slideShowImageView, hBox);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(50));
		vbox.setStyle("-fx-background-color: #244388;");
		ScrollPane scrollPane = new ScrollPane(vbox);
		scrollPane.setFitToWidth(true);
		scrollPane.setFitToHeight(true);

		return new VBox(scrollPane);  // Wrap the ScrollPane in a VBox for proper resizing
	}

	public VBox eventsScreen(){
		VBox events = new VBox(20); // Vertical spacing between elements is 20
//		Label helloLabel = new Label("Hello events screen");
//		Image eventsSource = new

		Image eventsSource = new Image("upcomingevents.gif");
		ImageView slideShowImageView = new ImageView(eventsSource);
		Image eventsSources = new Image("upcomingevents2.gif");
		ImageView eventRes = new ImageView(eventsSources);
		eventRes.setFitWidth(700);  // Set the desired width
		eventRes.setPreserveRatio(true);  // Preserve the aspect ratio
		eventRes.setSmooth(true);
		eventRes.setCache(true);

		//to run: mvn clean compile exec:java
		HBox hBox= new HBox(50,eventRes );
		hBox.setAlignment(Pos.CENTER);
		VBox vbox = new VBox(20, slideShowImageView, hBox);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(50));
		vbox.setStyle("-fx-background-color: rgba(78,37,166,0.76);");
		ScrollPane scrollPane = new ScrollPane(vbox);
		scrollPane.setFitToWidth(true);
		scrollPane.setFitToHeight(true);

		return new VBox(scrollPane);  // Wrap the ScrollPane in a VBox for proper resizing
	}

	public VBox storiesScreen(){
		VBox stories = new VBox(50);
		Image storiesDisplay = new Image("joy.png");
		ImageView slideSI = new ImageView(storiesDisplay);
		Image storiesDisplay2 = new Image("katya.png");
		ImageView storyRes = new ImageView(storiesDisplay2);
		Image storyokay = new Image("resource.png");
		ImageView storyRes2 = new ImageView(storyokay);

//		storyRes.setFitWidth();  // Set the desired width
//		slideSI.setFitWidth();
//		storyRes2.setFitWidth(700);
		storyRes.setPreserveRatio(true);  // Preserve the aspect ratio
		storyRes.setSmooth(true);
		storyRes.setCache(true);


		HBox ahBox= new HBox(50, storyRes);
		HBox bhBox = new HBox(50, storyRes2);
		ahBox.setAlignment(Pos.CENTER);
		VBox vbox = new VBox(50, slideSI, ahBox,storyRes2);
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(50));
		vbox.setStyle("-fx-background-color: rgba(78,37,166,0.76);");
		ScrollPane scrollPane = new ScrollPane(vbox);
		scrollPane.setFitToWidth(true);
		scrollPane.setFitToHeight(true);

		return new VBox(scrollPane);
//
//		return null;
	}


	public VBox gameScreen() {
		WebView webView = new WebView();
		WebEngine webEngine = webView.getEngine();

		String videoURL = "https://www.youtube.com/embed/rXER39AEE9k?si=W0wNJxR3a2v1PTmX";
		String embedCode = "<iframe width='800' height='600' src='" + videoURL + "' frameborder='0' allowfullscreen></iframe>";
		webEngine.loadContent(embedCode, "text/html");

		// Create labels for additional information
		Label label1 = new Label("What is the Big Bang Theory?");
		q1ChoiceA.setText("a) A popular TV show about scientists and their adventures");
        q1ChoiceA.setOnAction(new Question1Handler());
		q1ChoiceB.setText("b) The scientific explanation for the origin of the universe");
		q1ChoiceB.setOnAction(new Question1Handler());
		q1ChoiceC.setText("c) A theory about the formation of giant stars");
		q1ChoiceC.setOnAction(new Question1Handler());

		Label label2 = new Label("When did scientists believe the Big Bang happened?");
		q2ChoiceA.setText("a) Yesterday");
		q2ChoiceA.setOnAction(new Question2Handler());

		q2ChoiceB.setText("b) Millions of years ago");
		q2ChoiceB.setOnAction(new Question2Handler());
		q2ChoiceC.setText("c) Billions of years ago");
		q2ChoiceC.setOnAction(new Question2Handler());
		Label label3 = new Label("What was the universe like right after the Big Bang?");
		q3ChoiceA.setText("a) Filled with dinosaurs");
		q3ChoiceA.setOnAction(new Question3Handler());
		q3ChoiceB.setText("b) Extremely hot and dense");
		q3ChoiceB.setOnAction(new Question3Handler());
		q3ChoiceC.setText("c) Empty and cold");
		q2ChoiceC.setOnAction(new Question3Handler());

		Font font = Font.font("Arial", FontWeight.BOLD, 25); // Specify the font, weight, and size
		label1.setFont(font);
		// Create an HBox to hold the labels
		VBox labelsBox = new VBox(10, label1,q1ChoiceA,q1ChoiceB,q1ChoiceC, label2,q2ChoiceA ,q2ChoiceB , q2ChoiceC,label3,q3ChoiceA ,q3ChoiceB , q3ChoiceC);
		labelsBox.setAlignment(Pos.CENTER);

		// Create an HBox to hold the WebView
		HBox hBox = new HBox(webView);
		hBox.setAlignment(Pos.CENTER);

		// Create a VBox to hold both the WebView and labels
		VBox vBox = new VBox(20, hBox, labelsBox);
		vBox.setStyle("-fx-background-color: #244388;");
	//	HBox hBox = new HBox(20, VBox, labelsBox);
	//	vBox.setStyle("-fx-background-color: #244388;");

		// Add padding to separate content from the edges
		vBox.setPadding(new Insets(50, 20, 50, 20));

		ScrollPane scrollPane = new ScrollPane(vBox);
		scrollPane.setFitToWidth(true);
		scrollPane.setFitToHeight(true);

		return new VBox(scrollPane);
	}

	// Method to switch the main pane to a different view
	public void switchPane(Pane pane) {
//		borderPane.setTop(null);
//		borderPane.setRight(null);
//		borderPane.setBottom(null);
//		borderPane.setLeft(null);
//		borderPane.setCenter(null);
//		System.out.println("in Switch");
		borderPane.setCenter(pane);
	}
	public class Question1Handler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			Button button = (Button) event.getSource();
			String text = button.getText();
			if(text.equals(correctAnswer1)){

			 button.setStyle("-fx-background-color: green;");
			 q1ChoiceA.setDisable(true);
			 q1ChoiceB.setDisable(true);
			 q1ChoiceC.setDisable(true);
			 score+=1;
			}else{
				button.setStyle("-fx-background-color: red;");
				q1ChoiceA.setDisable(true);
				q1ChoiceB.setDisable(true);
				q1ChoiceC.setDisable(true);
				score+=1;
			}
		}
	}
	public class Question2Handler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			Button button = (Button) event.getSource();
			String text = button.getText();
			if(text.equals(correctAnswer2)){

				button.setStyle("-fx-background-color: green;");
				q2ChoiceA.setDisable(true);
				q2ChoiceB.setDisable(true);
				q2ChoiceC.setDisable(true);
				score+=1;
			}else{
				button.setStyle("-fx-background-color: red;");
				q2ChoiceA.setDisable(true);
				q2ChoiceB.setDisable(true);
				q2ChoiceC.setDisable(true);

			}
		}
	}
	public class Question3Handler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			Button button = (Button) event.getSource();
			String text = button.getText();
			if(text.equals(correctAnswer3)){

				button.setStyle("-fx-background-color: green;");
				q3ChoiceA.setDisable(true);
				q3ChoiceB.setDisable(true);
				q3ChoiceC.setDisable(true);
				score+=1;
			}else{
				button.setStyle("-fx-background-color: red;");
				q3ChoiceA.setDisable(true);
				q3ChoiceB.setDisable(true);
				q3ChoiceC.setDisable(true);
				score+=1;
			}
		}
	}
	// Event handler for stories in the toolBar button
	public class StoriesButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			System.out.println("in handle");
			try {
				if (storiesScene == null) {
					storiesScene = storiesScreen();
					System.out.println("Doesnt go to button");
				}
                switchPane(storiesScene);
				System.out.println("yay it switches-stories ");
				// Go to the next scene (switch )
			} catch (NumberFormatException y) {
				System.out.println("Scene won't change, try again ");

			}
		}
	}


	// Event handler for stories in the toolBar button
	public class EventsButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			System.out.println("in handle");
			try {
				if (eventsScene == null) {
					eventsScene = storiesScreen();
					System.out.println("Doesnt go to button");
				}
				switchPane(eventsScene);
				System.out.println("yay it switches-Events");
				// Go to the next scene (switch )
			} catch (NumberFormatException y) {
				System.out.println("Scene won't change, try again ");

			}
		}
	}


	// Event handler for stories in the toolBar button
	public class HomeButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			System.out.println("in handle");
			try {
				if (homeScene == null) {
					homeScene = homeScreen();
					System.out.println("Doesnt go to button");
				}
				switchPane(homeScene);
				System.out.println("yay it switches-Home");
				// Go to the next scene (switch )
			} catch (NumberFormatException y) {
				System.out.println("Scene won't change, try again ");

			}
		}
	}

//	 Event handler for stories in the toolBar button
	public class GamesButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			System.out.println("in handle");
			try {
				if (gamesScene == null) {
					gamesScene = gameScreen();
					System.out.println("Doesnt go to button");
				}
				switchPane(gamesScene);
				System.out.println("yay it switches-Games");
				// Go to the next scene (switch )
			} catch (NumberFormatException y) {
				System.out.println("Scene won't change, try again ");

			}
		}
	}

	// Method to start the JavaFX application

//	public void start(Stage primaryStage) throws Exception {
//		//button handlers
//		homeScene = homeScreen();
//		storiesScene = storiesScreen();
//		storiesOption.setOnAction(new StoriesButtonHandler() {
//			@Override
//			public void handle(ActionEvent actionEvent) {
//
//			}
//		});



	@Override
	public void start(Stage primaryStage) {

		homeScene = homeScreen(); // This is your initial screen
		storiesScene = storiesScreen(); // This potentially could be initialized lazily
		eventsScene = eventsScreen();
		gamesScene = gameScreen();
		// Setting up menu actions

		//storiesOption.setOnAction(event -> switchPane(storiesScene));
		// Add similar handlers for eventsOption and gameOption as needed

		// Setup the toolbar and add to the border pane
//		toolBar.getMenus().addAll(homeOption, gameOption, eventsOption, storiesOption);
		borderPane.setTop(fakeMenuBar);

		// Initially display the home scene
		switchPane(homeScene); // Start with the home scene

		// Scene and Stage setup
		Scene theScene = new Scene(borderPane, 1100, 900);
		primaryStage.setTitle("StellarSTEM");
		primaryStage.setScene(theScene);
		primaryStage.show();

		// Application exit setup
		primaryStage.setOnCloseRequest(event -> {
			Platform.exit();
			System.exit(0);
		});



		primaryStage.setTitle("StellarSTEM");
		mainPane =homeScene;

		// Set up the application to exit, SO THAT I DONT HAVE TO KEEP PRESSING CNTRL^C
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent t) {
				Platform.exit();
				System.exit(0);
			}
		});

//		borderPane.setTop(null);
//		borderPane.setRight(null);
//		borderPane.setBottom(null);
//		borderPane.setLeft(null);
//		borderPane.setCenter(null);

		borderPane.setCenter(mainPane);
		borderPane.setTop(fakeMenuBar);
//		Scene theScene = new Scene(borderPane, 1100, 900);
//		theScene = new Scene(borderPane, 1100, 900);
//		primaryStage.setScene(theScene);
//		primaryStage.show();

		primaryStage.setResizable(true);
//		primaryStage.setScene(theScene);
		primaryStage.show();
	}
}
