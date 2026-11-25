module edu.unicentro.trabalho3pooii {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static org.junit.jupiter.api;

    opens edu.unicentro.trabalho3pooii.controller to javafx.fxml;
    opens edu.unicentro.trabalho3pooii.model to org.junit.platform.commons;
    opens edu.unicentro.trabalho3pooii.service to org.junit.platform.commons;
    exports edu.unicentro.trabalho3pooii.main;
}
