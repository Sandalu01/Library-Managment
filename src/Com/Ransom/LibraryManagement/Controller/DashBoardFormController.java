package Com.Ransom.LibraryManagement.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {

    public AnchorPane contextdashboard;

    public void BookOnAction(ActionEvent actionEvent) throws IOException {
        SetUi("BookForm");
    }

    public void MembersOnAction(ActionEvent actionEvent) throws IOException {
        SetUi("MemberForm");

    }

    public void NewspapersOnAction(ActionEvent actionEvent) throws IOException {
        SetUi("NewsPapersForm");
    }

    public void MagazineOnAction(ActionEvent actionEvent) throws IOException {
        SetUi("MagazineForm");
    }

    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {
        SetUi("LoginForm");


    }
    private void SetUi(String location) throws IOException {
        Stage stage1 = (Stage) contextdashboard.getScene().getWindow();
        stage1.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/" + location + ".fxml"))
        ));
        stage1.centerOnScreen();
    }
}

