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
    public static class GetHostAssurancePolic
    {
        public static Task<GetHostAssurancePolicResult> InvokeAsync(GetHostAssurancePolicArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetHostAssurancePolicResult>("aquasec:index/getHostAssurancePolic:getHostAssurancePolic", args ?? new GetHostAssurancePolicArgs(), options.WithDefaults());

        public static Output<GetHostAssurancePolicResult> Invoke(GetHostAssurancePolicInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetHostAssurancePolicResult>("aquasec:index/getHostAssurancePolic:getHostAssurancePolic", args ?? new GetHostAssurancePolicInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHostAssurancePolicArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Indicates that policy should ignore cases that do not have a known fix.
        /// </summary>
        [Input("maximumScoreExcludeNoFix")]
        public bool? MaximumScoreExcludeNoFix { get; set; }

        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetHostAssurancePolicArgs()
        {
        }
        public static new GetHostAssurancePolicArgs Empty => new GetHostAssurancePolicArgs();
    }

    public sealed class GetHostAssurancePolicInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Indicates that policy should ignore cases that do not have a known fix.
        /// </summary>
        [Input("maximumScoreExcludeNoFix")]
        public Input<bool>? MaximumScoreExcludeNoFix { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetHostAssurancePolicInvokeArgs()
        {
        }
        public static new GetHostAssurancePolicInvokeArgs Empty => new GetHostAssurancePolicInvokeArgs();
    }


    [OutputType]
    public sealed class GetHostAssurancePolicResult
    {
        /// <summary>
        /// List of explicitly allowed images.
        /// </summary>
        public readonly ImmutableArray<string> AllowedImages;
        public readonly ImmutableArray<string> ApplicationScopes;
        /// <summary>
        /// What type of assurance policy is described.
        /// </summary>
        public readonly string AssuranceType;
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
        public readonly ImmutableArray<Outputs.GetHostAssurancePolicAutoScanTimeResult> AutoScanTimes;
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
        /// Lndicates if license blacklist is relevant.
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
        public readonly ImmutableArray<Outputs.GetHostAssurancePolicCustomCheckResult> CustomChecks;
        /// <summary>
        /// Indicates if scanning should include custom checks.
        /// </summary>
        public readonly bool CustomChecksEnabled;
        public readonly bool CustomSeverityEnabled;
        /// <summary>
        /// Indicates if cves blacklist is relevant.
        /// </summary>
        public readonly bool CvesBlackListEnabled;
        /// <summary>
        /// List of cves blacklisted items.
        /// </summary>
        public readonly ImmutableArray<string> CvesBlackLists;
        /// <summary>
        /// Indicates if cves whitelist is relevant.
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
        public readonly ImmutableArray<Outputs.GetHostAssurancePolicForbiddenLabelResult> ForbiddenLabels;
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
        public readonly bool? MaximumScoreExcludeNoFix;
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
        /// List of backlisted images.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHostAssurancePolicPackagesBlackListResult> PackagesBlackLists;
        /// <summary>
        /// Indicates if packages whitelist is relevant.
        /// </summary>
        public readonly bool PackagesWhiteListEnabled;
        /// <summary>
        /// List of whitelisted images.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHostAssurancePolicPackagesWhiteListResult> PackagesWhiteLists;
        public readonly bool PartialResultsImageFail;
        public readonly bool ReadOnly;
        /// <summary>
        /// List of registries.
        /// </summary>
        public readonly ImmutableArray<string> Registries;
        public readonly string Registry;
        public readonly ImmutableArray<Outputs.GetHostAssurancePolicRequiredLabelResult> RequiredLabels;
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
        public readonly ImmutableArray<Outputs.GetHostAssurancePolicScopeResult> Scopes;
        /// <summary>
        /// List of trusted images.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetHostAssurancePolicTrustedBaseImageResult> TrustedBaseImages;
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
        private GetHostAssurancePolicResult(
            ImmutableArray<string> allowedImages,

            ImmutableArray<string> applicationScopes,

            string assuranceType,

            bool auditOnFailure,

            string author,

            bool autoScanConfigured,

            bool autoScanEnabled,

            ImmutableArray<Outputs.GetHostAssurancePolicAutoScanTimeResult> autoScanTimes,

            ImmutableArray<string> blacklistPermissions,

            bool blacklistPermissionsEnabled,

            ImmutableArray<string> blacklistedLicenses,

            bool blacklistedLicensesEnabled,

            bool blockFailed,

            bool controlExcludeNoFix,

            ImmutableArray<Outputs.GetHostAssurancePolicCustomCheckResult> customChecks,

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

            ImmutableArray<Outputs.GetHostAssurancePolicForbiddenLabelResult> forbiddenLabels,

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

            bool? maximumScoreExcludeNoFix,

            ImmutableArray<string> monitoredMalwarePaths,

            string name,

            bool onlyNoneRootUsers,

            bool packagesBlackListEnabled,

            ImmutableArray<Outputs.GetHostAssurancePolicPackagesBlackListResult> packagesBlackLists,

            bool packagesWhiteListEnabled,

            ImmutableArray<Outputs.GetHostAssurancePolicPackagesWhiteListResult> packagesWhiteLists,

            bool partialResultsImageFail,

            bool readOnly,

            ImmutableArray<string> registries,

            string registry,

            ImmutableArray<Outputs.GetHostAssurancePolicRequiredLabelResult> requiredLabels,

            bool requiredLabelsEnabled,

            bool scanNfsMounts,

            bool scanSensitiveData,

            bool scapEnabled,

            ImmutableArray<string> scapFiles,

            ImmutableArray<Outputs.GetHostAssurancePolicScopeResult> scopes,

            ImmutableArray<Outputs.GetHostAssurancePolicTrustedBaseImageResult> trustedBaseImages,

            bool trustedBaseImagesEnabled,

            ImmutableArray<string> whitelistedLicenses,

            bool whitelistedLicensesEnabled)
        {
            AllowedImages = allowedImages;
            ApplicationScopes = applicationScopes;
            AssuranceType = assuranceType;
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
