// NAME: JOYADDAR MD JOBAYER
//MATRIC NO:1731833

import javafx.application.Application;                                   //These are the application
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AnimalFX extends Application {
                                                                          //I identify the scenes so I dont get an error
    Scene scene1,scene2,scene3,scene4,scene5;
    Stage window;
    @Override                  
                                                       //override the start method in the application class

    public void start(Stage primaryStage)             //Create a scene and place a button in the scene
{
                                                                           //1st quiz       
        Label firstlabel= new Label("How many tigers are there in India in 2020?");
Label reslabel= new Label();
        

Button btn= new Button("Submit");

RadioButton radio1, radio2, radio3, radio4;
radio1=new RadioButton("105");
radio2= new RadioButton("2967");
radio3= new RadioButton("2007");
radio4= new RadioButton("410");

ToggleGroup firstquestion= new ToggleGroup();

radio1.setToggleGroup(firstquestion);
radio2.setToggleGroup(firstquestion);
radio3.setToggleGroup(firstquestion);
radio4.setToggleGroup(firstquestion);

btn.setDisable(true);

radio1.setOnAction(e -> btn.setDisable(false) );
radio2.setOnAction(e -> btn.setDisable(false) );
radio3.setOnAction(e -> btn.setDisable(false) );
radio4.setOnAction(e -> btn.setDisable(false) );

btn.setOnAction(e -> 
{

if (radio2.isSelected())
{
reslabel.setText("Correct answer");
btn.setDisable(true);
}
   
else
{
reslabel.setText("Wrong answer");
btn.setDisable(true);
}           
}
);
//2nd quiz
Label secondlabel= new Label("How long until tigers are extinct?");
Label reslabel2= new Label();
        

Button btn1= new Button("Submit");

RadioButton radio5, radio6, radio7, radio8;
radio5= new RadioButton("21 years");
radio6= new RadioButton("67 years");
radio7= new RadioButton("80 years");
radio8= new RadioButton("40 years");

ToggleGroup secondquestion= new ToggleGroup();

radio5.setToggleGroup(secondquestion);
radio6.setToggleGroup(secondquestion);
radio7.setToggleGroup(secondquestion);
radio8.setToggleGroup(secondquestion);

btn1.setDisable(true);

radio5.setOnAction(e -> btn1.setDisable(false) );
radio6.setOnAction(e -> btn1.setDisable(false) );
radio7.setOnAction(e -> btn1.setDisable(false) );
radio8.setOnAction(e -> btn1.setDisable(false) );

btn1.setOnAction(e -> 
{

if (radio7.isSelected())
{
reslabel2.setText("Correct answer");
btn1.setDisable(true);
}
   
else
{
reslabel2.setText("Wrong answer");
btn1.setDisable(true);
}           
}
);

//quiz3

Label thirdlabel= new Label("In 1900,How many tigers have been used?");
Label reslabel3= new Label();
        

Button btn2= new Button("Submit");

RadioButton radio9, radio10, radio11, radio12;
radio9= new RadioButton("25000");
radio10= new RadioButton("4000");
radio11= new RadioButton("300000");
radio12= new RadioButton("100000");

ToggleGroup thirdquestion= new ToggleGroup();

radio9.setToggleGroup(thirdquestion);
radio10.setToggleGroup(thirdquestion);
radio11.setToggleGroup(thirdquestion);
radio12.setToggleGroup(thirdquestion);

btn2.setDisable(true);

radio9.setOnAction(e -> btn2.setDisable(false) );
radio10.setOnAction(e -> btn2.setDisable(false) );
radio11.setOnAction(e -> btn2.setDisable(false) );
radio12.setOnAction(e -> btn2.setDisable(false) );

btn2.setOnAction(e -> 
{

if (radio12.isSelected())
{
reslabel3.setText("Correct answer");
btn2.setDisable(true);
}
   
else
{
reslabel3.setText("Wrong answer");
btn2.setDisable(true);
}           
}
);

VBox layout= new VBox(5);

layout.getChildren().addAll(firstlabel, radio1, radio2, radio3, radio4, btn, reslabel, secondlabel,radio5, radio6, radio7, radio8,btn1,reslabel2,
        thirdlabel,radio9, radio10, radio11, radio12,btn2,reslabel3);
        
Scene scenequiz= new Scene(layout, 500, 500);
primaryStage.setScene(scenequiz);
        
primaryStage.show();

        window = primaryStage;
       
                                                                
 
                                                                           //Element of scene 3

       Text textt1 = new Text("The tiger (Panthera tigris) is a species in the family Felidae and a member of the genus Panthera");
       Text textt2 = new Text("The tiger has a muscular body with powerful forelimbs, a large head and a tail that is about half the length of its body. "
       		+ "The tiger's skull is similar to a lion's skull, with the frontal region usually less depressed or flattened, and a slightly longer postorbital region ");
       Text textt3 = new Text("Tigers are extremely territorial though so they will fight other animals and other tigers that invade their space.");
       Text textt4 = new Text("With an average head-to-body length of 250 to 390 cm cm (8.2 to 12.8 ft) they are bigger than females at 200 to 275 cm(6.56 to 9.02 ft).");

                                                                           //I showed texts in this scene

       
                                              
       VBox lay3 =  new VBox(20);
       lay3.getChildren().addAll(textt1, textt2,textt3,textt4);             //Layout of scene 3
       Scene scene3 = new Scene(lay3,1200,600);
       
       
                                                                            //Elements of scene 4

       Text text1 = new Text("1- Tigers are the largest amongst other wild cats.");
       Text text2 = new Text("2- Tigers are nocturnal animals.");
       Text text3 = new Text("3- Tigers love to swim and play in the water ");
       Text text4 = new Text("4- Tigers rarely roar and are humble towards their group");
       Text text5 = new Text("5- Tigers live between 20-26 years in the wild.");
       
       
                                                                            //Layout of scene 4
       VBox lay4 =  new VBox(20);
       lay4.getChildren().addAll(text1, text2,text3,text4,text5);
       Scene scene4 = new Scene(lay4,500,300);
       
                                                                            //I make pictures as elements in this screen

                                                                            //Elements of scene 5

       ImageView img1 = new ImageView("https://www.ranthamborenationalpark.com/blog/wp-content/uploads/2018/03/Nocturnal-Tigers.jpg" );   

                                                                           //I positioned them in te grid
                                                                            //Picture of tigers
       GridPane.setConstraints(img1, 0, 0);
       ImageView img2 = new ImageView("https://www.ranthamborenationalpark.com/blog/wp-content/uploads/2018/03/Stripes-on-Tigers-Body.jpg");
       GridPane.setConstraints(img2, 1, 0);
       ImageView img3 = new ImageView("https://cdn.britannica.com/40/75640-050-F894DD85/tiger-Siberian.jpg");
       GridPane.setConstraints(img3, 0, 1);
       ImageView img4 = new ImageView("https://i.pinimg.com/originals/4a/90/b3/4a90b30ebeb62d35a4beb5c0b80f798d.jpg");
       GridPane.setConstraints(img4, 1, 1);

                                                                           //I set 280 for  height and 180 for width for each image
       img1.setFitHeight(280);
       img1.setFitWidth(180);
       img2.setFitHeight(280);
       img2.setFitWidth(180);
       img3.setFitHeight(280);
       img3.setFitWidth(180);
       img4.setFitHeight(280);
       img4.setFitWidth(180);
       
                                                                           //Layout of scene 5

       GridPane grid2 = new GridPane();
       grid2.setPadding(new Insets(20,10,20,10));
       grid2.setVgap(20);
       grid2.setHgap(18);
       grid2.getChildren().addAll(img1 , img2,img3,img4);
       Scene scene5 = new Scene(grid2 , 600,600);
       
                                                                           //here are the elements of the body or the main sections
                                                                           //Element of second scene
       Label label2 = new Label("Choose a section");
                                                                           //here I set the coordinations of each elements
       GridPane.setConstraints(label2, 0, 0);
       Button butn2 =  new Button ("Introduction");
       GridPane.setConstraints(butn2, 0, 1);
       butn2.setOnAction(e-> window.setScene(scene3));                      
       Button btn3 =  new Button ("Fun Facts");
       GridPane.setConstraints(btn3, 1, 1);
       btn3.setOnAction(e-> window.setScene(scene4));
       Button btn6 =  new Button ("Quiz");
       GridPane.setConstraints(btn6, 2, 1);
       btn6.setOnAction(e -> window.setScene(scenequiz));
       Button btn4 =  new Button ("Photo Gallery");
       GridPane.setConstraints(btn4, 1, 2);
       btn4.setOnAction(e -> window.setScene(scene5));
       Button btn5 =  new Button ("Exit");
       GridPane.setConstraints(btn5, 2, 2);
                                                                            //this is the fucntion that close the window, once the user clicks on this button
       btn5.setOnAction(e -> window.close());

       
                                                                           //the layout of this scene where I put everything in a grid


                                                                           //Layout of scene 2
       GridPane grid1 = new GridPane();
                                                                           //I make distance between the grid and the main screen
       grid1.setPadding(new Insets(10,10,10,10));
                                                                          //I create gap between the elements
       grid1.setVgap(10);
       grid1.setHgap(8);
                                                                          //I add all elemetns to the scene so I can see it
       grid1.getChildren().addAll(label2 ,btn6, butn2,btn3,btn4,btn5);
       Scene scene2 = new Scene(grid1 , 600,600);
       
       
                                                                          //these are the elemetns for the main screen, which are a welcome msg and a button to continue to the other page
                                                                          //elements for first scene

       Label label1 = new Label("Welcome to My Showcase About Tigers");
       Button butn1 =  new Button ("Click here to continue");
                                                                 //when the user click on the butten it will take him/her to the other page where other sections can be found
       butn1.setOnAction(e -> primaryStage.setScene(scene2));
       
                                                                          //this is the layout of the first page elements, where i put all of them in a vertical box, and I make the size of the screen as 420 by 420
                                                                          //Layout of first scene
       VBox lay1 =  new VBox(20);
       lay1.getChildren().addAll(label1 , butn1);
       Scene scene1 = new Scene(lay1,420,420);
       
                                                                          //here is the general setting of the program and how to show it

                                                                          //set general
       primaryStage.setScene(scene1);
       primaryStage.setTitle("TIGER SHOWCASE");
       primaryStage.show();                                               // Display the stage 
       
    }
      public static void main(String [] args)
      {
        launch(args);
    
    }
    
}                                                                         // End the code



// THANK YOU SIR