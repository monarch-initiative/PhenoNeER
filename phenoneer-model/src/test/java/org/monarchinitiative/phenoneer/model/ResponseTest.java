package org.monarchinitiative.phenoneer.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.monarchinitiative.phenol.ontology.data.TermId;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class ResponseTest {

    private ObjectMapper mapper;

    @BeforeEach
    public void setUp() {
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Test
    public void serializationWorks() throws Exception {
        Response response = Response.of(
                Result.of(
                        "An example payload",
                        List.of(
                                Concept.of(TermId.of("HP:1234567"), 1, 2, false),
                                Concept.of(TermId.of("HP:1000123"), 4, 8, true)
                        )
                )
        );

        String json = mapper.writeValueAsString(response);

        assertThat(json, equalTo("""
                {
                  "result" : {
                    "payload" : "An example payload",
                    "concepts" : [ {
                      "id" : "HP:1234567",
                      "start" : 1,
                      "end" : 2,
                      "excluded" : false
                    }, {
                      "id" : "HP:1000123",
                      "start" : 4,
                      "end" : 8,
                      "excluded" : true
                    } ]
                  }
                }"""));
    }
}