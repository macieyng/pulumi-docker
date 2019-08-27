// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The provider type for the docker package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-docker/blob/master/website/docs/index.html.markdown.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'docker';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Provider.__pulumiType;
    }


    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let inputs: pulumi.Inputs = {};
        {
            inputs["caMaterial"] = (args ? args.caMaterial : undefined) || utilities.getEnv("DOCKER_CA_MATERIAL");
            inputs["certMaterial"] = (args ? args.certMaterial : undefined) || utilities.getEnv("DOCKER_CERT_MATERIAL");
            inputs["certPath"] = (args ? args.certPath : undefined) || utilities.getEnv("DOCKER_CERT_PATH");
            inputs["host"] = (args ? args.host : undefined) || (utilities.getEnv("DOCKER_HOST") || "unix:///var/run/docker.sock");
            inputs["keyMaterial"] = (args ? args.keyMaterial : undefined) || utilities.getEnv("DOCKER_KEY_MATERIAL");
            inputs["registryAuth"] = pulumi.output(args ? args.registryAuth : undefined).apply(JSON.stringify);
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Provider.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * PEM-encoded content of Docker host CA certificate
     */
    readonly caMaterial?: pulumi.Input<string>;
    /**
     * PEM-encoded content of Docker client certificate
     */
    readonly certMaterial?: pulumi.Input<string>;
    /**
     * Path to directory with Docker TLS config
     */
    readonly certPath?: pulumi.Input<string>;
    /**
     * The Docker daemon address
     */
    readonly host?: pulumi.Input<string>;
    /**
     * PEM-encoded content of Docker client private key
     */
    readonly keyMaterial?: pulumi.Input<string>;
    readonly registryAuth?: pulumi.Input<pulumi.Input<inputs.ProviderRegistryAuth>[]>;
}
