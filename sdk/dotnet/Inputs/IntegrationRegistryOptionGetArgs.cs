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

    public sealed class IntegrationRegistryOptionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("option")]
        public Input<string>? Option { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public IntegrationRegistryOptionGetArgs()
        {
        }
        public static new IntegrationRegistryOptionGetArgs Empty => new IntegrationRegistryOptionGetArgs();
    }
}