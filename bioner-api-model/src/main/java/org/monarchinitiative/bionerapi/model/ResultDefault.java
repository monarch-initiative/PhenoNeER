package org.monarchinitiative.bionerapi.model;

import java.util.Collection;

record ResultDefault(String payload, Collection<? extends Concept> concepts) implements Result {
    @Override
    public String payload() {
        return payload;
    }

    @Override
    public Collection<? extends Concept> getConcepts() {
        return concepts;
    }
}
