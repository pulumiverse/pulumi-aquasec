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

    public sealed class UserSaasGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupAdmin")]
        public Input<bool>? GroupAdmin { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public UserSaasGroupArgs()
        {
        }
        public static new UserSaasGroupArgs Empty => new UserSaasGroupArgs();
    }
}
