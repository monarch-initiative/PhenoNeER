package org.monarchinitiative.phenoneer.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import org.monarchinitiative.phenoneer.model.impl.RequestDefault;

/**
 * A NER request with a {@code String} payload.
 */
public interface Request {

    /**
     * Create default request with given {@code payload}.
     */
    static Request of(String payload) {
        return new RequestDefault(payload);
    }

    /**
     * @return a {@code String} with the NER request payload
     */
    @JsonGetter
    String getPayload();

}
