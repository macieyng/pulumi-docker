// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecContainerSpecConfig {
    private final String configId;
    private final @Nullable String configName;
    private final @Nullable String fileGid;
    private final @Nullable Integer fileMode;
    private final String fileName;
    private final @Nullable String fileUid;

    @CustomType.Constructor
    private ServiceTaskSpecContainerSpecConfig(
        @CustomType.Parameter("configId") String configId,
        @CustomType.Parameter("configName") @Nullable String configName,
        @CustomType.Parameter("fileGid") @Nullable String fileGid,
        @CustomType.Parameter("fileMode") @Nullable Integer fileMode,
        @CustomType.Parameter("fileName") String fileName,
        @CustomType.Parameter("fileUid") @Nullable String fileUid) {
        this.configId = configId;
        this.configName = configName;
        this.fileGid = fileGid;
        this.fileMode = fileMode;
        this.fileName = fileName;
        this.fileUid = fileUid;
    }

    public String configId() {
        return this.configId;
    }
    public Optional<String> configName() {
        return Optional.ofNullable(this.configName);
    }
    public Optional<String> fileGid() {
        return Optional.ofNullable(this.fileGid);
    }
    public Optional<Integer> fileMode() {
        return Optional.ofNullable(this.fileMode);
    }
    public String fileName() {
        return this.fileName;
    }
    public Optional<String> fileUid() {
        return Optional.ofNullable(this.fileUid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configId;
        private @Nullable String configName;
        private @Nullable String fileGid;
        private @Nullable Integer fileMode;
        private String fileName;
        private @Nullable String fileUid;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.configName = defaults.configName;
    	      this.fileGid = defaults.fileGid;
    	      this.fileMode = defaults.fileMode;
    	      this.fileName = defaults.fileName;
    	      this.fileUid = defaults.fileUid;
        }

        public Builder configId(String configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }
        public Builder configName(@Nullable String configName) {
            this.configName = configName;
            return this;
        }
        public Builder fileGid(@Nullable String fileGid) {
            this.fileGid = fileGid;
            return this;
        }
        public Builder fileMode(@Nullable Integer fileMode) {
            this.fileMode = fileMode;
            return this;
        }
        public Builder fileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }
        public Builder fileUid(@Nullable String fileUid) {
            this.fileUid = fileUid;
            return this;
        }        public ServiceTaskSpecContainerSpecConfig build() {
            return new ServiceTaskSpecContainerSpecConfig(configId, configName, fileGid, fileMode, fileName, fileUid);
        }
    }
}