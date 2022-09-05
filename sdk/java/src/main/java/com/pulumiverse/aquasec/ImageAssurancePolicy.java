// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumiverse.aquasec.ImageAssurancePolicyArgs;
import com.pulumiverse.aquasec.Utilities;
import com.pulumiverse.aquasec.inputs.ImageAssurancePolicyState;
import com.pulumiverse.aquasec.outputs.ImageAssurancePolicyAutoScanTime;
import com.pulumiverse.aquasec.outputs.ImageAssurancePolicyCustomCheck;
import com.pulumiverse.aquasec.outputs.ImageAssurancePolicyForbiddenLabel;
import com.pulumiverse.aquasec.outputs.ImageAssurancePolicyPackagesBlackList;
import com.pulumiverse.aquasec.outputs.ImageAssurancePolicyPackagesWhiteList;
import com.pulumiverse.aquasec.outputs.ImageAssurancePolicyRequiredLabel;
import com.pulumiverse.aquasec.outputs.ImageAssurancePolicyScope;
import com.pulumiverse.aquasec.outputs.ImageAssurancePolicyTrustedBaseImage;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="aquasec:index/imageAssurancePolicy:ImageAssurancePolicy")
public class ImageAssurancePolicy extends com.pulumi.resources.CustomResource {
    /**
     * List of explicitly allowed images.
     * 
     */
    @Export(name="allowedImages", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedImages;

    /**
     * @return List of explicitly allowed images.
     * 
     */
    public Output<Optional<List<String>>> allowedImages() {
        return Codegen.optional(this.allowedImages);
    }
    @Export(name="applicationScopes", type=List.class, parameters={String.class})
    private Output<List<String>> applicationScopes;

    public Output<List<String>> applicationScopes() {
        return this.applicationScopes;
    }
    /**
     * What type of assurance policy is described.
     * 
     */
    @Export(name="assuranceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> assuranceType;

    /**
     * @return What type of assurance policy is described.
     * 
     */
    public Output<Optional<String>> assuranceType() {
        return Codegen.optional(this.assuranceType);
    }
    /**
     * Indicates if auditing for failures.
     * 
     */
    @Export(name="auditOnFailure", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> auditOnFailure;

    /**
     * @return Indicates if auditing for failures.
     * 
     */
    public Output<Optional<Boolean>> auditOnFailure() {
        return Codegen.optional(this.auditOnFailure);
    }
    /**
     * Name of user account that created the policy.
     * 
     */
    @Export(name="author", type=String.class, parameters={})
    private Output<String> author;

    /**
     * @return Name of user account that created the policy.
     * 
     */
    public Output<String> author() {
        return this.author;
    }
    @Export(name="autoScanConfigured", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoScanConfigured;

    public Output<Optional<Boolean>> autoScanConfigured() {
        return Codegen.optional(this.autoScanConfigured);
    }
    @Export(name="autoScanEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoScanEnabled;

    public Output<Optional<Boolean>> autoScanEnabled() {
        return Codegen.optional(this.autoScanEnabled);
    }
    @Export(name="autoScanTimes", type=List.class, parameters={ImageAssurancePolicyAutoScanTime.class})
    private Output<List<ImageAssurancePolicyAutoScanTime>> autoScanTimes;

    public Output<List<ImageAssurancePolicyAutoScanTime>> autoScanTimes() {
        return this.autoScanTimes;
    }
    /**
     * List of function&#39;s forbidden permissions.
     * 
     */
    @Export(name="blacklistPermissions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> blacklistPermissions;

    /**
     * @return List of function&#39;s forbidden permissions.
     * 
     */
    public Output<Optional<List<String>>> blacklistPermissions() {
        return Codegen.optional(this.blacklistPermissions);
    }
    /**
     * Indicates if blacklist permissions is relevant.
     * 
     */
    @Export(name="blacklistPermissionsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> blacklistPermissionsEnabled;

    /**
     * @return Indicates if blacklist permissions is relevant.
     * 
     */
    public Output<Optional<Boolean>> blacklistPermissionsEnabled() {
        return Codegen.optional(this.blacklistPermissionsEnabled);
    }
    /**
     * List of blacklisted licenses.
     * 
     */
    @Export(name="blacklistedLicenses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> blacklistedLicenses;

    /**
     * @return List of blacklisted licenses.
     * 
     */
    public Output<Optional<List<String>>> blacklistedLicenses() {
        return Codegen.optional(this.blacklistedLicenses);
    }
    /**
     * Lndicates if license blacklist is relevant.
     * 
     */
    @Export(name="blacklistedLicensesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> blacklistedLicensesEnabled;

    /**
     * @return Lndicates if license blacklist is relevant.
     * 
     */
    public Output<Optional<Boolean>> blacklistedLicensesEnabled() {
        return Codegen.optional(this.blacklistedLicensesEnabled);
    }
    /**
     * Indicates if failed images are blocked.
     * 
     */
    @Export(name="blockFailed", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> blockFailed;

    /**
     * @return Indicates if failed images are blocked.
     * 
     */
    public Output<Optional<Boolean>> blockFailed() {
        return Codegen.optional(this.blockFailed);
    }
    @Export(name="controlExcludeNoFix", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> controlExcludeNoFix;

    public Output<Optional<Boolean>> controlExcludeNoFix() {
        return Codegen.optional(this.controlExcludeNoFix);
    }
    /**
     * List of Custom user scripts for checks.
     * 
     */
    @Export(name="customChecks", type=List.class, parameters={ImageAssurancePolicyCustomCheck.class})
    private Output</* @Nullable */ List<ImageAssurancePolicyCustomCheck>> customChecks;

    /**
     * @return List of Custom user scripts for checks.
     * 
     */
    public Output<Optional<List<ImageAssurancePolicyCustomCheck>>> customChecks() {
        return Codegen.optional(this.customChecks);
    }
    /**
     * Indicates if scanning should include custom checks.
     * 
     */
    @Export(name="customChecksEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> customChecksEnabled;

    /**
     * @return Indicates if scanning should include custom checks.
     * 
     */
    public Output<Optional<Boolean>> customChecksEnabled() {
        return Codegen.optional(this.customChecksEnabled);
    }
    @Export(name="customSeverityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> customSeverityEnabled;

    public Output<Optional<Boolean>> customSeverityEnabled() {
        return Codegen.optional(this.customSeverityEnabled);
    }
    /**
     * Indicates if cves blacklist is relevant.
     * 
     */
    @Export(name="cvesBlackListEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cvesBlackListEnabled;

    /**
     * @return Indicates if cves blacklist is relevant.
     * 
     */
    public Output<Optional<Boolean>> cvesBlackListEnabled() {
        return Codegen.optional(this.cvesBlackListEnabled);
    }
    /**
     * List of cves blacklisted items.
     * 
     */
    @Export(name="cvesBlackLists", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> cvesBlackLists;

    /**
     * @return List of cves blacklisted items.
     * 
     */
    public Output<Optional<List<String>>> cvesBlackLists() {
        return Codegen.optional(this.cvesBlackLists);
    }
    /**
     * Indicates if cves whitelist is relevant.
     * 
     */
    @Export(name="cvesWhiteListEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cvesWhiteListEnabled;

    /**
     * @return Indicates if cves whitelist is relevant.
     * 
     */
    public Output<Optional<Boolean>> cvesWhiteListEnabled() {
        return Codegen.optional(this.cvesWhiteListEnabled);
    }
    /**
     * List of cves whitelisted licenses
     * 
     */
    @Export(name="cvesWhiteLists", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> cvesWhiteLists;

    /**
     * @return List of cves whitelisted licenses
     * 
     */
    public Output<Optional<List<String>>> cvesWhiteLists() {
        return Codegen.optional(this.cvesWhiteLists);
    }
    /**
     * Identifier of the cvss severity.
     * 
     */
    @Export(name="cvssSeverity", type=String.class, parameters={})
    private Output</* @Nullable */ String> cvssSeverity;

    /**
     * @return Identifier of the cvss severity.
     * 
     */
    public Output<Optional<String>> cvssSeverity() {
        return Codegen.optional(this.cvssSeverity);
    }
    /**
     * Indicates if the cvss severity is scanned.
     * 
     */
    @Export(name="cvssSeverityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cvssSeverityEnabled;

    /**
     * @return Indicates if the cvss severity is scanned.
     * 
     */
    public Output<Optional<Boolean>> cvssSeverityEnabled() {
        return Codegen.optional(this.cvssSeverityEnabled);
    }
    /**
     * Indicates that policy should ignore cvss cases that do not have a known fix.
     * 
     */
    @Export(name="cvssSeverityExcludeNoFix", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cvssSeverityExcludeNoFix;

    /**
     * @return Indicates that policy should ignore cvss cases that do not have a known fix.
     * 
     */
    public Output<Optional<Boolean>> cvssSeverityExcludeNoFix() {
        return Codegen.optional(this.cvssSeverityExcludeNoFix);
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Indicates if malware should block the image.
     * 
     */
    @Export(name="disallowMalware", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disallowMalware;

    /**
     * @return Indicates if malware should block the image.
     * 
     */
    public Output<Optional<Boolean>> disallowMalware() {
        return Codegen.optional(this.disallowMalware);
    }
    @Export(name="dockerCisEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dockerCisEnabled;

    public Output<Optional<Boolean>> dockerCisEnabled() {
        return Codegen.optional(this.dockerCisEnabled);
    }
    /**
     * Name of the container image.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output</* @Nullable */ String> domain;

    /**
     * @return Name of the container image.
     * 
     */
    public Output<Optional<String>> domain() {
        return Codegen.optional(this.domain);
    }
    @Export(name="domainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainName;

    public Output<Optional<String>> domainName() {
        return Codegen.optional(this.domainName);
    }
    @Export(name="dtaEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> dtaEnabled;

    public Output<Optional<Boolean>> dtaEnabled() {
        return Codegen.optional(this.dtaEnabled);
    }
    @Export(name="dtaSeverity", type=String.class, parameters={})
    private Output</* @Nullable */ String> dtaSeverity;

    public Output<Optional<String>> dtaSeverity() {
        return Codegen.optional(this.dtaSeverity);
    }
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    @Export(name="enforce", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enforce;

    public Output<Optional<Boolean>> enforce() {
        return Codegen.optional(this.enforce);
    }
    @Export(name="enforceAfterDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> enforceAfterDays;

    public Output<Optional<Integer>> enforceAfterDays() {
        return Codegen.optional(this.enforceAfterDays);
    }
    @Export(name="enforceExcessivePermissions", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enforceExcessivePermissions;

    public Output<Optional<Boolean>> enforceExcessivePermissions() {
        return Codegen.optional(this.enforceExcessivePermissions);
    }
    @Export(name="exceptionalMonitoredMalwarePaths", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> exceptionalMonitoredMalwarePaths;

    public Output<Optional<List<String>>> exceptionalMonitoredMalwarePaths() {
        return Codegen.optional(this.exceptionalMonitoredMalwarePaths);
    }
    /**
     * Indicates if cicd failures will fail the image.
     * 
     */
    @Export(name="failCicd", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> failCicd;

    /**
     * @return Indicates if cicd failures will fail the image.
     * 
     */
    public Output<Optional<Boolean>> failCicd() {
        return Codegen.optional(this.failCicd);
    }
    @Export(name="forbiddenLabels", type=List.class, parameters={ImageAssurancePolicyForbiddenLabel.class})
    private Output</* @Nullable */ List<ImageAssurancePolicyForbiddenLabel>> forbiddenLabels;

    public Output<Optional<List<ImageAssurancePolicyForbiddenLabel>>> forbiddenLabels() {
        return Codegen.optional(this.forbiddenLabels);
    }
    @Export(name="forbiddenLabelsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forbiddenLabelsEnabled;

    public Output<Optional<Boolean>> forbiddenLabelsEnabled() {
        return Codegen.optional(this.forbiddenLabelsEnabled);
    }
    @Export(name="forceMicroenforcer", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceMicroenforcer;

    public Output<Optional<Boolean>> forceMicroenforcer() {
        return Codegen.optional(this.forceMicroenforcer);
    }
    @Export(name="functionIntegrityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> functionIntegrityEnabled;

    public Output<Optional<Boolean>> functionIntegrityEnabled() {
        return Codegen.optional(this.functionIntegrityEnabled);
    }
    @Export(name="ignoreRecentlyPublishedVln", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreRecentlyPublishedVln;

    public Output<Optional<Boolean>> ignoreRecentlyPublishedVln() {
        return Codegen.optional(this.ignoreRecentlyPublishedVln);
    }
    @Export(name="ignoreRecentlyPublishedVlnPeriod", type=Integer.class, parameters={})
    private Output<Integer> ignoreRecentlyPublishedVlnPeriod;

    public Output<Integer> ignoreRecentlyPublishedVlnPeriod() {
        return this.ignoreRecentlyPublishedVlnPeriod;
    }
    /**
     * Indicates if risk resources are ignored.
     * 
     */
    @Export(name="ignoreRiskResourcesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreRiskResourcesEnabled;

    /**
     * @return Indicates if risk resources are ignored.
     * 
     */
    public Output<Optional<Boolean>> ignoreRiskResourcesEnabled() {
        return Codegen.optional(this.ignoreRiskResourcesEnabled);
    }
    /**
     * List of ignored risk resources.
     * 
     */
    @Export(name="ignoredRiskResources", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ignoredRiskResources;

    /**
     * @return List of ignored risk resources.
     * 
     */
    public Output<Optional<List<String>>> ignoredRiskResources() {
        return Codegen.optional(this.ignoredRiskResources);
    }
    /**
     * List of images.
     * 
     */
    @Export(name="images", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> images;

    /**
     * @return List of images.
     * 
     */
    public Output<Optional<List<String>>> images() {
        return Codegen.optional(this.images);
    }
    @Export(name="kubeCisEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> kubeCisEnabled;

    public Output<Optional<Boolean>> kubeCisEnabled() {
        return Codegen.optional(this.kubeCisEnabled);
    }
    /**
     * List of labels.
     * 
     */
    @Export(name="labels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> labels;

    /**
     * @return List of labels.
     * 
     */
    public Output<Optional<List<String>>> labels() {
        return Codegen.optional(this.labels);
    }
    @Export(name="malwareAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> malwareAction;

    public Output<Optional<String>> malwareAction() {
        return Codegen.optional(this.malwareAction);
    }
    /**
     * Value of allowed maximum score.
     * 
     */
    @Export(name="maximumScore", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maximumScore;

    /**
     * @return Value of allowed maximum score.
     * 
     */
    public Output<Optional<Double>> maximumScore() {
        return Codegen.optional(this.maximumScore);
    }
    /**
     * Indicates if exceeding the maximum score is scanned.
     * 
     */
    @Export(name="maximumScoreEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> maximumScoreEnabled;

    /**
     * @return Indicates if exceeding the maximum score is scanned.
     * 
     */
    public Output<Optional<Boolean>> maximumScoreEnabled() {
        return Codegen.optional(this.maximumScoreEnabled);
    }
    /**
     * Indicates that policy should ignore cases that do not have a known fix.
     * 
     */
    @Export(name="maximumScoreExcludeNoFix", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> maximumScoreExcludeNoFix;

    /**
     * @return Indicates that policy should ignore cases that do not have a known fix.
     * 
     */
    public Output<Optional<Boolean>> maximumScoreExcludeNoFix() {
        return Codegen.optional(this.maximumScoreExcludeNoFix);
    }
    @Export(name="monitoredMalwarePaths", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> monitoredMalwarePaths;

    public Output<Optional<List<String>>> monitoredMalwarePaths() {
        return Codegen.optional(this.monitoredMalwarePaths);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Indicates if raise a warning for images that should only be run as root.
     * 
     */
    @Export(name="onlyNoneRootUsers", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> onlyNoneRootUsers;

    /**
     * @return Indicates if raise a warning for images that should only be run as root.
     * 
     */
    public Output<Optional<Boolean>> onlyNoneRootUsers() {
        return Codegen.optional(this.onlyNoneRootUsers);
    }
    /**
     * Indicates if packages blacklist is relevant.
     * 
     */
    @Export(name="packagesBlackListEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> packagesBlackListEnabled;

    /**
     * @return Indicates if packages blacklist is relevant.
     * 
     */
    public Output<Optional<Boolean>> packagesBlackListEnabled() {
        return Codegen.optional(this.packagesBlackListEnabled);
    }
    /**
     * List of backlisted images.
     * 
     */
    @Export(name="packagesBlackLists", type=List.class, parameters={ImageAssurancePolicyPackagesBlackList.class})
    private Output</* @Nullable */ List<ImageAssurancePolicyPackagesBlackList>> packagesBlackLists;

    /**
     * @return List of backlisted images.
     * 
     */
    public Output<Optional<List<ImageAssurancePolicyPackagesBlackList>>> packagesBlackLists() {
        return Codegen.optional(this.packagesBlackLists);
    }
    /**
     * Indicates if packages whitelist is relevant.
     * 
     */
    @Export(name="packagesWhiteListEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> packagesWhiteListEnabled;

    /**
     * @return Indicates if packages whitelist is relevant.
     * 
     */
    public Output<Optional<Boolean>> packagesWhiteListEnabled() {
        return Codegen.optional(this.packagesWhiteListEnabled);
    }
    /**
     * List of whitelisted images.
     * 
     */
    @Export(name="packagesWhiteLists", type=List.class, parameters={ImageAssurancePolicyPackagesWhiteList.class})
    private Output</* @Nullable */ List<ImageAssurancePolicyPackagesWhiteList>> packagesWhiteLists;

    /**
     * @return List of whitelisted images.
     * 
     */
    public Output<Optional<List<ImageAssurancePolicyPackagesWhiteList>>> packagesWhiteLists() {
        return Codegen.optional(this.packagesWhiteLists);
    }
    @Export(name="partialResultsImageFail", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> partialResultsImageFail;

    public Output<Optional<Boolean>> partialResultsImageFail() {
        return Codegen.optional(this.partialResultsImageFail);
    }
    @Export(name="readOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> readOnly;

    public Output<Optional<Boolean>> readOnly() {
        return Codegen.optional(this.readOnly);
    }
    /**
     * List of registries.
     * 
     */
    @Export(name="registries", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> registries;

    /**
     * @return List of registries.
     * 
     */
    public Output<Optional<List<String>>> registries() {
        return Codegen.optional(this.registries);
    }
    @Export(name="registry", type=String.class, parameters={})
    private Output</* @Nullable */ String> registry;

    public Output<Optional<String>> registry() {
        return Codegen.optional(this.registry);
    }
    @Export(name="requiredLabels", type=List.class, parameters={ImageAssurancePolicyRequiredLabel.class})
    private Output</* @Nullable */ List<ImageAssurancePolicyRequiredLabel>> requiredLabels;

    public Output<Optional<List<ImageAssurancePolicyRequiredLabel>>> requiredLabels() {
        return Codegen.optional(this.requiredLabels);
    }
    @Export(name="requiredLabelsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requiredLabelsEnabled;

    public Output<Optional<Boolean>> requiredLabelsEnabled() {
        return Codegen.optional(this.requiredLabelsEnabled);
    }
    @Export(name="scanNfsMounts", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> scanNfsMounts;

    public Output<Optional<Boolean>> scanNfsMounts() {
        return Codegen.optional(this.scanNfsMounts);
    }
    /**
     * Indicates if scan should include sensitive data in the image.
     * 
     */
    @Export(name="scanSensitiveData", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> scanSensitiveData;

    /**
     * @return Indicates if scan should include sensitive data in the image.
     * 
     */
    public Output<Optional<Boolean>> scanSensitiveData() {
        return Codegen.optional(this.scanSensitiveData);
    }
    /**
     * Indicates if scanning should include scap.
     * 
     */
    @Export(name="scapEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> scapEnabled;

    /**
     * @return Indicates if scanning should include scap.
     * 
     */
    public Output<Optional<Boolean>> scapEnabled() {
        return Codegen.optional(this.scapEnabled);
    }
    /**
     * List of SCAP user scripts for checks.
     * 
     */
    @Export(name="scapFiles", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> scapFiles;

    /**
     * @return List of SCAP user scripts for checks.
     * 
     */
    public Output<Optional<List<String>>> scapFiles() {
        return Codegen.optional(this.scapFiles);
    }
    @Export(name="scopes", type=List.class, parameters={ImageAssurancePolicyScope.class})
    private Output<List<ImageAssurancePolicyScope>> scopes;

    public Output<List<ImageAssurancePolicyScope>> scopes() {
        return this.scopes;
    }
    /**
     * List of trusted images.
     * 
     */
    @Export(name="trustedBaseImages", type=List.class, parameters={ImageAssurancePolicyTrustedBaseImage.class})
    private Output</* @Nullable */ List<ImageAssurancePolicyTrustedBaseImage>> trustedBaseImages;

    /**
     * @return List of trusted images.
     * 
     */
    public Output<Optional<List<ImageAssurancePolicyTrustedBaseImage>>> trustedBaseImages() {
        return Codegen.optional(this.trustedBaseImages);
    }
    /**
     * Indicates if list of trusted base images is relevant.
     * 
     */
    @Export(name="trustedBaseImagesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> trustedBaseImagesEnabled;

    /**
     * @return Indicates if list of trusted base images is relevant.
     * 
     */
    public Output<Optional<Boolean>> trustedBaseImagesEnabled() {
        return Codegen.optional(this.trustedBaseImagesEnabled);
    }
    /**
     * List of whitelisted licenses.
     * 
     */
    @Export(name="whitelistedLicenses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> whitelistedLicenses;

    /**
     * @return List of whitelisted licenses.
     * 
     */
    public Output<Optional<List<String>>> whitelistedLicenses() {
        return Codegen.optional(this.whitelistedLicenses);
    }
    /**
     * Indicates if license blacklist is relevant.
     * 
     */
    @Export(name="whitelistedLicensesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> whitelistedLicensesEnabled;

    /**
     * @return Indicates if license blacklist is relevant.
     * 
     */
    public Output<Optional<Boolean>> whitelistedLicensesEnabled() {
        return Codegen.optional(this.whitelistedLicensesEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ImageAssurancePolicy(String name) {
        this(name, ImageAssurancePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ImageAssurancePolicy(String name, ImageAssurancePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ImageAssurancePolicy(String name, ImageAssurancePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/imageAssurancePolicy:ImageAssurancePolicy", name, args == null ? ImageAssurancePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ImageAssurancePolicy(String name, Output<String> id, @Nullable ImageAssurancePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aquasec:index/imageAssurancePolicy:ImageAssurancePolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ImageAssurancePolicy get(String name, Output<String> id, @Nullable ImageAssurancePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ImageAssurancePolicy(name, id, state, options);
    }
}
