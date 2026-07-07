module com.marthus.marketplace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.marthus.marketplace to javafx.fxml;
    exports com.marthus.marketplace;
}