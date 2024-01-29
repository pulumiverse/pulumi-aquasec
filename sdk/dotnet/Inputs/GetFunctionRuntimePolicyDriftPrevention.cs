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

    public sealed class GetFunctionRuntimePolicyDriftPreventionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether drift prevention is enabled.
        /// </summary>
        [Input("enabled")]
        public bool? Enabled { get; set; }

        /// <summary>
        /// Whether to lockdown execution drift.
        /// </summary>
        [Input("execLockdown")]
        public bool? ExecLockdown { get; set; }

        [Input("execLockdownWhiteLists")]
        private List<string>? _execLockdownWhiteLists;

        /// <summary>
        /// List of items in the execution lockdown white list.
        /// </summary>
        public List<string> ExecLockdownWhiteLists
        {
            get => _execLockdownWhiteLists ?? (_execLockdownWhiteLists = new List<string>());
            set => _execLockdownWhiteLists = value;
        }

        /// <summary>
        /// Whether to lockdown image drift.
        /// </summary>
        [Input("imageLockdown")]
        public bool? ImageLockdown { get; set; }

        public GetFunctionRuntimePolicyDriftPreventionArgs()
        {
        }
        public static new GetFunctionRuntimePolicyDriftPreventionArgs Empty => new GetFunctionRuntimePolicyDriftPreventionArgs();
    }
}