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

    public sealed class ApplicationScopeCategoryWorkloadOVariableArgs : global::Pulumi.ResourceArgs
    {
        [Input("attribute")]
        public Input<string>? Attribute { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public ApplicationScopeCategoryWorkloadOVariableArgs()
        {
        }
        public static new ApplicationScopeCategoryWorkloadOVariableArgs Empty => new ApplicationScopeCategoryWorkloadOVariableArgs();
    }
}
