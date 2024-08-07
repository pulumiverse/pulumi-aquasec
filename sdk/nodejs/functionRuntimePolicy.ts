// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 */
export class FunctionRuntimePolicy extends pulumi.CustomResource {
    /**
     * Get an existing FunctionRuntimePolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FunctionRuntimePolicyState, opts?: pulumi.CustomResourceOptions): FunctionRuntimePolicy {
        return new FunctionRuntimePolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aquasec:index/functionRuntimePolicy:FunctionRuntimePolicy';

    /**
     * Returns true if the given object is an instance of FunctionRuntimePolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FunctionRuntimePolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FunctionRuntimePolicy.__pulumiType;
    }

    /**
     * Allowed executables configuration.
     */
    public readonly allowedExecutables!: pulumi.Output<outputs.FunctionRuntimePolicyAllowedExecutable[]>;
    /**
     * Allowed registries configuration.
     */
    public readonly allowedRegistries!: pulumi.Output<outputs.FunctionRuntimePolicyAllowedRegistry[]>;
    /**
     * Indicates the application scope of the service.
     */
    public readonly applicationScopes!: pulumi.Output<string[]>;
    /**
     * Detects brute force login attempts
     */
    public readonly auditBruteForceLogin!: pulumi.Output<boolean | undefined>;
    public readonly auditing!: pulumi.Output<outputs.FunctionRuntimePolicyAuditing>;
    /**
     * Username of the account that created the service.
     */
    public readonly author!: pulumi.Output<string>;
    public readonly blacklistedOsUsers!: pulumi.Output<outputs.FunctionRuntimePolicyBlacklistedOsUsers>;
    public readonly blockContainerExec!: pulumi.Output<boolean | undefined>;
    public readonly blockDisallowedImages!: pulumi.Output<boolean | undefined>;
    public readonly blockFilelessExec!: pulumi.Output<boolean | undefined>;
    public readonly blockNonCompliantWorkloads!: pulumi.Output<boolean | undefined>;
    public readonly blockNonK8sContainers!: pulumi.Output<boolean | undefined>;
    /**
     * Bypass scope configuration.
     */
    public readonly bypassScopes!: pulumi.Output<outputs.FunctionRuntimePolicyBypassScope[] | undefined>;
    public readonly containerExec!: pulumi.Output<outputs.FunctionRuntimePolicyContainerExec>;
    public readonly created!: pulumi.Output<string>;
    public readonly cve!: pulumi.Output<string | undefined>;
    public readonly defaultSecurityProfile!: pulumi.Output<string | undefined>;
    /**
     * The description of the function runtime policy
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly digest!: pulumi.Output<string | undefined>;
    /**
     * Drift prevention configuration.
     */
    public readonly driftPreventions!: pulumi.Output<outputs.FunctionRuntimePolicyDriftPrevention[]>;
    public readonly enableCryptoMiningDns!: pulumi.Output<boolean | undefined>;
    public readonly enableForkGuard!: pulumi.Output<boolean | undefined>;
    public readonly enableIpReputation!: pulumi.Output<boolean | undefined>;
    public readonly enablePortScanProtection!: pulumi.Output<boolean | undefined>;
    /**
     * Indicates if the runtime policy is enabled or not.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Indicates that policy should effect container execution (not just for audit).
     */
    public readonly enforce!: pulumi.Output<boolean | undefined>;
    /**
     * Indicates the number of days after which the runtime policy will be changed to enforce mode.
     */
    public readonly enforceAfterDays!: pulumi.Output<number | undefined>;
    public readonly enforceSchedulerAddedOn!: pulumi.Output<number | undefined>;
    /**
     * List of excluded application scopes.
     */
    public readonly excludeApplicationScopes!: pulumi.Output<string[] | undefined>;
    /**
     * Executable blacklist configuration.
     */
    public readonly executableBlacklists!: pulumi.Output<outputs.FunctionRuntimePolicyExecutableBlacklist[]>;
    public readonly failedKubernetesChecks!: pulumi.Output<outputs.FunctionRuntimePolicyFailedKubernetesChecks>;
    public readonly fileBlock!: pulumi.Output<outputs.FunctionRuntimePolicyFileBlock>;
    /**
     * Configuration for file integrity monitoring.
     */
    public readonly fileIntegrityMonitorings!: pulumi.Output<outputs.FunctionRuntimePolicyFileIntegrityMonitoring[] | undefined>;
    public readonly forkGuardProcessLimit!: pulumi.Output<number | undefined>;
    /**
     * Honeypot User ID (Access Key)
     */
    public readonly honeypotAccessKey!: pulumi.Output<string | undefined>;
    /**
     * List of options to apply the honeypot on (Environment Vairable, Layer, File)
     */
    public readonly honeypotApplyOns!: pulumi.Output<string[] | undefined>;
    /**
     * Honeypot User Password (Secret Key)
     */
    public readonly honeypotSecretKey!: pulumi.Output<string | undefined>;
    /**
     * Serverless application name
     */
    public readonly honeypotServerlessAppName!: pulumi.Output<string | undefined>;
    public readonly imageName!: pulumi.Output<string | undefined>;
    public readonly isAuditChecked!: pulumi.Output<boolean | undefined>;
    public readonly isAutoGenerated!: pulumi.Output<boolean | undefined>;
    public readonly isOotbPolicy!: pulumi.Output<boolean | undefined>;
    public readonly lastupdate!: pulumi.Output<number>;
    /**
     * Container privileges configuration.
     */
    public readonly limitContainerPrivileges!: pulumi.Output<outputs.FunctionRuntimePolicyLimitContainerPrivilege[]>;
    public readonly linuxCapabilities!: pulumi.Output<outputs.FunctionRuntimePolicyLinuxCapabilities>;
    /**
     * Configuration for Real-Time Malware Protection.
     */
    public readonly malwareScanOptions!: pulumi.Output<outputs.FunctionRuntimePolicyMalwareScanOptions | undefined>;
    /**
     * Name of the function runtime policy
     */
    public readonly name!: pulumi.Output<string>;
    public readonly noNewPrivileges!: pulumi.Output<boolean | undefined>;
    public readonly onlyRegisteredImages!: pulumi.Output<boolean | undefined>;
    public readonly packageBlock!: pulumi.Output<outputs.FunctionRuntimePolicyPackageBlock>;
    public readonly permission!: pulumi.Output<string | undefined>;
    public readonly portBlock!: pulumi.Output<outputs.FunctionRuntimePolicyPortBlock>;
    public readonly readonlyFiles!: pulumi.Output<outputs.FunctionRuntimePolicyReadonlyFiles>;
    public readonly readonlyRegistry!: pulumi.Output<outputs.FunctionRuntimePolicyReadonlyRegistry>;
    public readonly registry!: pulumi.Output<string | undefined>;
    public readonly registryAccessMonitoring!: pulumi.Output<outputs.FunctionRuntimePolicyRegistryAccessMonitoring>;
    public readonly repoName!: pulumi.Output<string | undefined>;
    public readonly resourceName!: pulumi.Output<string | undefined>;
    public readonly resourceType!: pulumi.Output<string | undefined>;
    /**
     * Restricted volumes configuration.
     */
    public readonly restrictedVolumes!: pulumi.Output<outputs.FunctionRuntimePolicyRestrictedVolume[]>;
    public readonly reverseShell!: pulumi.Output<outputs.FunctionRuntimePolicyReverseShell>;
    public readonly runtimeMode!: pulumi.Output<number | undefined>;
    public readonly runtimeType!: pulumi.Output<string | undefined>;
    /**
     * Logical expression of how to compute the dependency of the scope variables.
     */
    public readonly scopeExpression!: pulumi.Output<string>;
    /**
     * List of scope attributes.
     */
    public readonly scopeVariables!: pulumi.Output<outputs.FunctionRuntimePolicyScopeVariable[]>;
    /**
     * Scope configuration.
     */
    public readonly scopes!: pulumi.Output<outputs.FunctionRuntimePolicyScope[] | undefined>;
    public readonly systemIntegrityProtection!: pulumi.Output<outputs.FunctionRuntimePolicySystemIntegrityProtection>;
    public readonly tripwire!: pulumi.Output<outputs.FunctionRuntimePolicyTripwire>;
    public readonly type!: pulumi.Output<string | undefined>;
    public readonly updated!: pulumi.Output<string>;
    public readonly version!: pulumi.Output<string | undefined>;
    public readonly vpatchVersion!: pulumi.Output<string | undefined>;
    public readonly whitelistedOsUsers!: pulumi.Output<outputs.FunctionRuntimePolicyWhitelistedOsUsers>;

