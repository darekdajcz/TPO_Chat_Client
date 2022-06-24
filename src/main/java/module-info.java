module com.example.tpo_chatappclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tpo_chatappclient to javafx.fxml;
    exports com.example.tpo_chatappclient;
}