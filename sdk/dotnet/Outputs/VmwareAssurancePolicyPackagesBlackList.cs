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
    public sealed class VmwareAssurancePolicyPackagesBlackList
    {
        public readonly string? Arch;
        public readonly string? Display;
        public readonly string? Epoch;
        public readonly string? Format;
        public readonly string? License;
        public readonly string? Name;
        public readonly string? Release;
        public readonly string? Version;
        public readonly string? VersionRange;

        [OutputConstructor]
        private VmwareAssurancePolicyPackagesBlackList(
            string? arch,

            string? display,

            string? epoch,

            string? format,

            string? license,

            string? name,

            string? release,

            string? version,

            string? versionRange)
        {
            Arch = arch;
            Display = display;
            Epoch = epoch;
            Format = format;
            License = license;
            Name = name;
            Release = release;
            Version = version;
            VersionRange = versionRange;
        }
    }
}
