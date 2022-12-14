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

    public sealed class GetApplicationScopeCategoryArgs : global::Pulumi.InvokeArgs
    {
        [Input("artifacts")]
        private List<Inputs.GetApplicationScopeCategoryArtifactArgs>? _artifacts;
        public List<Inputs.GetApplicationScopeCategoryArtifactArgs> Artifacts
        {
            get => _artifacts ?? (_artifacts = new List<Inputs.GetApplicationScopeCategoryArtifactArgs>());
            set => _artifacts = value;
        }

        [Input("entityScopes")]
        private List<Inputs.GetApplicationScopeCategoryEntityScopeArgs>? _entityScopes;
        public List<Inputs.GetApplicationScopeCategoryEntityScopeArgs> EntityScopes
        {
            get => _entityScopes ?? (_entityScopes = new List<Inputs.GetApplicationScopeCategoryEntityScopeArgs>());
            set => _entityScopes = value;
        }

        [Input("infrastructures")]
        private List<Inputs.GetApplicationScopeCategoryInfrastructureArgs>? _infrastructures;
        public List<Inputs.GetApplicationScopeCategoryInfrastructureArgs> Infrastructures
        {
            get => _infrastructures ?? (_infrastructures = new List<Inputs.GetApplicationScopeCategoryInfrastructureArgs>());
            set => _infrastructures = value;
        }

        [Input("workloads")]
        private List<Inputs.GetApplicationScopeCategoryWorkloadArgs>? _workloads;
        public List<Inputs.GetApplicationScopeCategoryWorkloadArgs> Workloads
        {
            get => _workloads ?? (_workloads = new List<Inputs.GetApplicationScopeCategoryWorkloadArgs>());
            set => _workloads = value;
        }

        public GetApplicationScopeCategoryArgs()
        {
        }
        public static new GetApplicationScopeCategoryArgs Empty => new GetApplicationScopeCategoryArgs();
    }
}
