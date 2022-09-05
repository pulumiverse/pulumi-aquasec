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
    /// The `aquasec.UserSaas` resource manages your saas users within Aqua.
    /// 
    /// The users created must have at least one Csp Role that is already present within Aqua.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aquasec = Pulumiverse.Aquasec;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var iaC1 = new Aquasec.UserSaas("iaC1", new()
    ///     {
    ///         AccountAdmin = true,
    ///         CspRoles = new[] {},
    ///         Email = "infrastructure1@example.com",
    ///     });
    /// 
    ///     var iaC2 = new Aquasec.UserSaas("iaC2", new()
    ///     {
    ///         AccountAdmin = false,
    ///         CspRoles = new[]
    ///         {
    ///             "Default",
    ///         },
    ///         Email = "infrastructure2@example.com",
    ///         Groups = new[]
    ///         {
    ///             new Aquasec.Inputs.UserSaasGroupArgs
    ///             {
    ///                 GroupAdmin = false,
    ///                 Name = "IacGroupName",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AquasecResourceType("aquasec:index/userSaas:UserSaas")]
    public partial class UserSaas : global::Pulumi.CustomResource
    {
        [Output("accountAdmin")]
        public Output<bool> AccountAdmin { get; private set; } = null!;

        [Output("confirmed")]
        public Output<bool> Confirmed { get; private set; } = null!;

        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        [Output("cspRoles")]
        public Output<ImmutableArray<string>> CspRoles { get; private set; } = null!;

        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        [Output("groups")]
        public Output<ImmutableArray<Outputs.UserSaasGroup>> Groups { get; private set; } = null!;

        [Output("logins")]
        public Output<ImmutableArray<Outputs.UserSaasLogin>> Logins { get; private set; } = null!;

        [Output("multiaccount")]
        public Output<bool> Multiaccount { get; private set; } = null!;

        [Output("passwordReset")]
        public Output<bool> PasswordReset { get; private set; } = null!;

        [Output("sendAnnouncements")]
        public Output<bool> SendAnnouncements { get; private set; } = null!;

        [Output("sendNewPlugins")]
        public Output<bool> SendNewPlugins { get; private set; } = null!;

        [Output("sendNewRisks")]
        public Output<bool> SendNewRisks { get; private set; } = null!;

        [Output("sendScanResults")]
        public Output<bool> SendScanResults { get; private set; } = null!;

        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a UserSaas resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserSaas(string name, UserSaasArgs args, CustomResourceOptions? options = null)
            : base("aquasec:index/userSaas:UserSaas", name, args ?? new UserSaasArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserSaas(string name, Input<string> id, UserSaasState? state = null, CustomResourceOptions? options = null)
            : base("aquasec:index/userSaas:UserSaas", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserSaas resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserSaas Get(string name, Input<string> id, UserSaasState? state = null, CustomResourceOptions? options = null)
        {
            return new UserSaas(name, id, state, options);
        }
    }

    public sealed class UserSaasArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountAdmin", required: true)]
        public Input<bool> AccountAdmin { get; set; } = null!;

        [Input("cspRoles", required: true)]
        private InputList<string>? _cspRoles;
        public InputList<string> CspRoles
        {
            get => _cspRoles ?? (_cspRoles = new InputList<string>());
            set => _cspRoles = value;
        }

        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        [Input("groups")]
        private InputList<Inputs.UserSaasGroupArgs>? _groups;
        public InputList<Inputs.UserSaasGroupArgs> Groups
        {
            get => _groups ?? (_groups = new InputList<Inputs.UserSaasGroupArgs>());
            set => _groups = value;
        }

        public UserSaasArgs()
        {
        }
        public static new UserSaasArgs Empty => new UserSaasArgs();
    }

    public sealed class UserSaasState : global::Pulumi.ResourceArgs
    {
        [Input("accountAdmin")]
        public Input<bool>? AccountAdmin { get; set; }

        [Input("confirmed")]
        public Input<bool>? Confirmed { get; set; }

        [Input("created")]
        public Input<string>? Created { get; set; }

        [Input("cspRoles")]
        private InputList<string>? _cspRoles;
        public InputList<string> CspRoles
        {
            get => _cspRoles ?? (_cspRoles = new InputList<string>());
            set => _cspRoles = value;
        }

        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("groups")]
        private InputList<Inputs.UserSaasGroupGetArgs>? _groups;
        public InputList<Inputs.UserSaasGroupGetArgs> Groups
        {
            get => _groups ?? (_groups = new InputList<Inputs.UserSaasGroupGetArgs>());
            set => _groups = value;
        }

        [Input("logins")]
        private InputList<Inputs.UserSaasLoginGetArgs>? _logins;
        public InputList<Inputs.UserSaasLoginGetArgs> Logins
        {
            get => _logins ?? (_logins = new InputList<Inputs.UserSaasLoginGetArgs>());
            set => _logins = value;
        }

        [Input("multiaccount")]
        public Input<bool>? Multiaccount { get; set; }

        [Input("passwordReset")]
        public Input<bool>? PasswordReset { get; set; }

        [Input("sendAnnouncements")]
        public Input<bool>? SendAnnouncements { get; set; }

        [Input("sendNewPlugins")]
        public Input<bool>? SendNewPlugins { get; set; }

        [Input("sendNewRisks")]
        public Input<bool>? SendNewRisks { get; set; }

        [Input("sendScanResults")]
        public Input<bool>? SendScanResults { get; set; }

        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserSaasState()
        {
        }
        public static new UserSaasState Empty => new UserSaasState();
    }
}
