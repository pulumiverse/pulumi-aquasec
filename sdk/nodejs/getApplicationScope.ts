// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aquasec from "@pulumi/aquasec";
 *
 * const default = aquasec.getApplicationScope({
 *     name: "Global",
 * });
 * export const scopes = _default;
 * ```
 */
export function getApplicationScope(args: GetApplicationScopeArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationScopeResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aquasec:index/getApplicationScope:getApplicationScope", {
        "categories": args.categories,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplicationScope.
 */
export interface GetApplicationScopeArgs {
    /**
     * Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
     */
    categories?: inputs.GetApplicationScopeCategory[];
    /**
     * Name of an application scope.
     */
    name: string;
}

/**
 * A collection of values returned by getApplicationScope.
 */
export interface GetApplicationScopeResult {
    /**
     * Username of the account that created the service.
     */
    readonly author: string;
    /**
     * Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
     */
    readonly categories?: outputs.GetApplicationScopeCategory[];
    /**
     * Description of the application scope.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of an application scope.
     */
    readonly name: string;
    /**
     * Name of an application scope.
     */
    readonly ownerEmail: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aquasec from "@pulumi/aquasec";
 *
 * const default = aquasec.getApplicationScope({
 *     name: "Global",
 * });
 * export const scopes = _default;
 * ```
 */
export function getApplicationScopeOutput(args: GetApplicationScopeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplicationScopeResult> {
    return pulumi.output(args).apply((a: any) => getApplicationScope(a, opts))
}

/**
 * A collection of arguments for invoking getApplicationScope.
 */
export interface GetApplicationScopeOutputArgs {
    /**
     * Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
     */
    categories?: pulumi.Input<pulumi.Input<inputs.GetApplicationScopeCategoryArgs>[]>;
    /**
     * Name of an application scope.
     */
    name: pulumi.Input<string>;
}