    /**
     * Create a FunctionRuntimePolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FunctionRuntimePolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FunctionRuntimePolicyArgs | FunctionRuntimePolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FunctionRuntimePolicyState | undefined;
            resourceInputs["allowedExecutables"] = state ? state.allowedExecutables : undefined;
            resourceInputs["allowedRegistries"] = state ? state.allowedRegistries : undefined;
            resourceInputs["applicationScopes"] = state ? state.applicationScopes : undefined;
            resourceInputs["auditBruteForceLogin"] = state ? state.auditBruteForceLogin : undefined;
            resourceInputs["auditing"] = state ? state.auditing : undefined;
            resourceInputs["author"] = state ? state.author : undefined;
            resourceInputs["blacklistedOsUsers"] = state ? state.blacklistedOsUsers : undefined;
            resourceInputs["blockContainerExec"] = state ? state.blockContainerExec : undefined;
            resourceInputs["blockDisallowedImages"] = state ? state.blockDisallowedImages : undefined;
            resourceInputs["blockFilelessExec"] = state ? state.blockFilelessExec : undefined;
            resourceInputs["blockNonCompliantWorkloads"] = state ? state.blockNonCompliantWorkloads : undefined;
            resourceInputs["blockNonK8sContainers"] = state ? state.blockNonK8sContainers : undefined;
            resourceInputs["bypassScopes"] = state ? state.bypassScopes : undefined;
            resourceInputs["containerExec"] = state ? state.containerExec : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["cve"] = state ? state.cve : undefined;
            resourceInputs["defaultSecurityProfile"] = state ? state.defaultSecurityProfile : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["digest"] = state ? state.digest : undefined;
            resourceInputs["driftPreventions"] = state ? state.driftPreventions : undefined;
            resourceInputs["enableCryptoMiningDns"] = state ? state.enableCryptoMiningDns : undefined;
            resourceInputs["enableForkGuard"] = state ? state.enableForkGuard : undefined;
            resourceInputs["enableIpReputation"] = state ? state.enableIpReputation : undefined;
            resourceInputs["enablePortScanProtection"] = state ? state.enablePortScanProtection : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["enforce"] = state ? state.enforce : undefined;
            resourceInputs["enforceAfterDays"] = state ? state.enforceAfterDays : undefined;
            resourceInputs["enforceSchedulerAddedOn"] = state ? state.enforceSchedulerAddedOn : undefined;
            resourceInputs["excludeApplicationScopes"] = state ? state.excludeApplicationScopes : undefined;
            resourceInputs["executableBlacklists"] = state ? state.executableBlacklists : undefined;
            resourceInputs["failedKubernetesChecks"] = state ? state.failedKubernetesChecks : undefined;
            resourceInputs["fileBlock"] = state ? state.fileBlock : undefined;
            resourceInputs["fileIntegrityMonitorings"] = state ? state.fileIntegrityMonitorings : undefined;
            resourceInputs["forkGuardProcessLimit"] = state ? state.forkGuardProcessLimit : undefined;
            resourceInputs["honeypotAccessKey"] = state ? state.honeypotAccessKey : undefined;
            resourceInputs["honeypotApplyOns"] = state ? state.honeypotApplyOns : undefined;
            resourceInputs["honeypotSecretKey"] = state ? state.honeypotSecretKey : undefined;
            resourceInputs["honeypotServerlessAppName"] = state ? state.honeypotServerlessAppName : undefined;
            resourceInputs["imageName"] = state ? state.imageName : undefined;
            resourceInputs["isAuditChecked"] = state ? state.isAuditChecked : undefined;
            resourceInputs["isAutoGenerated"] = state ? state.isAutoGenerated : undefined;
            resourceInputs["isOotbPolicy"] = state ? state.isOotbPolicy : undefined;
            resourceInputs["lastupdate"] = state ? state.lastupdate : undefined;
            resourceInputs["limitContainerPrivileges"] = state ? state.limitContainerPrivileges : undefined;
            resourceInputs["linuxCapabilities"] = state ? state.linuxCapabilities : undefined;
            resourceInputs["malwareScanOptions"] = state ? state.malwareScanOptions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["noNewPrivileges"] = state ? state.noNewPrivileges : undefined;
            resourceInputs["onlyRegisteredImages"] = state ? state.onlyRegisteredImages : undefined;
            resourceInputs["packageBlock"] = state ? state.packageBlock : undefined;
            resourceInputs["permission"] = state ? state.permission : undefined;
            resourceInputs["portBlock"] = state ? state.portBlock : undefined;
            resourceInputs["readonlyFiles"] = state ? state.readonlyFiles : undefined;
            resourceInputs["readonlyRegistry"] = state ? state.readonlyRegistry : undefined;
            resourceInputs["registry"] = state ? state.registry : undefined;
            resourceInputs["registryAccessMonitoring"] = state ? state.registryAccessMonitoring : undefined;
            resourceInputs["repoName"] = state ? state.repoName : undefined;
            resourceInputs["resourceName"] = state ? state.resourceName : undefined;
            resourceInputs["resourceType"] = state ? state.resourceType : undefined;
            resourceInputs["restrictedVolumes"] = state ? state.restrictedVolumes : undefined;
            resourceInputs["reverseShell"] = state ? state.reverseShell : undefined;
            resourceInputs["runtimeMode"] = state ? state.runtimeMode : undefined;
            resourceInputs["runtimeType"] = state ? state.runtimeType : undefined;
            resourceInputs["scopeExpression"] = state ? state.scopeExpression : undefined;
            resourceInputs["scopeVariables"] = state ? state.scopeVariables : undefined;
            resourceInputs["scopes"] = state ? state.scopes : undefined;
            resourceInputs["systemIntegrityProtection"] = state ? state.systemIntegrityProtection : undefined;
            resourceInputs["tripwire"] = state ? state.tripwire : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["vpatchVersion"] = state ? state.vpatchVersion : undefined;
            resourceInputs["whitelistedOsUsers"] = state ? state.whitelistedOsUsers : undefined;
        } else {
            const args = argsOrState as FunctionRuntimePolicyArgs | undefined;
            resourceInputs["allowedExecutables"] = args ? args.allowedExecutables : undefined;
            resourceInputs["allowedRegistries"] = args ? args.allowedRegistries : undefined;
            resourceInputs["applicationScopes"] = args ? args.applicationScopes : undefined;
            resourceInputs["auditBruteForceLogin"] = args ? args.auditBruteForceLogin : undefined;
            resourceInputs["auditing"] = args ? args.auditing : undefined;
            resourceInputs["author"] = args ? args.author : undefined;
            resourceInputs["blacklistedOsUsers"] = args ? args.blacklistedOsUsers : undefined;
            resourceInputs["blockContainerExec"] = args ? args.blockContainerExec : undefined;
            resourceInputs["blockDisallowedImages"] = args ? args.blockDisallowedImages : undefined;
            resourceInputs["blockFilelessExec"] = args ? args.blockFilelessExec : undefined;
            resourceInputs["blockNonCompliantWorkloads"] = args ? args.blockNonCompliantWorkloads : undefined;
            resourceInputs["blockNonK8sContainers"] = args ? args.blockNonK8sContainers : undefined;
            resourceInputs["bypassScopes"] = args ? args.bypassScopes : undefined;
            resourceInputs["containerExec"] = args ? args.containerExec : undefined;
            resourceInputs["created"] = args ? args.created : undefined;
            resourceInputs["cve"] = args ? args.cve : undefined;
            resourceInputs["defaultSecurityProfile"] = args ? args.defaultSecurityProfile : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["digest"] = args ? args.digest : undefined;
            resourceInputs["driftPreventions"] = args ? args.driftPreventions : undefined;
            resourceInputs["enableCryptoMiningDns"] = args ? args.enableCryptoMiningDns : undefined;
            resourceInputs["enableForkGuard"] = args ? args.enableForkGuard : undefined;
            resourceInputs["enableIpReputation"] = args ? args.enableIpReputation : undefined;
            resourceInputs["enablePortScanProtection"] = args ? args.enablePortScanProtection : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["enforce"] = args ? args.enforce : undefined;
            resourceInputs["enforceAfterDays"] = args ? args.enforceAfterDays : undefined;
            resourceInputs["enforceSchedulerAddedOn"] = args ? args.enforceSchedulerAddedOn : undefined;
            resourceInputs["excludeApplicationScopes"] = args ? args.excludeApplicationScopes : undefined;
            resourceInputs["executableBlacklists"] = args ? args.executableBlacklists : undefined;
            resourceInputs["failedKubernetesChecks"] = args ? args.failedKubernetesChecks : undefined;
            resourceInputs["fileBlock"] = args ? args.fileBlock : undefined;
            resourceInputs["fileIntegrityMonitorings"] = args ? args.fileIntegrityMonitorings : undefined;
            resourceInputs["forkGuardProcessLimit"] = args ? args.forkGuardProcessLimit : undefined;
            resourceInputs["honeypotAccessKey"] = args ? args.honeypotAccessKey : undefined;
            resourceInputs["honeypotApplyOns"] = args ? args.honeypotApplyOns : undefined;
            resourceInputs["honeypotSecretKey"] = args?.honeypotSecretKey ? pulumi.secret(args.honeypotSecretKey) : undefined;
            resourceInputs["honeypotServerlessAppName"] = args ? args.honeypotServerlessAppName : undefined;
            resourceInputs["imageName"] = args ? args.imageName : undefined;
            resourceInputs["isAuditChecked"] = args ? args.isAuditChecked : undefined;
            resourceInputs["isAutoGenerated"] = args ? args.isAutoGenerated : undefined;
            resourceInputs["isOotbPolicy"] = args ? args.isOotbPolicy : undefined;
            resourceInputs["lastupdate"] = args ? args.lastupdate : undefined;
            resourceInputs["limitContainerPrivileges"] = args ? args.limitContainerPrivileges : undefined;
            resourceInputs["linuxCapabilities"] = args ? args.linuxCapabilities : undefined;
            resourceInputs["malwareScanOptions"] = args ? args.malwareScanOptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["noNewPrivileges"] = args ? args.noNewPrivileges : undefined;
            resourceInputs["onlyRegisteredImages"] = args ? args.onlyRegisteredImages : undefined;
            resourceInputs["packageBlock"] = args ? args.packageBlock : undefined;
            resourceInputs["permission"] = args ? args.permission : undefined;
            resourceInputs["portBlock"] = args ? args.portBlock : undefined;
            resourceInputs["readonlyFiles"] = args ? args.readonlyFiles : undefined;
            resourceInputs["readonlyRegistry"] = args ? args.readonlyRegistry : undefined;
            resourceInputs["registry"] = args ? args.registry : undefined;
            resourceInputs["registryAccessMonitoring"] = args ? args.registryAccessMonitoring : undefined;
            resourceInputs["repoName"] = args ? args.repoName : undefined;
            resourceInputs["resourceName"] = args ? args.resourceName : undefined;
            resourceInputs["resourceType"] = args ? args.resourceType : undefined;
            resourceInputs["restrictedVolumes"] = args ? args.restrictedVolumes : undefined;
            resourceInputs["reverseShell"] = args ? args.reverseShell : undefined;
            resourceInputs["runtimeMode"] = args ? args.runtimeMode : undefined;
            resourceInputs["runtimeType"] = args ? args.runtimeType : undefined;
            resourceInputs["scopeExpression"] = args ? args.scopeExpression : undefined;
            resourceInputs["scopeVariables"] = args ? args.scopeVariables : undefined;
            resourceInputs["scopes"] = args ? args.scopes : undefined;
            resourceInputs["systemIntegrityProtection"] = args ? args.systemIntegrityProtection : undefined;
            resourceInputs["tripwire"] = args ? args.tripwire : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["updated"] = args ? args.updated : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["vpatchVersion"] = args ? args.vpatchVersion : undefined;
            resourceInputs["whitelistedOsUsers"] = args ? args.whitelistedOsUsers : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["honeypotSecretKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(FunctionRuntimePolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FunctionRuntimePolicy resources.
 */
export interface FunctionRuntimePolicyState {
    /**
     * Allowed executables configuration.
     */
    allowedExecutables?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyAllowedExecutable>[]>;
    /**
     * Allowed registries configuration.
     */
    allowedRegistries?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyAllowedRegistry>[]>;
    /**
     * Indicates the application scope of the service.
     */
    applicationScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Detects brute force login attempts
     */
    auditBruteForceLogin?: pulumi.Input<boolean>;
    auditing?: pulumi.Input<inputs.FunctionRuntimePolicyAuditing>;
    /**
     * Username of the account that created the service.
     */
    author?: pulumi.Input<string>;
    blacklistedOsUsers?: pulumi.Input<inputs.FunctionRuntimePolicyBlacklistedOsUsers>;
    blockContainerExec?: pulumi.Input<boolean>;
    blockDisallowedImages?: pulumi.Input<boolean>;
    blockFilelessExec?: pulumi.Input<boolean>;
    blockNonCompliantWorkloads?: pulumi.Input<boolean>;
    blockNonK8sContainers?: pulumi.Input<boolean>;
    /**
     * Bypass scope configuration.
     */
    bypassScopes?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyBypassScope>[]>;
    containerExec?: pulumi.Input<inputs.FunctionRuntimePolicyContainerExec>;
    created?: pulumi.Input<string>;
    cve?: pulumi.Input<string>;
    defaultSecurityProfile?: pulumi.Input<string>;
    /**
     * The description of the function runtime policy
     */
    description?: pulumi.Input<string>;
    digest?: pulumi.Input<string>;
    /**
     * Drift prevention configuration.
     */
    driftPreventions?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyDriftPrevention>[]>;
    enableCryptoMiningDns?: pulumi.Input<boolean>;
    enableForkGuard?: pulumi.Input<boolean>;
    enableIpReputation?: pulumi.Input<boolean>;
    enablePortScanProtection?: pulumi.Input<boolean>;
    /**
     * Indicates if the runtime policy is enabled or not.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Indicates that policy should effect container execution (not just for audit).
     */
    enforce?: pulumi.Input<boolean>;
    /**
     * Indicates the number of days after which the runtime policy will be changed to enforce mode.
     */
    enforceAfterDays?: pulumi.Input<number>;
    enforceSchedulerAddedOn?: pulumi.Input<number>;
    /**
     * List of excluded application scopes.
     */
    excludeApplicationScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Executable blacklist configuration.
     */
    executableBlacklists?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyExecutableBlacklist>[]>;
    failedKubernetesChecks?: pulumi.Input<inputs.FunctionRuntimePolicyFailedKubernetesChecks>;
    fileBlock?: pulumi.Input<inputs.FunctionRuntimePolicyFileBlock>;
    /**
     * Configuration for file integrity monitoring.
     */
    fileIntegrityMonitorings?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyFileIntegrityMonitoring>[]>;
    forkGuardProcessLimit?: pulumi.Input<number>;
    /**
     * Honeypot User ID (Access Key)
     */
    honeypotAccessKey?: pulumi.Input<string>;
    /**
     * List of options to apply the honeypot on (Environment Vairable, Layer, File)
     */
    honeypotApplyOns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Honeypot User Password (Secret Key)
     */
    honeypotSecretKey?: pulumi.Input<string>;
    /**
     * Serverless application name
     */
    honeypotServerlessAppName?: pulumi.Input<string>;
    imageName?: pulumi.Input<string>;
    isAuditChecked?: pulumi.Input<boolean>;
    isAutoGenerated?: pulumi.Input<boolean>;
    isOotbPolicy?: pulumi.Input<boolean>;
    lastupdate?: pulumi.Input<number>;
    /**
     * Container privileges configuration.
     */
    limitContainerPrivileges?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyLimitContainerPrivilege>[]>;
    linuxCapabilities?: pulumi.Input<inputs.FunctionRuntimePolicyLinuxCapabilities>;
    /**
     * Configuration for Real-Time Malware Protection.
     */
    malwareScanOptions?: pulumi.Input<inputs.FunctionRuntimePolicyMalwareScanOptions>;
    /**
     * Name of the function runtime policy
     */
    name?: pulumi.Input<string>;
    noNewPrivileges?: pulumi.Input<boolean>;
    onlyRegisteredImages?: pulumi.Input<boolean>;
    packageBlock?: pulumi.Input<inputs.FunctionRuntimePolicyPackageBlock>;
    permission?: pulumi.Input<string>;
    portBlock?: pulumi.Input<inputs.FunctionRuntimePolicyPortBlock>;
    readonlyFiles?: pulumi.Input<inputs.FunctionRuntimePolicyReadonlyFiles>;
    readonlyRegistry?: pulumi.Input<inputs.FunctionRuntimePolicyReadonlyRegistry>;
    registry?: pulumi.Input<string>;
    registryAccessMonitoring?: pulumi.Input<inputs.FunctionRuntimePolicyRegistryAccessMonitoring>;
    repoName?: pulumi.Input<string>;
    resourceName?: pulumi.Input<string>;
    resourceType?: pulumi.Input<string>;
    /**
     * Restricted volumes configuration.
     */
    restrictedVolumes?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyRestrictedVolume>[]>;
    reverseShell?: pulumi.Input<inputs.FunctionRuntimePolicyReverseShell>;
    runtimeMode?: pulumi.Input<number>;
    runtimeType?: pulumi.Input<string>;
    /**
     * Logical expression of how to compute the dependency of the scope variables.
     */
    scopeExpression?: pulumi.Input<string>;
    /**
     * List of scope attributes.
     */
    scopeVariables?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyScopeVariable>[]>;
    /**
     * Scope configuration.
     */
    scopes?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyScope>[]>;
    systemIntegrityProtection?: pulumi.Input<inputs.FunctionRuntimePolicySystemIntegrityProtection>;
    tripwire?: pulumi.Input<inputs.FunctionRuntimePolicyTripwire>;
    type?: pulumi.Input<string>;
    updated?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
    vpatchVersion?: pulumi.Input<string>;
    whitelistedOsUsers?: pulumi.Input<inputs.FunctionRuntimePolicyWhitelistedOsUsers>;
}

/**
 * The set of arguments for constructing a FunctionRuntimePolicy resource.
 */
export interface FunctionRuntimePolicyArgs {
    /**
     * Allowed executables configuration.
     */
    allowedExecutables?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyAllowedExecutable>[]>;
    /**
     * Allowed registries configuration.
     */
    allowedRegistries?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyAllowedRegistry>[]>;
    /**
     * Indicates the application scope of the service.
     */
    applicationScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Detects brute force login attempts
     */
    auditBruteForceLogin?: pulumi.Input<boolean>;
    auditing?: pulumi.Input<inputs.FunctionRuntimePolicyAuditing>;
    /**
     * Username of the account that created the service.
     */
    author?: pulumi.Input<string>;
    blacklistedOsUsers?: pulumi.Input<inputs.FunctionRuntimePolicyBlacklistedOsUsers>;
    blockContainerExec?: pulumi.Input<boolean>;
    blockDisallowedImages?: pulumi.Input<boolean>;
    blockFilelessExec?: pulumi.Input<boolean>;
    blockNonCompliantWorkloads?: pulumi.Input<boolean>;
    blockNonK8sContainers?: pulumi.Input<boolean>;
    /**
     * Bypass scope configuration.
     */
    bypassScopes?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyBypassScope>[]>;
    containerExec?: pulumi.Input<inputs.FunctionRuntimePolicyContainerExec>;
    created?: pulumi.Input<string>;
    cve?: pulumi.Input<string>;
    defaultSecurityProfile?: pulumi.Input<string>;
    /**
     * The description of the function runtime policy
     */
    description?: pulumi.Input<string>;
    digest?: pulumi.Input<string>;
    /**
     * Drift prevention configuration.
     */
    driftPreventions?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyDriftPrevention>[]>;
    enableCryptoMiningDns?: pulumi.Input<boolean>;
    enableForkGuard?: pulumi.Input<boolean>;
    enableIpReputation?: pulumi.Input<boolean>;
    enablePortScanProtection?: pulumi.Input<boolean>;
    /**
     * Indicates if the runtime policy is enabled or not.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Indicates that policy should effect container execution (not just for audit).
     */
    enforce?: pulumi.Input<boolean>;
    /**
     * Indicates the number of days after which the runtime policy will be changed to enforce mode.
     */
    enforceAfterDays?: pulumi.Input<number>;
    enforceSchedulerAddedOn?: pulumi.Input<number>;
    /**
     * List of excluded application scopes.
     */
    excludeApplicationScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Executable blacklist configuration.
     */
    executableBlacklists?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyExecutableBlacklist>[]>;
    failedKubernetesChecks?: pulumi.Input<inputs.FunctionRuntimePolicyFailedKubernetesChecks>;
    fileBlock?: pulumi.Input<inputs.FunctionRuntimePolicyFileBlock>;
    /**
     * Configuration for file integrity monitoring.
     */
    fileIntegrityMonitorings?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyFileIntegrityMonitoring>[]>;
    forkGuardProcessLimit?: pulumi.Input<number>;
    /**
     * Honeypot User ID (Access Key)
     */
    honeypotAccessKey?: pulumi.Input<string>;
    /**
     * List of options to apply the honeypot on (Environment Vairable, Layer, File)
     */
    honeypotApplyOns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Honeypot User Password (Secret Key)
     */
    honeypotSecretKey?: pulumi.Input<string>;
    /**
     * Serverless application name
     */
    honeypotServerlessAppName?: pulumi.Input<string>;
    imageName?: pulumi.Input<string>;
    isAuditChecked?: pulumi.Input<boolean>;
    isAutoGenerated?: pulumi.Input<boolean>;
    isOotbPolicy?: pulumi.Input<boolean>;
    lastupdate?: pulumi.Input<number>;
    /**
     * Container privileges configuration.
     */
    limitContainerPrivileges?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyLimitContainerPrivilege>[]>;
    linuxCapabilities?: pulumi.Input<inputs.FunctionRuntimePolicyLinuxCapabilities>;
    /**
     * Configuration for Real-Time Malware Protection.
     */
    malwareScanOptions?: pulumi.Input<inputs.FunctionRuntimePolicyMalwareScanOptions>;
    /**
     * Name of the function runtime policy
     */
    name?: pulumi.Input<string>;
    noNewPrivileges?: pulumi.Input<boolean>;
    onlyRegisteredImages?: pulumi.Input<boolean>;
    packageBlock?: pulumi.Input<inputs.FunctionRuntimePolicyPackageBlock>;
    permission?: pulumi.Input<string>;
    portBlock?: pulumi.Input<inputs.FunctionRuntimePolicyPortBlock>;
    readonlyFiles?: pulumi.Input<inputs.FunctionRuntimePolicyReadonlyFiles>;
    readonlyRegistry?: pulumi.Input<inputs.FunctionRuntimePolicyReadonlyRegistry>;
    registry?: pulumi.Input<string>;
    registryAccessMonitoring?: pulumi.Input<inputs.FunctionRuntimePolicyRegistryAccessMonitoring>;
    repoName?: pulumi.Input<string>;
    resourceName?: pulumi.Input<string>;
    resourceType?: pulumi.Input<string>;
    /**
     * Restricted volumes configuration.
     */
    restrictedVolumes?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyRestrictedVolume>[]>;
    reverseShell?: pulumi.Input<inputs.FunctionRuntimePolicyReverseShell>;
    runtimeMode?: pulumi.Input<number>;
    runtimeType?: pulumi.Input<string>;
    /**
     * Logical expression of how to compute the dependency of the scope variables.
     */
    scopeExpression?: pulumi.Input<string>;
    /**
     * List of scope attributes.
     */
    scopeVariables?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyScopeVariable>[]>;
    /**
     * Scope configuration.
     */
    scopes?: pulumi.Input<pulumi.Input<inputs.FunctionRuntimePolicyScope>[]>;
    systemIntegrityProtection?: pulumi.Input<inputs.FunctionRuntimePolicySystemIntegrityProtection>;
    tripwire?: pulumi.Input<inputs.FunctionRuntimePolicyTripwire>;
    type?: pulumi.Input<string>;
    updated?: pulumi.Input<string>;
    version?: pulumi.Input<string>;
    vpatchVersion?: pulumi.Input<string>;
    whitelistedOsUsers?: pulumi.Input<inputs.FunctionRuntimePolicyWhitelistedOsUsers>;
}
