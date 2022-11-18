package org.monarchinitiative.bionerapi.model;

/**
 * Specification of the named entity recognition service.
 */
public interface NamedEntityRecognitionService {

    /**
     * Perform NER on given {@code request} and wrap the results into {@link Response}.
     *
     * @throws NamedEntityRecognitionException in case of issues in the named entity recognition.
     */
    Response mine(Request request) throws NamedEntityRecognitionException;

}
