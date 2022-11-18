package org.monarchinitiative.bionerapi.model;

record ResponseDefault(Result result) implements Response {
    @Override
    public Result getResult() {
        return result;
    }
}
