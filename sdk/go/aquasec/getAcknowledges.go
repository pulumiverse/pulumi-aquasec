// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The data source `getAcknowledges` provides a method to query all acknowledges within the Aqua
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
//			acknowledgesAcknowledges, err := aquasec.GetAcknowledges(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("acknowledges", acknowledgesAcknowledges)
//			return nil
//		})
//	}
//
// ```
func GetAcknowledges(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetAcknowledgesResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetAcknowledgesResult
	err := ctx.Invoke("aquasec:index/getAcknowledges:getAcknowledges", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAcknowledges.
type GetAcknowledgesResult struct {
	// A list of existing security acknowledges.
	Acknowledges []GetAcknowledgesAcknowledge `pulumi:"acknowledges"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}
