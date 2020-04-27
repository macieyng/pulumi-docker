// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Docker.Outputs
{

    [OutputType]
    public sealed class ServiceTaskSpecResourcesLimitsGenericResources
    {
        /// <summary>
        /// The Integer resources, delimited by `=`
        /// </summary>
        public readonly ImmutableArray<string> DiscreteResourcesSpecs;
        /// <summary>
        /// The String resources, delimited by `=`
        /// </summary>
        public readonly ImmutableArray<string> NamedResourcesSpecs;

        [OutputConstructor]
        private ServiceTaskSpecResourcesLimitsGenericResources(
            ImmutableArray<string> discreteResourcesSpecs,

            ImmutableArray<string> namedResourcesSpecs)
        {
            DiscreteResourcesSpecs = discreteResourcesSpecs;
            NamedResourcesSpecs = namedResourcesSpecs;
        }
    }
}
