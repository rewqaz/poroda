module com.vsu.ru.poroda {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;
    requires vecmath;

    opens com.vsu.ru.cg.gui to javafx.fxml;
    exports com.vsu.ru.cg;
    exports com.vsu.ru.cg.gui;
}