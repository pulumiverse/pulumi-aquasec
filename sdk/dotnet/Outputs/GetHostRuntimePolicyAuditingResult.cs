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
    public sealed class GetHostRuntimePolicyAuditingResult
    {
        public readonly bool? AuditAllNetwork;
        public readonly bool? AuditAllProcesses;
        public readonly bool? AuditFailedLogin;
        public readonly bool? AuditOsUserActivity;
        public readonly bool? AuditProcessCmdline;
        public readonly bool? AuditSuccessLogin;
        public readonly bool? AuditUserAccountManagement;
        public readonly bool? Enabled;

        [OutputConstructor]
        private GetHostRuntimePolicyAuditingResult(
            bool? auditAllNetwork,

            bool? auditAllProcesses,

            bool? auditFailedLogin,

            bool? auditOsUserActivity,

            bool? auditProcessCmdline,

            bool? auditSuccessLogin,

            bool? auditUserAccountManagement,

            bool? enabled)
        {
            AuditAllNetwork = auditAllNetwork;
            AuditAllProcesses = auditAllProcesses;
            AuditFailedLogin = auditFailedLogin;
            AuditOsUserActivity = auditOsUserActivity;
            AuditProcessCmdline = auditProcessCmdline;
            AuditSuccessLogin = auditSuccessLogin;
            AuditUserAccountManagement = auditUserAccountManagement;
            Enabled = enabled;
        }
    }
}
