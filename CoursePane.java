// Assignment #: Arizona State University Spring 2023 CSE205 #6
//         Name: Your Name
//    StudentID: Your ID
//      Lecture: Your lecture time (e.g., MWF 9:40am)
//  Description: //-- is where you should add your own code

//Note: when you submit on gradescope, you need to comment out the package line
//package yourPackageName;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class CoursePane extends HBox
{
    //GUI components
    private ArrayList<Course> courseList;
    private VBox checkboxContainer;

    //Step 1.1: declare any necessary instance variables here
    //----

    //constructor
    public CoursePane()
    {
        //step 1.2: initialize instance variables
        //----
        

        Label labelLeft = new Label("Add Course(s)");
        labelLeft.setTextFill(Color.BLUE);
        labelLeft.setFont(Font.font(null, 14));

        Label labelRight = new Label("Course(s) Enrolled");
        labelRight.setTextFill(Color.BLUE);
        labelRight.setFont(Font.font(null, 14));

        //set up the layout. Note: CoursePane is a HBox and contains
        //leftPane, centerPane and rightPane. Pick proper layout class
        //and use nested sub-pane if necessary, then add each GUI components inside.

        //step 1.3: create and set up the layout of the leftPane, leftPane contains a top label, the center sub-pane
        //and a label show at the bottom
        //----


        //step 1.4: create and set up the layout of the centerPane which holds the two buttons
		//----


        //step 1.5: create and set up the layout of the rightPane, rightPane contains a top label,
        //checkboxContainer and a label show at the bottom
        //----

        //CoursePane is a HBox. Add leftPane, centerPane and rightPane inside
        this.setPadding(new Insets(10, 10, 10, 10));
        //----

        //Step 3: Register the GUI component with its handler class
        //----

    } //end of constructor

    //step 2.1: Whenever a new Course is added or one or several courses are dropped/removed, this method will
    //1) clear the original checkboxContainer;
    //2) create a CheckBox for each Course object inside the courseList, and also add it inside the checkboxContainer;
    //3) register the CheckBox with the CheckBoxHandler.
    public void updateCheckBoxContainer()
    {
        checkboxContainer.getChildren().clear();
        //----
        //----
    }

    //Step 2.2: Create a ButtonHandler class
    private class ButtonHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            //----

            try {
					if (//everything is entered correctly and the "Add =>" button is pressed
              	    {
                	   //need to check whether the course already exist inside the courseList or not
                	   if (//it's a new course)
                	   {
						   //----
					   }
					   else //a duplicated one
					   {
						   //show error message
						   //----
					   }

                    }

                   //Clear all the text fields and prepare for the next entry;
                   //----

                   else if ( //">=" button is pressed, but one of the text field is empty
                  {
                    //----
               	  }

                else if ( //when "Drop Course" button is pushed.)
                {
                    //----
                }
                else  //  for all other invalid actions, thrown an exception and it will be caught
                {
					//----
				}

            } //end of try

            catch(NumberFormatException ex)
            {
                //----
            }
            catch(Exception exception)
            {
                //----
            }
        } //end of handle() method
    } //end of ButtonHandler class

    ////Step 2.3: A ComboBoxHandler
    private class ComboBoxHandler implements EventHandler<ActionEvent>
    {
       //----

    }//end of ComboBoxHandler

    //Step 2.4: A CheckBoxHandler
    private class CheckBoxHandler implements EventHandler<ActionEvent>
    {
        // Pass in a Course object so that we know which course is associated with which CheckBox
        private Course oneCourse;

        //constructor
        public CheckBoxHandler(Course oneCourse)
        {
           //----
        }
        public void handle(ActionEvent e)
        {
            //----
        }
    }//end of CheckBoxHandler

} //end of CoursePane class