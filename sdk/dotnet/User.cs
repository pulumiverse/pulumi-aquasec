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
    /// The `aquasec.User` resource manages your users within Aqua.
    /// 
    /// The users created must have at least one Role that is already present within Aqua.
    /// 
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
    ///     var iaC = new Aquasec.User("iaC", new()
    ///     {
    ///         UserId = "IaC",
    ///         Password = @var.Password,
    ///         Roles = new[]
    ///         {
    ///             "infrastructure",
    ///         },
    ///         Email = "infrastructure@example.com",
    ///         FirstTime = true,
    ///     });
    /// 
    ///     // Display name for this user
    /// });
    /// ```
    /// </summary>
    [AquasecResourceType("aquasec:index/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The user Email.
        /// </summary>
        [Output("email")]
        public Output<string?> Email { get; private set; } = null!;

        /// <summary>
        /// If the user must change the password first login. Applicable only one time, Later for user password resets use aqua console.
        /// </summary>
        [Output("firstTime")]
        public Output<bool?> FirstTime { get; private set; } = null!;

        /// <summary>
        /// Give the Permission Set full access, meaning all actions are allowed without restriction.
        /// </summary>
        [Output("isSuper")]
        public Output<bool> IsSuper { get; private set; } = null!;

        /// <summary>
        /// The user name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Login password for the user; string, required, at least 8 characters long.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Password confirmation.
        /// </summary>
        [Output("passwordConfirm")]
        public Output<string?> PasswordConfirm { get; private set; } = null!;

        /// <summary>
        /// User's Aqua plan (Developer / Team / Advanced).
        /// </summary>
        [Output("plan")]
        public Output<string> Plan { get; private set; } = null!;

        /// <summary>
        /// The first role that assigned to the user for backward compatibility.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;

        /// <summary>
        /// The roles that will be assigned to the user.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// The user type (Aqua, LDAP, SAML, OAuth2, OpenID, Tenant Manager).
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Whether to allow UI access for users with this Permission Set.
        /// </summary>
        [Output("uiAccess")]
        public Output<bool> UiAccess { get; private set; } = null!;

        /// <summary>
        /// The user ID.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("aquasec:index/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("aquasec:index/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user Email.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// If the user must change the password first login. Applicable only one time, Later for user password resets use aqua console.
        /// </summary>
        [Input("firstTime")]
        public Input<bool>? FirstTime { get; set; }

        /// <summary>
        /// The user name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Login password for the user; string, required, at least 8 characters long.
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        /// <summary>
        /// Password confirmation.
        /// </summary>
        [Input("passwordConfirm")]
        public Input<string>? PasswordConfirm { get; set; }

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// The roles that will be assigned to the user.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// The user ID.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user Email.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// If the user must change the password first login. Applicable only one time, Later for user password resets use aqua console.
        /// </summary>
        [Input("firstTime")]
        public Input<bool>? FirstTime { get; set; }

        /// <summary>
        /// Give the Permission Set full access, meaning all actions are allowed without restriction.
        /// </summary>
        [Input("isSuper")]
        public Input<bool>? IsSuper { get; set; }

        /// <summary>
        /// The user name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Login password for the user; string, required, at least 8 characters long.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Password confirmation.
        /// </summary>
        [Input("passwordConfirm")]
        public Input<string>? PasswordConfirm { get; set; }

        /// <summary>
        /// User's Aqua plan (Developer / Team / Advanced).
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// The first role that assigned to the user for backward compatibility.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// The roles that will be assigned to the user.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// The user type (Aqua, LDAP, SAML, OAuth2, OpenID, Tenant Manager).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Whether to allow UI access for users with this Permission Set.
        /// </summary>
        [Input("uiAccess")]
        public Input<bool>? UiAccess { get; set; }

        /// <summary>
        /// The user ID.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
