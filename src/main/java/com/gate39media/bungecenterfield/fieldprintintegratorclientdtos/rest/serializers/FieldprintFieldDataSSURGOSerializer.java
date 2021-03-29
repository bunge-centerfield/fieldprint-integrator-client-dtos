package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata.CoordinatesDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata.FieldDataLocationsDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata.GeoLocationDto;

import java.io.IOException;

public class FieldprintFieldDataSSURGOSerializer extends JsonSerializer<FieldDataLocationsDto> {

    @Override
    public void serialize(FieldDataLocationsDto dto, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        writeGeojson(gen, dto.getGeojson());
        gen.writeEndObject();
    }

    private void writeGeojson(JsonGenerator gen, GeoLocationDto geojson) throws IOException {
        gen.writeFieldName("geojson");
        gen.writeStartObject();
        gen.writeStringField("type", geojson.getType());
        writeCoordinates(gen, geojson);
        gen.writeEndObject();
    }

    private void writeCoordinates(JsonGenerator gen, GeoLocationDto geojson) throws IOException {
        gen.writeArrayFieldStart("coordinates");
        gen.writeStartArray();
        geojson.getCoordinates().forEach(coordinate -> fillCoordinates(gen, coordinate));
        gen.writeEndArray();
        gen.writeEndArray();
    }

    private void fillCoordinates(JsonGenerator gen, CoordinatesDto coordinate) {
        try {
            final double[] values = {coordinate.getLatitude(), coordinate.getLongitude()};
            gen.writeArray(values, 0, values.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
