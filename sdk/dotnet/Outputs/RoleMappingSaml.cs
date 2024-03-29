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
    public sealed class RoleMappingSaml
    {
        /// <summary>
        /// Role Mapping is used to define the IdP role that the user will assume in Aqua. Use '|' as a separator for multiple roles.
        /// </summary>
        public readonly ImmutableDictionary<string, string> RoleMapping;

        [OutputConstructor]
        private RoleMappingSaml(ImmutableDictionary<string, string> roleMapping)
        {
            RoleMapping = roleMapping;
        }
    }
}
