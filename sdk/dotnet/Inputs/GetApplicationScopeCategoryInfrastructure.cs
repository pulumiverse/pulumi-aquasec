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

    public sealed class GetApplicationScopeCategoryInfrastructureArgs : global::Pulumi.InvokeArgs
    {
        [Input("kubernetes")]
        private List<Inputs.GetApplicationScopeCategoryInfrastructureKuberneteArgs>? _kubernetes;
        public List<Inputs.GetApplicationScopeCategoryInfrastructureKuberneteArgs> Kubernetes
        {
            get => _kubernetes ?? (_kubernetes = new List<Inputs.GetApplicationScopeCategoryInfrastructureKuberneteArgs>());
            set => _kubernetes = value;
        }

        [Input("os")]
        private List<Inputs.GetApplicationScopeCategoryInfrastructureOArgs>? _os;
        public List<Inputs.GetApplicationScopeCategoryInfrastructureOArgs> Os
        {
            get => _os ?? (_os = new List<Inputs.GetApplicationScopeCategoryInfrastructureOArgs>());
            set => _os = value;
        }

        public GetApplicationScopeCategoryInfrastructureArgs()
        {
        }
        public static new GetApplicationScopeCategoryInfrastructureArgs Empty => new GetApplicationScopeCategoryInfrastructureArgs();
    }
}
