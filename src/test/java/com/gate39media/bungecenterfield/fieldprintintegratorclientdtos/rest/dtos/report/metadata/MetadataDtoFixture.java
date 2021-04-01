package com.gate39media.bungecenterfield.fieldprintintegratorclientdtos.rest.dtos.report.metadata;

public class MetadataDtoFixture {

    public static MetadataDto newInstance() {
        return MetadataDto.builder()
                .runTimeSec(45)
                .boundaryAcres(70)
                .state("KS")
                .location("Location #1")
                .grower("Grower #1")
                .field("Field #1")
                .generatedFor("Mocked generated")
                .qdmpRequestId("Mocked generated")
                .version(fromVersion("1.0"))
                .build();
    }

    private static MetadataDto.VersionDto fromVersion(String apiVersion) {
        final MetadataDto.VersionDto version = new MetadataDto.VersionDto();
        version.setApi(apiVersion);
        return version;
    }
}