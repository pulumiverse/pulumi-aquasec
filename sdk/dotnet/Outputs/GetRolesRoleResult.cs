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
    public sealed class GetRolesRoleResult
    {
        /// <summary>
        /// Free text description for the role.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The name of the role, comprised of alphanumeric characters and '-', '_', ' ', ':', '.', '@', '!', '^'.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The name of the Permission Set that will affect the users assigned to this specific Role.
        /// </summary>
        public readonly string Permission;
        /// <summary>
        /// List of Application Scopes that will affect the users assigned to this specific Role.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        /// <summary>
        /// The date of the last modification of the role.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetRolesRoleResult(
            string description,

            string name,

            string permission,

            ImmutableArray<string> scopes,

            string updatedAt)
        {
            Description = description;
            Name = name;
            Permission = permission;
            Scopes = scopes;
            UpdatedAt = updatedAt;
        }
    }
}
