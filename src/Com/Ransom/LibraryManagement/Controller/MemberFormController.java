package Com.Ransom.LibraryManagement.Controller;

import Com.Ransom.LibraryManagement.DB.Database;
import Com.Ransom.LibraryManagement.Model.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MemberFormController {

    public AnchorPane membercontext;
    public TextField txtname;

    public TextField txtemail;
    public TextField txtphone;
    public TextField txtaddress;
    public TextField txtcity;

    public void SubmitOnAction(ActionEvent actionEvent) throws IOException {

        String name=txtname.getText();
        String email=txtemail.getText().toLowerCase();
        String telephone=txtphone.getText();
        String address=txtaddress.getText();
        String city=txtcity.getText();
        Database.memebertable.add(new Member(name,email,telephone,address,city));
        new Alert(Alert.AlertType.CONFIRMATION,"submit successfully");

        //Alert
        setui("DashBoardForm");
    }

    public void BacktoOnACtion(ActionEvent actionEvent) throws IOException {
        setui("DashBoardForm");

    }
    private void setui(String location) throws IOException
    {
        Stage stage=(Stage)membercontext.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
        ));
        stage.centerOnScreen();

    }

}
