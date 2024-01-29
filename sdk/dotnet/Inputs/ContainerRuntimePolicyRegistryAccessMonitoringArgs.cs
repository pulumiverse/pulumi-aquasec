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

    public sealed class ContainerRuntimePolicyRegistryAccessMonitoringArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("exceptionalMonitoredRegistryPaths")]
        private InputList<string>? _exceptionalMonitoredRegistryPaths;
        public InputList<string> ExceptionalMonitoredRegistryPaths
        {
            get => _exceptionalMonitoredRegistryPaths ?? (_exceptionalMonitoredRegistryPaths = new InputList<string>());
            set => _exceptionalMonitoredRegistryPaths = value;
        }

        [Input("exceptionalMonitoredRegistryProcesses")]
        private InputList<string>? _exceptionalMonitoredRegistryProcesses;
        public InputList<string> ExceptionalMonitoredRegistryProcesses
        {
            get => _exceptionalMonitoredRegistryProcesses ?? (_exceptionalMonitoredRegistryProcesses = new InputList<string>());
            set => _exceptionalMonitoredRegistryProcesses = value;
        }

        [Input("exceptionalMonitoredRegistryUsers")]
        private InputList<string>? _exceptionalMonitoredRegistryUsers;
        public InputList<string> ExceptionalMonitoredRegistryUsers
        {
            get => _exceptionalMonitoredRegistryUsers ?? (_exceptionalMonitoredRegistryUsers = new InputList<string>());
            set => _exceptionalMonitoredRegistryUsers = value;
        }

        [Input("monitoredRegistryAttributes")]
        public Input<bool>? MonitoredRegistryAttributes { get; set; }

        [Input("monitoredRegistryCreate")]
        public Input<bool>? MonitoredRegistryCreate { get; set; }

        [Input("monitoredRegistryDelete")]
        public Input<bool>? MonitoredRegistryDelete { get; set; }

        [Input("monitoredRegistryModify")]
        public Input<bool>? MonitoredRegistryModify { get; set; }

        [Input("monitoredRegistryPaths")]
        private InputList<string>? _monitoredRegistryPaths;
        public InputList<string> MonitoredRegistryPaths
        {
            get => _monitoredRegistryPaths ?? (_monitoredRegistryPaths = new InputList<string>());
            set => _monitoredRegistryPaths = value;
        }

        [Input("monitoredRegistryProcesses")]
        private InputList<string>? _monitoredRegistryProcesses;
        public InputList<string> MonitoredRegistryProcesses
        {
            get => _monitoredRegistryProcesses ?? (_monitoredRegistryProcesses = new InputList<string>());
            set => _monitoredRegistryProcesses = value;
        }

        [Input("monitoredRegistryRead")]
        public Input<bool>? MonitoredRegistryRead { get; set; }

        [Input("monitoredRegistryUsers")]
        private InputList<string>? _monitoredRegistryUsers;
        public InputList<string> MonitoredRegistryUsers
        {
            get => _monitoredRegistryUsers ?? (_monitoredRegistryUsers = new InputList<string>());
            set => _monitoredRegistryUsers = value;
        }

        public ContainerRuntimePolicyRegistryAccessMonitoringArgs()
        {
        }
        public static new ContainerRuntimePolicyRegistryAccessMonitoringArgs Empty => new ContainerRuntimePolicyRegistryAccessMonitoringArgs();
    }
}
