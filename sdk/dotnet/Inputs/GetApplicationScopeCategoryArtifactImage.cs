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

    public sealed class GetApplicationScopeCategoryArtifactImageArgs : global::Pulumi.InvokeArgs
    {
        [Input("expression", required: true)]
        public string Expression { get; set; } = null!;

        [Input("variables")]
        private List<Inputs.GetApplicationScopeCategoryArtifactImageVariableArgs>? _variables;
        public List<Inputs.GetApplicationScopeCategoryArtifactImageVariableArgs> Variables
        {
            get => _variables ?? (_variables = new List<Inputs.GetApplicationScopeCategoryArtifactImageVariableArgs>());
            set => _variables = value;
        }

        public GetApplicationScopeCategoryArtifactImageArgs()
        {
        }
        public static new GetApplicationScopeCategoryArtifactImageArgs Empty => new GetApplicationScopeCategoryArtifactImageArgs();
    }
}
