package org.monarchinitiative.phenoneer.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
                Result.of(TestData.PAYLOAD, TestData.CONCEPTS)
        );

        String actual = mapper.writeValueAsString(response);
        String expected = TestData.readFile(RequestTest.class.getResourceAsStream("response.json"));

        assertThat(actual, equalTo(expected));
    }
}