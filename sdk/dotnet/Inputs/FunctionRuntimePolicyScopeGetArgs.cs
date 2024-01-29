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

    public sealed class FunctionRuntimePolicyScopeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Scope expression.
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        [Input("variables", required: true)]
        private InputList<Inputs.FunctionRuntimePolicyScopeVariableGetArgs>? _variables;

        /// <summary>
        /// List of variables in the scope.
        /// </summary>
        public InputList<Inputs.FunctionRuntimePolicyScopeVariableGetArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.FunctionRuntimePolicyScopeVariableGetArgs>());
            set => _variables = value;
        }

        public FunctionRuntimePolicyScopeGetArgs()
        {
        }
        public static new FunctionRuntimePolicyScopeGetArgs Empty => new FunctionRuntimePolicyScopeGetArgs();
    }
}
