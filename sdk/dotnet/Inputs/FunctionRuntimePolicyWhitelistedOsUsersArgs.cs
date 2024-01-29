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

    public sealed class FunctionRuntimePolicyWhitelistedOsUsersArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("groupWhiteLists")]
        private InputList<string>? _groupWhiteLists;
        public InputList<string> GroupWhiteLists
        {
            get => _groupWhiteLists ?? (_groupWhiteLists = new InputList<string>());
            set => _groupWhiteLists = value;
        }

        [Input("userWhiteLists")]
        private InputList<string>? _userWhiteLists;
        public InputList<string> UserWhiteLists
        {
            get => _userWhiteLists ?? (_userWhiteLists = new InputList<string>());
            set => _userWhiteLists = value;
        }

        public FunctionRuntimePolicyWhitelistedOsUsersArgs()
        {
        }
        public static new FunctionRuntimePolicyWhitelistedOsUsersArgs Empty => new FunctionRuntimePolicyWhitelistedOsUsersArgs();
    }
}
