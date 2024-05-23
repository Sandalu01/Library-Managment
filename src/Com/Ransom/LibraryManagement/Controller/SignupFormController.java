package Com.Ransom.LibraryManagement.Controller;

import Com.Ransom.LibraryManagement.DB.Database;
import Com.Ransom.LibraryManagement.Model.Member;
import Com.Ransom.LibraryManagement.Model.memberRegister;
import Com.Ransom.LibraryManagement.Utill.Security.PasswordManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupFormController {
    public AnchorPane Signupcontext;
    public TextField txtfirstname;
    public TextField txtlastname;
    public TextField txtemail;
    public PasswordField txtpassword;

    public void SignUpOnAction(ActionEvent actionEvent) throws IOException {
        String First=txtfirstname.getText();
        String Last=txtlastname.getText();
        String email=txtemail.getText().toLowerCase();;
        String password=new PasswordManager().encryption(txtpassword.getText().trim());
        Database.memeberregistertable.add(new memberRegister(First,Last,email,password));
        new Alert(Alert.AlertType.INFORMATION,"Welcome to Library dashBoard ").show();
        SetUi("DashBoardForm");

    }

    public void AlreadyhaveOnAction(ActionEvent actionEvent) throws IOException {
        SetUi("LoginForm");

    }

    private void SetUi(String location) throws IOException {
        Stage stage1 = (Stage) Signupcontext.getScene().getWindow();
        stage1.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/" + location + ".fxml"))
        ));
        stage1.centerOnScreen();

    }


}
