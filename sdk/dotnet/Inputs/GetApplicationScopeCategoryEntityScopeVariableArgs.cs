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

    public sealed class GetApplicationScopeCategoryEntityScopeVariableInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("attribute", required: true)]
        public Input<string> Attribute { get; set; } = null!;

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public GetApplicationScopeCategoryEntityScopeVariableInputArgs()
        {
        }
        public static new GetApplicationScopeCategoryEntityScopeVariableInputArgs Empty => new GetApplicationScopeCategoryEntityScopeVariableInputArgs();
    }
}
