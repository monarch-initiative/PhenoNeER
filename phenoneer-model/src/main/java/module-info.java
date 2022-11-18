/**
 * The data model of the components for named entity recognition (NER).
 */
module org.monarchinitiative.phenoneer.model {
    requires com.fasterxml.jackson.databind;
    requires org.monarchinitiative.phenol.core;

    exports org.monarchinitiative.phenoneer.model;

    opens org.monarchinitiative.phenoneer.model to com.fasterxml.jackson.databind;
    opens org.monarchinitiative.phenoneer.model.impl to com.fasterxml.jackson.databind;
}