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

public class BookFormController {
    public AnchorPane contextbook;
    public TextField txtbookId;
    public TextField txtbookname;
    public TextField txtmembername;
    public TextField txtDate;
    public TextField txttimepieroed;

    public void SubmitOnAction(ActionEvent actionEvent) {
        String bookId=txtbookId.getText().toLowerCase();
        String Bookname=txtbookname.getText();
        String Membersname=txtmembername.getText();
        String Date=txtDate.getText();
        String timepieroed=txttimepieroed.getText();
        Database.memebertable.add(new Member(bookId,Bookname,Membersname,Date,timepieroed));
        new Alert(Alert.AlertType.CONFIRMATION,"submission is Successful");
    }

    public void BacktoOnAction(ActionEvent actionEvent) throws IOException {
        SetUi("DashBoardForm");

    }
    private void SetUi(String location) throws IOException {
        Stage stage1 = (Stage) contextbook.getScene().getWindow();
        stage1.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/" + location + ".fxml"))
        ));
        stage1.centerOnScreen();
    }
}
