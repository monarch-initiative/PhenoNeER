/**
 * The data model of the components for named entity recognition (NER).
 */
module org.monarchinitiative.bioner.api.model {
    requires com.fasterxml.jackson.databind;
    requires org.monarchinitiative.phenol.core;

    exports org.monarchinitiative.bionerapi.model;

    opens org.monarchinitiative.bionerapi.model to com.fasterxml.jackson.databind;
    opens org.monarchinitiative.bionerapi.model.impl to com.fasterxml.jackson.databind;
}