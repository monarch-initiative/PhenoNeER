package org.monarchinitiative.phenoneer.model.impl;

import org.monarchinitiative.phenol.ontology.data.TermId;
import org.monarchinitiative.phenoneer.model.Concept;

public record ConceptDefault(TermId id, int start, int end, boolean excluded) implements Concept {
    @Override
    public TermId getId() {
        return id;
    }

    @Override
    public int getStart() {
        return start;
    }

    @Override
    public int getEnd() {
        return end;
    }

    @Override
    public boolean isExcluded() {
        return excluded;
    }
}