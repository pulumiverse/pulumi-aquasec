// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
//			rolesMappingSaas, err := aquasec.GetRolesMappingSaas(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("roleMapping", rolesMappingSaas.RolesMappings)
//			return nil
//		})
//	}
//
// ```
func GetRolesMappingSaas(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetRolesMappingSaasResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetRolesMappingSaasResult
	err := ctx.Invoke("aquasec:index/getRolesMappingSaas:getRolesMappingSaas", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getRolesMappingSaas.
type GetRolesMappingSaasResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id            string                            `pulumi:"id"`
	RolesMappings []GetRolesMappingSaasRolesMapping `pulumi:"rolesMappings"`
}
