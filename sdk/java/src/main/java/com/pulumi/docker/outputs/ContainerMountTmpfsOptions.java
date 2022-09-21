// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerMountTmpfsOptions {
    private final @Nullable Integer mode;
    private final @Nullable Integer sizeBytes;

    @CustomType.Constructor
    private ContainerMountTmpfsOptions(
        @CustomType.Parameter("mode") @Nullable Integer mode,
        @CustomType.Parameter("sizeBytes") @Nullable Integer sizeBytes) {
        this.mode = mode;
        this.sizeBytes = sizeBytes;
    }

    public Optional<Integer> mode() {
        return Optional.ofNullable(this.mode);
    }
    public Optional<Integer> sizeBytes() {
        return Optional.ofNullable(this.sizeBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerMountTmpfsOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer mode;
        private @Nullable Integer sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerMountTmpfsOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder mode(@Nullable Integer mode) {
            this.mode = mode;
            return this;
        }
        public Builder sizeBytes(@Nullable Integer sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }        public ContainerMountTmpfsOptions build() {
            return new ContainerMountTmpfsOptions(mode, sizeBytes);
        }
    }
}