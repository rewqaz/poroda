module com.render {
    requires javafx.controls;
    requires javafx.fxml;
    requires vecmath;
    requires java.desktop;


    opens com.render to javafx.fxml;
    exports com.render;
}