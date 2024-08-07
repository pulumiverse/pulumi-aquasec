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
    public static class GetEnforcerGroups
    {
        /// <summary>
        /// The data source `aquasec.EnforcerGroups` provides an Enforcer group template that generates a configuration file, which is subsequently used to generate one or more Enforcers using a Docker command.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var groups = Aquasec.GetEnforcerGroups.Invoke(new()
        ///     {
        ///         GroupId = "IacGroup",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["groupDetails"] = groups,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEnforcerGroupsResult> InvokeAsync(GetEnforcerGroupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEnforcerGroupsResult>("aquasec:index/getEnforcerGroups:getEnforcerGroups", args ?? new GetEnforcerGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// The data source `aquasec.EnforcerGroups` provides an Enforcer group template that generates a configuration file, which is subsequently used to generate one or more Enforcers using a Docker command.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aquasec = Pulumi.Aquasec;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var groups = Aquasec.GetEnforcerGroups.Invoke(new()
        ///     {
        ///         GroupId = "IacGroup",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["groupDetails"] = groups,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEnforcerGroupsResult> Invoke(GetEnforcerGroupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnforcerGroupsResult>("aquasec:index/getEnforcerGroups:getEnforcerGroups", args ?? new GetEnforcerGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEnforcerGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Select Enabled to send activity logs in your containers to the Aqua Server for forensics purposes.
        /// </summary>
        [Input("forensics")]
        public bool? Forensics { get; set; }

        /// <summary>
        /// The ID of the Enforcer group.
        /// </summary>
        [Input("groupId", required: true)]
        public string GroupId { get; set; } = null!;

        /// <summary>
        /// Select Enabled to send activity logs in your host to the Aqua Server for forensics purposes.
        /// </summary>
        [Input("hostForensics")]
        public bool? HostForensics { get; set; }

        public GetEnforcerGroupsArgs()
        {
        }
        public static new GetEnforcerGroupsArgs Empty => new GetEnforcerGroupsArgs();
    }

    public sealed class GetEnforcerGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Select Enabled to send activity logs in your containers to the Aqua Server for forensics purposes.
        /// </summary>
        [Input("forensics")]
        public Input<bool>? Forensics { get; set; }

        /// <summary>
        /// The ID of the Enforcer group.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// Select Enabled to send activity logs in your host to the Aqua Server for forensics purposes.
        /// </summary>
        [Input("hostForensics")]
        public Input<bool>? HostForensics { get; set; }

        public GetEnforcerGroupsInvokeArgs()
        {
        }
        public static new GetEnforcerGroupsInvokeArgs Empty => new GetEnforcerGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEnforcerGroupsResult
    {
        /// <summary>
        /// Selecting this option will allow the KubeEnforcer to block the deployment of container images that have failed any of these Container Runtime Policy controls:\
        /// 			* Block Non-Compliant Images\
        /// 			* Block Non-Compliant Workloads\
        /// 			* Block Unregistered Images\
        /// 			This functionality can work only when the KubeEnforcer is deployed in Enforce mode.
        /// </summary>
        public readonly bool AdmissionControl;
        /// <summary>
        /// Allow kube enforcer audit.
        /// </summary>
        public readonly bool AllowKubeEnforcerAudit;
        /// <summary>
        /// List of application names to allow on the hosts. if provided, only containers of the listed applications will be allowed to run.
        /// </summary>
        public readonly ImmutableArray<string> AllowedApplications;
        /// <summary>
        /// List of label names to allow on the hosts.
        /// </summary>
        public readonly ImmutableArray<string> AllowedLabels;
        /// <summary>
        /// List of registry names to allow on the hosts.
        /// </summary>
        public readonly ImmutableArray<string> AllowedRegistries;
        /// <summary>
        /// This setting is available only when you have license for `Advanced Malware Protection`. Send true to make use of the license and enable the `Real-time Malware Protection` control in the Host Runtime policies.
        /// </summary>
        public readonly bool AntivirusProtection;
        /// <summary>
        /// Aqua server version
        /// </summary>
        public readonly string AquaVersion;
        /// <summary>
        /// Agent will send extra audit messages to the server for success operations from inside the container (runtime).
        /// </summary>
        public readonly bool AuditAll;
        /// <summary>
        /// This option is applicable only if `Enable Pod Enforcer injection` is selected. Select this option if you want Aqua Enterprise to copy the secrets defined above to the Pod Enforcer namespace and container. Otherwise, you can choose to copy these secrets by other means.
        /// </summary>
        public readonly bool AutoCopySecrets;
        /// <summary>
        /// This option is available only if `Enable workload discovery` is selected. If selected, the KubeEnforcer will add previously unknown image registries from the cluster to Aqua.
        /// </summary>
        public readonly bool AutoDiscoverConfigureRegistries;
        /// <summary>
        /// When this option is selected, the KubeEnforcer will discover workloads on its cluster.
        /// </summary>
        public readonly bool AutoDiscoveryEnabled;
        /// <summary>
        /// This option is available only if `Enable workload discovery` is selected. If selected, the KubeEnforcer will automatically register images running as workloads (and scan the discovered images for security issues).
        /// </summary>
        public readonly bool AutoScanDiscoveredImagesRunningContainers;
        /// <summary>
        /// If `Enabled`, detects suspicious activity in your containers and displays potential security threats in the Incidents and Audits pages.
        /// </summary>
        public readonly bool BehavioralEngine;
        /// <summary>
        /// This applies only if both `Enable admission control` and Enforce mode are set. This additional option must be selected for admission control to work if the KubeEnforcer is not connected to any Gateway. If this option is not selected, admission control will be disabled; this will have no effect on containers already running.
        /// </summary>
        public readonly bool BlockAdmissionControl;
        /// <summary>
        /// The installation command.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnforcerGroupsCommandResult> Commands;
        /// <summary>
        /// Number of connected enforcers in the enforcer group.
        /// </summary>
        public readonly int ConnectedCount;
        /// <summary>
        /// When set to `True` applies Container Runtime Policies, Image Profiles, and Firewall Policies to containers.
        /// </summary>
        public readonly bool ContainerActivityProtection;
        /// <summary>
        /// This setting is available only when you have license for `Advanced Malware Protection`. Send true to make use of the license and enable the `Real-time Malware Protection` control in the Container Runtime policies.
        /// </summary>
        public readonly bool ContainerAntivirusProtection;
        /// <summary>
        /// A description for the Aqua Enforcer group.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Number of disconnected enforcers in the enforcer group.
        /// </summary>
        public readonly int DisconnectedCount;
        /// <summary>
        /// Whether the enforce mode is enabled on the Enforcers.
        /// </summary>
        public readonly bool Enforce;
        /// <summary>
        /// The specific Aqua Enforcer product image (with image tag) to be deployed.
        /// </summary>
        public readonly string EnforcerImageName;
        /// <summary>
        /// Select Enabled to send activity logs in your containers to the Aqua Server for forensics purposes.
        /// </summary>
        public readonly bool? Forensics;
        /// <summary>
        /// Gateway Address
        /// </summary>
        public readonly string GatewayAddress;
        /// <summary>
        /// Gateway Name
        /// </summary>
        public readonly string GatewayName;
        /// <summary>
        /// List of Aqua gateway IDs for the Enforcers.
        /// </summary>
        public readonly ImmutableArray<string> Gateways;
        /// <summary>
        /// The ID of the Enforcer group.
        /// </summary>
        public readonly string GroupId;
        /// <summary>
        /// Number of high vulnerabilities in the enforcers that in this enforcer group.
        /// </summary>
        public readonly int HighVulns;
        /// <summary>
        /// When set to `True` enables host scanning and respective Host Assurance controls.
        /// </summary>
        public readonly bool HostAssurance;
        /// <summary>
        /// When set to `True` enables these Host Runtime Policy controls: `OS Users and Groups Allowed` and `OS Users and Groups Blocked`
        /// </summary>
        public readonly bool HostBehavioralEngine;
        /// <summary>
        /// Select Enabled to send activity logs in your host to the Aqua Server for forensics purposes.
        /// </summary>
        public readonly bool? HostForensics;
        /// <summary>
        /// When set to `True` applies Firewall Policies to hosts, and allows recording network maps for Aqua services. The Network Firewall setting must be disabled when deploying the Aqua Enforcer on a machine running Rocky Linux. See https://docs.aquasec.com/docs/platform-support-limitations-rocky-linux for further information
        /// </summary>
        public readonly bool HostNetworkProtection;
        /// <summary>
        /// The OS type for the host
        /// </summary>
        public readonly string HostOs;
        /// <summary>
        /// When set to `True` enables all Host Runtime Policy controls except for `OS Users and Groups Allowed` and `OS Users and Groups Blocked`.
        /// </summary>
        public readonly bool HostProtection;
        /// <summary>
        /// When set to `True` enables these Host Runtime Policy controls: `OS Users and Groups Allowed` and `OS Users and Groups Blocked`
        /// </summary>
        public readonly bool HostUserProtection;
        /// <summary>
        /// Number of enforcers in the enforcer group.
        /// </summary>
        public readonly int HostsCount;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// When Set to `True` enables selected controls: Container Runtime Policy (`Block Non-Compliant Images`, `Block Unregistered Images`, and `Registries Allowed`) and Default Image Assurance Policy (`Images Blocked`).
        /// </summary>
        public readonly bool ImageAssurance;
        /// <summary>
        /// Enforcer install command
        /// </summary>
        public readonly string InstallCommand;
        /// <summary>
        /// See https://docs.aquasec.com/docs/securing-kubernetes-applications#section-configuration-hardening, The KubeEnforcer can deploy the Aqua Security kube-bench open-source product to perform Kubernetes CIS benchmark testing of nodes.
        /// 			This field specifies the path and file name of the kube-bench product image for the KubeEnforcer to deploy; it will be filled in automatically. You can optionally enter a different value.
        /// </summary>
        public readonly string KubeBenchImageName;
        /// <summary>
        /// The last date and time the batch token was updated in UNIX time.
        /// </summary>
        public readonly int LastUpdate;
        /// <summary>
        /// Name for the batch install record.
        /// </summary>
        public readonly string LogicalName;
        /// <summary>
        /// Number of low vulnerabilities in the enforcers that in this enforcer group.
        /// </summary>
        public readonly int LowVulns;
        /// <summary>
        /// Number of medium vulnerabilities in the enforcers that in this enforcer group.
        /// </summary>
        public readonly int MedVulns;
        /// <summary>
        /// This option is applicable only if `Enable Pod Enforcer injection` is selected.
        /// </summary>
        public readonly string MicroEnforcerCertsSecretsName;
        /// <summary>
        /// This option is applicable only if `Enable Pod Enforcer injection` is selected. This field specifies the path and file name of the KubeEnforcer product image to be deployed; it will be filled in automatically. You can optionally enter a different value.
        /// </summary>
        public readonly string MicroEnforcerImageName;
        /// <summary>
        /// This applies only if both `Enable admission control` and Enforce mode are set. This additional option must be selected for admission control to work if the KubeEnforcer is not connected to any Gateway. If this option is not selected, admission control will be disabled; this will have no effect on containers already running.
        /// </summary>
        public readonly bool MicroEnforcerInjection;
        /// <summary>
        /// This option is applicable only if `Enable Pod Enforcer injection` is selected.
        /// </summary>
        public readonly string MicroEnforcerSecretsName;
        /// <summary>
        /// Number of negligible vulnerabilities in the enforcers that in this enforcer group.
        /// </summary>
        public readonly int NegVulns;
        /// <summary>
        /// When set to `True` applies Firewall Policies to containers, and allows recording network maps for Aqua services. The Network Firewall setting must be disabled when deploying the Aqua Enforcer on a machine running Rocky Linux. See https://docs.aquasec.com/docs/platform-support-limitations-rocky-linux for further information.
        /// </summary>
        public readonly bool NetworkProtection;
        /// <summary>
        /// The orchestrator for which you are creating the Enforcer group.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnforcerGroupsOrchestratorResult> Orchestrators;
        /// <summary>
        /// pas deployment link
        /// </summary>
        public readonly string PasDeploymentLink;
        /// <summary>
        /// Permission Action
        /// </summary>
        public readonly string Permission;
        /// <summary>
        /// When set to `True` allows Enforcers to be discovered in the Risk Explorer.
        /// </summary>
        public readonly bool RiskExplorerAutoDiscovery;
        /// <summary>
        /// Function Runtime Policy that will applay on the nano enforcer.
        /// </summary>
        public readonly string RuntimePolicyName;
        /// <summary>
        /// The container runtime environment.
        /// </summary>
        public readonly string RuntimeType;
        /// <summary>
        /// When set to `True` configures Enforcers to discover local host images. Discovered images will be listed under Images &gt; Host Images, as well as under Infrastructure (in the Images tab for applicable hosts).
        /// </summary>
        public readonly bool SyncHostImages;
        /// <summary>
        /// When set to `True` allows profiling and monitoring system calls made by running containers.
        /// </summary>
        public readonly bool SyscallEnabled;
        /// <summary>
        /// The batch install token.
        /// </summary>
        public readonly string Token;
        /// <summary>
        /// Enforcer Type.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// When set to `True` applies User Access Control Policies to containers. Note that Aqua Enforcers must be deployed with the AQUA*RUNC*INTERCEPTION environment variable set to 0 in order to use User Access Control Policies.
        /// </summary>
        public readonly bool UserAccessControl;

        [OutputConstructor]
        private GetEnforcerGroupsResult(
            bool admissionControl,

            bool allowKubeEnforcerAudit,

            ImmutableArray<string> allowedApplications,

            ImmutableArray<string> allowedLabels,

            ImmutableArray<string> allowedRegistries,

            bool antivirusProtection,

            string aquaVersion,

            bool auditAll,

            bool autoCopySecrets,

            bool autoDiscoverConfigureRegistries,

            bool autoDiscoveryEnabled,

            bool autoScanDiscoveredImagesRunningContainers,

            bool behavioralEngine,

            bool blockAdmissionControl,

            ImmutableArray<Outputs.GetEnforcerGroupsCommandResult> commands,

            int connectedCount,

            bool containerActivityProtection,

            bool containerAntivirusProtection,

            string description,

            int disconnectedCount,

            bool enforce,

            string enforcerImageName,

            bool? forensics,

            string gatewayAddress,

            string gatewayName,

            ImmutableArray<string> gateways,

            string groupId,

            int highVulns,

            bool hostAssurance,

            bool hostBehavioralEngine,

            bool? hostForensics,

            bool hostNetworkProtection,

            string hostOs,

            bool hostProtection,

            bool hostUserProtection,

            int hostsCount,

            string id,

            bool imageAssurance,

            string installCommand,

            string kubeBenchImageName,

            int lastUpdate,

            string logicalName,

            int lowVulns,

            int medVulns,

            string microEnforcerCertsSecretsName,

            string microEnforcerImageName,

            bool microEnforcerInjection,

            string microEnforcerSecretsName,

            int negVulns,

            bool networkProtection,

            ImmutableArray<Outputs.GetEnforcerGroupsOrchestratorResult> orchestrators,

            string pasDeploymentLink,

            string permission,

            bool riskExplorerAutoDiscovery,

            string runtimePolicyName,

            string runtimeType,

            bool syncHostImages,

            bool syscallEnabled,

            string token,

            string type,

            bool userAccessControl)
        {
            AdmissionControl = admissionControl;
            AllowKubeEnforcerAudit = allowKubeEnforcerAudit;
            AllowedApplications = allowedApplications;
            AllowedLabels = allowedLabels;
            AllowedRegistries = allowedRegistries;
            AntivirusProtection = antivirusProtection;
            AquaVersion = aquaVersion;
            AuditAll = auditAll;
            AutoCopySecrets = autoCopySecrets;
            AutoDiscoverConfigureRegistries = autoDiscoverConfigureRegistries;
            AutoDiscoveryEnabled = autoDiscoveryEnabled;
            AutoScanDiscoveredImagesRunningContainers = autoScanDiscoveredImagesRunningContainers;
            BehavioralEngine = behavioralEngine;
            BlockAdmissionControl = blockAdmissionControl;
            Commands = commands;
            ConnectedCount = connectedCount;
            ContainerActivityProtection = containerActivityProtection;
            ContainerAntivirusProtection = containerAntivirusProtection;
            Description = description;
            DisconnectedCount = disconnectedCount;
            Enforce = enforce;
            EnforcerImageName = enforcerImageName;
            Forensics = forensics;
            GatewayAddress = gatewayAddress;
            GatewayName = gatewayName;
            Gateways = gateways;
            GroupId = groupId;
            HighVulns = highVulns;
            HostAssurance = hostAssurance;
            HostBehavioralEngine = hostBehavioralEngine;
            HostForensics = hostForensics;
            HostNetworkProtection = hostNetworkProtection;
            HostOs = hostOs;
            HostProtection = hostProtection;
            HostUserProtection = hostUserProtection;
            HostsCount = hostsCount;
            Id = id;
            ImageAssurance = imageAssurance;
            InstallCommand = installCommand;
            KubeBenchImageName = kubeBenchImageName;
            LastUpdate = lastUpdate;
            LogicalName = logicalName;
            LowVulns = lowVulns;
            MedVulns = medVulns;
            MicroEnforcerCertsSecretsName = microEnforcerCertsSecretsName;
            MicroEnforcerImageName = microEnforcerImageName;
            MicroEnforcerInjection = microEnforcerInjection;
            MicroEnforcerSecretsName = microEnforcerSecretsName;
            NegVulns = negVulns;
            NetworkProtection = networkProtection;
            Orchestrators = orchestrators;
            PasDeploymentLink = pasDeploymentLink;
            Permission = permission;
            RiskExplorerAutoDiscovery = riskExplorerAutoDiscovery;
            RuntimePolicyName = runtimePolicyName;
            RuntimeType = runtimeType;
            SyncHostImages = syncHostImages;
            SyscallEnabled = syscallEnabled;
            Token = token;
            Type = type;
            UserAccessControl = userAccessControl;
        }
    }
}
