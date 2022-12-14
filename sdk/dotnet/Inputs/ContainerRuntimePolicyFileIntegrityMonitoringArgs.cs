// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec.Inputs
{

    public sealed class ContainerRuntimePolicyFileIntegrityMonitoringArgs : global::Pulumi.ResourceArgs
    {
        [Input("excludedPaths")]
        private InputList<string>? _excludedPaths;

        /// <summary>
        /// List of paths to be excluded from being monitored.
        /// </summary>
        public InputList<string> ExcludedPaths
        {
            get => _excludedPaths ?? (_excludedPaths = new InputList<string>());
            set => _excludedPaths = value;
        }

        [Input("excludedProcesses")]
        private InputList<string>? _excludedProcesses;

        /// <summary>
        /// List of processes to be excluded from being monitored.
        /// </summary>
        public InputList<string> ExcludedProcesses
        {
            get => _excludedProcesses ?? (_excludedProcesses = new InputList<string>());
            set => _excludedProcesses = value;
        }

        [Input("excludedUsers")]
        private InputList<string>? _excludedUsers;

        /// <summary>
        /// List of users to be excluded from being monitored.
        /// </summary>
        public InputList<string> ExcludedUsers
        {
            get => _excludedUsers ?? (_excludedUsers = new InputList<string>());
            set => _excludedUsers = value;
        }

        /// <summary>
        /// If true, add attributes operations will be monitored.
        /// </summary>
        [Input("monitorAttributes")]
        public Input<bool>? MonitorAttributes { get; set; }

        /// <summary>
        /// If true, create operations will be monitored.
        /// </summary>
        [Input("monitorCreate")]
        public Input<bool>? MonitorCreate { get; set; }

        /// <summary>
        /// If true, deletion operations will be monitored.
        /// </summary>
        [Input("monitorDelete")]
        public Input<bool>? MonitorDelete { get; set; }

        /// <summary>
        /// If true, modification operations will be monitored.
        /// </summary>
        [Input("monitorModify")]
        public Input<bool>? MonitorModify { get; set; }

        /// <summary>
        /// If true, read operations will be monitored.
        /// </summary>
        [Input("monitorRead")]
        public Input<bool>? MonitorRead { get; set; }

        [Input("monitoredPaths")]
        private InputList<string>? _monitoredPaths;

        /// <summary>
        /// List of paths to be monitored.
        /// </summary>
        public InputList<string> MonitoredPaths
        {
            get => _monitoredPaths ?? (_monitoredPaths = new InputList<string>());
            set => _monitoredPaths = value;
        }

        [Input("monitoredProcesses")]
        private InputList<string>? _monitoredProcesses;

        /// <summary>
        /// List of processes to be monitored.
        /// </summary>
        public InputList<string> MonitoredProcesses
        {
            get => _monitoredProcesses ?? (_monitoredProcesses = new InputList<string>());
            set => _monitoredProcesses = value;
        }

        [Input("monitoredUsers")]
        private InputList<string>? _monitoredUsers;

        /// <summary>
        /// List of users to be monitored.
        /// </summary>
        public InputList<string> MonitoredUsers
        {
            get => _monitoredUsers ?? (_monitoredUsers = new InputList<string>());
            set => _monitoredUsers = value;
        }

        public ContainerRuntimePolicyFileIntegrityMonitoringArgs()
        {
        }
        public static new ContainerRuntimePolicyFileIntegrityMonitoringArgs Empty => new ContainerRuntimePolicyFileIntegrityMonitoringArgs();
    }
}
