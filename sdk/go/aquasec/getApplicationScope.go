// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"context"
	"reflect"

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
//			_default, err := aquasec.LookupApplicationScope(ctx, &aquasec.LookupApplicationScopeArgs{
//				Name: "Global",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("scopes", _default)
//			return nil
//		})
//	}
//
// ```
func LookupApplicationScope(ctx *pulumi.Context, args *LookupApplicationScopeArgs, opts ...pulumi.InvokeOption) (*LookupApplicationScopeResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupApplicationScopeResult
	err := ctx.Invoke("aquasec:index/getApplicationScope:getApplicationScope", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplicationScope.
type LookupApplicationScopeArgs struct {
	// Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
	Categories []GetApplicationScopeCategory `pulumi:"categories"`
	// Name of an application scope.
	Name string `pulumi:"name"`
}

// A collection of values returned by getApplicationScope.
type LookupApplicationScopeResult struct {
	// Username of the account that created the service.
	Author string `pulumi:"author"`
	// Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
	Categories []GetApplicationScopeCategory `pulumi:"categories"`
	// Description of the application scope.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of an application scope.
	Name string `pulumi:"name"`
	// Name of an application scope.
	OwnerEmail string `pulumi:"ownerEmail"`
}

func LookupApplicationScopeOutput(ctx *pulumi.Context, args LookupApplicationScopeOutputArgs, opts ...pulumi.InvokeOption) LookupApplicationScopeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupApplicationScopeResult, error) {
			args := v.(LookupApplicationScopeArgs)
			r, err := LookupApplicationScope(ctx, &args, opts...)
			var s LookupApplicationScopeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupApplicationScopeResultOutput)
}

// A collection of arguments for invoking getApplicationScope.
type LookupApplicationScopeOutputArgs struct {
	// Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
	Categories GetApplicationScopeCategoryArrayInput `pulumi:"categories"`
	// Name of an application scope.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupApplicationScopeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationScopeArgs)(nil)).Elem()
}

// A collection of values returned by getApplicationScope.
type LookupApplicationScopeResultOutput struct{ *pulumi.OutputState }

func (LookupApplicationScopeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationScopeResult)(nil)).Elem()
}

func (o LookupApplicationScopeResultOutput) ToLookupApplicationScopeResultOutput() LookupApplicationScopeResultOutput {
	return o
}

func (o LookupApplicationScopeResultOutput) ToLookupApplicationScopeResultOutputWithContext(ctx context.Context) LookupApplicationScopeResultOutput {
	return o
}

// Username of the account that created the service.
func (o LookupApplicationScopeResultOutput) Author() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationScopeResult) string { return v.Author }).(pulumi.StringOutput)
}

// Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
func (o LookupApplicationScopeResultOutput) Categories() GetApplicationScopeCategoryArrayOutput {
	return o.ApplyT(func(v LookupApplicationScopeResult) []GetApplicationScopeCategory { return v.Categories }).(GetApplicationScopeCategoryArrayOutput)
}

// Description of the application scope.
func (o LookupApplicationScopeResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationScopeResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupApplicationScopeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationScopeResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of an application scope.
func (o LookupApplicationScopeResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationScopeResult) string { return v.Name }).(pulumi.StringOutput)
}

// Name of an application scope.
func (o LookupApplicationScopeResultOutput) OwnerEmail() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationScopeResult) string { return v.OwnerEmail }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplicationScopeResultOutput{})
}
