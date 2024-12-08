module com.example.sistemapagamento {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sistemapagamento to javafx.fxml;
    exports com.example.sistemapagamento;
}