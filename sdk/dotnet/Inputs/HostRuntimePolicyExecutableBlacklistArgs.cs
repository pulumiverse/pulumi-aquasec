// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec.Inputs
{

    public sealed class HostRuntimePolicyExecutableBlacklistArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the executable blacklist is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("executables")]
        private InputList<string>? _executables;

        /// <summary>
        /// List of blacklisted executables.
        /// </summary>
        public InputList<string> Executables
        {
            get => _executables ?? (_executables = new InputList<string>());
            set => _executables = value;
        }

        public HostRuntimePolicyExecutableBlacklistArgs()
        {
        }
        public static new HostRuntimePolicyExecutableBlacklistArgs Empty => new HostRuntimePolicyExecutableBlacklistArgs();
    }
}
