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
    [AquasecResourceType("aquasec:index/notificationSlack:NotificationSlack")]
    public partial class NotificationSlack : global::Pulumi.CustomResource
    {
        [Output("channel")]
        public Output<string> Channel { get; private set; } = null!;

        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        [Output("icon")]
        public Output<string?> Icon { get; private set; } = null!;

        [Output("mainText")]
        public Output<string?> MainText { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("serviceKey")]
        public Output<string?> ServiceKey { get; private set; } = null!;

        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;

        [Output("webhookUrl")]
        public Output<string> WebhookUrl { get; private set; } = null!;


        /// <summary>
        /// Create a NotificationSlack resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NotificationSlack(string name, NotificationSlackArgs args, CustomResourceOptions? options = null)
            : base("aquasec:index/notificationSlack:NotificationSlack", name, args ?? new NotificationSlackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NotificationSlack(string name, Input<string> id, NotificationSlackState? state = null, CustomResourceOptions? options = null)
            : base("aquasec:index/notificationSlack:NotificationSlack", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NotificationSlack resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NotificationSlack Get(string name, Input<string> id, NotificationSlackState? state = null, CustomResourceOptions? options = null)
        {
            return new NotificationSlack(name, id, state, options);
        }
    }

    public sealed class NotificationSlackArgs : global::Pulumi.ResourceArgs
    {
        [Input("channel", required: true)]
        public Input<string> Channel { get; set; } = null!;

        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("icon")]
        public Input<string>? Icon { get; set; }

        [Input("mainText")]
        public Input<string>? MainText { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("serviceKey")]
        public Input<string>? ServiceKey { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        [Input("webhookUrl", required: true)]
        public Input<string> WebhookUrl { get; set; } = null!;

        public NotificationSlackArgs()
        {
        }
        public static new NotificationSlackArgs Empty => new NotificationSlackArgs();
    }

    public sealed class NotificationSlackState : global::Pulumi.ResourceArgs
    {
        [Input("channel")]
        public Input<string>? Channel { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("icon")]
        public Input<string>? Icon { get; set; }

        [Input("mainText")]
        public Input<string>? MainText { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("serviceKey")]
        public Input<string>? ServiceKey { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("userName")]
        public Input<string>? UserName { get; set; }

        [Input("webhookUrl")]
        public Input<string>? WebhookUrl { get; set; }

        public NotificationSlackState()
        {
        }
        public static new NotificationSlackState Empty => new NotificationSlackState();
    }
}
