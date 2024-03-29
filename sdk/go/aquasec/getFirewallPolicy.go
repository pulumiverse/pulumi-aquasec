// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumiverse/pulumi-aquasec/sdk/go/aquasec/internal"
)

func LookupFirewallPolicy(ctx *pulumi.Context, args *LookupFirewallPolicyArgs, opts ...pulumi.InvokeOption) (*LookupFirewallPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFirewallPolicyResult
	err := ctx.Invoke("aquasec:index/getFirewallPolicy:getFirewallPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFirewallPolicy.
type LookupFirewallPolicyArgs struct {
	// Name of the policy, no longer than 128 characters and no slash characters.
	Name string `pulumi:"name"`
	// Information on network addresses that are allowed to receive data or requests.
	OutboundNetworks []GetFirewallPolicyOutboundNetwork `pulumi:"outboundNetworks"`
}

// A collection of values returned by getFirewallPolicy.
type LookupFirewallPolicyResult struct {
	// Username of the account that created the policy.
	Author string `pulumi:"author"`
	// Indicates whether policy includes blocking incoming 'ping' requests.
	BlockIcmpPing bool `pulumi:"blockIcmpPing"`
	// Indicates whether policy includes blocking metadata services of the cloud.
	BlockMetadataService bool `pulumi:"blockMetadataService"`
	// Description of the Firewall Policy.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Information on network addresses that are allowed to pass in data or requests.
	InboundNetworks []GetFirewallPolicyInboundNetwork `pulumi:"inboundNetworks"`
	// Timestamp of the last update in Unix time format.
	Lastupdate int `pulumi:"lastupdate"`
	// Name of the policy, no longer than 128 characters and no slash characters.
	Name string `pulumi:"name"`
	// Information on network addresses that are allowed to receive data or requests.
	OutboundNetworks []GetFirewallPolicyOutboundNetwork `pulumi:"outboundNetworks"`
	// Indicates the class of protection defined by the firewall.
	Type string `pulumi:"type"`
	// Aqua version functionality supported
	Version string `pulumi:"version"`
}

func LookupFirewallPolicyOutput(ctx *pulumi.Context, args LookupFirewallPolicyOutputArgs, opts ...pulumi.InvokeOption) LookupFirewallPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFirewallPolicyResult, error) {
			args := v.(LookupFirewallPolicyArgs)
			r, err := LookupFirewallPolicy(ctx, &args, opts...)
			var s LookupFirewallPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFirewallPolicyResultOutput)
}

// A collection of arguments for invoking getFirewallPolicy.
type LookupFirewallPolicyOutputArgs struct {
	// Name of the policy, no longer than 128 characters and no slash characters.
	Name pulumi.StringInput `pulumi:"name"`
	// Information on network addresses that are allowed to receive data or requests.
	OutboundNetworks GetFirewallPolicyOutboundNetworkArrayInput `pulumi:"outboundNetworks"`
}

func (LookupFirewallPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFirewallPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getFirewallPolicy.
type LookupFirewallPolicyResultOutput struct{ *pulumi.OutputState }

func (LookupFirewallPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFirewallPolicyResult)(nil)).Elem()
}

func (o LookupFirewallPolicyResultOutput) ToLookupFirewallPolicyResultOutput() LookupFirewallPolicyResultOutput {
	return o
}

func (o LookupFirewallPolicyResultOutput) ToLookupFirewallPolicyResultOutputWithContext(ctx context.Context) LookupFirewallPolicyResultOutput {
	return o
}

// Username of the account that created the policy.
func (o LookupFirewallPolicyResultOutput) Author() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) string { return v.Author }).(pulumi.StringOutput)
}

// Indicates whether policy includes blocking incoming 'ping' requests.
func (o LookupFirewallPolicyResultOutput) BlockIcmpPing() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) bool { return v.BlockIcmpPing }).(pulumi.BoolOutput)
}

// Indicates whether policy includes blocking metadata services of the cloud.
func (o LookupFirewallPolicyResultOutput) BlockMetadataService() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) bool { return v.BlockMetadataService }).(pulumi.BoolOutput)
}

// Description of the Firewall Policy.
func (o LookupFirewallPolicyResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFirewallPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// Information on network addresses that are allowed to pass in data or requests.
func (o LookupFirewallPolicyResultOutput) InboundNetworks() GetFirewallPolicyInboundNetworkArrayOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) []GetFirewallPolicyInboundNetwork { return v.InboundNetworks }).(GetFirewallPolicyInboundNetworkArrayOutput)
}

// Timestamp of the last update in Unix time format.
func (o LookupFirewallPolicyResultOutput) Lastupdate() pulumi.IntOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) int { return v.Lastupdate }).(pulumi.IntOutput)
}

// Name of the policy, no longer than 128 characters and no slash characters.
func (o LookupFirewallPolicyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) string { return v.Name }).(pulumi.StringOutput)
}

// Information on network addresses that are allowed to receive data or requests.
func (o LookupFirewallPolicyResultOutput) OutboundNetworks() GetFirewallPolicyOutboundNetworkArrayOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) []GetFirewallPolicyOutboundNetwork { return v.OutboundNetworks }).(GetFirewallPolicyOutboundNetworkArrayOutput)
}

// Indicates the class of protection defined by the firewall.
func (o LookupFirewallPolicyResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) string { return v.Type }).(pulumi.StringOutput)
}

// Aqua version functionality supported
func (o LookupFirewallPolicyResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallPolicyResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFirewallPolicyResultOutput{})
}
