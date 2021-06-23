package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata.GeolocationCoordinatesDto;
import com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.fielddata.GeoLocationDto;

import java.io.IOException;
import java.util.List;

public class FieldprintGeolocationSerializer extends JsonSerializer<GeoLocationDto> {

    @Override
    public void serialize(GeoLocationDto dto, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        writeGeojson(gen, dto.getType(), dto.getCoordinates());
        gen.writeEndObject();
    }

    private void writeGeojson(JsonGenerator gen, String type, List<GeolocationCoordinatesDto> coordinates) throws IOException {
        gen.writeStringField("type", type);
        writeCoordinates(gen, coordinates);
    }

    private void writeCoordinates(JsonGenerator gen, List<GeolocationCoordinatesDto> coordinates) throws IOException {
        gen.writeArrayFieldStart("coordinates");
        gen.writeStartArray();
        coordinates.forEach(coordinate -> fillCoordinates(gen, coordinate));
        gen.writeEndArray();
        gen.writeEndArray();
    }

    private void fillCoordinates(JsonGenerator gen, GeolocationCoordinatesDto coordinate) {
        try {
            final double[] values = {coordinate.getLongitude(), coordinate.getLatitude()};
            gen.writeArray(values, 0, values.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
