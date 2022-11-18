package org.monarchinitiative.phenoneer.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import org.monarchinitiative.phenoneer.model.impl.ResponseDefault;

/**
 * A response from the {@link NamedEntityRecognitionService}.
 */
public interface Response {

    /**
     * Create a {@code Response} from provided {@link Result}.
     */
    static Response of(Result result) {
        return new ResponseDefault(result);
    }

    /**
     * @return NER result
     */
    @JsonGetter
    Result getResult();

}
