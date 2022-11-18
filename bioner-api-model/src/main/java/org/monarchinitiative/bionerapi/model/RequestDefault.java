package org.monarchinitiative.bionerapi.model;

record RequestDefault(String payload) implements Request {
    @Override
    public String getPayload() {
        return payload;
    }
}
