package Com.Ransom.LibraryManagement.Controller;

import Com.Ransom.LibraryManagement.DB.Database;
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
import java.util.Optional;

public class LoginFormController {
    public AnchorPane logincontext;
    public TextField txtemail;
    public PasswordField txtpasswors;

    public void LoginOnAction(ActionEvent actionEvent) throws IOException {
        String email = txtemail.getText().toLowerCase();
        String password = txtpasswors.getText().trim();
        Optional<memberRegister> selected = Database.memeberregistertable.stream().filter(user -> user.getEmail().equals(email)).findFirst();

        if(selected.isPresent()){
            if(new PasswordManager().chekpassword(password,selected.get().getPassword())){
                System.out.println(selected.get().toString());
                SetUi("DashBoardForm");
            }
            else {
                new Alert(Alert.AlertType.ERROR,
                        "Wrong password").show();

            }
        }
        else{
            new Alert(Alert.AlertType.WARNING,
                    String.format("user not found", email)).show();

        }

    }

    public void CreateAnAccountONAction(ActionEvent actionEvent) throws IOException {
        SetUi("SignupForm");
    }

    private void SetUi(String location) throws IOException {
        Stage stage1 = (Stage) logincontext.getScene().getWindow();
        stage1.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/" + location + ".fxml"))
        ));
        stage1.centerOnScreen();
    }
}
