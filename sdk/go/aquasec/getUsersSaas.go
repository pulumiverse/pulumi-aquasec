// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The data source `getUsersSaas` provides a method to query all saas users within the Aqua users management. The fields returned from this query are detailed in the Schema section below.
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
//			_, err := aquasec.GetUsers(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstUserEmail", data.Aquasec_users_saas.Users.Users[0].Email)
//			return nil
//		})
//	}
//
// ```
func GetUsersSaas(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetUsersSaasResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetUsersSaasResult
	err := ctx.Invoke("aquasec:index/getUsersSaas:getUsersSaas", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getUsersSaas.
type GetUsersSaasResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id    string             `pulumi:"id"`
	Users []GetUsersSaasUser `pulumi:"users"`
}
