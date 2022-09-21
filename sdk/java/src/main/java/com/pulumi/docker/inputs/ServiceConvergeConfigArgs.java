// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceConvergeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceConvergeConfigArgs Empty = new ServiceConvergeConfigArgs();

    /**
     * The interval to check if the desired state is reached `(ms|s)`. Defaults to `7s`.
     * 
     */
    @Import(name="delay")
    private @Nullable Output<String> delay;

    /**
     * @return The interval to check if the desired state is reached `(ms|s)`. Defaults to `7s`.
     * 
     */
    public Optional<Output<String>> delay() {
        return Optional.ofNullable(this.delay);
    }

    /**
     * The timeout of the service to reach the desired state `(s|m)`. Defaults to `3m`
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    /**
     * @return The timeout of the service to reach the desired state `(s|m)`. Defaults to `3m`
     * 
     */
    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ServiceConvergeConfigArgs() {}

    private ServiceConvergeConfigArgs(ServiceConvergeConfigArgs $) {
        this.delay = $.delay;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceConvergeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceConvergeConfigArgs $;

        public Builder() {
            $ = new ServiceConvergeConfigArgs();
        }

        public Builder(ServiceConvergeConfigArgs defaults) {
            $ = new ServiceConvergeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delay The interval to check if the desired state is reached `(ms|s)`. Defaults to `7s`.
         * 
         * @return builder
         * 
         */
        public Builder delay(@Nullable Output<String> delay) {
            $.delay = delay;
            return this;
        }

        /**
         * @param delay The interval to check if the desired state is reached `(ms|s)`. Defaults to `7s`.
         * 
         * @return builder
         * 
         */
        public Builder delay(String delay) {
            return delay(Output.of(delay));
        }

        /**
         * @param timeout The timeout of the service to reach the desired state `(s|m)`. Defaults to `3m`
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The timeout of the service to reach the desired state `(s|m)`. Defaults to `3m`
         * 
         * @return builder
         * 
         */
        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public ServiceConvergeConfigArgs build() {
            return $;
        }
    }

}