// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTaskSpecRestartPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecRestartPolicyArgs Empty = new ServiceTaskSpecRestartPolicyArgs();

    @Import(name="condition")
    private @Nullable Output<String> condition;

    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="delay")
    private @Nullable Output<String> delay;

    public Optional<Output<String>> delay() {
        return Optional.ofNullable(this.delay);
    }

    @Import(name="maxAttempts")
    private @Nullable Output<Integer> maxAttempts;

    public Optional<Output<Integer>> maxAttempts() {
        return Optional.ofNullable(this.maxAttempts);
    }

    @Import(name="window")
    private @Nullable Output<String> window;

    public Optional<Output<String>> window() {
        return Optional.ofNullable(this.window);
    }

    private ServiceTaskSpecRestartPolicyArgs() {}

    private ServiceTaskSpecRestartPolicyArgs(ServiceTaskSpecRestartPolicyArgs $) {
        this.condition = $.condition;
        this.delay = $.delay;
        this.maxAttempts = $.maxAttempts;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTaskSpecRestartPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTaskSpecRestartPolicyArgs $;

        public Builder() {
            $ = new ServiceTaskSpecRestartPolicyArgs();
        }

        public Builder(ServiceTaskSpecRestartPolicyArgs defaults) {
            $ = new ServiceTaskSpecRestartPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        public Builder delay(@Nullable Output<String> delay) {
            $.delay = delay;
            return this;
        }

        public Builder delay(String delay) {
            return delay(Output.of(delay));
        }

        public Builder maxAttempts(@Nullable Output<Integer> maxAttempts) {
            $.maxAttempts = maxAttempts;
            return this;
        }

        public Builder maxAttempts(Integer maxAttempts) {
            return maxAttempts(Output.of(maxAttempts));
        }

        public Builder window(@Nullable Output<String> window) {
            $.window = window;
            return this;
        }

        public Builder window(String window) {
            return window(Output.of(window));
        }

        public ServiceTaskSpecRestartPolicyArgs build() {
            return $;
        }
    }

}