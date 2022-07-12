// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs Empty = new ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs();

    @Import(name="file")
    private @Nullable Output<String> file;

    public Optional<Output<String>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="registry")
    private @Nullable Output<String> registry;

    public Optional<Output<String>> registry() {
        return Optional.ofNullable(this.registry);
    }

    private ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs() {}

    private ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs(ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs $) {
        this.file = $.file;
        this.registry = $.registry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs $;

        public Builder() {
            $ = new ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs();
        }

        public Builder(ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs defaults) {
            $ = new ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder file(@Nullable Output<String> file) {
            $.file = file;
            return this;
        }

        public Builder file(String file) {
            return file(Output.of(file));
        }

        public Builder registry(@Nullable Output<String> registry) {
            $.registry = registry;
            return this;
        }

        public Builder registry(String registry) {
            return registry(Output.of(registry));
        }

        public ServiceTaskSpecContainerSpecPrivilegesCredentialSpecArgs build() {
            return $;
        }
    }

}
