module com.vsu.ru.test_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;

    opens com.vsu.ru.cg.gui to javafx.fxml;
    exports com.vsu.ru.cg;
    exports com.vsu.ru.cg.gui;
}