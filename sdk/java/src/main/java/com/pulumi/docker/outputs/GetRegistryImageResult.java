// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegistryImageResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return If `true`, the verification of TLS certificates of the server/registry is disabled. Defaults to `false`
     * 
     */
    private final @Nullable Boolean insecureSkipVerify;
    /**
     * @return The name of the Docker image, including any tags. e.g. `alpine:latest`
     * 
     */
    private final String name;
    /**
     * @return The content digest of the image, as stored in the registry.
     * 
     */
    private final String sha256Digest;

    @CustomType.Constructor
    private GetRegistryImageResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("insecureSkipVerify") @Nullable Boolean insecureSkipVerify,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sha256Digest") String sha256Digest) {
        this.id = id;
        this.insecureSkipVerify = insecureSkipVerify;
        this.name = name;
        this.sha256Digest = sha256Digest;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If `true`, the verification of TLS certificates of the server/registry is disabled. Defaults to `false`
     * 
     */
    public Optional<Boolean> insecureSkipVerify() {
        return Optional.ofNullable(this.insecureSkipVerify);
    }
    /**
     * @return The name of the Docker image, including any tags. e.g. `alpine:latest`
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The content digest of the image, as stored in the registry.
     * 
     */
    public String sha256Digest() {
        return this.sha256Digest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Boolean insecureSkipVerify;
        private String name;
        private String sha256Digest;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.insecureSkipVerify = defaults.insecureSkipVerify;
    	      this.name = defaults.name;
    	      this.sha256Digest = defaults.sha256Digest;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder insecureSkipVerify(@Nullable Boolean insecureSkipVerify) {
            this.insecureSkipVerify = insecureSkipVerify;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sha256Digest(String sha256Digest) {
            this.sha256Digest = Objects.requireNonNull(sha256Digest);
            return this;
        }        public GetRegistryImageResult build() {
            return new GetRegistryImageResult(id, insecureSkipVerify, name, sha256Digest);
        }
    }
}