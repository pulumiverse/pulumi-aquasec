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

    public sealed class VmwareAssurancePolicyPackagesWhiteListArgs : global::Pulumi.ResourceArgs
    {
        [Input("arch")]
        public Input<string>? Arch { get; set; }

        [Input("display")]
        public Input<string>? Display { get; set; }

        [Input("epoch")]
        public Input<string>? Epoch { get; set; }

        [Input("format")]
        public Input<string>? Format { get; set; }

        [Input("license")]
        public Input<string>? License { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("release")]
        public Input<string>? Release { get; set; }

        [Input("version")]
        public Input<string>? Version { get; set; }

        [Input("versionRange")]
        public Input<string>? VersionRange { get; set; }

        public VmwareAssurancePolicyPackagesWhiteListArgs()
        {
        }
        public static new VmwareAssurancePolicyPackagesWhiteListArgs Empty => new VmwareAssurancePolicyPackagesWhiteListArgs();
    }
}
