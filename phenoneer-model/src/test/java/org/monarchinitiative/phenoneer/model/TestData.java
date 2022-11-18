package org.monarchinitiative.phenoneer.model;

import org.monarchinitiative.phenol.ontology.data.TermId;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class TestData {

    public static final String PAYLOAD = """
            Here we present a 13-year-old girl with inherited myopathy associated with collagenopathy.
                        
            During the neonatal period weak sucking, decreased muscle tone, joint
            laxity and hyperextension of elbows, knees and wrists were observed.
                        
            No joint dislocations or sprains occurred. Mental development, including speech, was normal.""";

    public static final List<Concept> CONCEPTS = List.of(
            Concept.of(TermId.of("HP:0003198"),  50,  58, false), // Myopathy
            Concept.of(TermId.of("HP:0002033"), 119, 131, false), // Poor suck
            Concept.of(TermId.of("HP:0001388"), 156, 168, false), // Joint laxity
            Concept.of(TermId.of("HP:0001373"), 235, 253, true)   // Joint dislocation
    );

    private TestData() {
    }

    static String readFile(InputStream is) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            return reader.lines().collect(Collectors.joining(System.lineSeparator()));
        }
    }
}
