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
    public sealed class GetRolesMappingOauth2Result
    {
        public readonly ImmutableDictionary<string, string> RoleMapping;

        [OutputConstructor]
        private GetRolesMappingOauth2Result(ImmutableDictionary<string, string> roleMapping)
        {
            RoleMapping = roleMapping;
        }
    }
}