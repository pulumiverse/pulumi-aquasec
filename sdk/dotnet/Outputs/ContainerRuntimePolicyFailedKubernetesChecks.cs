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
    public sealed class ContainerRuntimePolicyFailedKubernetesChecks
    {
        public readonly bool? Enabled;
        public readonly ImmutableArray<string> FailedChecks;

        [OutputConstructor]
        private ContainerRuntimePolicyFailedKubernetesChecks(
            bool? enabled,

            ImmutableArray<string> failedChecks)
        {
            Enabled = enabled;
            FailedChecks = failedChecks;
        }
    }
}
