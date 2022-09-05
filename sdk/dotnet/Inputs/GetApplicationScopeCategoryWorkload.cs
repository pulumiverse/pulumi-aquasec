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

    public sealed class GetApplicationScopeCategoryWorkloadArgs : global::Pulumi.InvokeArgs
    {
        [Input("cfs")]
        private List<Inputs.GetApplicationScopeCategoryWorkloadCfArgs>? _cfs;
        public List<Inputs.GetApplicationScopeCategoryWorkloadCfArgs> Cfs
        {
            get => _cfs ?? (_cfs = new List<Inputs.GetApplicationScopeCategoryWorkloadCfArgs>());
            set => _cfs = value;
        }

        [Input("kubernetes")]
        private List<Inputs.GetApplicationScopeCategoryWorkloadKuberneteArgs>? _kubernetes;
        public List<Inputs.GetApplicationScopeCategoryWorkloadKuberneteArgs> Kubernetes
        {
            get => _kubernetes ?? (_kubernetes = new List<Inputs.GetApplicationScopeCategoryWorkloadKuberneteArgs>());
            set => _kubernetes = value;
        }

        [Input("os")]
        private List<Inputs.GetApplicationScopeCategoryWorkloadOArgs>? _os;
        public List<Inputs.GetApplicationScopeCategoryWorkloadOArgs> Os
        {
            get => _os ?? (_os = new List<Inputs.GetApplicationScopeCategoryWorkloadOArgs>());
            set => _os = value;
        }

        public GetApplicationScopeCategoryWorkloadArgs()
        {
        }
        public static new GetApplicationScopeCategoryWorkloadArgs Empty => new GetApplicationScopeCategoryWorkloadArgs();
    }
}
