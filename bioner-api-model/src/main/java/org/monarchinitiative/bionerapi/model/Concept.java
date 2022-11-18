package org.monarchinitiative.bionerapi.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.monarchinitiative.bionerapi.model.impl.ConceptDefault;
import org.monarchinitiative.bionerapi.model.impl.TermIdSerializer;
import org.monarchinitiative.phenol.ontology.data.Identified;
import org.monarchinitiative.phenol.ontology.data.TermId;

/**
 * Corresponds to a named entity identified by NER process based on a {@link Request#getPayload()}.
 * <p>
 *  The concept coordinates {@link #getStart()} and {@link #getEnd()} point to the character range
 *  in the {@link Request#getPayload()} that corresponds to the {@code Concept}. The coordinates use
 *  0-based coordinate system - the same coordinate system Java uses to slice {@code String}s.
 * </p>
 */
public interface Concept extends Identified {

    /**
     * Create a {@code Concept} from given arguments.
     */
    static Concept of(TermId id, int start, int end, boolean isExcluded) {
        return new ConceptDefault(id, start, end, isExcluded);
    }

    /**
     * @return the CURIE of the identified entity
     */
    @JsonSerialize(using = TermIdSerializer.class)
    TermId getId();

    /**
     * @return start coordinate in 0-based coordinate system (excluded) of the character range that corresponds
     * to the {@code Concept}.
     */
    @JsonGetter
    int getStart();

    /**
     * @return end coordinate in 0-based coordinate system (excluded) of the character range that corresponds
     * to the {@code Concept}.
     */
    @JsonGetter
    int getEnd();

    /**
     * @return {@code true} if the concept is <em>excluded</em> (i.e. not observed) in the payload.
     */
    @JsonGetter
    boolean isExcluded();

    /**
     * @return {@code true} if the concept is <em>observed</em> (i.e. not excluded) in the payload.
     */
    @JsonIgnore
    default boolean isObserved() {
        return !isExcluded();
    }

}
