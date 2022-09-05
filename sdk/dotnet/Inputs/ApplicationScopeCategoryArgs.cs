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

    public sealed class ApplicationScopeCategoryArgs : global::Pulumi.ResourceArgs
    {
        [Input("artifacts")]
        private InputList<Inputs.ApplicationScopeCategoryArtifactArgs>? _artifacts;
        public InputList<Inputs.ApplicationScopeCategoryArtifactArgs> Artifacts
        {
            get => _artifacts ?? (_artifacts = new InputList<Inputs.ApplicationScopeCategoryArtifactArgs>());
            set => _artifacts = value;
        }

        [Input("entityScopes")]
        private InputList<Inputs.ApplicationScopeCategoryEntityScopeArgs>? _entityScopes;
        public InputList<Inputs.ApplicationScopeCategoryEntityScopeArgs> EntityScopes
        {
            get => _entityScopes ?? (_entityScopes = new InputList<Inputs.ApplicationScopeCategoryEntityScopeArgs>());
            set => _entityScopes = value;
        }

        [Input("infrastructures")]
        private InputList<Inputs.ApplicationScopeCategoryInfrastructureArgs>? _infrastructures;
        public InputList<Inputs.ApplicationScopeCategoryInfrastructureArgs> Infrastructures
        {
            get => _infrastructures ?? (_infrastructures = new InputList<Inputs.ApplicationScopeCategoryInfrastructureArgs>());
            set => _infrastructures = value;
        }

        [Input("workloads")]
        private InputList<Inputs.ApplicationScopeCategoryWorkloadArgs>? _workloads;
        public InputList<Inputs.ApplicationScopeCategoryWorkloadArgs> Workloads
        {
            get => _workloads ?? (_workloads = new InputList<Inputs.ApplicationScopeCategoryWorkloadArgs>());
            set => _workloads = value;
        }

        public ApplicationScopeCategoryArgs()
        {
        }
        public static new ApplicationScopeCategoryArgs Empty => new ApplicationScopeCategoryArgs();
    }
}
