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

    public sealed class FunctionAssurancePolicyTrustedBaseImageArgs : global::Pulumi.ResourceArgs
    {
        [Input("imagename")]
        public Input<string>? Imagename { get; set; }

        [Input("registry")]
        public Input<string>? Registry { get; set; }

        public FunctionAssurancePolicyTrustedBaseImageArgs()
        {
        }
        public static new FunctionAssurancePolicyTrustedBaseImageArgs Empty => new FunctionAssurancePolicyTrustedBaseImageArgs();
    }
}
