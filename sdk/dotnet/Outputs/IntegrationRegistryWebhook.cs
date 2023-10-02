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
    public sealed class IntegrationRegistryWebhook
    {
        public readonly string? AuthToken;
        public readonly bool? Enabled;
        public readonly bool? UnQuarantine;
        /// <summary>
        /// The URL, address or region of the registry
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private IntegrationRegistryWebhook(
            string? authToken,

            bool? enabled,

            bool? unQuarantine,

            string? url)
        {
            AuthToken = authToken;
            Enabled = enabled;
            UnQuarantine = unQuarantine;
            Url = url;
        }
    }
}
