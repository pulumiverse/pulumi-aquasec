// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec
{
    public static class GetContainerRuntimePolicy
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var containerRuntimePolicy = Aquasec.GetContainerRuntimePolicy.Invoke(new()
        ///     {
        ///         Name = "FunctionRuntimePolicyName",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["containerRuntimePolicyDetails"] = containerRuntimePolicy.Apply(getContainerRuntimePolicyResult =&gt; getContainerRuntimePolicyResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetContainerRuntimePolicyResult> InvokeAsync(GetContainerRuntimePolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetContainerRuntimePolicyResult>("aquasec:index/getContainerRuntimePolicy:getContainerRuntimePolicy", args ?? new GetContainerRuntimePolicyArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var containerRuntimePolicy = Aquasec.GetContainerRuntimePolicy.Invoke(new()
        ///     {
        ///         Name = "FunctionRuntimePolicyName",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["containerRuntimePolicyDetails"] = containerRuntimePolicy.Apply(getContainerRuntimePolicyResult =&gt; getContainerRuntimePolicyResult),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetContainerRuntimePolicyResult> Invoke(GetContainerRuntimePolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetContainerRuntimePolicyResult>("aquasec:index/getContainerRuntimePolicy:getContainerRuntimePolicy", args ?? new GetContainerRuntimePolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetContainerRuntimePolicyArgs : global::Pulumi.InvokeArgs
    {
        [Input("malwareScanOptions")]
        private List<Inputs.GetContainerRuntimePolicyMalwareScanOptionArgs>? _malwareScanOptions;

        /// <summary>
        /// Configuration for Real-Time Malware Protection.
        /// </summary>
        public List<Inputs.GetContainerRuntimePolicyMalwareScanOptionArgs> MalwareScanOptions
        {
            get => _malwareScanOptions ?? (_malwareScanOptions = new List<Inputs.GetContainerRuntimePolicyMalwareScanOptionArgs>());
            set => _malwareScanOptions = value;
        }

        /// <summary>
        /// Name of the container runtime policy
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetContainerRuntimePolicyArgs()
        {
        }
        public static new GetContainerRuntimePolicyArgs Empty => new GetContainerRuntimePolicyArgs();
    }

    public sealed class GetContainerRuntimePolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("malwareScanOptions")]
        private InputList<Inputs.GetContainerRuntimePolicyMalwareScanOptionInputArgs>? _malwareScanOptions;

        /// <summary>
        /// Configuration for Real-Time Malware Protection.
        /// </summary>
        public InputList<Inputs.GetContainerRuntimePolicyMalwareScanOptionInputArgs> MalwareScanOptions
        {
            get => _malwareScanOptions ?? (_malwareScanOptions = new InputList<Inputs.GetContainerRuntimePolicyMalwareScanOptionInputArgs>());
            set => _malwareScanOptions = value;
        }

        /// <summary>
        /// Name of the container runtime policy
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetContainerRuntimePolicyInvokeArgs()
        {
        }
        public static new GetContainerRuntimePolicyInvokeArgs Empty => new GetContainerRuntimePolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetContainerRuntimePolicyResult
    {
        /// <summary>
        /// List of executables that are allowed for the user.
        /// </summary>
        public readonly ImmutableArray<string> AllowedExecutables;
        /// <summary>
        /// List of registries that allowed for running containers.
        /// </summary>
        public readonly ImmutableArray<string> AllowedRegistries;
        /// <summary>
        /// Indicates the application scope of the service.
        /// </summary>
        public readonly ImmutableArray<string> ApplicationScopes;
        /// <summary>
        /// If true, all network activity will be audited.
        /// </summary>
        public readonly bool AuditAllNetworkActivity;
        /// <summary>
        /// If true, all process activity will be audited.
        /// </summary>
        public readonly bool AuditAllProcessesActivity;
        /// <summary>
        /// If true, full command arguments will be audited.
        /// </summary>
        public readonly bool AuditFullCommandArguments;
        /// <summary>
        /// Username of the account that created the service.
        /// </summary>
        public readonly string Author;
        /// <summary>
        /// If true, prevent containers from running with access to host network.
        /// </summary>
        public readonly bool BlockAccessHostNetwork;
        /// <summary>
        /// If true, prevent containers from running with adding capabilities with `--cap-add` privilege.
        /// </summary>
        public readonly bool BlockAddingCapabilities;
        /// <summary>
        /// If true, exec into a container is prevented.
        /// </summary>
        public readonly bool BlockContainerExec;
        /// <summary>
        /// Detect and prevent communication to DNS/IP addresses known to be used for Cryptocurrency Mining
        /// </summary>
        public readonly bool BlockCryptocurrencyMining;
        /// <summary>
        /// Detect and prevent running in-memory execution
        /// </summary>
        public readonly bool BlockFilelessExec;
        /// <summary>
        /// If true, prevent containers from running with the capability to bind in port lower than 1024.
        /// </summary>
        public readonly bool BlockLowPortBinding;
        /// <summary>
        /// If true, running non-compliant image in the container is prevented.
        /// </summary>
        public readonly bool BlockNonCompliantImages;
        /// <summary>
        /// If true, running containers in non-compliant pods is prevented.
        /// </summary>
        public readonly bool BlockNonCompliantWorkloads;
        /// <summary>
        /// If true, running non-kubernetes containers is prevented.
        /// </summary>
        public readonly bool BlockNonK8sContainers;
        /// <summary>
        /// If true, prevent containers from running with privileged container capability.
        /// </summary>
        public readonly bool BlockPrivilegedContainers;
        /// <summary>
        /// If true, reverse shell is prevented.
        /// </summary>
        public readonly bool BlockReverseShell;
        /// <summary>
        /// If true, prevent containers from running with root user.
        /// </summary>
        public readonly bool BlockRootUser;
        /// <summary>
        /// If true, running images in the container that are not registered in Aqua is prevented.
        /// </summary>
        public readonly bool BlockUnregisteredImages;
        /// <summary>
        /// If true, prevent containers from running with the privilege to use the IPC namespace.
        /// </summary>
        public readonly bool BlockUseIpcNamespace;
        /// <summary>
        /// If true, prevent containers from running with the privilege to use the PID namespace.
        /// </summary>
        public readonly bool BlockUsePidNamespace;
        /// <summary>
        /// If true, prevent containers from running with the privilege to use the user namespace.
        /// </summary>
        public readonly bool BlockUseUserNamespace;
        /// <summary>
        /// If true, prevent containers from running with the privilege to use the UTS namespace.
        /// </summary>
        public readonly bool BlockUseUtsNamespace;
        /// <summary>
        /// If true, prevents containers from using specific Unix capabilities.
        /// </summary>
        public readonly ImmutableArray<string> BlockedCapabilities;
        /// <summary>
        /// List of executables that are prevented from running in containers.
        /// </summary>
        public readonly ImmutableArray<string> BlockedExecutables;
        /// <summary>
        /// List of files that are prevented from being read, modified and executed in the containers.
        /// </summary>
        public readonly ImmutableArray<string> BlockedFiles;
        /// <summary>
        /// List of blocked inbound ports.
        /// </summary>
        public readonly ImmutableArray<string> BlockedInboundPorts;
        /// <summary>
        /// List of blocked outbound ports.
        /// </summary>
        public readonly ImmutableArray<string> BlockedOutboundPorts;
        /// <summary>
        /// Prevent containers from reading, writing, or executing all files in the list of packages.
        /// </summary>
        public readonly ImmutableArray<string> BlockedPackages;
        /// <summary>
        /// List of volumes that are prevented from being mounted in the containers.
        /// </summary>
        public readonly ImmutableArray<string> BlockedVolumes;
        /// <summary>
        /// List of processes that will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> ContainerExecAllowedProcesses;
        /// <summary>
        /// The description of the container runtime policy
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// If true, executables that are not in the original image is prevented from running.
        /// </summary>
        public readonly bool EnableDriftPrevention;
        /// <summary>
        /// If true, fork bombs are prevented in the containers.
        /// </summary>
        public readonly bool EnableForkGuard;
        /// <summary>
        /// If true, detect and prevent communication from containers to IP addresses known to have a bad reputation.
        /// </summary>
        public readonly bool EnableIpReputationSecurity;
        /// <summary>
        /// If true, detects port scanning behavior in the container.
        /// </summary>
        public readonly bool EnablePortScanDetection;
        /// <summary>
        /// Indicates if the runtime policy is enabled or not.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Indicates that policy should effect container execution (not just for audit).
        /// </summary>
        public readonly bool Enforce;
        /// <summary>
        /// Indicates the number of days after which the runtime policy will be changed to enforce mode.
        /// </summary>
        public readonly int EnforceAfterDays;
        /// <summary>
        /// List of files and directories to be excluded from the read-only list.
        /// </summary>
        public readonly ImmutableArray<string> ExceptionalReadonlyFilesAndDirectories;
        /// <summary>
        /// Specify processes that will be allowed
        /// </summary>
        public readonly ImmutableArray<string> ExecLockdownWhiteLists;
        /// <summary>
        /// Configuration for file integrity monitoring.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetContainerRuntimePolicyFileIntegrityMonitoringResult> FileIntegrityMonitorings;
        /// <summary>
        /// Process limit for the fork guard.
        /// </summary>
        public readonly int ForkGuardProcessLimit;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// If true, prevents the container from obtaining new privileges at runtime. (only enabled in enforce mode)
        /// </summary>
        public readonly bool LimitNewPrivileges;
        /// <summary>
        /// Configuration for Real-Time Malware Protection.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetContainerRuntimePolicyMalwareScanOptionResult> MalwareScanOptions;
        /// <summary>
        /// If true, system time changes will be monitored.
        /// </summary>
        public readonly bool MonitorSystemTimeChanges;
        /// <summary>
        /// Name of the container runtime policy
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// List of files and directories to be restricted as read-only
        /// </summary>
        public readonly ImmutableArray<string> ReadonlyFilesAndDirectories;
        /// <summary>
        /// List of IPs/ CIDRs that will be allowed
        /// </summary>
        public readonly ImmutableArray<string> ReverseShellAllowedIps;
        /// <summary>
        /// List of processes that will be allowed
        /// </summary>
        public readonly ImmutableArray<string> ReverseShellAllowedProcesses;
        /// <summary>
        /// Logical expression of how to compute the dependency of the scope variables.
        /// </summary>
        public readonly string ScopeExpression;
        /// <summary>
        /// List of scope attributes.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetContainerRuntimePolicyScopeVariableResult> ScopeVariables;

        [OutputConstructor]
        private GetContainerRuntimePolicyResult(
            ImmutableArray<string> allowedExecutables,

            ImmutableArray<string> allowedRegistries,

            ImmutableArray<string> applicationScopes,

            bool auditAllNetworkActivity,

            bool auditAllProcessesActivity,

            bool auditFullCommandArguments,

            string author,

            bool blockAccessHostNetwork,

            bool blockAddingCapabilities,

            bool blockContainerExec,

            bool blockCryptocurrencyMining,

            bool blockFilelessExec,

            bool blockLowPortBinding,

            bool blockNonCompliantImages,

            bool blockNonCompliantWorkloads,

            bool blockNonK8sContainers,

            bool blockPrivilegedContainers,

            bool blockReverseShell,

            bool blockRootUser,

            bool blockUnregisteredImages,

            bool blockUseIpcNamespace,

            bool blockUsePidNamespace,

            bool blockUseUserNamespace,

            bool blockUseUtsNamespace,

            ImmutableArray<string> blockedCapabilities,

            ImmutableArray<string> blockedExecutables,

            ImmutableArray<string> blockedFiles,

            ImmutableArray<string> blockedInboundPorts,

            ImmutableArray<string> blockedOutboundPorts,

            ImmutableArray<string> blockedPackages,

            ImmutableArray<string> blockedVolumes,

            ImmutableArray<string> containerExecAllowedProcesses,

            string description,

            bool enableDriftPrevention,

            bool enableForkGuard,

            bool enableIpReputationSecurity,

            bool enablePortScanDetection,

            bool enabled,

            bool enforce,

            int enforceAfterDays,

            ImmutableArray<string> exceptionalReadonlyFilesAndDirectories,

            ImmutableArray<string> execLockdownWhiteLists,

            ImmutableArray<Outputs.GetContainerRuntimePolicyFileIntegrityMonitoringResult> fileIntegrityMonitorings,

            int forkGuardProcessLimit,

            string id,

            bool limitNewPrivileges,

            ImmutableArray<Outputs.GetContainerRuntimePolicyMalwareScanOptionResult> malwareScanOptions,

            bool monitorSystemTimeChanges,

            string name,

            ImmutableArray<string> readonlyFilesAndDirectories,

            ImmutableArray<string> reverseShellAllowedIps,

            ImmutableArray<string> reverseShellAllowedProcesses,

            string scopeExpression,

            ImmutableArray<Outputs.GetContainerRuntimePolicyScopeVariableResult> scopeVariables)
        {
            AllowedExecutables = allowedExecutables;
            AllowedRegistries = allowedRegistries;
            ApplicationScopes = applicationScopes;
            AuditAllNetworkActivity = auditAllNetworkActivity;
            AuditAllProcessesActivity = auditAllProcessesActivity;
            AuditFullCommandArguments = auditFullCommandArguments;
            Author = author;
            BlockAccessHostNetwork = blockAccessHostNetwork;
            BlockAddingCapabilities = blockAddingCapabilities;
            BlockContainerExec = blockContainerExec;
            BlockCryptocurrencyMining = blockCryptocurrencyMining;
            BlockFilelessExec = blockFilelessExec;
            BlockLowPortBinding = blockLowPortBinding;
            BlockNonCompliantImages = blockNonCompliantImages;
            BlockNonCompliantWorkloads = blockNonCompliantWorkloads;
            BlockNonK8sContainers = blockNonK8sContainers;
            BlockPrivilegedContainers = blockPrivilegedContainers;
            BlockReverseShell = blockReverseShell;
            BlockRootUser = blockRootUser;
            BlockUnregisteredImages = blockUnregisteredImages;
            BlockUseIpcNamespace = blockUseIpcNamespace;
            BlockUsePidNamespace = blockUsePidNamespace;
            BlockUseUserNamespace = blockUseUserNamespace;
            BlockUseUtsNamespace = blockUseUtsNamespace;
            BlockedCapabilities = blockedCapabilities;
            BlockedExecutables = blockedExecutables;
            BlockedFiles = blockedFiles;
            BlockedInboundPorts = blockedInboundPorts;
            BlockedOutboundPorts = blockedOutboundPorts;
            BlockedPackages = blockedPackages;
            BlockedVolumes = blockedVolumes;
            ContainerExecAllowedProcesses = containerExecAllowedProcesses;
            Description = description;
            EnableDriftPrevention = enableDriftPrevention;
            EnableForkGuard = enableForkGuard;
            EnableIpReputationSecurity = enableIpReputationSecurity;
            EnablePortScanDetection = enablePortScanDetection;
            Enabled = enabled;
            Enforce = enforce;
            EnforceAfterDays = enforceAfterDays;
            ExceptionalReadonlyFilesAndDirectories = exceptionalReadonlyFilesAndDirectories;
            ExecLockdownWhiteLists = execLockdownWhiteLists;
            FileIntegrityMonitorings = fileIntegrityMonitorings;
            ForkGuardProcessLimit = forkGuardProcessLimit;
            Id = id;
            LimitNewPrivileges = limitNewPrivileges;
            MalwareScanOptions = malwareScanOptions;
            MonitorSystemTimeChanges = monitorSystemTimeChanges;
            Name = name;
            ReadonlyFilesAndDirectories = readonlyFilesAndDirectories;
            ReverseShellAllowedIps = reverseShellAllowedIps;
            ReverseShellAllowedProcesses = reverseShellAllowedProcesses;
            ScopeExpression = scopeExpression;
            ScopeVariables = scopeVariables;
        }
    }
}
