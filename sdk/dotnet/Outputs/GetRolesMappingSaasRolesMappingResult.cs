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
    public sealed class GetRolesMappingSaasRolesMappingResult
    {
        public readonly int AccountId;
        public readonly string Created;
        public readonly string CspRole;
        public readonly int Id;
        public readonly ImmutableArray<string> SamlGroups;

        [OutputConstructor]
        private GetRolesMappingSaasRolesMappingResult(
            int accountId,

            string created,

            string cspRole,

            int id,

            ImmutableArray<string> samlGroups)
        {
            AccountId = accountId;
            Created = created;
            CspRole = cspRole;
            Id = id;
            SamlGroups = samlGroups;
        }
    }
}
