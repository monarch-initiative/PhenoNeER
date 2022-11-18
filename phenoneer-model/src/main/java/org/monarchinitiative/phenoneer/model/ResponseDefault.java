package org.monarchinitiative.phenoneer.model;

record ResponseDefault(Result result) implements Response {
    @Override
    public Result getResult() {
        return result;
    }
}
