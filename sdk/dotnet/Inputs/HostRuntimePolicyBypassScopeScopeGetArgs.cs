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

    public sealed class HostRuntimePolicyBypassScopeScopeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Scope expression.
        /// </summary>
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        [Input("variables")]
        private InputList<Inputs.HostRuntimePolicyBypassScopeScopeVariableGetArgs>? _variables;

        /// <summary>
        /// List of variables in the scope.
        /// </summary>
        public InputList<Inputs.HostRuntimePolicyBypassScopeScopeVariableGetArgs> Variables
        {
            get => _variables ?? (_variables = new InputList<Inputs.HostRuntimePolicyBypassScopeScopeVariableGetArgs>());
            set => _variables = value;
        }

        public HostRuntimePolicyBypassScopeScopeGetArgs()
        {
        }
        public static new HostRuntimePolicyBypassScopeScopeGetArgs Empty => new HostRuntimePolicyBypassScopeScopeGetArgs();
    }
}
