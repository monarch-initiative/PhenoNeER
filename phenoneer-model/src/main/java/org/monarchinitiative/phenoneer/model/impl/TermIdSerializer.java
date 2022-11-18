package org.monarchinitiative.phenoneer.model.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.monarchinitiative.phenol.ontology.data.TermId;

import java.io.IOException;

public class TermIdSerializer extends StdSerializer<TermId> {

    public TermIdSerializer() {
        this(TermId.class);
    }

    protected TermIdSerializer(Class<TermId> t) {
        super(t);
    }

    @Override
    public void serialize(TermId termId, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(termId.getValue());
    }

}
