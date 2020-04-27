module com.fapce.Login {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens com.fapce.Login to javafx.fxml;
    exports com.fapce.Login;
}