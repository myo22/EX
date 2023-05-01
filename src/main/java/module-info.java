module com.example.ex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex to javafx.fxml;
    exports com.example.ex;
    exports com.example.fw;
    opens com.example.fw to javafx.fxml;
    opens com.example.ClassLoader to javafx.fxml;
    exports com.example.ClassLoader;
}