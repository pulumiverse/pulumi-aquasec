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
    public sealed class GetApplicationScopeCategoryWorkloadResult
    {
        public readonly ImmutableArray<Outputs.GetApplicationScopeCategoryWorkloadCfResult> Cfs;
        public readonly ImmutableArray<Outputs.GetApplicationScopeCategoryWorkloadKuberneteResult> Kubernetes;
        public readonly ImmutableArray<Outputs.GetApplicationScopeCategoryWorkloadOResult> Os;

        [OutputConstructor]
        private GetApplicationScopeCategoryWorkloadResult(
            ImmutableArray<Outputs.GetApplicationScopeCategoryWorkloadCfResult> cfs,

            ImmutableArray<Outputs.GetApplicationScopeCategoryWorkloadKuberneteResult> kubernetes,

            ImmutableArray<Outputs.GetApplicationScopeCategoryWorkloadOResult> os)
        {
            Cfs = cfs;
            Kubernetes = kubernetes;
            Os = os;
        }
    }
}
