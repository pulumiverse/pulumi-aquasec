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

    public sealed class ContainerRuntimePolicyScopeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Scope expression.
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        [Input("variables", required: true)]
        private InputList<Inputs.ContainerRuntimePolicyScopeVariableArgs>? _variables;

        /// <summary>
        /// List of variables in the scope.
        /// </summary>
        public InputList<Inputs.ContainerRuntimePolicyScopeVariableArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.ContainerRuntimePolicyScopeVariableArgs>());
            set => _variables = value;
        }

        public ContainerRuntimePolicyScopeArgs()
        {
        }
        public static new ContainerRuntimePolicyScopeArgs Empty => new ContainerRuntimePolicyScopeArgs();
    }
}