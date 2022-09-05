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
    [AquasecResourceType("aquasec:index/applicationScope:ApplicationScope")]
    public partial class ApplicationScope : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Username of the account that created the service.
        /// </summary>
        [Output("author")]
        public Output<string> Author { get; private set; } = null!;

        /// <summary>
        /// Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
        /// </summary>
        [Output("categories")]
        public Output<ImmutableArray<Outputs.ApplicationScopeCategory>> Categories { get; private set; } = null!;

        /// <summary>
        /// Description of the application scope.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of an application scope.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Name of an application scope.
        /// </summary>
        [Output("ownerEmail")]
        public Output<string?> OwnerEmail { get; private set; } = null!;


        /// <summary>
        /// Create a ApplicationScope resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApplicationScope(string name, ApplicationScopeArgs? args = null, CustomResourceOptions? options = null)
            : base("aquasec:index/applicationScope:ApplicationScope", name, args ?? new ApplicationScopeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApplicationScope(string name, Input<string> id, ApplicationScopeState? state = null, CustomResourceOptions? options = null)
            : base("aquasec:index/applicationScope:ApplicationScope", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApplicationScope resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApplicationScope Get(string name, Input<string> id, ApplicationScopeState? state = null, CustomResourceOptions? options = null)
        {
            return new ApplicationScope(name, id, state, options);
        }
    }

    public sealed class ApplicationScopeArgs : global::Pulumi.ResourceArgs
    {
        [Input("categories")]
        private InputList<Inputs.ApplicationScopeCategoryArgs>? _categories;

        /// <summary>
        /// Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
        /// </summary>
        public InputList<Inputs.ApplicationScopeCategoryArgs> Categories
        {
            get => _categories ?? (_categories = new InputList<Inputs.ApplicationScopeCategoryArgs>());
            set => _categories = value;
        }

        /// <summary>
        /// Description of the application scope.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of an application scope.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Name of an application scope.
        /// </summary>
        [Input("ownerEmail")]
        public Input<string>? OwnerEmail { get; set; }

        public ApplicationScopeArgs()
        {
        }
        public static new ApplicationScopeArgs Empty => new ApplicationScopeArgs();
    }

    public sealed class ApplicationScopeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Username of the account that created the service.
        /// </summary>
        [Input("author")]
        public Input<string>? Author { get; set; }

        [Input("categories")]
        private InputList<Inputs.ApplicationScopeCategoryGetArgs>? _categories;

        /// <summary>
        /// Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
        /// </summary>
        public InputList<Inputs.ApplicationScopeCategoryGetArgs> Categories
        {
            get => _categories ?? (_categories = new InputList<Inputs.ApplicationScopeCategoryGetArgs>());
            set => _categories = value;
        }

        /// <summary>
        /// Description of the application scope.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of an application scope.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Name of an application scope.
        /// </summary>
        [Input("ownerEmail")]
        public Input<string>? OwnerEmail { get; set; }

        public ApplicationScopeState()
        {
        }
        public static new ApplicationScopeState Empty => new ApplicationScopeState();
    }
}
