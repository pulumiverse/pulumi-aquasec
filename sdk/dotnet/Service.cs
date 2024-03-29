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
    [AquasecResourceType("aquasec:index/service:Service")]
    public partial class Service : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates the application scope of the service.
        /// </summary>
        [Output("applicationScopes")]
        public Output<ImmutableArray<string>> ApplicationScopes { get; private set; } = null!;

        /// <summary>
        /// Username of the account that created the service.
        /// </summary>
        [Output("author")]
        public Output<string> Author { get; private set; } = null!;

        /// <summary>
        /// The number of containers associated with the service.
        /// </summary>
        [Output("containersCount")]
        public Output<int> ContainersCount { get; private set; } = null!;

        /// <summary>
        /// A textual description of the service record; maximum 500 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Enforcement status of the service.
        /// </summary>
        [Output("enforce")]
        public Output<bool?> Enforce { get; private set; } = null!;

        /// <summary>
        /// Whether the service has been evaluated for security vulnerabilities.
        /// </summary>
        [Output("evaluated")]
        public Output<bool> Evaluated { get; private set; } = null!;

        /// <summary>
        /// Indicates if registered or not.
        /// </summary>
        [Output("isRegistered")]
        public Output<bool> IsRegistered { get; private set; } = null!;

        /// <summary>
        /// Timestamp of the last update in Unix time format.
        /// </summary>
        [Output("lastupdate")]
        public Output<int> Lastupdate { get; private set; } = null!;

        /// <summary>
        /// Indicates if monitoring is enabled or not
        /// </summary>
        [Output("monitoring")]
        public Output<bool?> Monitoring { get; private set; } = null!;

        /// <summary>
        /// Name assigned to the attribute.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of container that are not evaluated.
        /// </summary>
        [Output("notEvaluatedCount")]
        public Output<int> NotEvaluatedCount { get; private set; } = null!;

        /// <summary>
        /// The service's policies; an array of container firewall policy names.
        /// </summary>
        [Output("policies")]
        public Output<ImmutableArray<string>> Policies { get; private set; } = null!;

        /// <summary>
        /// Rules priority, must be between 1-100.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// Logical expression of how to compute the dependency of the scope variables.
        /// </summary>
        [Output("scopeExpression")]
        public Output<string?> ScopeExpression { get; private set; } = null!;

        /// <summary>
        /// List of scope attributes.
        /// </summary>
        [Output("scopeVariables")]
        public Output<ImmutableArray<Outputs.ServiceScopeVariable>> ScopeVariables { get; private set; } = null!;

        /// <summary>
        /// Type of the workload. container or host.
        /// </summary>
        [Output("target")]
        public Output<string> Target { get; private set; } = null!;

        /// <summary>
        /// The number of containers allocated to the service that are not registered.
        /// </summary>
        [Output("unregisteredCount")]
        public Output<int> UnregisteredCount { get; private set; } = null!;

        /// <summary>
        /// Number of high severity vulnerabilities.
        /// </summary>
        [Output("vulnerabilitiesHigh")]
        public Output<int> VulnerabilitiesHigh { get; private set; } = null!;

        /// <summary>
        /// Number of low severity vulnerabilities.
        /// </summary>
        [Output("vulnerabilitiesLow")]
        public Output<int> VulnerabilitiesLow { get; private set; } = null!;

        /// <summary>
        /// Number of malware.
        /// </summary>
        [Output("vulnerabilitiesMalware")]
        public Output<int> VulnerabilitiesMalware { get; private set; } = null!;

        /// <summary>
        /// Number of medium severity vulnerabilities.
        /// </summary>
        [Output("vulnerabilitiesMedium")]
        public Output<int> VulnerabilitiesMedium { get; private set; } = null!;

        /// <summary>
        /// Number of negligible vulnerabilities.
        /// </summary>
        [Output("vulnerabilitiesNegligible")]
        public Output<int> VulnerabilitiesNegligible { get; private set; } = null!;

        /// <summary>
        /// The CVSS average vulnerabilities score.
        /// </summary>
        [Output("vulnerabilitiesScoreAverage")]
        public Output<int> VulnerabilitiesScoreAverage { get; private set; } = null!;

        /// <summary>
        /// Number of sensitive vulnerabilities.
        /// </summary>
        [Output("vulnerabilitiesSensitive")]
        public Output<int> VulnerabilitiesSensitive { get; private set; } = null!;

        /// <summary>
        /// Total number of vulnerabilities.
        /// </summary>
        [Output("vulnerabilitiesTotal")]
        public Output<int> VulnerabilitiesTotal { get; private set; } = null!;


        /// <summary>
        /// Create a Service resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Service(string name, ServiceArgs args, CustomResourceOptions? options = null)
            : base("aquasec:index/service:Service", name, args ?? new ServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Service(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
            : base("aquasec:index/service:Service", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumiverse/pulumi-aquasec",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Service resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Service Get(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new Service(name, id, state, options);
        }
    }

    public sealed class ServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("applicationScopes", required: true)]
        private InputList<string>? _applicationScopes;

        /// <summary>
        /// Indicates the application scope of the service.
        /// </summary>
        public InputList<string> ApplicationScopes
        {
            get => _applicationScopes ?? (_applicationScopes = new InputList<string>());
            set => _applicationScopes = value;
        }

        /// <summary>
        /// A textual description of the service record; maximum 500 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enforcement status of the service.
        /// </summary>
        [Input("enforce")]
        public Input<bool>? Enforce { get; set; }

        /// <summary>
        /// Indicates if monitoring is enabled or not
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// Name assigned to the attribute.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("policies", required: true)]
        private InputList<string>? _policies;

        /// <summary>
        /// The service's policies; an array of container firewall policy names.
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        /// <summary>
        /// Rules priority, must be between 1-100.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Logical expression of how to compute the dependency of the scope variables.
        /// </summary>
        [Input("scopeExpression")]
        public Input<string>? ScopeExpression { get; set; }

        [Input("scopeVariables")]
        private InputList<Inputs.ServiceScopeVariableArgs>? _scopeVariables;

        /// <summary>
        /// List of scope attributes.
        /// </summary>
        public InputList<Inputs.ServiceScopeVariableArgs> ScopeVariables
        {
            get => _scopeVariables ?? (_scopeVariables = new InputList<Inputs.ServiceScopeVariableArgs>());
            set => _scopeVariables = value;
        }

        /// <summary>
        /// Type of the workload. container or host.
        /// </summary>
        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        public ServiceArgs()
        {
        }
        public static new ServiceArgs Empty => new ServiceArgs();
    }

    public sealed class ServiceState : global::Pulumi.ResourceArgs
    {
        [Input("applicationScopes")]
        private InputList<string>? _applicationScopes;

        /// <summary>
        /// Indicates the application scope of the service.
        /// </summary>
        public InputList<string> ApplicationScopes
        {
            get => _applicationScopes ?? (_applicationScopes = new InputList<string>());
            set => _applicationScopes = value;
        }

        /// <summary>
        /// Username of the account that created the service.
        /// </summary>
        [Input("author")]
        public Input<string>? Author { get; set; }

        /// <summary>
        /// The number of containers associated with the service.
        /// </summary>
        [Input("containersCount")]
        public Input<int>? ContainersCount { get; set; }

        /// <summary>
        /// A textual description of the service record; maximum 500 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enforcement status of the service.
        /// </summary>
        [Input("enforce")]
        public Input<bool>? Enforce { get; set; }

        /// <summary>
        /// Whether the service has been evaluated for security vulnerabilities.
        /// </summary>
        [Input("evaluated")]
        public Input<bool>? Evaluated { get; set; }

        /// <summary>
        /// Indicates if registered or not.
        /// </summary>
        [Input("isRegistered")]
        public Input<bool>? IsRegistered { get; set; }

        /// <summary>
        /// Timestamp of the last update in Unix time format.
        /// </summary>
        [Input("lastupdate")]
        public Input<int>? Lastupdate { get; set; }

        /// <summary>
        /// Indicates if monitoring is enabled or not
        /// </summary>
        [Input("monitoring")]
        public Input<bool>? Monitoring { get; set; }

        /// <summary>
        /// Name assigned to the attribute.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of container that are not evaluated.
        /// </summary>
        [Input("notEvaluatedCount")]
        public Input<int>? NotEvaluatedCount { get; set; }

        [Input("policies")]
        private InputList<string>? _policies;

        /// <summary>
        /// The service's policies; an array of container firewall policy names.
        /// </summary>
        public InputList<string> Policies
        {
            get => _policies ?? (_policies = new InputList<string>());
            set => _policies = value;
        }

        /// <summary>
        /// Rules priority, must be between 1-100.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Logical expression of how to compute the dependency of the scope variables.
        /// </summary>
        [Input("scopeExpression")]
        public Input<string>? ScopeExpression { get; set; }

        [Input("scopeVariables")]
        private InputList<Inputs.ServiceScopeVariableGetArgs>? _scopeVariables;

        /// <summary>
        /// List of scope attributes.
        /// </summary>
        public InputList<Inputs.ServiceScopeVariableGetArgs> ScopeVariables
        {
            get => _scopeVariables ?? (_scopeVariables = new InputList<Inputs.ServiceScopeVariableGetArgs>());
            set => _scopeVariables = value;
        }

        /// <summary>
        /// Type of the workload. container or host.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// The number of containers allocated to the service that are not registered.
        /// </summary>
        [Input("unregisteredCount")]
        public Input<int>? UnregisteredCount { get; set; }

        /// <summary>
        /// Number of high severity vulnerabilities.
        /// </summary>
        [Input("vulnerabilitiesHigh")]
        public Input<int>? VulnerabilitiesHigh { get; set; }

        /// <summary>
        /// Number of low severity vulnerabilities.
        /// </summary>
        [Input("vulnerabilitiesLow")]
        public Input<int>? VulnerabilitiesLow { get; set; }

        /// <summary>
        /// Number of malware.
        /// </summary>
        [Input("vulnerabilitiesMalware")]
        public Input<int>? VulnerabilitiesMalware { get; set; }

        /// <summary>
        /// Number of medium severity vulnerabilities.
        /// </summary>
        [Input("vulnerabilitiesMedium")]
        public Input<int>? VulnerabilitiesMedium { get; set; }

        /// <summary>
        /// Number of negligible vulnerabilities.
        /// </summary>
        [Input("vulnerabilitiesNegligible")]
        public Input<int>? VulnerabilitiesNegligible { get; set; }

        /// <summary>
        /// The CVSS average vulnerabilities score.
        /// </summary>
        [Input("vulnerabilitiesScoreAverage")]
        public Input<int>? VulnerabilitiesScoreAverage { get; set; }

        /// <summary>
        /// Number of sensitive vulnerabilities.
        /// </summary>
        [Input("vulnerabilitiesSensitive")]
        public Input<int>? VulnerabilitiesSensitive { get; set; }

        /// <summary>
        /// Total number of vulnerabilities.
        /// </summary>
        [Input("vulnerabilitiesTotal")]
        public Input<int>? VulnerabilitiesTotal { get; set; }

        public ServiceState()
        {
        }
        public static new ServiceState Empty => new ServiceState();
    }
}
