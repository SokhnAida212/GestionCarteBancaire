module com.banque.gestioncarte {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;
    requires static lombok;

    // Ouvrir le package contenant les entités JPA
    opens com.banque.gestioncarte.models to org.hibernate.orm.core;

    opens com.banque.gestioncarte to javafx.fxml;
    exports com.banque.gestioncarte;
}