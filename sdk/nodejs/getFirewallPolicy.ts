// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export function getFirewallPolicy(args: GetFirewallPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetFirewallPolicyResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aquasec:index/getFirewallPolicy:getFirewallPolicy", {
        "name": args.name,
        "outboundNetworks": args.outboundNetworks,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirewallPolicy.
 */
export interface GetFirewallPolicyArgs {
    /**
     * Name of the policy, no longer than 128 characters and no slash characters.
     */
    name: string;
    /**
     * Information on network addresses that are allowed to receive data or requests.
     */
    outboundNetworks?: inputs.GetFirewallPolicyOutboundNetwork[];
}

/**
 * A collection of values returned by getFirewallPolicy.
 */
export interface GetFirewallPolicyResult {
    /**
     * Username of the account that created the policy.
     */
    readonly author: string;
    /**
     * Indicates whether policy includes blocking incoming 'ping' requests.
     */
    readonly blockIcmpPing: boolean;
    /**
     * Indicates whether policy includes blocking metadata services of the cloud.
     */
    readonly blockMetadataService: boolean;
    /**
     * Description of the Firewall Policy.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Information on network addresses that are allowed to pass in data or requests.
     */
    readonly inboundNetworks: outputs.GetFirewallPolicyInboundNetwork[];
    /**
     * Timestamp of the last update in Unix time format.
     */
    readonly lastupdate: number;
    /**
     * Name of the policy, no longer than 128 characters and no slash characters.
     */
    readonly name: string;
    /**
     * Information on network addresses that are allowed to receive data or requests.
     */
    readonly outboundNetworks?: outputs.GetFirewallPolicyOutboundNetwork[];
    /**
     * Indicates the class of protection defined by the firewall.
     */
    readonly type: string;
    /**
     * Aqua version functionality supported
     */
    readonly version: string;
}

export function getFirewallPolicyOutput(args: GetFirewallPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFirewallPolicyResult> {
    return pulumi.output(args).apply(a => getFirewallPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getFirewallPolicy.
 */
export interface GetFirewallPolicyOutputArgs {
    /**
     * Name of the policy, no longer than 128 characters and no slash characters.
     */
    name: pulumi.Input<string>;
    /**
     * Information on network addresses that are allowed to receive data or requests.
     */
    outboundNetworks?: pulumi.Input<pulumi.Input<inputs.GetFirewallPolicyOutboundNetworkArgs>[]>;
}
