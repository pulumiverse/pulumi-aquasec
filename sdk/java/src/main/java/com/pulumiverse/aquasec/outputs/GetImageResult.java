// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumiverse.aquasec.outputs.GetImageAssuranceChecksPerformed;
import com.pulumiverse.aquasec.outputs.GetImageHistory;
import com.pulumiverse.aquasec.outputs.GetImageVulnerability;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImageResult {
    /**
     * @return The image architecture.
     * 
     */
    private final String architecture;
    /**
     * @return The list of image assurance checks performed on the image.
     * 
     */
    private final List<GetImageAssuranceChecksPerformed> assuranceChecksPerformeds;
    /**
     * @return The name of the user who registered the image.
     * 
     */
    private final String author;
    /**
     * @return Whether the image is blacklisted.
     * 
     */
    private final Boolean blacklisted;
    /**
     * @return The image creation comment.
     * 
     */
    private final String comment;
    /**
     * @return The date and time when the image was registered.
     * 
     */
    private final String created;
    /**
     * @return Number of critical severity vulnerabilities detected in the image.
     * 
     */
    private final Integer criticalVulnerabilities;
    /**
     * @return The default user of the image.
     * 
     */
    private final String defaultUser;
    /**
     * @return The content digest of the image.
     * 
     */
    private final String digest;
    /**
     * @return Whether the image is disallowed (non-compliant).
     * 
     */
    private final Boolean disallowed;
    /**
     * @return Whether the image was disallowed because of Image Assurance Policies.
     * 
     */
    private final Boolean disallowedByAssuranceChecks;
    /**
     * @return The Docker image ID.
     * 
     */
    private final String dockerId;
    /**
     * @return Docker labels of the image.
     * 
     */
    private final List<String> dockerLabels;
    /**
     * @return The Docker version used when building the image.
     * 
     */
    private final String dockerVersion;
    /**
     * @return DTA severity score.
     * 
     */
    private final String dtaSeverityScore;
    /**
     * @return If DTA was skipped.
     * 
     */
    private final Boolean dtaSkipped;
    /**
     * @return The reason why DTA was skipped.
     * 
     */
    private final String dtaSkippedReason;
    /**
     * @return Environment variables in the image.
     * 
     */
    private final List<String> environmentVariables;
    /**
     * @return Number of high severity vulnerabilities detected in the image.
     * 
     */
    private final Integer highVulnerabilities;
    /**
     * @return The Docker history of the image.
     * 
     */
    private final List<GetImageHistory> histories;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The size of the image in bytes.
     * 
     */
    private final Integer imageSize;
    /**
     * @return The type of the image.
     * 
     */
    private final String imageType;
    /**
     * @return Aqua labels of the image.
     * 
     */
    private final List<String> labels;
    /**
     * @return Number of low severity vulnerabilities detected in the image.
     * 
     */
    private final Integer lowVulnerabilities;
    /**
     * @return Number of malware found on the image.
     * 
     */
    private final Integer malware;
    /**
     * @return Number of medium severity vulnerabilities detected in the image.
     * 
     */
    private final Integer mediumVulnerabilities;
    /**
     * @return The name of the image.
     * 
     */
    private final String name;
    /**
     * @return Number of negligible severity vulnerabilities detected in the image.
     * 
     */
    private final Integer negligibleVulnerabilities;
    /**
     * @return Whether a new version of the image is available in the registry but is not scanned and registered yet.
     * 
     */
    private final Boolean newerImageExists;
    /**
     * @return The operating system detected in the image
     * 
     */
    private final String os;
    /**
     * @return The version of the OS detected in the image.
     * 
     */
    private final String osVersion;
    /**
     * @return The ID of the parent image.
     * 
     */
    private final String parent;
    /**
     * @return Whether the image could only be partially scanned.
     * 
     */
    private final Boolean partialResults;
    /**
     * @return Whether the image is non-compliant, but is pending this status due to running containers.
     * 
     */
    private final Boolean pendingDisallowed;
    /**
     * @return Permission of the image.
     * 
     */
    private final String permission;
    /**
     * @return The name of the user who last modified the image permissions.
     * 
     */
    private final String permissionAuthor;
    /**
     * @return The comment provided when the image permissions were last modified
     * 
     */
    private final String permissionComment;
    /**
     * @return The name of the registry where the image is stored.
     * 
     */
    private final String registry;
    /**
     * @return Type of the registry.
     * 
     */
    private final String registryType;
    /**
     * @return The repository digests.
     * 
     */
    private final List<String> repoDigests;
    /**
     * @return The name of the image&#39;s repository.
     * 
     */
    private final String repository;
    /**
     * @return The date and time when the image was last scanned.
     * 
     */
    private final String scanDate;
    /**
     * @return If the image scan failed, the failure message.
     * 
     */
    private final String scanError;
    /**
     * @return The scan status of the image (either &#39;pending&#39;, &#39;in*progress&#39;, &#39;finished&#39;, &#39;failed&#39; or &#39;not*started&#39;).
     * 
     */
    private final String scanStatus;
    /**
     * @return Number of sensitive data detected in the image.
     * 
     */
    private final Integer sensitiveData;
    /**
     * @return The tag of the image.
     * 
     */
    private final String tag;
    /**
     * @return The total number of vulnerabilities detected in the image.
     * 
     */
    private final Integer totalVulnerabilities;
    /**
     * @return The virtual size of the image.
     * 
     */
    private final Integer virtualSize;
    /**
     * @return A list of all the vulnerabilities found in the image
     * 
     */
    private final List<GetImageVulnerability> vulnerabilities;
    /**
     * @return Whether the image is whitelisted.
     * 
     */
    private final Boolean whitelisted;

    @CustomType.Constructor
    private GetImageResult(
        @CustomType.Parameter("architecture") String architecture,
        @CustomType.Parameter("assuranceChecksPerformeds") List<GetImageAssuranceChecksPerformed> assuranceChecksPerformeds,
        @CustomType.Parameter("author") String author,
        @CustomType.Parameter("blacklisted") Boolean blacklisted,
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("criticalVulnerabilities") Integer criticalVulnerabilities,
        @CustomType.Parameter("defaultUser") String defaultUser,
        @CustomType.Parameter("digest") String digest,
        @CustomType.Parameter("disallowed") Boolean disallowed,
        @CustomType.Parameter("disallowedByAssuranceChecks") Boolean disallowedByAssuranceChecks,
        @CustomType.Parameter("dockerId") String dockerId,
        @CustomType.Parameter("dockerLabels") List<String> dockerLabels,
        @CustomType.Parameter("dockerVersion") String dockerVersion,
        @CustomType.Parameter("dtaSeverityScore") String dtaSeverityScore,
        @CustomType.Parameter("dtaSkipped") Boolean dtaSkipped,
        @CustomType.Parameter("dtaSkippedReason") String dtaSkippedReason,
        @CustomType.Parameter("environmentVariables") List<String> environmentVariables,
        @CustomType.Parameter("highVulnerabilities") Integer highVulnerabilities,
        @CustomType.Parameter("histories") List<GetImageHistory> histories,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageSize") Integer imageSize,
        @CustomType.Parameter("imageType") String imageType,
        @CustomType.Parameter("labels") List<String> labels,
        @CustomType.Parameter("lowVulnerabilities") Integer lowVulnerabilities,
        @CustomType.Parameter("malware") Integer malware,
        @CustomType.Parameter("mediumVulnerabilities") Integer mediumVulnerabilities,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("negligibleVulnerabilities") Integer negligibleVulnerabilities,
        @CustomType.Parameter("newerImageExists") Boolean newerImageExists,
        @CustomType.Parameter("os") String os,
        @CustomType.Parameter("osVersion") String osVersion,
        @CustomType.Parameter("parent") String parent,
        @CustomType.Parameter("partialResults") Boolean partialResults,
        @CustomType.Parameter("pendingDisallowed") Boolean pendingDisallowed,
        @CustomType.Parameter("permission") String permission,
        @CustomType.Parameter("permissionAuthor") String permissionAuthor,
        @CustomType.Parameter("permissionComment") String permissionComment,
        @CustomType.Parameter("registry") String registry,
        @CustomType.Parameter("registryType") String registryType,
        @CustomType.Parameter("repoDigests") List<String> repoDigests,
        @CustomType.Parameter("repository") String repository,
        @CustomType.Parameter("scanDate") String scanDate,
        @CustomType.Parameter("scanError") String scanError,
        @CustomType.Parameter("scanStatus") String scanStatus,
        @CustomType.Parameter("sensitiveData") Integer sensitiveData,
        @CustomType.Parameter("tag") String tag,
        @CustomType.Parameter("totalVulnerabilities") Integer totalVulnerabilities,
        @CustomType.Parameter("virtualSize") Integer virtualSize,
        @CustomType.Parameter("vulnerabilities") List<GetImageVulnerability> vulnerabilities,
        @CustomType.Parameter("whitelisted") Boolean whitelisted) {
        this.architecture = architecture;
        this.assuranceChecksPerformeds = assuranceChecksPerformeds;
        this.author = author;
        this.blacklisted = blacklisted;
        this.comment = comment;
        this.created = created;
        this.criticalVulnerabilities = criticalVulnerabilities;
        this.defaultUser = defaultUser;
        this.digest = digest;
        this.disallowed = disallowed;
        this.disallowedByAssuranceChecks = disallowedByAssuranceChecks;
        this.dockerId = dockerId;
        this.dockerLabels = dockerLabels;
        this.dockerVersion = dockerVersion;
        this.dtaSeverityScore = dtaSeverityScore;
        this.dtaSkipped = dtaSkipped;
        this.dtaSkippedReason = dtaSkippedReason;
        this.environmentVariables = environmentVariables;
        this.highVulnerabilities = highVulnerabilities;
        this.histories = histories;
        this.id = id;
        this.imageSize = imageSize;
        this.imageType = imageType;
        this.labels = labels;
        this.lowVulnerabilities = lowVulnerabilities;
        this.malware = malware;
        this.mediumVulnerabilities = mediumVulnerabilities;
        this.name = name;
        this.negligibleVulnerabilities = negligibleVulnerabilities;
        this.newerImageExists = newerImageExists;
        this.os = os;
        this.osVersion = osVersion;
        this.parent = parent;
        this.partialResults = partialResults;
        this.pendingDisallowed = pendingDisallowed;
        this.permission = permission;
        this.permissionAuthor = permissionAuthor;
        this.permissionComment = permissionComment;
        this.registry = registry;
        this.registryType = registryType;
        this.repoDigests = repoDigests;
        this.repository = repository;
        this.scanDate = scanDate;
        this.scanError = scanError;
        this.scanStatus = scanStatus;
        this.sensitiveData = sensitiveData;
        this.tag = tag;
        this.totalVulnerabilities = totalVulnerabilities;
        this.virtualSize = virtualSize;
        this.vulnerabilities = vulnerabilities;
        this.whitelisted = whitelisted;
    }

    /**
     * @return The image architecture.
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    /**
     * @return The list of image assurance checks performed on the image.
     * 
     */
    public List<GetImageAssuranceChecksPerformed> assuranceChecksPerformeds() {
        return this.assuranceChecksPerformeds;
    }
    /**
     * @return The name of the user who registered the image.
     * 
     */
    public String author() {
        return this.author;
    }
    /**
     * @return Whether the image is blacklisted.
     * 
     */
    public Boolean blacklisted() {
        return this.blacklisted;
    }
    /**
     * @return The image creation comment.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return The date and time when the image was registered.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return Number of critical severity vulnerabilities detected in the image.
     * 
     */
    public Integer criticalVulnerabilities() {
        return this.criticalVulnerabilities;
    }
    /**
     * @return The default user of the image.
     * 
     */
    public String defaultUser() {
        return this.defaultUser;
    }
    /**
     * @return The content digest of the image.
     * 
     */
    public String digest() {
        return this.digest;
    }
    /**
     * @return Whether the image is disallowed (non-compliant).
     * 
     */
    public Boolean disallowed() {
        return this.disallowed;
    }
    /**
     * @return Whether the image was disallowed because of Image Assurance Policies.
     * 
     */
    public Boolean disallowedByAssuranceChecks() {
        return this.disallowedByAssuranceChecks;
    }
    /**
     * @return The Docker image ID.
     * 
     */
    public String dockerId() {
        return this.dockerId;
    }
    /**
     * @return Docker labels of the image.
     * 
     */
    public List<String> dockerLabels() {
        return this.dockerLabels;
    }
    /**
     * @return The Docker version used when building the image.
     * 
     */
    public String dockerVersion() {
        return this.dockerVersion;
    }
    /**
     * @return DTA severity score.
     * 
     */
    public String dtaSeverityScore() {
        return this.dtaSeverityScore;
    }
    /**
     * @return If DTA was skipped.
     * 
     */
    public Boolean dtaSkipped() {
        return this.dtaSkipped;
    }
    /**
     * @return The reason why DTA was skipped.
     * 
     */
    public String dtaSkippedReason() {
        return this.dtaSkippedReason;
    }
    /**
     * @return Environment variables in the image.
     * 
     */
    public List<String> environmentVariables() {
        return this.environmentVariables;
    }
    /**
     * @return Number of high severity vulnerabilities detected in the image.
     * 
     */
    public Integer highVulnerabilities() {
        return this.highVulnerabilities;
    }
    /**
     * @return The Docker history of the image.
     * 
     */
    public List<GetImageHistory> histories() {
        return this.histories;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The size of the image in bytes.
     * 
     */
    public Integer imageSize() {
        return this.imageSize;
    }
    /**
     * @return The type of the image.
     * 
     */
    public String imageType() {
        return this.imageType;
    }
    /**
     * @return Aqua labels of the image.
     * 
     */
    public List<String> labels() {
        return this.labels;
    }
    /**
     * @return Number of low severity vulnerabilities detected in the image.
     * 
     */
    public Integer lowVulnerabilities() {
        return this.lowVulnerabilities;
    }
    /**
     * @return Number of malware found on the image.
     * 
     */
    public Integer malware() {
        return this.malware;
    }
    /**
     * @return Number of medium severity vulnerabilities detected in the image.
     * 
     */
    public Integer mediumVulnerabilities() {
        return this.mediumVulnerabilities;
    }
    /**
     * @return The name of the image.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Number of negligible severity vulnerabilities detected in the image.
     * 
     */
    public Integer negligibleVulnerabilities() {
        return this.negligibleVulnerabilities;
    }
    /**
     * @return Whether a new version of the image is available in the registry but is not scanned and registered yet.
     * 
     */
    public Boolean newerImageExists() {
        return this.newerImageExists;
    }
    /**
     * @return The operating system detected in the image
     * 
     */
    public String os() {
        return this.os;
    }
    /**
     * @return The version of the OS detected in the image.
     * 
     */
    public String osVersion() {
        return this.osVersion;
    }
    /**
     * @return The ID of the parent image.
     * 
     */
    public String parent() {
        return this.parent;
    }
    /**
     * @return Whether the image could only be partially scanned.
     * 
     */
    public Boolean partialResults() {
        return this.partialResults;
    }
    /**
     * @return Whether the image is non-compliant, but is pending this status due to running containers.
     * 
     */
    public Boolean pendingDisallowed() {
        return this.pendingDisallowed;
    }
    /**
     * @return Permission of the image.
     * 
     */
    public String permission() {
        return this.permission;
    }
    /**
     * @return The name of the user who last modified the image permissions.
     * 
     */
    public String permissionAuthor() {
        return this.permissionAuthor;
    }
    /**
     * @return The comment provided when the image permissions were last modified
     * 
     */
    public String permissionComment() {
        return this.permissionComment;
    }
    /**
     * @return The name of the registry where the image is stored.
     * 
     */
    public String registry() {
        return this.registry;
    }
    /**
     * @return Type of the registry.
     * 
     */
    public String registryType() {
        return this.registryType;
    }
    /**
     * @return The repository digests.
     * 
     */
    public List<String> repoDigests() {
        return this.repoDigests;
    }
    /**
     * @return The name of the image&#39;s repository.
     * 
     */
    public String repository() {
        return this.repository;
    }
    /**
     * @return The date and time when the image was last scanned.
     * 
     */
    public String scanDate() {
        return this.scanDate;
    }
    /**
     * @return If the image scan failed, the failure message.
     * 
     */
    public String scanError() {
        return this.scanError;
    }
    /**
     * @return The scan status of the image (either &#39;pending&#39;, &#39;in*progress&#39;, &#39;finished&#39;, &#39;failed&#39; or &#39;not*started&#39;).
     * 
     */
    public String scanStatus() {
        return this.scanStatus;
    }
    /**
     * @return Number of sensitive data detected in the image.
     * 
     */
    public Integer sensitiveData() {
        return this.sensitiveData;
    }
    /**
     * @return The tag of the image.
     * 
     */
    public String tag() {
        return this.tag;
    }
    /**
     * @return The total number of vulnerabilities detected in the image.
     * 
     */
    public Integer totalVulnerabilities() {
        return this.totalVulnerabilities;
    }
    /**
     * @return The virtual size of the image.
     * 
     */
    public Integer virtualSize() {
        return this.virtualSize;
    }
    /**
     * @return A list of all the vulnerabilities found in the image
     * 
     */
    public List<GetImageVulnerability> vulnerabilities() {
        return this.vulnerabilities;
    }
    /**
     * @return Whether the image is whitelisted.
     * 
     */
    public Boolean whitelisted() {
        return this.whitelisted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private List<GetImageAssuranceChecksPerformed> assuranceChecksPerformeds;
        private String author;
        private Boolean blacklisted;
        private String comment;
        private String created;
        private Integer criticalVulnerabilities;
        private String defaultUser;
        private String digest;
        private Boolean disallowed;
        private Boolean disallowedByAssuranceChecks;
        private String dockerId;
        private List<String> dockerLabels;
        private String dockerVersion;
        private String dtaSeverityScore;
        private Boolean dtaSkipped;
        private String dtaSkippedReason;
        private List<String> environmentVariables;
        private Integer highVulnerabilities;
        private List<GetImageHistory> histories;
        private String id;
        private Integer imageSize;
        private String imageType;
        private List<String> labels;
        private Integer lowVulnerabilities;
        private Integer malware;
        private Integer mediumVulnerabilities;
        private String name;
        private Integer negligibleVulnerabilities;
        private Boolean newerImageExists;
        private String os;
        private String osVersion;
        private String parent;
        private Boolean partialResults;
        private Boolean pendingDisallowed;
        private String permission;
        private String permissionAuthor;
        private String permissionComment;
        private String registry;
        private String registryType;
        private List<String> repoDigests;
        private String repository;
        private String scanDate;
        private String scanError;
        private String scanStatus;
        private Integer sensitiveData;
        private String tag;
        private Integer totalVulnerabilities;
        private Integer virtualSize;
        private List<GetImageVulnerability> vulnerabilities;
        private Boolean whitelisted;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.assuranceChecksPerformeds = defaults.assuranceChecksPerformeds;
    	      this.author = defaults.author;
    	      this.blacklisted = defaults.blacklisted;
    	      this.comment = defaults.comment;
    	      this.created = defaults.created;
    	      this.criticalVulnerabilities = defaults.criticalVulnerabilities;
    	      this.defaultUser = defaults.defaultUser;
    	      this.digest = defaults.digest;
    	      this.disallowed = defaults.disallowed;
    	      this.disallowedByAssuranceChecks = defaults.disallowedByAssuranceChecks;
    	      this.dockerId = defaults.dockerId;
    	      this.dockerLabels = defaults.dockerLabels;
    	      this.dockerVersion = defaults.dockerVersion;
    	      this.dtaSeverityScore = defaults.dtaSeverityScore;
    	      this.dtaSkipped = defaults.dtaSkipped;
    	      this.dtaSkippedReason = defaults.dtaSkippedReason;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.highVulnerabilities = defaults.highVulnerabilities;
    	      this.histories = defaults.histories;
    	      this.id = defaults.id;
    	      this.imageSize = defaults.imageSize;
    	      this.imageType = defaults.imageType;
    	      this.labels = defaults.labels;
    	      this.lowVulnerabilities = defaults.lowVulnerabilities;
    	      this.malware = defaults.malware;
    	      this.mediumVulnerabilities = defaults.mediumVulnerabilities;
    	      this.name = defaults.name;
    	      this.negligibleVulnerabilities = defaults.negligibleVulnerabilities;
    	      this.newerImageExists = defaults.newerImageExists;
    	      this.os = defaults.os;
    	      this.osVersion = defaults.osVersion;
    	      this.parent = defaults.parent;
    	      this.partialResults = defaults.partialResults;
    	      this.pendingDisallowed = defaults.pendingDisallowed;
    	      this.permission = defaults.permission;
    	      this.permissionAuthor = defaults.permissionAuthor;
    	      this.permissionComment = defaults.permissionComment;
    	      this.registry = defaults.registry;
    	      this.registryType = defaults.registryType;
    	      this.repoDigests = defaults.repoDigests;
    	      this.repository = defaults.repository;
    	      this.scanDate = defaults.scanDate;
    	      this.scanError = defaults.scanError;
    	      this.scanStatus = defaults.scanStatus;
    	      this.sensitiveData = defaults.sensitiveData;
    	      this.tag = defaults.tag;
    	      this.totalVulnerabilities = defaults.totalVulnerabilities;
    	      this.virtualSize = defaults.virtualSize;
    	      this.vulnerabilities = defaults.vulnerabilities;
    	      this.whitelisted = defaults.whitelisted;
        }

        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        public Builder assuranceChecksPerformeds(List<GetImageAssuranceChecksPerformed> assuranceChecksPerformeds) {
            this.assuranceChecksPerformeds = Objects.requireNonNull(assuranceChecksPerformeds);
            return this;
        }
        public Builder assuranceChecksPerformeds(GetImageAssuranceChecksPerformed... assuranceChecksPerformeds) {
            return assuranceChecksPerformeds(List.of(assuranceChecksPerformeds));
        }
        public Builder author(String author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }
        public Builder blacklisted(Boolean blacklisted) {
            this.blacklisted = Objects.requireNonNull(blacklisted);
            return this;
        }
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder criticalVulnerabilities(Integer criticalVulnerabilities) {
            this.criticalVulnerabilities = Objects.requireNonNull(criticalVulnerabilities);
            return this;
        }
        public Builder defaultUser(String defaultUser) {
            this.defaultUser = Objects.requireNonNull(defaultUser);
            return this;
        }
        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder disallowed(Boolean disallowed) {
            this.disallowed = Objects.requireNonNull(disallowed);
            return this;
        }
        public Builder disallowedByAssuranceChecks(Boolean disallowedByAssuranceChecks) {
            this.disallowedByAssuranceChecks = Objects.requireNonNull(disallowedByAssuranceChecks);
            return this;
        }
        public Builder dockerId(String dockerId) {
            this.dockerId = Objects.requireNonNull(dockerId);
            return this;
        }
        public Builder dockerLabels(List<String> dockerLabels) {
            this.dockerLabels = Objects.requireNonNull(dockerLabels);
            return this;
        }
        public Builder dockerLabels(String... dockerLabels) {
            return dockerLabels(List.of(dockerLabels));
        }
        public Builder dockerVersion(String dockerVersion) {
            this.dockerVersion = Objects.requireNonNull(dockerVersion);
            return this;
        }
        public Builder dtaSeverityScore(String dtaSeverityScore) {
            this.dtaSeverityScore = Objects.requireNonNull(dtaSeverityScore);
            return this;
        }
        public Builder dtaSkipped(Boolean dtaSkipped) {
            this.dtaSkipped = Objects.requireNonNull(dtaSkipped);
            return this;
        }
        public Builder dtaSkippedReason(String dtaSkippedReason) {
            this.dtaSkippedReason = Objects.requireNonNull(dtaSkippedReason);
            return this;
        }
        public Builder environmentVariables(List<String> environmentVariables) {
            this.environmentVariables = Objects.requireNonNull(environmentVariables);
            return this;
        }
        public Builder environmentVariables(String... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        public Builder highVulnerabilities(Integer highVulnerabilities) {
            this.highVulnerabilities = Objects.requireNonNull(highVulnerabilities);
            return this;
        }
        public Builder histories(List<GetImageHistory> histories) {
            this.histories = Objects.requireNonNull(histories);
            return this;
        }
        public Builder histories(GetImageHistory... histories) {
            return histories(List.of(histories));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageSize(Integer imageSize) {
            this.imageSize = Objects.requireNonNull(imageSize);
            return this;
        }
        public Builder imageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }
        public Builder labels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder lowVulnerabilities(Integer lowVulnerabilities) {
            this.lowVulnerabilities = Objects.requireNonNull(lowVulnerabilities);
            return this;
        }
        public Builder malware(Integer malware) {
            this.malware = Objects.requireNonNull(malware);
            return this;
        }
        public Builder mediumVulnerabilities(Integer mediumVulnerabilities) {
            this.mediumVulnerabilities = Objects.requireNonNull(mediumVulnerabilities);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder negligibleVulnerabilities(Integer negligibleVulnerabilities) {
            this.negligibleVulnerabilities = Objects.requireNonNull(negligibleVulnerabilities);
            return this;
        }
        public Builder newerImageExists(Boolean newerImageExists) {
            this.newerImageExists = Objects.requireNonNull(newerImageExists);
            return this;
        }
        public Builder os(String os) {
            this.os = Objects.requireNonNull(os);
            return this;
        }
        public Builder osVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder partialResults(Boolean partialResults) {
            this.partialResults = Objects.requireNonNull(partialResults);
            return this;
        }
        public Builder pendingDisallowed(Boolean pendingDisallowed) {
            this.pendingDisallowed = Objects.requireNonNull(pendingDisallowed);
            return this;
        }
        public Builder permission(String permission) {
            this.permission = Objects.requireNonNull(permission);
            return this;
        }
        public Builder permissionAuthor(String permissionAuthor) {
            this.permissionAuthor = Objects.requireNonNull(permissionAuthor);
            return this;
        }
        public Builder permissionComment(String permissionComment) {
            this.permissionComment = Objects.requireNonNull(permissionComment);
            return this;
        }
        public Builder registry(String registry) {
            this.registry = Objects.requireNonNull(registry);
            return this;
        }
        public Builder registryType(String registryType) {
            this.registryType = Objects.requireNonNull(registryType);
            return this;
        }
        public Builder repoDigests(List<String> repoDigests) {
            this.repoDigests = Objects.requireNonNull(repoDigests);
            return this;
        }
        public Builder repoDigests(String... repoDigests) {
            return repoDigests(List.of(repoDigests));
        }
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder scanDate(String scanDate) {
            this.scanDate = Objects.requireNonNull(scanDate);
            return this;
        }
        public Builder scanError(String scanError) {
            this.scanError = Objects.requireNonNull(scanError);
            return this;
        }
        public Builder scanStatus(String scanStatus) {
            this.scanStatus = Objects.requireNonNull(scanStatus);
            return this;
        }
        public Builder sensitiveData(Integer sensitiveData) {
            this.sensitiveData = Objects.requireNonNull(sensitiveData);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public Builder totalVulnerabilities(Integer totalVulnerabilities) {
            this.totalVulnerabilities = Objects.requireNonNull(totalVulnerabilities);
            return this;
        }
        public Builder virtualSize(Integer virtualSize) {
            this.virtualSize = Objects.requireNonNull(virtualSize);
            return this;
        }
        public Builder vulnerabilities(List<GetImageVulnerability> vulnerabilities) {
            this.vulnerabilities = Objects.requireNonNull(vulnerabilities);
            return this;
        }
        public Builder vulnerabilities(GetImageVulnerability... vulnerabilities) {
            return vulnerabilities(List.of(vulnerabilities));
        }
        public Builder whitelisted(Boolean whitelisted) {
            this.whitelisted = Objects.requireNonNull(whitelisted);
            return this;
        }        public GetImageResult build() {
            return new GetImageResult(architecture, assuranceChecksPerformeds, author, blacklisted, comment, created, criticalVulnerabilities, defaultUser, digest, disallowed, disallowedByAssuranceChecks, dockerId, dockerLabels, dockerVersion, dtaSeverityScore, dtaSkipped, dtaSkippedReason, environmentVariables, highVulnerabilities, histories, id, imageSize, imageType, labels, lowVulnerabilities, malware, mediumVulnerabilities, name, negligibleVulnerabilities, newerImageExists, os, osVersion, parent, partialResults, pendingDisallowed, permission, permissionAuthor, permissionComment, registry, registryType, repoDigests, repository, scanDate, scanError, scanStatus, sensitiveData, tag, totalVulnerabilities, virtualSize, vulnerabilities, whitelisted);
        }
    }
}
