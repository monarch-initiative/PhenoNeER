package org.monarchinitiative.bionerapi.model;

/**
 * An exception to signal issues encountered during the named entity recognition.
 */
public class NamedEntityRecognitionException extends RuntimeException {
    public NamedEntityRecognitionException() {
        super();
    }

    public NamedEntityRecognitionException(String message) {
        super(message);
    }

    public NamedEntityRecognitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NamedEntityRecognitionException(Throwable cause) {
        super(cause);
    }

    protected NamedEntityRecognitionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
