module me.habism.grove.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    
    opens me.habism.grove.gui to javafx.fxml;
    exports me.habism.grove.gui;
}
