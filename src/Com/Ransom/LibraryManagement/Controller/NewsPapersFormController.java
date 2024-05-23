package Com.Ransom.LibraryManagement.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NewsPapersFormController {


    public AnchorPane newscontext;

    public void backtoOnAction(ActionEvent actionEvent) throws IOException {
        setui("DashBoardForm");
    }
    private void setui(String location) throws IOException
    {
        Stage stage=(Stage)newscontext.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
        ));
        stage.centerOnScreen();

    }

}
