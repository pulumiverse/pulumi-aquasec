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
    public sealed class ContainerRuntimePolicyReadonlyFiles
    {
        public readonly bool? Enabled;
        public readonly ImmutableArray<string> ExceptionalReadonlyFiles;
        public readonly ImmutableArray<string> ExceptionalReadonlyFilesProcesses;
        public readonly ImmutableArray<string> ExceptionalReadonlyFilesUsers;
        public readonly ImmutableArray<string> ReadonlyFiles;
        public readonly ImmutableArray<string> ReadonlyFilesProcesses;
        public readonly ImmutableArray<string> ReadonlyFilesUsers;

        [OutputConstructor]
        private ContainerRuntimePolicyReadonlyFiles(
            bool? enabled,

            ImmutableArray<string> exceptionalReadonlyFiles,

            ImmutableArray<string> exceptionalReadonlyFilesProcesses,

            ImmutableArray<string> exceptionalReadonlyFilesUsers,

            ImmutableArray<string> readonlyFiles,

            ImmutableArray<string> readonlyFilesProcesses,

            ImmutableArray<string> readonlyFilesUsers)
        {
            Enabled = enabled;
            ExceptionalReadonlyFiles = exceptionalReadonlyFiles;
            ExceptionalReadonlyFilesProcesses = exceptionalReadonlyFilesProcesses;
            ExceptionalReadonlyFilesUsers = exceptionalReadonlyFilesUsers;
            ReadonlyFiles = readonlyFiles;
            ReadonlyFilesProcesses = readonlyFilesProcesses;
            ReadonlyFilesUsers = readonlyFilesUsers;
        }
    }
}