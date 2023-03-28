module ee.mandra.d4s {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens ee.mandra.d4s to javafx.fxml;
    exports ee.mandra.d4s;
}