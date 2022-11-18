package org.monarchinitiative.phenoneer.model.impl;

import org.monarchinitiative.phenoneer.model.Response;
import org.monarchinitiative.phenoneer.model.Result;

public record ResponseDefault(Result result) implements Response {
    @Override
    public Result getResult() {
        return result;
    }
}
