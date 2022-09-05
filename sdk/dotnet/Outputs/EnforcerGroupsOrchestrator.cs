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
    public sealed class EnforcerGroupsOrchestrator
    {
        public readonly bool? Master;
        /// <summary>
        /// May be specified for these orchestrators: Kubernetes, Kubernetes GKE, VMware Tanzu Kubernetes Grid Integrated Edition (PKS).
        /// </summary>
        public readonly string? Namespace;
        /// <summary>
        /// May be specified for these orchestrators: Kubernetes, Kubernetes GKE, OpenShift, VMware Tanzu Kubernetes Grid Integrated Edition (PKS).
        /// </summary>
        public readonly string? ServiceAccount;
        /// <summary>
        /// Enforcer Type.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private EnforcerGroupsOrchestrator(
            bool? master,

            string? @namespace,

            string? serviceAccount,

            string? type)
        {
            Master = master;
            Namespace = @namespace;
            ServiceAccount = serviceAccount;
            Type = type;
        }
    }
}
