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
    public sealed class ImageAssuranceChecksPerformed
    {
        public readonly string? AssuranceType;
        public readonly bool? Blocking;
        public readonly string? Control;
        public readonly bool? DtaSkipped;
        public readonly string? DtaSkippedReason;
        public readonly bool? Failed;
        public readonly string? PolicyName;

        [OutputConstructor]
        private ImageAssuranceChecksPerformed(
            string? assuranceType,

            bool? blocking,

            string? control,

            bool? dtaSkipped,

            string? dtaSkippedReason,

            bool? failed,

            string? policyName)
        {
            AssuranceType = assuranceType;
            Blocking = blocking;
            Control = control;
            DtaSkipped = dtaSkipped;
            DtaSkippedReason = dtaSkippedReason;
            Failed = failed;
            PolicyName = policyName;
        }
    }
}
