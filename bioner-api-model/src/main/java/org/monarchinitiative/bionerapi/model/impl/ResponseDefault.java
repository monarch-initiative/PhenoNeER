package org.monarchinitiative.bionerapi.model.impl;

import org.monarchinitiative.bionerapi.model.Response;
import org.monarchinitiative.bionerapi.model.Result;

public record ResponseDefault(Result result) implements Response {
    @Override
    public Result getResult() {
        return result;
    }
}
