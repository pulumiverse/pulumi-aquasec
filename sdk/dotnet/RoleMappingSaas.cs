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
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aquasec = Pulumiverse.Aquasec;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var rolesMappingSaasRoleMappingSaas = new Aquasec.RoleMappingSaas("rolesMappingSaasRoleMappingSaas", new()
    ///     {
    ///         SamlGroups = new[]
    ///         {
    ///             "group1",
    ///             "group2",
    ///         },
    ///         CspRole = "Administrator",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["rolesMappingSaas"] = rolesMappingSaasRoleMappingSaas,
    ///     };
    /// });
    /// ```
    /// </summary>
    [AquasecResourceType("aquasec:index/roleMappingSaas:RoleMappingSaas")]
    public partial class RoleMappingSaas : global::Pulumi.CustomResource
    {
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        [Output("cspRole")]
        public Output<string> CspRole { get; private set; } = null!;

        [Output("roleMappingId")]
        public Output<int> RoleMappingId { get; private set; } = null!;

        [Output("samlGroups")]
        public Output<ImmutableArray<string>> SamlGroups { get; private set; } = null!;


        /// <summary>
        /// Create a RoleMappingSaas resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RoleMappingSaas(string name, RoleMappingSaasArgs args, CustomResourceOptions? options = null)
            : base("aquasec:index/roleMappingSaas:RoleMappingSaas", name, args ?? new RoleMappingSaasArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RoleMappingSaas(string name, Input<string> id, RoleMappingSaasState? state = null, CustomResourceOptions? options = null)
            : base("aquasec:index/roleMappingSaas:RoleMappingSaas", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RoleMappingSaas resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RoleMappingSaas Get(string name, Input<string> id, RoleMappingSaasState? state = null, CustomResourceOptions? options = null)
        {
            return new RoleMappingSaas(name, id, state, options);
        }
    }

    public sealed class RoleMappingSaasArgs : global::Pulumi.ResourceArgs
    {
        [Input("cspRole", required: true)]
        public Input<string> CspRole { get; set; } = null!;

        [Input("samlGroups", required: true)]
        private InputList<string>? _samlGroups;
        public InputList<string> SamlGroups
        {
            get => _samlGroups ?? (_samlGroups = new InputList<string>());
            set => _samlGroups = value;
        }

        public RoleMappingSaasArgs()
        {
        }
        public static new RoleMappingSaasArgs Empty => new RoleMappingSaasArgs();
    }

    public sealed class RoleMappingSaasState : global::Pulumi.ResourceArgs
    {
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("created")]
        public Input<string>? Created { get; set; }

        [Input("cspRole")]
        public Input<string>? CspRole { get; set; }

        [Input("roleMappingId")]
        public Input<int>? RoleMappingId { get; set; }

        [Input("samlGroups")]
        private InputList<string>? _samlGroups;
        public InputList<string> SamlGroups
        {
            get => _samlGroups ?? (_samlGroups = new InputList<string>());
            set => _samlGroups = value;
        }

        public RoleMappingSaasState()
        {
        }
        public static new RoleMappingSaasState Empty => new RoleMappingSaasState();
    }
}
