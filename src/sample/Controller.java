package sample;


import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {

    public TableView<String> tableView;
    public TextField textField;


    public void initialize() {
        for (TableColumn<String, ?> column : tableView.getColumns()) {
            if ("napis".equals(column.getId())) {
                TableColumn<String, String> textColumn = (TableColumn<String, String>) column;
                textColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue()));
            } else if ("dlugosc".equals(column.getId())) {
                TableColumn<String, String> lengthColumn = (TableColumn<String, String>) column;
                lengthColumn.setCellValueFactory((param -> new SimpleStringProperty(String.valueOf(param.getValue().length()))));
            }
        }
    }

    public void handleClick(ActionEvent actionEvent) {
        tableView.getItems().add(textField.getText());
    }
}

