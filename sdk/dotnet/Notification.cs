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
    /// Provides a Aquasec Notification resource. This can be used to create and manage Aquasec Notification resources.
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
    ///     var teams = new Aquasec.Notification("teams", new()
    ///     {
    ///         Properties = 
    ///         {
    ///             { "url", "&lt;TEAMS-URL&gt;" },
    ///         },
    ///         Type = "teams",
    ///     });
    /// 
    ///     var slack = new Aquasec.Notification("slack", new()
    ///     {
    ///         Properties = 
    ///         {
    ///             { "url", "&lt;SLACK-URL&gt;" },
    ///         },
    ///         Type = "slack",
    ///     });
    /// 
    ///     var webhook = new Aquasec.Notification("webhook", new()
    ///     {
    ///         Properties = 
    ///         {
    ///             { "url", "&lt;WEBHOOK-URL&gt;" },
    ///         },
    ///         Type = "webhook",
    ///     });
    /// 
    ///     var servicenow = new Aquasec.Notification("servicenow", new()
    ///     {
    ///         Properties = 
    ///         {
    ///             { "board_name", "" },
    ///             { "instance_name", "" },
    ///             { "password", "&lt;PASSWORD&gt;" },
    ///             { "url", "&lt;SERVICENOW-URL&gt;" },
    ///             { "user", "&lt;USERNAME&gt;" },
    ///         },
    ///         Type = "serviceNow",
    ///     });
    /// 
    ///     var jiraWithToken = new Aquasec.Notification("jiraWithToken", new()
    ///     {
    ///         Properties = 
    ///         {
    ///             { "definition_of_done", "Done" },
    ///             { "project_key", "&lt;JIRA_PROJECT_KEY&gt;" },
    ///             { "summary", "SOME_TEXT" },
    ///             { "token", "&lt;JIRA-TOKEN&gt;" },
    ///             { "url", "&lt;JIRA-URL&gt;" },
    ///         },
    ///         Type = "jira",
    ///     });
    /// 
    ///     var jiraWithCreds = new Aquasec.Notification("jiraWithCreds", new()
    ///     {
    ///         Properties = 
    ///         {
    ///             { "password", "&lt;JIRA_PASSWORD&gt;" },
    ///             { "project_key", "&lt;JIRA_PROJECT_KEY&gt;" },
    ///             { "summary", "SOME_TEXT" },
    ///             { "url", "&lt;JIRA-URL&gt;" },
    ///             { "user", "&lt;JIRA_USERNAME&gt;" },
    ///         },
    ///         Type = "jira",
    ///     });
    /// 
    ///     var emailWithCreds = new Aquasec.Notification("emailWithCreds", new()
    ///     {
    ///         Properties = 
    ///         {
    ///             { "host", "&lt;EMAIL_HOST&gt;" },
    ///             { "password", "&lt;EMAIL_PASSWORD&gt;" },
    ///             { "port", "&lt;EMAIL_PORT&gt;" },
    ///             { "recipients", "&lt;RECIPIENTS&gt;" },
    ///             { "sender", "&lt;SENDER_EMAIL_ADDRESS&gt;" },
    ///             { "user", "&lt;EMAIL_USERNAME&gt;" },
    ///         },
    ///         Type = "email",
    ///     });
    /// 
    ///     var emailWithMx = new Aquasec.Notification("emailWithMx", new()
    ///     {
    ///         Properties = 
    ///         {
    ///             { "port", "&lt;EMAIL_PORT&gt;" },
    ///             { "recipients", "&lt;RECIPIENTS&gt;" },
    ///             { "sender", "&lt;SENDER_EMAIL_ADDRESS&gt;" },
    ///             { "use_mx", "true" },
    ///         },
    ///         Type = "email",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AquasecResourceType("aquasec:index/notification:Notification")]
    public partial class Notification : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The user that created the notification
        /// </summary>
        [Output("author")]
        public Output<string> Author { get; private set; } = null!;

        /// <summary>
        /// Notification last update time
        /// </summary>
        [Output("lastUpdated")]
        public Output<string> LastUpdated { get; private set; } = null!;

        /// <summary>
        /// Notification name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Notification properties, please check the examples for setting it
        /// </summary>
        [Output("properties")]
        public Output<ImmutableDictionary<string, string>> Properties { get; private set; } = null!;

        /// <summary>
        /// Notification Template
        /// </summary>
        [Output("template")]
        public Output<ImmutableDictionary<string, string>> Template { get; private set; } = null!;

        /// <summary>
        /// Notifications types, allowed values: slack\ jira\ email\ teams\ webhook\ splunk\ serviceNow
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Notification resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Notification(string name, NotificationArgs args, CustomResourceOptions? options = null)
            : base("aquasec:index/notification:Notification", name, args ?? new NotificationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Notification(string name, Input<string> id, NotificationState? state = null, CustomResourceOptions? options = null)
            : base("aquasec:index/notification:Notification", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Notification resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Notification Get(string name, Input<string> id, NotificationState? state = null, CustomResourceOptions? options = null)
        {
            return new Notification(name, id, state, options);
        }
    }

    public sealed class NotificationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Notification name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("properties", required: true)]
        private InputMap<string>? _properties;

        /// <summary>
        /// Notification properties, please check the examples for setting it
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        /// <summary>
        /// Notifications types, allowed values: slack\ jira\ email\ teams\ webhook\ splunk\ serviceNow
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NotificationArgs()
        {
        }
        public static new NotificationArgs Empty => new NotificationArgs();
    }

    public sealed class NotificationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The user that created the notification
        /// </summary>
        [Input("author")]
        public Input<string>? Author { get; set; }

        /// <summary>
        /// Notification last update time
        /// </summary>
        [Input("lastUpdated")]
        public Input<string>? LastUpdated { get; set; }

        /// <summary>
        /// Notification name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("properties")]
        private InputMap<string>? _properties;

        /// <summary>
        /// Notification properties, please check the examples for setting it
        /// </summary>
        public InputMap<string> Properties
        {
            get => _properties ?? (_properties = new InputMap<string>());
            set => _properties = value;
        }

        [Input("template")]
        private InputMap<string>? _template;

        /// <summary>
        /// Notification Template
        /// </summary>
        public InputMap<string> Template
        {
            get => _template ?? (_template = new InputMap<string>());
            set => _template = value;
        }

        /// <summary>
        /// Notifications types, allowed values: slack\ jira\ email\ teams\ webhook\ splunk\ serviceNow
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NotificationState()
        {
        }
        public static new NotificationState Empty => new NotificationState();
    }
}
