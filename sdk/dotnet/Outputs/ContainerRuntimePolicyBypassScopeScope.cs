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
    public sealed class ContainerRuntimePolicyBypassScopeScope
    {
        /// <summary>
        /// Scope expression.
        /// </summary>
        public readonly string? Expression;
        /// <summary>
        /// List of variables in the scope.
        /// </summary>
        public readonly ImmutableArray<Outputs.ContainerRuntimePolicyBypassScopeScopeVariable> Variables;

        [OutputConstructor]
        private ContainerRuntimePolicyBypassScopeScope(
            string? expression,

            ImmutableArray<Outputs.ContainerRuntimePolicyBypassScopeScopeVariable> variables)
        {
            Expression = expression;
            Variables = variables;
        }
    }
}
