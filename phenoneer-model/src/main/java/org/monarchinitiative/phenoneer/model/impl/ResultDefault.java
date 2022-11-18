package org.monarchinitiative.phenoneer.model.impl;

import org.monarchinitiative.phenoneer.model.Concept;
import org.monarchinitiative.phenoneer.model.Result;

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
