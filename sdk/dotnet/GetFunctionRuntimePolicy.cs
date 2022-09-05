// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec
{
    public static class GetFunctionRuntimePolicy
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var functionRuntimePolicy = Aquasec.GetFunctionRuntimePolicy.Invoke(new()
        ///     {
        ///         Name = "FunctionRuntimePolicyName",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["functionRuntimePolicyDetails"] = functionRuntimePolicy.Apply(getFunctionRuntimePolicyResult =&gt; getFunctionRuntimePolicyResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFunctionRuntimePolicyResult> InvokeAsync(GetFunctionRuntimePolicyArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetFunctionRuntimePolicyResult>("aquasec:index/getFunctionRuntimePolicy:getFunctionRuntimePolicy", args ?? new GetFunctionRuntimePolicyArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var functionRuntimePolicy = Aquasec.GetFunctionRuntimePolicy.Invoke(new()
        ///     {
        ///         Name = "FunctionRuntimePolicyName",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["functionRuntimePolicyDetails"] = functionRuntimePolicy.Apply(getFunctionRuntimePolicyResult =&gt; getFunctionRuntimePolicyResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFunctionRuntimePolicyResult> Invoke(GetFunctionRuntimePolicyInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetFunctionRuntimePolicyResult>("aquasec:index/getFunctionRuntimePolicy:getFunctionRuntimePolicy", args ?? new GetFunctionRuntimePolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFunctionRuntimePolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the function runtime policy
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetFunctionRuntimePolicyArgs()
        {
        }
        public static new GetFunctionRuntimePolicyArgs Empty => new GetFunctionRuntimePolicyArgs();
    }

    public sealed class GetFunctionRuntimePolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the function runtime policy
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetFunctionRuntimePolicyInvokeArgs()
        {
        }
        public static new GetFunctionRuntimePolicyInvokeArgs Empty => new GetFunctionRuntimePolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetFunctionRuntimePolicyResult
    {
        /// <summary>
        /// Indicates the application scope of the service.
        /// </summary>
        public readonly ImmutableArray<string> ApplicationScopes;
        /// <summary>
        /// Username of the account that created the service.
        /// </summary>
        public readonly string Author;
        /// <summary>
        /// If true, prevent creation of malicious executables in functions during their runtime post invocation.
        /// </summary>
        public readonly bool BlockMaliciousExecutables;
        /// <summary>
        /// List of processes that will be allowed
        /// </summary>
        public readonly ImmutableArray<string> BlockMaliciousExecutablesAllowedProcesses;
        /// <summary>
        /// If true, prevent running of executables in functions locate in /tmp folder during their runtime post invocation.
        /// </summary>
        public readonly bool BlockRunningExecutablesInTmpFolder;
        /// <summary>
        /// List of executables that are prevented from running in containers.
        /// </summary>
        public readonly ImmutableArray<string> BlockedExecutables;
        /// <summary>
        /// The description of the function runtime policy
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Indicates if the runtime policy is enabled or not.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Indicates that policy should effect container execution (not just for audit).
        /// </summary>
        public readonly bool Enforce;
        /// <summary>
        /// Honeypot User ID (Access Key)
        /// </summary>
        public readonly string HoneypotAccessKey;
        /// <summary>
        /// List of options to apply the honeypot on (Environment Vairable, Layer, File)
        /// </summary>
        public readonly ImmutableArray<string> HoneypotApplyOns;
        /// <summary>
        /// Honeypot User Password (Secret Key)
        /// </summary>
        public readonly string HoneypotSecretKey;
        /// <summary>
        /// Serverless application name
        /// </summary>
        public readonly string HoneypotServerlessAppName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the function runtime policy
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Logical expression of how to compute the dependency of the scope variables.
        /// </summary>
        public readonly string ScopeExpression;
        /// <summary>
        /// List of scope attributes.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFunctionRuntimePolicyScopeVariableResult> ScopeVariables;

        [OutputConstructor]
        private GetFunctionRuntimePolicyResult(
            ImmutableArray<string> applicationScopes,

            string author,

            bool blockMaliciousExecutables,

            ImmutableArray<string> blockMaliciousExecutablesAllowedProcesses,

            bool blockRunningExecutablesInTmpFolder,

            ImmutableArray<string> blockedExecutables,

            string description,

            bool enabled,

            bool enforce,

            string honeypotAccessKey,

            ImmutableArray<string> honeypotApplyOns,

            string honeypotSecretKey,

            string honeypotServerlessAppName,

            string id,

            string name,

            string scopeExpression,

            ImmutableArray<Outputs.GetFunctionRuntimePolicyScopeVariableResult> scopeVariables)
        {
            ApplicationScopes = applicationScopes;
            Author = author;
            BlockMaliciousExecutables = blockMaliciousExecutables;
            BlockMaliciousExecutablesAllowedProcesses = blockMaliciousExecutablesAllowedProcesses;
            BlockRunningExecutablesInTmpFolder = blockRunningExecutablesInTmpFolder;
            BlockedExecutables = blockedExecutables;
            Description = description;
            Enabled = enabled;
            Enforce = enforce;
            HoneypotAccessKey = honeypotAccessKey;
            HoneypotApplyOns = honeypotApplyOns;
            HoneypotSecretKey = honeypotSecretKey;
            HoneypotServerlessAppName = honeypotServerlessAppName;
            Id = id;
            Name = name;
            ScopeExpression = scopeExpression;
            ScopeVariables = scopeVariables;
        }
    }
}
