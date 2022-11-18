package org.monarchinitiative.bionerapi.model.impl;

import org.monarchinitiative.bionerapi.model.Concept;
import org.monarchinitiative.phenol.ontology.data.TermId;

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
