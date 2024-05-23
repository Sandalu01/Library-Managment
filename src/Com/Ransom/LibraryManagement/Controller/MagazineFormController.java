package Com.Ransom.LibraryManagement.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MagazineFormController {

    public AnchorPane magcontext;

    public void BacktoOnActiom(ActionEvent actionEvent) throws IOException {
        setui("DashBoardForm");
    }

    private void setui(String location) throws IOException {
        Stage stage1 = (Stage) magcontext.getScene().getWindow();
        stage1.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/" + location + ".fxml"))
        ));
        stage1.centerOnScreen();
    }



}

