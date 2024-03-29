// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumiverse/pulumi-aquasec/sdk/go/aquasec/internal"
)

// The data source `getGateways` provides a method to query all gateways within the Aqua
//
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
//			testgateway, err := aquasec.GetGateways(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("gatewayData", testgateway)
//			ctx.Export("gatewayName", testgateway.Gateways[0].Id)
//			ctx.Export("gatewayStatus", testgateway.Gateways[0].Status)
//			ctx.Export("gatewayDescription", testgateway.Gateways[0].Description)
//			ctx.Export("gatewayVersion", testgateway.Gateways[0].Version)
//			ctx.Export("gatewayHostname", testgateway.Gateways[0].Hostname)
//			ctx.Export("gatewayGrpcAddress", testgateway.Gateways[0].GrpcAddress)
//			return nil
//		})
//	}
//
// ```
func GetGateways(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetGatewaysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGatewaysResult
	err := ctx.Invoke("aquasec:index/getGateways:getGateways", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getGateways.
type GetGatewaysResult struct {
	// A list of existing gateways' parameters.
	Gateways []GetGatewaysGateway `pulumi:"gateways"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetGatewaysOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetGatewaysResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetGatewaysResult, error) {
		r, err := GetGateways(ctx, opts...)
		var s GetGatewaysResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetGatewaysResultOutput)
}

// A collection of values returned by getGateways.
type GetGatewaysResultOutput struct{ *pulumi.OutputState }

func (GetGatewaysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewaysResult)(nil)).Elem()
}

func (o GetGatewaysResultOutput) ToGetGatewaysResultOutput() GetGatewaysResultOutput {
	return o
}

func (o GetGatewaysResultOutput) ToGetGatewaysResultOutputWithContext(ctx context.Context) GetGatewaysResultOutput {
	return o
}

// A list of existing gateways' parameters.
func (o GetGatewaysResultOutput) Gateways() GetGatewaysGatewayArrayOutput {
	return o.ApplyT(func(v GetGatewaysResult) []GetGatewaysGateway { return v.Gateways }).(GetGatewaysGatewayArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGatewaysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewaysResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGatewaysResultOutput{})
}
