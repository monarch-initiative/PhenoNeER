package org.monarchinitiative.phenoneer.model.impl;

import org.monarchinitiative.phenoneer.model.Request;

public record RequestDefault(String payload) implements Request {
    @Override
    public String getPayload() {
        return payload;
    }
}
