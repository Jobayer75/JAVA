
package animalfx;
    import javafx.application.Application;
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

public class OOP_PROJECT extends Application {
                                               //I identify the scenes so I dont get an error
    Scene scene1,scene2,scene3,scene4,scene5;
    Stage window;
    @Override
    public void start(Stage primaryStage) {
       
        window = primaryStage;
       
                                                   //I showed texts in this scene 
                                                                  //Element of scene 3
       Text textt1 = new Text("The lion (Panthera leo) is a species in the family Felidae and a member of the genus Panthera");
       Text textt2 = new Text("It is most recognisable for its muscular, deep-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail");
       Text textt3 = new Text("It is sexually dimorphic; adult male lions have a prominent mane");
       Text textt4 = new Text("With a typical head-to-body length of 184–208 cm (72–82 in) they are larger than females at 160–184 cm (63–72 in).");
       
       
                                              //Layout of scene 3
       VBox lay3 =  new VBox(20);
       lay3.getChildren().addAll(textt1, textt2,textt3,textt4);
       Scene scene3 = new Scene(lay3,1000,500);
       
       
                                              //Elements of scene 4
       Text text2 = new Text("1- Of all the big cat species in the world, lions are the most social");
       Text text3 = new Text("2- Male lions may get all of the attention with their majestic manes, but the females do the majority of the work when it comes to hunting.");
       Text text4 = new Text("3- LIONS DO NOT NEED TO DRINK EVERYDAY, BUT THEY DO NEED TO EAT");
       Text text5 = new Text("4- A lion has many physical characteristics that make it a superb hunter");
       Text text6 = new Text("5- Lions mate every two years and female lions give birth to a litter of 2-3 cubs after a four-month pregnancy.");
       
       
                                                    //Layout of scene 4
       VBox lay4 =  new VBox(20);
       lay4.getChildren().addAll(text2, text3,text4,text5,text6);
       Scene scene4 = new Scene(lay4,1000,300);
       
                              //I make pictures as elements in this screen

                              //Elements of scene 5
       ImageView img1 = new ImageView("https://images.unsplash.com/photo-1573725342230-178c824a10f2?ixlib=rb-1.2.1&w=1000&q=80" );
                                    //I positioned them in te grid
       GridPane.setConstraints(img1, 0, 0);
       ImageView img2 = new ImageView("https://lumiere-a.akamaihd.net/v1/images/tlk_listicle_1_62b7eec6.jpeg?region=0,0,1500,844");
       GridPane.setConstraints(img2, 1, 0);
       ImageView img3 = new ImageView("https://i.pinimg.com/originals/15/00/08/150008b953af2b5a2a39c998675a4b3a.jpg");
       GridPane.setConstraints(img3, 0, 1);
       ImageView img4 = new ImageView("https://cdn.mos.cms.futurecdn.net/J9KeYkEZf4HHD5LRGf799N-1200-80.jpg");
       GridPane.setConstraints(img4, 1, 1);

                                       //I set fixed height and width for eahc image
       img1.setFitHeight(200);
       img1.setFitWidth(200);
       img2.setFitHeight(200);
       img2.setFitWidth(200);
       img3.setFitHeight(200);
       img3.setFitWidth(200);
       img4.setFitHeight(200);
       img4.setFitWidth(200);
       
                                                    //Layout of scene 5

       GridPane grid2 = new GridPane();
       grid2.setPadding(new Insets(20,20,20,20));
       grid2.setVgap(20);
       grid2.setHgap(18);
       grid2.getChildren().addAll(img1 , img2,img3,img4);
       Scene scene5 = new Scene(grid2 , 600,600);
       
                                           //here are the elements of the body or the main sections
                                           //Element of second scene

       Label label2 = new Label("Choose a section");
                                            //here we set the coordinations of each elements
       GridPane.setConstraints(label2, 0, 0);
       Button btn2 =  new Button ("Introduction");
       GridPane.setConstraints(btn2, 0, 1);
      // btn2.setOnAction(e -> window.setScene(scene3));
       Button btn3 =  new Button ("Fun Facts");
       GridPane.setConstraints(btn3, 1, 1);
      // btn3.setOnAction(e -> window.setScene(scene4));
       Button btn4 =  new Button ("Photo Gallery");
       GridPane.setConstraints(btn4, 1, 2);
      // btn4.setOnAction(e -> window.setScene(scene5));
       Button btn5 =  new Button ("Exit");
       GridPane.setConstraints(btn5, 2, 2);
                                            //this is the fucntion that close the window, once the user clicks on this button
      // btn5.setOnAction(e -> window.close());
       
                                            //the layout of this scene where we put everything in a grid

                                    //Layout of scene 2
       GridPane grid1 = new GridPane();
                                       //I make distance between the grid and the main screen
       grid1.setPadding(new Insets(10,10,10,10));
                                    //I make gap between the elements
       grid1.setVgap(10);
       grid1.setHgap(8);
                             //I add all elemetns to the scene so we can see it
       grid1.getChildren().addAll(label2 , btn2,btn3,btn4,btn5);
       Scene scene2 = new Scene(grid1 , 600,600);
       
       
                                                 //these are the elemetns for the main screen, which are a welcome msg and a button to continue to the other page
                                      //elements for first scene
       Label label1 = new Label("Welciome to my caseshow about lions");
       Button btn1 =  new Button ("Click here to continue");
                                                         //when the user click on the butten it will take him/her to the other page where other sections can be found
      // btn1.setOnAction(e -> primaryStage.setScene(scene2));
       
                                                          //this is the layout of the first page elements, where we put all of them in a vertical box, and we make the size of the screen as 400 by 400
                                                        //Layout of first scene
       VBox lay1 =  new VBox(20);
       lay1.getChildren().addAll(label1 , btn1);
       Scene scene1 = new Scene(lay1,400,400);
       
                                                       //here is the general setting of the program and how to show it
                                                   //set general
       primaryStage.setScene(scene1);
       primaryStage.setTitle("Lion Showcase");
       primaryStage.show();
       
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}


    

