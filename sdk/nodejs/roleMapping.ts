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
 * import * as aquasec from "@pulumiverse/aquasec";
 *
 * const roleMappingRoleMapping = new aquasec.RoleMapping("roleMappingRoleMapping", {saml: {
 *     roleMapping: {
 *         Administrator: "group1",
 *         Scanner: "group2|group3",
 *     },
 * }});
 * export const roleMapping = roleMappingRoleMapping;
 * ```
 */
export class RoleMapping extends pulumi.CustomResource {
    /**
     * Get an existing RoleMapping resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleMappingState, opts?: pulumi.CustomResourceOptions): RoleMapping {
        return new RoleMapping(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aquasec:index/roleMapping:RoleMapping';

    /**
     * Returns true if the given object is an instance of RoleMapping.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoleMapping {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoleMapping.__pulumiType;
    }

    /**
     * LDAP Authentication
     */
    public readonly ldap!: pulumi.Output<outputs.RoleMappingLdap | undefined>;
    /**
     * Oauth2 Authentication
     */
    public readonly oauth2!: pulumi.Output<outputs.RoleMappingOauth2 | undefined>;
    /**
     * OpenId Authentication
     */
    public readonly openid!: pulumi.Output<outputs.RoleMappingOpenid | undefined>;
    /**
     * SAML Authentication
     */
    public readonly saml!: pulumi.Output<outputs.RoleMappingSaml | undefined>;

    /**
     * Create a RoleMapping resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RoleMappingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoleMappingArgs | RoleMappingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoleMappingState | undefined;
            resourceInputs["ldap"] = state ? state.ldap : undefined;
            resourceInputs["oauth2"] = state ? state.oauth2 : undefined;
            resourceInputs["openid"] = state ? state.openid : undefined;
            resourceInputs["saml"] = state ? state.saml : undefined;
        } else {
            const args = argsOrState as RoleMappingArgs | undefined;
            resourceInputs["ldap"] = args ? args.ldap : undefined;
            resourceInputs["oauth2"] = args ? args.oauth2 : undefined;
            resourceInputs["openid"] = args ? args.openid : undefined;
            resourceInputs["saml"] = args ? args.saml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RoleMapping.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoleMapping resources.
 */
export interface RoleMappingState {
    /**
     * LDAP Authentication
     */
    ldap?: pulumi.Input<inputs.RoleMappingLdap>;
    /**
     * Oauth2 Authentication
     */
    oauth2?: pulumi.Input<inputs.RoleMappingOauth2>;
    /**
     * OpenId Authentication
     */
    openid?: pulumi.Input<inputs.RoleMappingOpenid>;
    /**
     * SAML Authentication
     */
    saml?: pulumi.Input<inputs.RoleMappingSaml>;
}

/**
 * The set of arguments for constructing a RoleMapping resource.
 */
export interface RoleMappingArgs {
    /**
     * LDAP Authentication
     */
    ldap?: pulumi.Input<inputs.RoleMappingLdap>;
    /**
     * Oauth2 Authentication
     */
    oauth2?: pulumi.Input<inputs.RoleMappingOauth2>;
    /**
     * OpenId Authentication
     */
    openid?: pulumi.Input<inputs.RoleMappingOpenid>;
    /**
     * SAML Authentication
     */
    saml?: pulumi.Input<inputs.RoleMappingSaml>;
}
