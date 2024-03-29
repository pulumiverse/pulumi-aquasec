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
    public sealed class ContainerRuntimePolicyReadonlyRegistry
    {
        public readonly bool? Enabled;
        public readonly ImmutableArray<string> ExceptionalReadonlyRegistryPaths;
        public readonly ImmutableArray<string> ExceptionalReadonlyRegistryProcesses;
        public readonly ImmutableArray<string> ExceptionalReadonlyRegistryUsers;
        public readonly ImmutableArray<string> ReadonlyRegistryPaths;
        public readonly ImmutableArray<string> ReadonlyRegistryProcesses;
        public readonly ImmutableArray<string> ReadonlyRegistryUsers;

        [OutputConstructor]
        private ContainerRuntimePolicyReadonlyRegistry(
            bool? enabled,

            ImmutableArray<string> exceptionalReadonlyRegistryPaths,

            ImmutableArray<string> exceptionalReadonlyRegistryProcesses,

            ImmutableArray<string> exceptionalReadonlyRegistryUsers,

            ImmutableArray<string> readonlyRegistryPaths,

            ImmutableArray<string> readonlyRegistryProcesses,

            ImmutableArray<string> readonlyRegistryUsers)
        {
            Enabled = enabled;
            ExceptionalReadonlyRegistryPaths = exceptionalReadonlyRegistryPaths;
            ExceptionalReadonlyRegistryProcesses = exceptionalReadonlyRegistryProcesses;
            ExceptionalReadonlyRegistryUsers = exceptionalReadonlyRegistryUsers;
            ReadonlyRegistryPaths = readonlyRegistryPaths;
            ReadonlyRegistryProcesses = readonlyRegistryProcesses;
            ReadonlyRegistryUsers = readonlyRegistryUsers;
        }
    }
}
