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

    public sealed class FunctionRuntimePolicyFailedKubernetesChecksGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("failedChecks")]
        private InputList<string>? _failedChecks;
        public InputList<string> FailedChecks
        {
            get => _failedChecks ?? (_failedChecks = new InputList<string>());
            set => _failedChecks = value;
        }

        public FunctionRuntimePolicyFailedKubernetesChecksGetArgs()
        {
        }
        public static new FunctionRuntimePolicyFailedKubernetesChecksGetArgs Empty => new FunctionRuntimePolicyFailedKubernetesChecksGetArgs();
    }
}
