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

    public sealed class VmwareAssurancePolicyRequiredLabelArgs : global::Pulumi.ResourceArgs
    {
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public VmwareAssurancePolicyRequiredLabelArgs()
        {
        }
        public static new VmwareAssurancePolicyRequiredLabelArgs Empty => new VmwareAssurancePolicyRequiredLabelArgs();
    }
}
