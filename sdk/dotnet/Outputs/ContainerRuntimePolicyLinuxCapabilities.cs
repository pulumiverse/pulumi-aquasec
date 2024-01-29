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
    public sealed class ContainerRuntimePolicyLinuxCapabilities
    {
        public readonly bool? Enabled;
        public readonly ImmutableArray<string> RemoveLinuxCapabilities;

        [OutputConstructor]
        private ContainerRuntimePolicyLinuxCapabilities(
            bool? enabled,

            ImmutableArray<string> removeLinuxCapabilities)
        {
            Enabled = enabled;
            RemoveLinuxCapabilities = removeLinuxCapabilities;
        }
    }
}
