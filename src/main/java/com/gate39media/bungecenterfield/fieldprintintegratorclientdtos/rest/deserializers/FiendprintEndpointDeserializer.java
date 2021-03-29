package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.endpoints.FieldprintEndpointsDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FiendprintEndpointDeserializer extends JsonDeserializer<FieldprintEndpointsDto> {

    @Override
    public FieldprintEndpointsDto deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        List<String> endpoints = new ArrayList<>();
        JsonNode root = getJsonNode(p);
        root.elements().forEachRemaining(element -> endpoints.add(element.asText()));
        return FieldprintEndpointsDto.fromEndpoints(endpoints);
    }

    private JsonNode getJsonNode(final JsonParser jsonParser) throws IOException {
        final ObjectCodec oc = jsonParser.getCodec();
        return Optional.ofNullable((JsonNode) oc.readTree(jsonParser)).orElseThrow(() -> new IllegalArgumentException("JSON Node must not be null!"));
    }
}
