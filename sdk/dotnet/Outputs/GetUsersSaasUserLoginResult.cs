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
    public sealed class GetUsersSaasUserLoginResult
    {
        public readonly string Created;
        public readonly int Id;
        public readonly string IpAddress;
        public readonly int UserId;

        [OutputConstructor]
        private GetUsersSaasUserLoginResult(
            string created,

            int id,

            string ipAddress,

            int userId)
        {
            Created = created;
            Id = id;
            IpAddress = ipAddress;
            UserId = userId;
        }
    }
}
