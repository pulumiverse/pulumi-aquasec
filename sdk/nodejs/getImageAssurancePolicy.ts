// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export function getImageAssurancePolicy(args: GetImageAssurancePolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetImageAssurancePolicyResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aquasec:index/getImageAssurancePolicy:getImageAssurancePolicy", {
        "maximumScoreExcludeNoFix": args.maximumScoreExcludeNoFix,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getImageAssurancePolicy.
 */
export interface GetImageAssurancePolicyArgs {
    /**
     * Indicates that policy should ignore cases that do not have a known fix.
     */
    maximumScoreExcludeNoFix?: boolean;
    name: string;
}

/**
 * A collection of values returned by getImageAssurancePolicy.
 */
export interface GetImageAssurancePolicyResult {
    /**
     * List of explicitly allowed images.
     */
    readonly allowedImages: string[];
    readonly applicationScopes: string[];
    /**
     * What type of assurance policy is described.
     */
    readonly assuranceType: string;
    /**
     * Indicates if auditing for failures.
     */
    readonly auditOnFailure: boolean;
    /**
     * Name of user account that created the policy.
     */
    readonly author: string;
    readonly autoScanConfigured: boolean;
    readonly autoScanEnabled: boolean;
    readonly autoScanTimes: outputs.GetImageAssurancePolicyAutoScanTime[];
    /**
     * List of function's forbidden permissions.
     */
    readonly blacklistPermissions: string[];
    /**
     * Indicates if blacklist permissions is relevant.
     */
    readonly blacklistPermissionsEnabled: boolean;
    /**
     * List of blacklisted licenses.
     */
    readonly blacklistedLicenses: string[];
    /**
     * Lndicates if license blacklist is relevant.
     */
    readonly blacklistedLicensesEnabled: boolean;
    /**
     * Indicates if failed images are blocked.
     */
    readonly blockFailed: boolean;
    readonly controlExcludeNoFix: boolean;
    /**
     * List of Custom user scripts for checks.
     */
    readonly customChecks: outputs.GetImageAssurancePolicyCustomCheck[];
    /**
     * Indicates if scanning should include custom checks.
     */
    readonly customChecksEnabled: boolean;
    readonly customSeverityEnabled: boolean;
    /**
     * Indicates if cves blacklist is relevant.
     */
    readonly cvesBlackListEnabled: boolean;
    /**
     * List of cves blacklisted items.
     */
    readonly cvesBlackLists: string[];
    /**
     * Indicates if cves whitelist is relevant.
     */
    readonly cvesWhiteListEnabled: boolean;
    /**
     * List of cves whitelisted licenses
     */
    readonly cvesWhiteLists: string[];
    /**
     * Identifier of the cvss severity.
     */
    readonly cvssSeverity: string;
    /**
     * Indicates if the cvss severity is scanned.
     */
    readonly cvssSeverityEnabled: boolean;
    /**
     * Indicates that policy should ignore cvss cases that do not have a known fix.
     */
    readonly cvssSeverityExcludeNoFix: boolean;
    readonly description: string;
    /**
     * Indicates if malware should block the image.
     */
    readonly disallowMalware: boolean;
    readonly dockerCisEnabled: boolean;
    /**
     * Name of the container image.
     */
    readonly domain: string;
    readonly domainName: string;
    readonly dtaEnabled: boolean;
    readonly dtaSeverity: string;
    readonly enabled: boolean;
    readonly enforce: boolean;
    readonly enforceAfterDays: number;
    readonly enforceExcessivePermissions: boolean;
    readonly exceptionalMonitoredMalwarePaths: string[];
    /**
     * Indicates if cicd failures will fail the image.
     */
    readonly failCicd: boolean;
    readonly forbiddenLabels: outputs.GetImageAssurancePolicyForbiddenLabel[];
    readonly forbiddenLabelsEnabled: boolean;
    readonly forceMicroenforcer: boolean;
    readonly functionIntegrityEnabled: boolean;
    /**
     * The ID of this resource.
     */
    readonly id: string;
    readonly ignoreRecentlyPublishedVln: boolean;
    readonly ignoreRecentlyPublishedVlnPeriod: number;
    /**
     * Indicates if risk resources are ignored.
     */
    readonly ignoreRiskResourcesEnabled: boolean;
    /**
     * List of ignored risk resources.
     */
    readonly ignoredRiskResources: string[];
    /**
     * List of images.
     */
    readonly images: string[];
    readonly kubeCisEnabled: boolean;
    /**
     * List of labels.
     */
    readonly labels: string[];
    readonly malwareAction: string;
    /**
     * Value of allowed maximum score.
     */
    readonly maximumScore: number;
    /**
     * Indicates if exceeding the maximum score is scanned.
     */
    readonly maximumScoreEnabled: boolean;
    /**
     * Indicates that policy should ignore cases that do not have a known fix.
     */
    readonly maximumScoreExcludeNoFix?: boolean;
    readonly monitoredMalwarePaths: string[];
    readonly name: string;
    /**
     * Indicates if raise a warning for images that should only be run as root.
     */
    readonly onlyNoneRootUsers: boolean;
    /**
     * Indicates if packages blacklist is relevant.
     */
    readonly packagesBlackListEnabled: boolean;
    /**
     * List of backlisted images.
     */
    readonly packagesBlackLists: outputs.GetImageAssurancePolicyPackagesBlackList[];
    /**
     * Indicates if packages whitelist is relevant.
     */
    readonly packagesWhiteListEnabled: boolean;
    /**
     * List of whitelisted images.
     */
    readonly packagesWhiteLists: outputs.GetImageAssurancePolicyPackagesWhiteList[];
    readonly partialResultsImageFail: boolean;
    readonly readOnly: boolean;
    /**
     * List of registries.
     */
    readonly registries: string[];
    readonly registry: string;
    readonly requiredLabels: outputs.GetImageAssurancePolicyRequiredLabel[];
    readonly requiredLabelsEnabled: boolean;
    readonly scanNfsMounts: boolean;
    /**
     * Indicates if scan should include sensitive data in the image.
     */
    readonly scanSensitiveData: boolean;
    /**
     * Indicates if scanning should include scap.
     */
    readonly scapEnabled: boolean;
    /**
     * List of SCAP user scripts for checks.
     */
    readonly scapFiles: string[];
    readonly scopes: outputs.GetImageAssurancePolicyScope[];
    /**
     * List of trusted images.
     */
    readonly trustedBaseImages: outputs.GetImageAssurancePolicyTrustedBaseImage[];
    /**
     * Indicates if list of trusted base images is relevant.
     */
    readonly trustedBaseImagesEnabled: boolean;
    /**
     * List of whitelisted licenses.
     */
    readonly whitelistedLicenses: string[];
    /**
     * Indicates if license blacklist is relevant.
     */
    readonly whitelistedLicensesEnabled: boolean;
}

export function getImageAssurancePolicyOutput(args: GetImageAssurancePolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetImageAssurancePolicyResult> {
    return pulumi.output(args).apply(a => getImageAssurancePolicy(a, opts))
}

/**
 * A collection of arguments for invoking getImageAssurancePolicy.
 */
export interface GetImageAssurancePolicyOutputArgs {
    /**
     * Indicates that policy should ignore cases that do not have a known fix.
     */
    maximumScoreExcludeNoFix?: pulumi.Input<boolean>;
    name: pulumi.Input<string>;
}
