module com.eiman.ejn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.eiman.ejn to javafx.fxml;
    exports com.eiman.ejn;
}