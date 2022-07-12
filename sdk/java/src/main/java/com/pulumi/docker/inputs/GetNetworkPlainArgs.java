// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkPlainArgs Empty = new GetNetworkPlainArgs();

    /**
     * The name of the Docker network.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Docker network.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetNetworkPlainArgs() {}

    private GetNetworkPlainArgs(GetNetworkPlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkPlainArgs $;

        public Builder() {
            $ = new GetNetworkPlainArgs();
        }

        public Builder(GetNetworkPlainArgs defaults) {
            $ = new GetNetworkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Docker network.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetNetworkPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
