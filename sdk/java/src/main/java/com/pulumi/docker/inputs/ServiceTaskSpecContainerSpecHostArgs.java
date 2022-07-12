// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceTaskSpecContainerSpecHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecHostArgs Empty = new ServiceTaskSpecContainerSpecHostArgs();

    @Import(name="host", required=true)
    private Output<String> host;

    public Output<String> host() {
        return this.host;
    }

    @Import(name="ip", required=true)
    private Output<String> ip;

    public Output<String> ip() {
        return this.ip;
    }

    private ServiceTaskSpecContainerSpecHostArgs() {}

    private ServiceTaskSpecContainerSpecHostArgs(ServiceTaskSpecContainerSpecHostArgs $) {
        this.host = $.host;
        this.ip = $.ip;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTaskSpecContainerSpecHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTaskSpecContainerSpecHostArgs $;

        public Builder() {
            $ = new ServiceTaskSpecContainerSpecHostArgs();
        }

        public Builder(ServiceTaskSpecContainerSpecHostArgs defaults) {
            $ = new ServiceTaskSpecContainerSpecHostArgs(Objects.requireNonNull(defaults));
        }

        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder ip(Output<String> ip) {
            $.ip = ip;
            return this;
        }

        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public ServiceTaskSpecContainerSpecHostArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.ip = Objects.requireNonNull($.ip, "expected parameter 'ip' to be non-null");
            return $;
        }
    }

}
