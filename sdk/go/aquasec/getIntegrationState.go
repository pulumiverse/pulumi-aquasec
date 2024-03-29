// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumiverse/pulumi-aquasec/sdk/go/aquasec/internal"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumiverse/pulumi-aquasec/sdk/go/aquasec"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			integrationState, err := aquasec.GetIntegrationState(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("aquasecIntegrationState", integrationState)
//			return nil
//		})
//	}
//
// ```
func GetIntegrationState(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetIntegrationStateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIntegrationStateResult
	err := ctx.Invoke("aquasec:index/getIntegrationState:getIntegrationState", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getIntegrationState.
type GetIntegrationStateResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// OIDCSettings enabled status
	OidcSettings bool `pulumi:"oidcSettings"`
	// OpenIdSettings enabled status
	OpenidSettings bool `pulumi:"openidSettings"`
	// SAMLSettings enabled status
	SamlSettings bool `pulumi:"samlSettings"`
}

func GetIntegrationStateOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetIntegrationStateResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetIntegrationStateResult, error) {
		r, err := GetIntegrationState(ctx, opts...)
		var s GetIntegrationStateResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetIntegrationStateResultOutput)
}

// A collection of values returned by getIntegrationState.
type GetIntegrationStateResultOutput struct{ *pulumi.OutputState }

func (GetIntegrationStateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIntegrationStateResult)(nil)).Elem()
}

func (o GetIntegrationStateResultOutput) ToGetIntegrationStateResultOutput() GetIntegrationStateResultOutput {
	return o
}

func (o GetIntegrationStateResultOutput) ToGetIntegrationStateResultOutputWithContext(ctx context.Context) GetIntegrationStateResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetIntegrationStateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIntegrationStateResult) string { return v.Id }).(pulumi.StringOutput)
}

// OIDCSettings enabled status
func (o GetIntegrationStateResultOutput) OidcSettings() pulumi.BoolOutput {
	return o.ApplyT(func(v GetIntegrationStateResult) bool { return v.OidcSettings }).(pulumi.BoolOutput)
}

// OpenIdSettings enabled status
func (o GetIntegrationStateResultOutput) OpenidSettings() pulumi.BoolOutput {
	return o.ApplyT(func(v GetIntegrationStateResult) bool { return v.OpenidSettings }).(pulumi.BoolOutput)
}

// SAMLSettings enabled status
func (o GetIntegrationStateResultOutput) SamlSettings() pulumi.BoolOutput {
	return o.ApplyT(func(v GetIntegrationStateResult) bool { return v.SamlSettings }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIntegrationStateResultOutput{})
}
