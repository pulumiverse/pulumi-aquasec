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
    public sealed class GetFunctionAssurancePolicyTrustedBaseImageResult
    {
        public readonly string Imagename;
        public readonly string Registry;

        [OutputConstructor]
        private GetFunctionAssurancePolicyTrustedBaseImageResult(
            string imagename,

            string registry)
        {
            Imagename = imagename;
            Registry = registry;
        }
    }
}
