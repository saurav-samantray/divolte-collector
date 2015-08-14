package io.divolte.server.config;

import javax.annotation.ParametersAreNullableByDefault;

import com.fasterxml.jackson.annotation.JsonCreator;

@ParametersAreNullableByDefault
public final class SchemaMappingConfiguration {
    public final Integer version;
    public final String mappingScriptFile;

    @JsonCreator
    private SchemaMappingConfiguration(final Integer version, final String mappingScriptFile) {
        this.version = version;
        this.mappingScriptFile = mappingScriptFile;
    }

    @Override
    public String toString() {
        return "SchemaMappingConfiguration [version=" + version + ", mappingScriptFile=" + mappingScriptFile + "]";
    }
}