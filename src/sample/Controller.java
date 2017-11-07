package sample;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Collection;

public class Controller {

    @FXML
    public TableView<String> table;

    @FXML
    public TableColumn tekst;

    @FXML
    TextField textfield;


    public final ObservableList<String> data
            = FXCollections.observableArrayList();

    @FXML
    private void handleClick(ActionEvent event) {
        data.add(textfield.getText());
        table.setItems(data);
    }
}
