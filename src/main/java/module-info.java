module me.habism.grove.gui {
    requires javafx.controls;
    requires javafx.fxml;

    opens me.habism.grove.gui to javafx.fxml;
    exports me.habism.grove.gui;
}
