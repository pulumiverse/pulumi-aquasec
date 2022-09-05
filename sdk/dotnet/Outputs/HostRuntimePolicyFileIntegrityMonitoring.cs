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
    public sealed class HostRuntimePolicyFileIntegrityMonitoring
    {
        /// <summary>
        /// List of paths to be excluded from being monitored.
        /// </summary>
        public readonly ImmutableArray<string> ExcludedPaths;
        /// <summary>
        /// List of processes to be excluded from being monitored.
        /// </summary>
        public readonly ImmutableArray<string> ExcludedProcesses;
        /// <summary>
        /// List of users to be excluded from being monitored.
        /// </summary>
        public readonly ImmutableArray<string> ExcludedUsers;
        /// <summary>
        /// If true, add attributes operations will be monitored.
        /// </summary>
        public readonly bool? MonitorAttributes;
        /// <summary>
        /// If true, create operations will be monitored.
        /// </summary>
        public readonly bool? MonitorCreate;
        /// <summary>
        /// If true, deletion operations will be monitored.
        /// </summary>
        public readonly bool? MonitorDelete;
        /// <summary>
        /// If true, modification operations will be monitored.
        /// </summary>
        public readonly bool? MonitorModify;
        /// <summary>
        /// If true, read operations will be monitored.
        /// </summary>
        public readonly bool? MonitorRead;
        /// <summary>
        /// List of paths to be monitored.
        /// </summary>
        public readonly ImmutableArray<string> MonitoredPaths;
        /// <summary>
        /// List of processes to be monitored.
        /// </summary>
        public readonly ImmutableArray<string> MonitoredProcesses;
        /// <summary>
        /// List of users to be monitored.
        /// </summary>
        public readonly ImmutableArray<string> MonitoredUsers;

        [OutputConstructor]
        private HostRuntimePolicyFileIntegrityMonitoring(
            ImmutableArray<string> excludedPaths,

            ImmutableArray<string> excludedProcesses,

            ImmutableArray<string> excludedUsers,

            bool? monitorAttributes,

            bool? monitorCreate,

            bool? monitorDelete,

            bool? monitorModify,

            bool? monitorRead,

            ImmutableArray<string> monitoredPaths,

            ImmutableArray<string> monitoredProcesses,

            ImmutableArray<string> monitoredUsers)
        {
            ExcludedPaths = excludedPaths;
            ExcludedProcesses = excludedProcesses;
            ExcludedUsers = excludedUsers;
            MonitorAttributes = monitorAttributes;
            MonitorCreate = monitorCreate;
            MonitorDelete = monitorDelete;
            MonitorModify = monitorModify;
            MonitorRead = monitorRead;
            MonitoredPaths = monitoredPaths;
            MonitoredProcesses = monitoredProcesses;
            MonitoredUsers = monitoredUsers;
        }
    }
}
