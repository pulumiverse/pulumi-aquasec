// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec.Inputs
{

    public sealed class GetContainerRuntimePolicyPortBlockArgs : global::Pulumi.InvokeArgs
    {
        [Input("blockInboundPorts")]
        private List<string>? _blockInboundPorts;
        public List<string> BlockInboundPorts
        {
            get => _blockInboundPorts ?? (_blockInboundPorts = new List<string>());
            set => _blockInboundPorts = value;
        }

        [Input("blockOutboundPorts")]
        private List<string>? _blockOutboundPorts;
        public List<string> BlockOutboundPorts
        {
            get => _blockOutboundPorts ?? (_blockOutboundPorts = new List<string>());
            set => _blockOutboundPorts = value;
        }

        [Input("enabled")]
        public bool? Enabled { get; set; }

        public GetContainerRuntimePolicyPortBlockArgs()
        {
        }
        public static new GetContainerRuntimePolicyPortBlockArgs Empty => new GetContainerRuntimePolicyPortBlockArgs();
    }
}