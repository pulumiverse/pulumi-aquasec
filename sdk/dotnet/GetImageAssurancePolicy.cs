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
    public static class GetImageAssurancePolicy
    {
        public static Task<GetImageAssurancePolicyResult> InvokeAsync(GetImageAssurancePolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetImageAssurancePolicyResult>("aquasec:index/getImageAssurancePolicy:getImageAssurancePolicy", args ?? new GetImageAssurancePolicyArgs(), options.WithDefaults());

        public static Output<GetImageAssurancePolicyResult> Invoke(GetImageAssurancePolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetImageAssurancePolicyResult>("aquasec:index/getImageAssurancePolicy:getImageAssurancePolicy", args ?? new GetImageAssurancePolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetImageAssurancePolicyArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetImageAssurancePolicyArgs()
        {
        }
        public static new GetImageAssurancePolicyArgs Empty => new GetImageAssurancePolicyArgs();
    }

    public sealed class GetImageAssurancePolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetImageAssurancePolicyInvokeArgs()
        {
        }
        public static new GetImageAssurancePolicyInvokeArgs Empty => new GetImageAssurancePolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetImageAssurancePolicyResult
    {
        /// <summary>
        /// List of explicitly allowed images.
        /// </summary>
        public readonly ImmutableArray<string> AllowedImages;
        public readonly ImmutableArray<string> ApplicationScopes;
        /// <summary>
        /// Indicates if auditing for failures.
        /// </summary>
        public readonly bool AuditOnFailure;
        /// <summary>
        /// Name of user account that created the policy.
        /// </summary>
        public readonly string Author;
        public readonly bool AutoScanConfigured;
        public readonly bool AutoScanEnabled;
        public readonly ImmutableArray<Outputs.GetImageAssurancePolicyAutoScanTimeResult> AutoScanTimes;
        /// <summary>
        /// List of function's forbidden permissions.
        /// </summary>
        public readonly ImmutableArray<string> BlacklistPermissions;
        /// <summary>
        /// Indicates if blacklist permissions is relevant.
        /// </summary>
        public readonly bool BlacklistPermissionsEnabled;
        /// <summary>
        /// List of blacklisted licenses.
        /// </summary>
        public readonly ImmutableArray<string> BlacklistedLicenses;
        /// <summary>
        /// Indicates if license blacklist is relevant.
        /// </summary>
        public readonly bool BlacklistedLicensesEnabled;
        /// <summary>
        /// Indicates if failed images are blocked.
        /// </summary>
        public readonly bool BlockFailed;
        public readonly bool ControlExcludeNoFix;
        /// <summary>
        /// List of Custom user scripts for checks.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImageAssurancePolicyCustomCheckResult> CustomChecks;
        /// <summary>
        /// Indicates if scanning should include custom checks.
        /// </summary>
        public readonly bool CustomChecksEnabled;
        public readonly bool CustomSeverityEnabled;
        /// <summary>
        /// Indicates if CVEs blacklist is relevant.
        /// </summary>
        public readonly bool CvesBlackListEnabled;
        /// <summary>
        /// List of CVEs blacklisted items.
        /// </summary>
        public readonly ImmutableArray<string> CvesBlackLists;
        /// <summary>
        /// Indicates if CVEs whitelist is relevant.
        /// </summary>
        public readonly bool CvesWhiteListEnabled;
        /// <summary>
        /// List of cves whitelisted licenses
        /// </summary>
        public readonly ImmutableArray<string> CvesWhiteLists;
        /// <summary>
        /// Identifier of the cvss severity.
        /// </summary>
        public readonly string CvssSeverity;
        /// <summary>
        /// Indicates if the cvss severity is scanned.
        /// </summary>
        public readonly bool CvssSeverityEnabled;
        /// <summary>
        /// Indicates that policy should ignore cvss cases that do not have a known fix.
        /// </summary>
        public readonly bool CvssSeverityExcludeNoFix;
        public readonly string Description;
        /// <summary>
        /// Indicates if malware should block the image.
        /// </summary>
        public readonly bool DisallowMalware;
        /// <summary>
        /// Checks the host according to the Docker CIS benchmark, if Docker is found on the host.
        /// </summary>
        public readonly bool DockerCisEnabled;
        /// <summary>
        /// Name of the container image.
        /// </summary>
        public readonly string Domain;
        public readonly string DomainName;
        public readonly bool DtaEnabled;
        public readonly string DtaSeverity;
        public readonly bool Enabled;
        public readonly bool Enforce;
        public readonly int EnforceAfterDays;
        public readonly bool EnforceExcessivePermissions;
        public readonly ImmutableArray<string> ExceptionalMonitoredMalwarePaths;
        /// <summary>
        /// Indicates if cicd failures will fail the image.
        /// </summary>
        public readonly bool FailCicd;
        public readonly ImmutableArray<Outputs.GetImageAssurancePolicyForbiddenLabelResult> ForbiddenLabels;
        public readonly bool ForbiddenLabelsEnabled;
        public readonly bool ForceMicroenforcer;
        public readonly bool FunctionIntegrityEnabled;
        /// <summary>
        /// The ID of this resource.
        /// </summary>
        public readonly string Id;
        public readonly bool IgnoreRecentlyPublishedVln;
        public readonly int IgnoreRecentlyPublishedVlnPeriod;
        /// <summary>
        /// Indicates if risk resources are ignored.
        /// </summary>
        public readonly bool IgnoreRiskResourcesEnabled;
        /// <summary>
        /// List of ignored risk resources.
        /// </summary>
        public readonly ImmutableArray<string> IgnoredRiskResources;
        /// <summary>
        /// List of images.
        /// </summary>
        public readonly ImmutableArray<string> Images;
        /// <summary>
        /// Performs a Kubernetes CIS benchmark check for the host.
        /// </summary>
        public readonly bool KubeCisEnabled;
        /// <summary>
        /// List of labels.
        /// </summary>
        public readonly ImmutableArray<string> Labels;
        public readonly string MalwareAction;
        /// <summary>
        /// Value of allowed maximum score.
        /// </summary>
        public readonly double MaximumScore;
        /// <summary>
        /// Indicates if exceeding the maximum score is scanned.
        /// </summary>
        public readonly bool MaximumScoreEnabled;
        /// <summary>
        /// Indicates that policy should ignore cases that do not have a known fix.
        /// </summary>
        public readonly bool MaximumScoreExcludeNoFix;
        public readonly ImmutableArray<string> MonitoredMalwarePaths;
        public readonly string Name;
        /// <summary>
        /// Indicates if raise a warning for images that should only be run as root.
        /// </summary>
        public readonly bool OnlyNoneRootUsers;
        /// <summary>
        /// Indicates if packages blacklist is relevant.
        /// </summary>
        public readonly bool PackagesBlackListEnabled;
        /// <summary>
        /// List of blacklisted images.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImageAssurancePolicyPackagesBlackListResult> PackagesBlackLists;
        /// <summary>
        /// Indicates if packages whitelist is relevant.
        /// </summary>
        public readonly bool PackagesWhiteListEnabled;
        /// <summary>
        /// List of whitelisted images.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImageAssurancePolicyPackagesWhiteListResult> PackagesWhiteLists;
        public readonly bool PartialResultsImageFail;
        public readonly bool ReadOnly;
        /// <summary>
        /// List of registries.
        /// </summary>
        public readonly ImmutableArray<string> Registries;
        public readonly string Registry;
        public readonly ImmutableArray<Outputs.GetImageAssurancePolicyRequiredLabelResult> RequiredLabels;
        public readonly bool RequiredLabelsEnabled;
        public readonly bool ScanNfsMounts;
        /// <summary>
        /// Indicates if scan should include sensitive data in the image.
        /// </summary>
        public readonly bool ScanSensitiveData;
        /// <summary>
        /// Indicates if scanning should include scap.
        /// </summary>
        public readonly bool ScapEnabled;
        /// <summary>
        /// List of SCAP user scripts for checks.
        /// </summary>
        public readonly ImmutableArray<string> ScapFiles;
        public readonly ImmutableArray<Outputs.GetImageAssurancePolicyScopeResult> Scopes;
        /// <summary>
        /// List of trusted images.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetImageAssurancePolicyTrustedBaseImageResult> TrustedBaseImages;
        /// <summary>
        /// Indicates if list of trusted base images is relevant.
        /// </summary>
        public readonly bool TrustedBaseImagesEnabled;
        /// <summary>
        /// List of whitelisted licenses.
        /// </summary>
        public readonly ImmutableArray<string> WhitelistedLicenses;
        /// <summary>
        /// Indicates if license blacklist is relevant.
        /// </summary>
        public readonly bool WhitelistedLicensesEnabled;

        [OutputConstructor]
        private GetImageAssurancePolicyResult(
            ImmutableArray<string> allowedImages,

            ImmutableArray<string> applicationScopes,

            bool auditOnFailure,

            string author,

            bool autoScanConfigured,

            bool autoScanEnabled,

            ImmutableArray<Outputs.GetImageAssurancePolicyAutoScanTimeResult> autoScanTimes,

            ImmutableArray<string> blacklistPermissions,

            bool blacklistPermissionsEnabled,

            ImmutableArray<string> blacklistedLicenses,

            bool blacklistedLicensesEnabled,

            bool blockFailed,

            bool controlExcludeNoFix,

            ImmutableArray<Outputs.GetImageAssurancePolicyCustomCheckResult> customChecks,

            bool customChecksEnabled,

            bool customSeverityEnabled,

            bool cvesBlackListEnabled,

            ImmutableArray<string> cvesBlackLists,

            bool cvesWhiteListEnabled,

            ImmutableArray<string> cvesWhiteLists,

            string cvssSeverity,

            bool cvssSeverityEnabled,

            bool cvssSeverityExcludeNoFix,

            string description,

            bool disallowMalware,

            bool dockerCisEnabled,

            string domain,

            string domainName,

            bool dtaEnabled,

            string dtaSeverity,

            bool enabled,

            bool enforce,

            int enforceAfterDays,

            bool enforceExcessivePermissions,

            ImmutableArray<string> exceptionalMonitoredMalwarePaths,

            bool failCicd,

            ImmutableArray<Outputs.GetImageAssurancePolicyForbiddenLabelResult> forbiddenLabels,

            bool forbiddenLabelsEnabled,

            bool forceMicroenforcer,

            bool functionIntegrityEnabled,

            string id,

            bool ignoreRecentlyPublishedVln,

            int ignoreRecentlyPublishedVlnPeriod,

            bool ignoreRiskResourcesEnabled,

            ImmutableArray<string> ignoredRiskResources,

            ImmutableArray<string> images,

            bool kubeCisEnabled,

            ImmutableArray<string> labels,

            string malwareAction,

            double maximumScore,

            bool maximumScoreEnabled,

            bool maximumScoreExcludeNoFix,

            ImmutableArray<string> monitoredMalwarePaths,

            string name,

            bool onlyNoneRootUsers,

            bool packagesBlackListEnabled,

            ImmutableArray<Outputs.GetImageAssurancePolicyPackagesBlackListResult> packagesBlackLists,

            bool packagesWhiteListEnabled,

            ImmutableArray<Outputs.GetImageAssurancePolicyPackagesWhiteListResult> packagesWhiteLists,

            bool partialResultsImageFail,

            bool readOnly,

            ImmutableArray<string> registries,

            string registry,

            ImmutableArray<Outputs.GetImageAssurancePolicyRequiredLabelResult> requiredLabels,

            bool requiredLabelsEnabled,

            bool scanNfsMounts,

            bool scanSensitiveData,

            bool scapEnabled,

            ImmutableArray<string> scapFiles,

            ImmutableArray<Outputs.GetImageAssurancePolicyScopeResult> scopes,

            ImmutableArray<Outputs.GetImageAssurancePolicyTrustedBaseImageResult> trustedBaseImages,

            bool trustedBaseImagesEnabled,

            ImmutableArray<string> whitelistedLicenses,

            bool whitelistedLicensesEnabled)
        {
            AllowedImages = allowedImages;
            ApplicationScopes = applicationScopes;
            AuditOnFailure = auditOnFailure;
            Author = author;
            AutoScanConfigured = autoScanConfigured;
            AutoScanEnabled = autoScanEnabled;
            AutoScanTimes = autoScanTimes;
            BlacklistPermissions = blacklistPermissions;
            BlacklistPermissionsEnabled = blacklistPermissionsEnabled;
            BlacklistedLicenses = blacklistedLicenses;
            BlacklistedLicensesEnabled = blacklistedLicensesEnabled;
            BlockFailed = blockFailed;
            ControlExcludeNoFix = controlExcludeNoFix;
            CustomChecks = customChecks;
            CustomChecksEnabled = customChecksEnabled;
            CustomSeverityEnabled = customSeverityEnabled;
            CvesBlackListEnabled = cvesBlackListEnabled;
            CvesBlackLists = cvesBlackLists;
            CvesWhiteListEnabled = cvesWhiteListEnabled;
            CvesWhiteLists = cvesWhiteLists;
            CvssSeverity = cvssSeverity;
            CvssSeverityEnabled = cvssSeverityEnabled;
            CvssSeverityExcludeNoFix = cvssSeverityExcludeNoFix;
            Description = description;
            DisallowMalware = disallowMalware;
            DockerCisEnabled = dockerCisEnabled;
            Domain = domain;
            DomainName = domainName;
            DtaEnabled = dtaEnabled;
            DtaSeverity = dtaSeverity;
            Enabled = enabled;
            Enforce = enforce;
            EnforceAfterDays = enforceAfterDays;
            EnforceExcessivePermissions = enforceExcessivePermissions;
            ExceptionalMonitoredMalwarePaths = exceptionalMonitoredMalwarePaths;
            FailCicd = failCicd;
            ForbiddenLabels = forbiddenLabels;
            ForbiddenLabelsEnabled = forbiddenLabelsEnabled;
            ForceMicroenforcer = forceMicroenforcer;
            FunctionIntegrityEnabled = functionIntegrityEnabled;
            Id = id;
            IgnoreRecentlyPublishedVln = ignoreRecentlyPublishedVln;
            IgnoreRecentlyPublishedVlnPeriod = ignoreRecentlyPublishedVlnPeriod;
            IgnoreRiskResourcesEnabled = ignoreRiskResourcesEnabled;
            IgnoredRiskResources = ignoredRiskResources;
            Images = images;
            KubeCisEnabled = kubeCisEnabled;
            Labels = labels;
            MalwareAction = malwareAction;
            MaximumScore = maximumScore;
            MaximumScoreEnabled = maximumScoreEnabled;
            MaximumScoreExcludeNoFix = maximumScoreExcludeNoFix;
            MonitoredMalwarePaths = monitoredMalwarePaths;
            Name = name;
            OnlyNoneRootUsers = onlyNoneRootUsers;
            PackagesBlackListEnabled = packagesBlackListEnabled;
            PackagesBlackLists = packagesBlackLists;
            PackagesWhiteListEnabled = packagesWhiteListEnabled;
            PackagesWhiteLists = packagesWhiteLists;
            PartialResultsImageFail = partialResultsImageFail;
            ReadOnly = readOnly;
            Registries = registries;
            Registry = registry;
            RequiredLabels = requiredLabels;
            RequiredLabelsEnabled = requiredLabelsEnabled;
            ScanNfsMounts = scanNfsMounts;
            ScanSensitiveData = scanSensitiveData;
            ScapEnabled = scapEnabled;
            ScapFiles = scapFiles;
            Scopes = scopes;
            TrustedBaseImages = trustedBaseImages;
            TrustedBaseImagesEnabled = trustedBaseImagesEnabled;
            WhitelistedLicenses = whitelistedLicenses;
            WhitelistedLicensesEnabled = whitelistedLicensesEnabled;
        }
    }
}
