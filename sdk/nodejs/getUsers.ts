// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The data source `aquasec.getUsers` provides a method to query all users within the Aqua users database. The fields returned from this query are detailed in the Schema section below.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aquasec from "@pulumi/aquasec";
 *
 * const users = aquasec.getUsers({});
 * export const firstUserName = users.then(users => users.users?.[0]?.name);
 * ```
 */
export function getUsers(opts?: pulumi.InvokeOptions): Promise<GetUsersResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aquasec:index/getUsers:getUsers", {
    }, opts);
}

/**
 * A collection of values returned by getUsers.
 */
export interface GetUsersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly users: outputs.GetUsersUser[];
}
/**
 * The data source `aquasec.getUsers` provides a method to query all users within the Aqua users database. The fields returned from this query are detailed in the Schema section below.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aquasec from "@pulumi/aquasec";
 *
 * const users = aquasec.getUsers({});
 * export const firstUserName = users.then(users => users.users?.[0]?.name);
 * ```
 */
export function getUsersOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetUsersResult> {
    return pulumi.output(getUsers(opts))
}
