package org.monarchinitiative.phenoneer.model;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.Collection;

/**
 * {@code Result} is a container for results of the NER processing.
 * <p>
 *   The container contains the original {@link Request#getPayload()} and the results of the
 * </p>
 */
public interface Result {

    /**
     * Create a {@code Result} from given {@code payload} and {@code concepts}.
     */
    static Result of(String payload, Collection<? extends Concept> concepts) {
        return new ResultDefault(payload, concepts);
    }

    /**
     * @return the NER input.
     */
    @JsonGetter
    String payload();

    /**
     * @return results of the NER processing.
     */
    Collection<? extends Concept> getConcepts();

}
