// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getImage(args: GetImageArgs, opts?: pulumi.InvokeOptions): Promise<GetImageResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aquasec:index/getImage:getImage", {
        "registry": args.registry,
        "repository": args.repository,
        "tag": args.tag,
    }, opts);
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageArgs {
    /**
     * The name of the registry where the image is stored.
     */
    registry: string;
    /**
     * The name of the image's repository.
     */
    repository: string;
    /**
     * The tag of the image.
     */
    tag: string;
}

/**
 * A collection of values returned by getImage.
 */
export interface GetImageResult {
    /**
     * The image architecture.
     */
    readonly architecture: string;
    /**
     * The list of image assurance checks performed on the image.
     */
    readonly assuranceChecksPerformeds: outputs.GetImageAssuranceChecksPerformed[];
    /**
     * The name of the user who registered the image.
     */
    readonly author: string;
    /**
     * Whether the image is blacklisted.
     */
    readonly blacklisted: boolean;
    /**
     * The image creation comment.
     */
    readonly comment: string;
    /**
     * The date and time when the image was registered.
     */
    readonly created: string;
    /**
     * Number of critical severity vulnerabilities detected in the image.
     */
    readonly criticalVulnerabilities: number;
    /**
     * The default user of the image.
     */
    readonly defaultUser: string;
    /**
     * The content digest of the image.
     */
    readonly digest: string;
    /**
     * Whether the image is disallowed (non-compliant).
     */
    readonly disallowed: boolean;
    /**
     * Whether the image was disallowed because of Image Assurance Policies.
     */
    readonly disallowedByAssuranceChecks: boolean;
    /**
     * The Docker image ID.
     */
    readonly dockerId: string;
    /**
     * Docker labels of the image.
     */
    readonly dockerLabels: string[];
    /**
     * The Docker version used when building the image.
     */
    readonly dockerVersion: string;
    /**
     * DTA severity score.
     */
    readonly dtaSeverityScore: string;
    /**
     * If DTA was skipped.
     */
    readonly dtaSkipped: boolean;
    /**
     * The reason why DTA was skipped.
     */
    readonly dtaSkippedReason: string;
    /**
     * Environment variables in the image.
     */
    readonly environmentVariables: string[];
    /**
     * Number of high severity vulnerabilities detected in the image.
     */
    readonly highVulnerabilities: number;
    /**
     * The Docker history of the image.
     */
    readonly histories: outputs.GetImageHistory[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The size of the image in bytes.
     */
    readonly imageSize: number;
    /**
     * The type of the image.
     */
    readonly imageType: string;
    /**
     * Aqua labels of the image.
     */
    readonly labels: string[];
    /**
     * Number of low severity vulnerabilities detected in the image.
     */
    readonly lowVulnerabilities: number;
    /**
     * Number of malware found on the image.
     */
    readonly malware: number;
    /**
     * Number of medium severity vulnerabilities detected in the image.
     */
    readonly mediumVulnerabilities: number;
    /**
     * The name of the image.
     */
    readonly name: string;
    /**
     * Number of negligible severity vulnerabilities detected in the image.
     */
    readonly negligibleVulnerabilities: number;
    /**
     * Whether a new version of the image is available in the registry but is not scanned and registered yet.
     */
    readonly newerImageExists: boolean;
    /**
     * The operating system detected in the image
     */
    readonly os: string;
    /**
     * The version of the OS detected in the image.
     */
    readonly osVersion: string;
    /**
     * The ID of the parent image.
     */
    readonly parent: string;
    /**
     * Whether the image could only be partially scanned.
     */
    readonly partialResults: boolean;
    /**
     * Whether the image is non-compliant, but is pending this status due to running containers.
     */
    readonly pendingDisallowed: boolean;
    /**
     * Permission of the image.
     */
    readonly permission: string;
    /**
     * The name of the user who last modified the image permissions.
     */
    readonly permissionAuthor: string;
    /**
     * The comment provided when the image permissions were last modified
     */
    readonly permissionComment: string;
    /**
     * The name of the registry where the image is stored.
     */
    readonly registry: string;
    /**
     * Type of the registry.
     */
    readonly registryType: string;
    /**
     * The repository digests.
     */
    readonly repoDigests: string[];
    /**
     * The name of the image's repository.
     */
    readonly repository: string;
    /**
     * The date and time when the image was last scanned.
     */
    readonly scanDate: string;
    /**
     * If the image scan failed, the failure message.
     */
    readonly scanError: string;
    /**
     * The scan status of the image (either 'pending', 'in*progress', 'finished', 'failed' or 'not*started').
     */
    readonly scanStatus: string;
    /**
     * Number of sensitive data detected in the image.
     */
    readonly sensitiveData: number;
    /**
     * The tag of the image.
     */
    readonly tag: string;
    /**
     * The total number of vulnerabilities detected in the image.
     */
    readonly totalVulnerabilities: number;
    /**
     * The virtual size of the image.
     */
    readonly virtualSize: number;
    /**
     * A list of all the vulnerabilities found in the image
     */
    readonly vulnerabilities: outputs.GetImageVulnerability[];
    /**
     * Whether the image is whitelisted.
     */
    readonly whitelisted: boolean;
}
export function getImageOutput(args: GetImageOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetImageResult> {
    return pulumi.output(args).apply((a: any) => getImage(a, opts))
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageOutputArgs {
    /**
     * The name of the registry where the image is stored.
     */
    registry: pulumi.Input<string>;
    /**
     * The name of the image's repository.
     */
    repository: pulumi.Input<string>;
    /**
     * The tag of the image.
     */
    tag: pulumi.Input<string>;
}
