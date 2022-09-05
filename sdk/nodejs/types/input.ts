// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

export interface ApplicationScopeCategory {
    artifacts?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryArtifact>[]>;
    entityScopes?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryEntityScope>[]>;
    infrastructures?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryInfrastructure>[]>;
    workloads?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryWorkload>[]>;
}

export interface ApplicationScopeCategoryArtifact {
    cfs?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryArtifactCf>[]>;
    functions?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryArtifactFunction>[]>;
    images?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryArtifactImage>[]>;
}

export interface ApplicationScopeCategoryArtifactCf {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryArtifactCfVariable>[]>;
}

export interface ApplicationScopeCategoryArtifactCfVariable {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ApplicationScopeCategoryArtifactFunction {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryArtifactFunctionVariable>[]>;
}

export interface ApplicationScopeCategoryArtifactFunctionVariable {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ApplicationScopeCategoryArtifactImage {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryArtifactImageVariable>[]>;
}

export interface ApplicationScopeCategoryArtifactImageVariable {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ApplicationScopeCategoryEntityScope {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryEntityScopeVariable>[]>;
}

export interface ApplicationScopeCategoryEntityScopeVariable {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ApplicationScopeCategoryInfrastructure {
    kubernetes?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryInfrastructureKubernete>[]>;
    os?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryInfrastructureO>[]>;
}

export interface ApplicationScopeCategoryInfrastructureKubernete {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryInfrastructureKuberneteVariable>[]>;
}

export interface ApplicationScopeCategoryInfrastructureKuberneteVariable {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ApplicationScopeCategoryInfrastructureO {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryInfrastructureOVariable>[]>;
}

export interface ApplicationScopeCategoryInfrastructureOVariable {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ApplicationScopeCategoryWorkload {
    cfs?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryWorkloadCf>[]>;
    kubernetes?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryWorkloadKubernete>[]>;
    os?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryWorkloadO>[]>;
}

export interface ApplicationScopeCategoryWorkloadCf {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryWorkloadCfVariable>[]>;
}

export interface ApplicationScopeCategoryWorkloadCfVariable {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ApplicationScopeCategoryWorkloadKubernete {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryWorkloadKuberneteVariable>[]>;
}

export interface ApplicationScopeCategoryWorkloadKuberneteVariable {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ApplicationScopeCategoryWorkloadO {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ApplicationScopeCategoryWorkloadOVariable>[]>;
}

export interface ApplicationScopeCategoryWorkloadOVariable {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ContainerRuntimePolicyFileIntegrityMonitoring {
    /**
     * List of paths to be excluded from being monitored.
     */
    excludedPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of processes to be excluded from being monitored.
     */
    excludedProcesses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of users to be excluded from being monitored.
     */
    excludedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If true, add attributes operations will be monitored.
     */
    monitorAttributes?: pulumi.Input<boolean>;
    /**
     * If true, create operations will be monitored.
     */
    monitorCreate?: pulumi.Input<boolean>;
    /**
     * If true, deletion operations will be monitored.
     */
    monitorDelete?: pulumi.Input<boolean>;
    /**
     * If true, modification operations will be monitored.
     */
    monitorModify?: pulumi.Input<boolean>;
    /**
     * If true, read operations will be monitored.
     */
    monitorRead?: pulumi.Input<boolean>;
    /**
     * List of paths to be monitored.
     */
    monitoredPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of processes to be monitored.
     */
    monitoredProcesses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of users to be monitored.
     */
    monitoredUsers?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ContainerRuntimePolicyScopeVariable {
    /**
     * Class of supported scope.
     */
    attribute: pulumi.Input<string>;
    /**
     * Value assigned to the attribute.
     */
    value: pulumi.Input<string>;
}

export interface EnforcerGroupsCommand {
    default?: pulumi.Input<string>;
    kubernetes?: pulumi.Input<string>;
    swarm?: pulumi.Input<string>;
    windows?: pulumi.Input<string>;
}

export interface EnforcerGroupsOrchestrator {
    master?: pulumi.Input<boolean>;
    /**
     * May be specified for these orchestrators: Kubernetes, Kubernetes GKE, VMware Tanzu Kubernetes Grid Integrated Edition (PKS).
     */
    namespace?: pulumi.Input<string>;
    /**
     * May be specified for these orchestrators: Kubernetes, Kubernetes GKE, OpenShift, VMware Tanzu Kubernetes Grid Integrated Edition (PKS).
     */
    serviceAccount?: pulumi.Input<string>;
    /**
     * Enforcer Type.
     */
    type?: pulumi.Input<string>;
}

export interface FirewallPolicyInboundNetwork {
    /**
     * Indicates whether the specified resources are allowed to pass in data or requests.
     */
    allow: pulumi.Input<boolean>;
    /**
     * Range of ports affected by firewall.
     */
    portRange: pulumi.Input<string>;
    /**
     * Information of the resource.
     */
    resource?: pulumi.Input<string>;
    /**
     * Type of the resource
     */
    resourceType: pulumi.Input<string>;
}

export interface FirewallPolicyOutboundNetwork {
    /**
     * Indicates whether the specified resources are allowed to receive data or requests.
     */
    allow: pulumi.Input<boolean>;
    /**
     * Range of ports affected by firewall.
     */
    portRange: pulumi.Input<string>;
    /**
     * Information of the resource.
     */
    resource?: pulumi.Input<string>;
    /**
     * Type of the resource.
     */
    resourceType: pulumi.Input<string>;
}

export interface FunctionAssurancePolicyAutoScanTime {
    iteration?: pulumi.Input<number>;
    iterationType?: pulumi.Input<string>;
    time?: pulumi.Input<string>;
    weekDays?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface FunctionAssurancePolicyCustomCheck {
    /**
     * Name of user account that created the policy.
     */
    author?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    engine?: pulumi.Input<string>;
    lastModified?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    path?: pulumi.Input<string>;
    readOnly?: pulumi.Input<boolean>;
    scriptId?: pulumi.Input<string>;
    severity?: pulumi.Input<string>;
    snippet?: pulumi.Input<string>;
}

export interface FunctionAssurancePolicyForbiddenLabel {
    key?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface FunctionAssurancePolicyPackagesBlackList {
    arch?: pulumi.Input<string>;
    display?: pulumi.Input<string>;
    epoch?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    license?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    release?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
    versionRange?: pulumi.Input<string>;
}

export interface FunctionAssurancePolicyPackagesWhiteList {
    arch?: pulumi.Input<string>;
    display?: pulumi.Input<string>;
    epoch?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    license?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    release?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
    versionRange?: pulumi.Input<string>;
}

export interface FunctionAssurancePolicyRequiredLabel {
    key?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface FunctionAssurancePolicyScope {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.FunctionAssurancePolicyScopeVariable>[]>;
}

export interface FunctionAssurancePolicyScopeVariable {
    attribute?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface FunctionAssurancePolicyTrustedBaseImage {
    imagename?: pulumi.Input<string>;
    registry?: pulumi.Input<string>;
}

export interface FunctionRuntimePolicyScopeVariable {
    /**
     * Class of supported scope.
     */
    attribute: pulumi.Input<string>;
    /**
     * Value assigned to the attribute.
     */
    value: pulumi.Input<string>;
}

export interface GetApplicationScopeCategory {
    artifacts?: inputs.GetApplicationScopeCategoryArtifact[];
    entityScopes?: inputs.GetApplicationScopeCategoryEntityScope[];
    infrastructures?: inputs.GetApplicationScopeCategoryInfrastructure[];
    workloads?: inputs.GetApplicationScopeCategoryWorkload[];
}

export interface GetApplicationScopeCategoryArgs {
    artifacts?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryArtifactArgs>[]>;
    entityScopes?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryEntityScopeArgs>[]>;
    infrastructures?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryInfrastructureArgs>[]>;
    workloads?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryWorkloadArgs>[]>;
}

export interface GetApplicationScopeCategoryArtifact {
    cfs?: inputs.GetApplicationScopeCategoryArtifactCf[];
    functions?: inputs.GetApplicationScopeCategoryArtifactFunction[];
    images?: inputs.GetApplicationScopeCategoryArtifactImage[];
}

export interface GetApplicationScopeCategoryArtifactArgs {
    cfs?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryArtifactCfArgs>[]>;
    functions?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryArtifactFunctionArgs>[]>;
    images?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryArtifactImageArgs>[]>;
}

export interface GetApplicationScopeCategoryArtifactCfArgs {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryArtifactCfVariableArgs>[]>;
}

export interface GetApplicationScopeCategoryArtifactCf {
    expression?: string;
    variables?: inputs.GetApplicationScopeCategoryArtifactCfVariable[];
}

export interface GetApplicationScopeCategoryArtifactCfVariableArgs {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface GetApplicationScopeCategoryArtifactCfVariable {
    attribute?: string;
    value?: string;
}

export interface GetApplicationScopeCategoryArtifactFunctionArgs {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryArtifactFunctionVariableArgs>[]>;
}

export interface GetApplicationScopeCategoryArtifactFunction {
    expression?: string;
    variables?: inputs.GetApplicationScopeCategoryArtifactFunctionVariable[];
}

export interface GetApplicationScopeCategoryArtifactFunctionVariableArgs {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface GetApplicationScopeCategoryArtifactFunctionVariable {
    attribute?: string;
    value?: string;
}

export interface GetApplicationScopeCategoryArtifactImage {
    expression?: string;
    variables?: inputs.GetApplicationScopeCategoryArtifactImageVariable[];
}

export interface GetApplicationScopeCategoryArtifactImageArgs {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryArtifactImageVariableArgs>[]>;
}

export interface GetApplicationScopeCategoryArtifactImageVariableArgs {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface GetApplicationScopeCategoryArtifactImageVariable {
    attribute?: string;
    value?: string;
}

export interface GetApplicationScopeCategoryEntityScope {
    expression?: string;
    variables?: inputs.GetApplicationScopeCategoryEntityScopeVariable[];
}

export interface GetApplicationScopeCategoryEntityScopeArgs {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryEntityScopeVariableArgs>[]>;
}

export interface GetApplicationScopeCategoryEntityScopeVariable {
    attribute?: string;
    value?: string;
}

export interface GetApplicationScopeCategoryEntityScopeVariableArgs {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface GetApplicationScopeCategoryInfrastructure {
    kubernetes?: inputs.GetApplicationScopeCategoryInfrastructureKubernete[];
    os?: inputs.GetApplicationScopeCategoryInfrastructureO[];
}

export interface GetApplicationScopeCategoryInfrastructureArgs {
    kubernetes?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryInfrastructureKuberneteArgs>[]>;
    os?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryInfrastructureOArgs>[]>;
}

export interface GetApplicationScopeCategoryInfrastructureKubernete {
    expression?: string;
    variables?: inputs.GetApplicationScopeCategoryInfrastructureKuberneteVariable[];
}

export interface GetApplicationScopeCategoryInfrastructureKuberneteArgs {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryInfrastructureKuberneteVariableArgs>[]>;
}

export interface GetApplicationScopeCategoryInfrastructureKuberneteVariableArgs {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface GetApplicationScopeCategoryInfrastructureKuberneteVariable {
    attribute?: string;
    value?: string;
}

export interface GetApplicationScopeCategoryInfrastructureOArgs {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryInfrastructureOVariableArgs>[]>;
}

export interface GetApplicationScopeCategoryInfrastructureO {
    expression?: string;
    variables?: inputs.GetApplicationScopeCategoryInfrastructureOVariable[];
}

export interface GetApplicationScopeCategoryInfrastructureOVariable {
    attribute?: string;
    value?: string;
}

export interface GetApplicationScopeCategoryInfrastructureOVariableArgs {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface GetApplicationScopeCategoryWorkloadArgs {
    cfs?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryWorkloadCfArgs>[]>;
    kubernetes?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryWorkloadKuberneteArgs>[]>;
    os?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryWorkloadOArgs>[]>;
}

export interface GetApplicationScopeCategoryWorkload {
    cfs?: inputs.GetApplicationScopeCategoryWorkloadCf[];
    kubernetes?: inputs.GetApplicationScopeCategoryWorkloadKubernete[];
    os?: inputs.GetApplicationScopeCategoryWorkloadO[];
}

export interface GetApplicationScopeCategoryWorkloadCfArgs {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryWorkloadCfVariableArgs>[]>;
}

export interface GetApplicationScopeCategoryWorkloadCf {
    expression?: string;
    variables?: inputs.GetApplicationScopeCategoryWorkloadCfVariable[];
}

export interface GetApplicationScopeCategoryWorkloadCfVariable {
    attribute?: string;
    value?: string;
}

export interface GetApplicationScopeCategoryWorkloadCfVariableArgs {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface GetApplicationScopeCategoryWorkloadKubernete {
    expression?: string;
    variables?: inputs.GetApplicationScopeCategoryWorkloadKuberneteVariable[];
}

export interface GetApplicationScopeCategoryWorkloadKuberneteArgs {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryWorkloadKuberneteVariableArgs>[]>;
}

export interface GetApplicationScopeCategoryWorkloadKuberneteVariableArgs {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface GetApplicationScopeCategoryWorkloadKuberneteVariable {
    attribute?: string;
    value?: string;
}

export interface GetApplicationScopeCategoryWorkloadO {
    expression?: string;
    variables?: inputs.GetApplicationScopeCategoryWorkloadOVariable[];
}

export interface GetApplicationScopeCategoryWorkloadOArgs {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryWorkloadOVariableArgs>[]>;
}

export interface GetApplicationScopeCategoryWorkloadOVariable {
    attribute?: string;
    value?: string;
}

export interface GetApplicationScopeCategoryWorkloadOVariableArgs {
    attribute?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface GetFirewallPolicyOutboundNetworkArgs {
    /**
     * Indicates whether the specified resources are allowed to receive data or requests.
     */
    allow?: pulumi.Input<boolean>;
    /**
     * Range of ports affected by firewall.
     */
    portRange?: pulumi.Input<string>;
    /**
     * Information of the resource.
     */
    resource?: pulumi.Input<string>;
    /**
     * Type of the resource.
     */
    resourceType?: pulumi.Input<string>;
}

export interface GetFirewallPolicyOutboundNetwork {
    /**
     * Indicates whether the specified resources are allowed to receive data or requests.
     */
    allow?: boolean;
    /**
     * Range of ports affected by firewall.
     */
    portRange?: string;
    /**
     * Information of the resource.
     */
    resource?: string;
    /**
     * Type of the resource.
     */
    resourceType?: string;
}

export interface HostAssurancePolicAutoScanTime {
    iteration?: pulumi.Input<number>;
    iterationType?: pulumi.Input<string>;
    time?: pulumi.Input<string>;
    weekDays?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface HostAssurancePolicCustomCheck {
    /**
     * Name of user account that created the policy.
     */
    author?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    engine?: pulumi.Input<string>;
    lastModified?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    path?: pulumi.Input<string>;
    readOnly?: pulumi.Input<boolean>;
    scriptId?: pulumi.Input<string>;
    severity?: pulumi.Input<string>;
    snippet?: pulumi.Input<string>;
}

export interface HostAssurancePolicForbiddenLabel {
    key?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface HostAssurancePolicPackagesBlackList {
    arch?: pulumi.Input<string>;
    display?: pulumi.Input<string>;
    epoch?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    license?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    release?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
    versionRange?: pulumi.Input<string>;
}

export interface HostAssurancePolicPackagesWhiteList {
    arch?: pulumi.Input<string>;
    display?: pulumi.Input<string>;
    epoch?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    license?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    release?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
    versionRange?: pulumi.Input<string>;
}

export interface HostAssurancePolicRequiredLabel {
    key?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface HostAssurancePolicScope {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.HostAssurancePolicScopeVariable>[]>;
}

export interface HostAssurancePolicScopeVariable {
    attribute?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface HostAssurancePolicTrustedBaseImage {
    imagename?: pulumi.Input<string>;
    registry?: pulumi.Input<string>;
}

export interface HostRuntimePolicyFileIntegrityMonitoring {
    /**
     * List of paths to be excluded from being monitored.
     */
    excludedPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of processes to be excluded from being monitored.
     */
    excludedProcesses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of users to be excluded from being monitored.
     */
    excludedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If true, add attributes operations will be monitored.
     */
    monitorAttributes?: pulumi.Input<boolean>;
    /**
     * If true, create operations will be monitored.
     */
    monitorCreate?: pulumi.Input<boolean>;
    /**
     * If true, deletion operations will be monitored.
     */
    monitorDelete?: pulumi.Input<boolean>;
    /**
     * If true, modification operations will be monitored.
     */
    monitorModify?: pulumi.Input<boolean>;
    /**
     * If true, read operations will be monitored.
     */
    monitorRead?: pulumi.Input<boolean>;
    /**
     * List of paths to be monitored.
     */
    monitoredPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of processes to be monitored.
     */
    monitoredProcesses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of users to be monitored.
     */
    monitoredUsers?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface HostRuntimePolicyScopeVariable {
    /**
     * Class of supported scope.
     */
    attribute: pulumi.Input<string>;
    /**
     * Value assigned to the attribute.
     */
    value: pulumi.Input<string>;
}

export interface HostRuntimePolicyWindowsRegistryMonitoring {
    /**
     * List of paths to be excluded from being monitored.
     */
    excludedPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of registry processes to be excluded from being monitored.
     */
    excludedProcesses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of registry users to be excluded from being monitored.
     */
    excludedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If true, add attributes operations will be monitored.
     */
    monitorAttributes?: pulumi.Input<boolean>;
    /**
     * If true, create operations will be monitored.
     */
    monitorCreate?: pulumi.Input<boolean>;
    /**
     * If true, deletion operations will be monitored.
     */
    monitorDelete?: pulumi.Input<boolean>;
    /**
     * If true, modification operations will be monitored.
     */
    monitorModify?: pulumi.Input<boolean>;
    /**
     * If true, read operations will be monitored.
     */
    monitorRead?: pulumi.Input<boolean>;
    /**
     * List of paths to be monitored.
     */
    monitoredPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of registry processes to be monitored.
     */
    monitoredProcesses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of registry users to be monitored.
     */
    monitoredUsers?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface HostRuntimePolicyWindowsRegistryProtection {
    /**
     * List of registry paths to be excluded from being protected.
     */
    excludedPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of registry processes to be excluded from being protected.
     */
    excludedProcesses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of registry paths to be users from being protected.
     */
    excludedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of registry paths to be protected.
     */
    protectedPaths?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of registry processes to be protected.
     */
    protectedProcesses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of registry users to be protected.
     */
    protectedUsers?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ImageAssuranceChecksPerformed {
    assuranceType?: pulumi.Input<string>;
    blocking?: pulumi.Input<boolean>;
    control?: pulumi.Input<string>;
    /**
     * If DTA was skipped.
     */
    dtaSkipped?: pulumi.Input<boolean>;
    /**
     * The reason why DTA was skipped.
     */
    dtaSkippedReason?: pulumi.Input<string>;
    failed?: pulumi.Input<boolean>;
    policyName?: pulumi.Input<string>;
}

export interface ImageAssurancePolicyAutoScanTime {
    iteration?: pulumi.Input<number>;
    iterationType?: pulumi.Input<string>;
    time?: pulumi.Input<string>;
    weekDays?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ImageAssurancePolicyCustomCheck {
    /**
     * Name of user account that created the policy.
     */
    author?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    engine?: pulumi.Input<string>;
    lastModified?: pulumi.Input<number>;
    name?: pulumi.Input<string>;
    path?: pulumi.Input<string>;
    readOnly?: pulumi.Input<boolean>;
    scriptId?: pulumi.Input<string>;
    severity?: pulumi.Input<string>;
    snippet?: pulumi.Input<string>;
}

export interface ImageAssurancePolicyForbiddenLabel {
    key?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ImageAssurancePolicyPackagesBlackList {
    arch?: pulumi.Input<string>;
    display?: pulumi.Input<string>;
    epoch?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    license?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    release?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
    versionRange?: pulumi.Input<string>;
}

export interface ImageAssurancePolicyPackagesWhiteList {
    arch?: pulumi.Input<string>;
    display?: pulumi.Input<string>;
    epoch?: pulumi.Input<string>;
    format?: pulumi.Input<string>;
    license?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    release?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
    versionRange?: pulumi.Input<string>;
}

export interface ImageAssurancePolicyRequiredLabel {
    key?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ImageAssurancePolicyScope {
    expression?: pulumi.Input<string>;
    variables?: pulumi.Input<pulumi.Input<inputs.ImageAssurancePolicyScopeVariable>[]>;
}

export interface ImageAssurancePolicyScopeVariable {
    attribute?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    value?: pulumi.Input<string>;
}

export interface ImageAssurancePolicyTrustedBaseImage {
    imagename?: pulumi.Input<string>;
    registry?: pulumi.Input<string>;
}

export interface ImageHistory {
    /**
     * The image creation comment.
     */
    comment?: pulumi.Input<string>;
    /**
     * The date and time when the image was registered.
     */
    created?: pulumi.Input<string>;
    createdBy?: pulumi.Input<string>;
    /**
     * The ID of this resource.
     */
    id?: pulumi.Input<string>;
    size?: pulumi.Input<number>;
}

export interface ImageVulnerability {
    ackAuthor?: pulumi.Input<string>;
    ackComment?: pulumi.Input<string>;
    ackExpirationConfiguredAt?: pulumi.Input<string>;
    ackExpirationConfiguredBy?: pulumi.Input<string>;
    ackExpirationDays?: pulumi.Input<number>;
    ackScope?: pulumi.Input<string>;
    acknowledgeDate?: pulumi.Input<string>;
    ancestorPkg?: pulumi.Input<string>;
    aquaScore?: pulumi.Input<number>;
    aquaScoreClassification?: pulumi.Input<string>;
    aquaScoringSystem?: pulumi.Input<string>;
    aquaSeverity?: pulumi.Input<string>;
    aquaSeverityClassification?: pulumi.Input<string>;
    aquaVectors?: pulumi.Input<string>;
    auditEventsCount?: pulumi.Input<number>;
    blockEventsCount?: pulumi.Input<number>;
    classification?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    /**
     * The content digest of the image.
     */
    digest?: pulumi.Input<string>;
    exploitReference?: pulumi.Input<string>;
    exploitType?: pulumi.Input<string>;
    firstFoundDate?: pulumi.Input<string>;
    fixVersion?: pulumi.Input<string>;
    imageName?: pulumi.Input<string>;
    lastFoundDate?: pulumi.Input<string>;
    modificationDate?: pulumi.Input<string>;
    /**
     * The name of the image.
     */
    name?: pulumi.Input<string>;
    nvdCvss2Score?: pulumi.Input<number>;
    nvdCvss2Vectors?: pulumi.Input<string>;
    nvdCvss3Score?: pulumi.Input<number>;
    nvdCvss3Severity?: pulumi.Input<string>;
    nvdCvss3Vectors?: pulumi.Input<string>;
    nvdSeverity?: pulumi.Input<string>;
    nvdUrl?: pulumi.Input<string>;
    /**
     * The operating system detected in the image
     */
    os?: pulumi.Input<string>;
    /**
     * The version of the OS detected in the image.
     */
    osVersion?: pulumi.Input<string>;
    /**
     * Permission of the image.
     */
    permission?: pulumi.Input<string>;
    publishDate?: pulumi.Input<string>;
    /**
     * The name of the registry where the image is stored.
     */
    registry?: pulumi.Input<string>;
    /**
     * The name of the image's repository.
     */
    repository?: pulumi.Input<string>;
    resourceArchitecture?: pulumi.Input<string>;
    resourceCpe?: pulumi.Input<string>;
    resourceFormat?: pulumi.Input<string>;
    resourceHash?: pulumi.Input<string>;
    resourceLicenses?: pulumi.Input<pulumi.Input<string>[]>;
    resourceName?: pulumi.Input<string>;
    resourcePath?: pulumi.Input<string>;
    resourceType?: pulumi.Input<string>;
    resourceVersion?: pulumi.Input<string>;
    severityClassification?: pulumi.Input<string>;
    solution?: pulumi.Input<string>;
    temporalVector?: pulumi.Input<string>;
    vPatchAppliedBy?: pulumi.Input<string>;
    vPatchAppliedOn?: pulumi.Input<string>;
    vPatchEnforcedBy?: pulumi.Input<string>;
    vPatchEnforcedOn?: pulumi.Input<string>;
    vPatchPolicyEnforce?: pulumi.Input<boolean>;
    vPatchPolicyName?: pulumi.Input<string>;
    vPatchRevertedBy?: pulumi.Input<string>;
    vPatchRevertedOn?: pulumi.Input<string>;
    vPatchStatus?: pulumi.Input<string>;
    vendorCvss2Score?: pulumi.Input<number>;
    vendorCvss2Vectors?: pulumi.Input<string>;
    vendorSeverity?: pulumi.Input<string>;
    vendorStatement?: pulumi.Input<string>;
    vendorUrl?: pulumi.Input<string>;
}

export interface ServiceScopeVariable {
    /**
     * Class of supported scope.
     */
    attribute: pulumi.Input<string>;
    /**
     * Value assigned to the attribute.
     */
    value: pulumi.Input<string>;
}

export interface UserSaasGroup {
    groupAdmin?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
}

export interface UserSaasLogin {
    created?: pulumi.Input<string>;
    /**
     * The ID of this resource.
     */
    id?: pulumi.Input<number>;
    ipAddress?: pulumi.Input<string>;
    userId?: pulumi.Input<number>;
}
