// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.docker.PluginArgs;
import com.pulumi.docker.Utilities;
import com.pulumi.docker.inputs.PluginState;
import com.pulumi.docker.outputs.PluginGrantPermission;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &lt;!-- Bug: Type and Name are switched --&gt;
 * Manages the lifecycle of a Docker plugin.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.docker.Plugin;
 * import com.pulumi.docker.PluginArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var sample_volume_plugin = new Plugin(&#34;sample-volume-plugin&#34;, PluginArgs.builder()        
 *             .alias(&#34;sample-volume-plugin&#34;)
 *             .enableTimeout(60)
 *             .enabled(false)
 *             .envs(&#34;DEBUG=1&#34;)
 *             .forceDestroy(true)
 *             .forceDisable(true)
 *             .grantAllPermissions(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * #!/bin/bash
 * 
 * ```sh
 *  $ pulumi import docker:index/plugin:Plugin sample-volume-plugin &#34;$(docker plugin inspect -f {{.ID}} tiborvass/sample-volume-plugin:latest)&#34;
 * ```
 * 
 */
@ResourceType(type="docker:index/plugin:Plugin")
public class Plugin extends com.pulumi.resources.CustomResource {
    /**
     * Docker Plugin alias
     * 
     */
    @Export(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return Docker Plugin alias
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * HTTP client timeout to enable the plugin
     * 
     */
    @Export(name="enableTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> enableTimeout;

    /**
     * @return HTTP client timeout to enable the plugin
     * 
     */
    public Output<Optional<Integer>> enableTimeout() {
        return Codegen.optional(this.enableTimeout);
    }
    /**
     * If `true` the plugin is enabled. Defaults to `true`
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If `true` the plugin is enabled. Defaults to `true`
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The environment variables in the form of `KEY=VALUE`, e.g. `DEBUG=0`
     * 
     */
    @Export(name="envs", type=List.class, parameters={String.class})
    private Output<List<String>> envs;

    /**
     * @return The environment variables in the form of `KEY=VALUE`, e.g. `DEBUG=0`
     * 
     */
    public Output<List<String>> envs() {
        return this.envs;
    }
    /**
     * If true, then the plugin is destroyed forcibly
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return If true, then the plugin is destroyed forcibly
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * If true, then the plugin is disabled forcibly
     * 
     */
    @Export(name="forceDisable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDisable;

    /**
     * @return If true, then the plugin is disabled forcibly
     * 
     */
    public Output<Optional<Boolean>> forceDisable() {
        return Codegen.optional(this.forceDisable);
    }
    /**
     * If true, grant all permissions necessary to run the plugin
     * 
     */
    @Export(name="grantAllPermissions", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> grantAllPermissions;

    /**
     * @return If true, grant all permissions necessary to run the plugin
     * 
     */
    public Output<Optional<Boolean>> grantAllPermissions() {
        return Codegen.optional(this.grantAllPermissions);
    }
    /**
     * Grant specific permissions only
     * 
     */
    @Export(name="grantPermissions", type=List.class, parameters={PluginGrantPermission.class})
    private Output</* @Nullable */ List<PluginGrantPermission>> grantPermissions;

    /**
     * @return Grant specific permissions only
     * 
     */
    public Output<Optional<List<PluginGrantPermission>>> grantPermissions() {
        return Codegen.optional(this.grantPermissions);
    }
    /**
     * Docker Plugin name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Docker Plugin name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Docker Plugin Reference
     * 
     */
    @Export(name="pluginReference", type=String.class, parameters={})
    private Output<String> pluginReference;

    /**
     * @return Docker Plugin Reference
     * 
     */
    public Output<String> pluginReference() {
        return this.pluginReference;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Plugin(String name) {
        this(name, PluginArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Plugin(String name, @Nullable PluginArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Plugin(String name, @Nullable PluginArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/plugin:Plugin", name, args == null ? PluginArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Plugin(String name, Output<String> id, @Nullable PluginState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/plugin:Plugin", name, state, makeResourceOptions(options, id));
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
    public static Plugin get(String name, Output<String> id, @Nullable PluginState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Plugin(name, id, state, options);
    }
}
