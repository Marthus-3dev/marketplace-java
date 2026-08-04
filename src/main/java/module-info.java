module com.marthus.marketplace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.marthus.marketplace to javafx.fxml;
    exports com.marthus.marketplace;
    exports com.marthus.marketplace.controller;
    opens com.marthus.marketplace.controller to javafx.fxml;
}