// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec.Outputs
{

    [OutputType]
    public sealed class HostRuntimePolicyAllowedRegistry
    {
        /// <summary>
        /// List of allowed registries.
        /// </summary>
        public readonly ImmutableArray<string> AllowedRegistries;
        /// <summary>
        /// Whether allowed registries are enabled.
        /// </summary>
        public readonly bool? Enabled;

        [OutputConstructor]
        private HostRuntimePolicyAllowedRegistry(
            ImmutableArray<string> allowedRegistries,

            bool? enabled)
        {
            AllowedRegistries = allowedRegistries;
            Enabled = enabled;
        }
    }
}
