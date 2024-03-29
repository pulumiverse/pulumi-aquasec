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
 * const rolesMappingSaas = aquasec.getRolesMappingSaas({});
 * export const roleMapping = rolesMappingSaas.then(rolesMappingSaas => rolesMappingSaas.rolesMappings);
 * ```
 */
export function getRolesMappingSaas(opts?: pulumi.InvokeOptions): Promise<GetRolesMappingSaasResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aquasec:index/getRolesMappingSaas:getRolesMappingSaas", {
    }, opts);
}

/**
 * A collection of values returned by getRolesMappingSaas.
 */
export interface GetRolesMappingSaasResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly rolesMappings: outputs.GetRolesMappingSaasRolesMapping[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aquasec from "@pulumi/aquasec";
 *
 * const rolesMappingSaas = aquasec.getRolesMappingSaas({});
 * export const roleMapping = rolesMappingSaas.then(rolesMappingSaas => rolesMappingSaas.rolesMappings);
 * ```
 */
export function getRolesMappingSaasOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetRolesMappingSaasResult> {
    return pulumi.output(getRolesMappingSaas(opts))
}
