package org.monarchinitiative.bionerapi.model.impl;

import org.monarchinitiative.bionerapi.model.Concept;
import org.monarchinitiative.bionerapi.model.Result;

import java.util.Collection;

public record ResultDefault(String payload, Collection<? extends Concept> concepts) implements Result {
    @Override
    public String payload() {
        return payload;
    }

    @Override
    public Collection<? extends Concept> getConcepts() {
        return concepts;
    }
}
