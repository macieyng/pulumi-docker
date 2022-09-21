// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.docker.ServiceConfigArgs;
import com.pulumi.docker.Utilities;
import com.pulumi.docker.inputs.ServiceConfigState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ### Example Assuming you created a `config` as follows #!/bin/bash printf &#39;{&#34;a&#34;:&#34;b&#34;}&#39; | docker config create foo - # prints the id
 * 
 * 08c26c477474478d971139f750984775a7f019dbe8a2e7f09d66a187c009e66d you provide the definition for the resource as follows terraform resource &#34;docker_config&#34; &#34;foo&#34; {
 * 
 *  name = &#34;foo&#34;
 * 
 *  data = base64encode(&#34;{\&#34;a\&#34;\&#34;b\&#34;}&#34;) } then the import command is as follows #!/bin/bash
 * 
 * ```sh
 *  $ pulumi import docker:index/serviceConfig:ServiceConfig foo 08c26c477474478d971139f750984775a7f019dbe8a2e7f09d66a187c009e66d
 * ```
 * 
 */
@ResourceType(type="docker:index/serviceConfig:ServiceConfig")
public class ServiceConfig extends com.pulumi.resources.CustomResource {
    /**
     * Base64-url-safe-encoded config data
     * 
     */
    @Export(name="data", type=String.class, parameters={})
    private Output<String> data;

    /**
     * @return Base64-url-safe-encoded config data
     * 
     */
    public Output<String> data() {
        return this.data;
    }
    /**
     * User-defined name of the config
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User-defined name of the config
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceConfig(String name) {
        this(name, ServiceConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceConfig(String name, ServiceConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceConfig(String name, ServiceConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/serviceConfig:ServiceConfig", name, args == null ? ServiceConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceConfig(String name, Output<String> id, @Nullable ServiceConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/serviceConfig:ServiceConfig", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServiceConfig get(String name, Output<String> id, @Nullable ServiceConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceConfig(name, id, state, options);
    }
}