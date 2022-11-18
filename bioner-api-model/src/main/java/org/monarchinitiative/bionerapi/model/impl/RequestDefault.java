package org.monarchinitiative.bionerapi.model.impl;

import org.monarchinitiative.bionerapi.model.Request;

public record RequestDefault(String payload) implements Request {
    @Override
    public String getPayload() {
        return payload;
    }
}
