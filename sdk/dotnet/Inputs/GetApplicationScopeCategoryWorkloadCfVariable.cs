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

    public sealed class GetApplicationScopeCategoryWorkloadCfVariableArgs : global::Pulumi.InvokeArgs
    {
        [Input("attribute", required: true)]
        public string Attribute { get; set; } = null!;

        [Input("value")]
        public string? Value { get; set; }

        public GetApplicationScopeCategoryWorkloadCfVariableArgs()
        {
        }
        public static new GetApplicationScopeCategoryWorkloadCfVariableArgs Empty => new GetApplicationScopeCategoryWorkloadCfVariableArgs();
    }
}
