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
    public sealed class HostRuntimePolicyPortBlock
    {
        public readonly ImmutableArray<string> BlockInboundPorts;
        public readonly ImmutableArray<string> BlockOutboundPorts;
        public readonly bool? Enabled;

        [OutputConstructor]
        private HostRuntimePolicyPortBlock(
            ImmutableArray<string> blockInboundPorts,

            ImmutableArray<string> blockOutboundPorts,

            bool? enabled)
        {
            BlockInboundPorts = blockInboundPorts;
            BlockOutboundPorts = blockOutboundPorts;
            Enabled = enabled;
        }
    }
}
