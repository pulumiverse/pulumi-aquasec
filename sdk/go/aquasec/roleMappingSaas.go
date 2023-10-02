// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
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
//			rolesMappingSaasRoleMappingSaas, err := aquasec.NewRoleMappingSaas(ctx, "rolesMappingSaasRoleMappingSaas", &aquasec.RoleMappingSaasArgs{
//				SamlGroups: pulumi.StringArray{
//					pulumi.String("group1"),
//					pulumi.String("group2"),
//				},
//				CspRole: pulumi.String("Administrator"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("rolesMappingSaas", rolesMappingSaasRoleMappingSaas)
//			return nil
//		})
//	}
//
// ```
type RoleMappingSaas struct {
	pulumi.CustomResourceState

	AccountId     pulumi.IntOutput         `pulumi:"accountId"`
	Created       pulumi.StringOutput      `pulumi:"created"`
	CspRole       pulumi.StringOutput      `pulumi:"cspRole"`
	RoleMappingId pulumi.IntOutput         `pulumi:"roleMappingId"`
	SamlGroups    pulumi.StringArrayOutput `pulumi:"samlGroups"`
}

// NewRoleMappingSaas registers a new resource with the given unique name, arguments, and options.
func NewRoleMappingSaas(ctx *pulumi.Context,
	name string, args *RoleMappingSaasArgs, opts ...pulumi.ResourceOption) (*RoleMappingSaas, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CspRole == nil {
		return nil, errors.New("invalid value for required argument 'CspRole'")
	}
	if args.SamlGroups == nil {
		return nil, errors.New("invalid value for required argument 'SamlGroups'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RoleMappingSaas
	err := ctx.RegisterResource("aquasec:index/roleMappingSaas:RoleMappingSaas", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoleMappingSaas gets an existing RoleMappingSaas resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoleMappingSaas(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoleMappingSaasState, opts ...pulumi.ResourceOption) (*RoleMappingSaas, error) {
	var resource RoleMappingSaas
	err := ctx.ReadResource("aquasec:index/roleMappingSaas:RoleMappingSaas", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoleMappingSaas resources.
type roleMappingSaasState struct {
	AccountId     *int     `pulumi:"accountId"`
	Created       *string  `pulumi:"created"`
	CspRole       *string  `pulumi:"cspRole"`
	RoleMappingId *int     `pulumi:"roleMappingId"`
	SamlGroups    []string `pulumi:"samlGroups"`
}

type RoleMappingSaasState struct {
	AccountId     pulumi.IntPtrInput
	Created       pulumi.StringPtrInput
	CspRole       pulumi.StringPtrInput
	RoleMappingId pulumi.IntPtrInput
	SamlGroups    pulumi.StringArrayInput
}

func (RoleMappingSaasState) ElementType() reflect.Type {
	return reflect.TypeOf((*roleMappingSaasState)(nil)).Elem()
}

type roleMappingSaasArgs struct {
	CspRole    string   `pulumi:"cspRole"`
	SamlGroups []string `pulumi:"samlGroups"`
}

// The set of arguments for constructing a RoleMappingSaas resource.
type RoleMappingSaasArgs struct {
	CspRole    pulumi.StringInput
	SamlGroups pulumi.StringArrayInput
}

func (RoleMappingSaasArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*roleMappingSaasArgs)(nil)).Elem()
}

type RoleMappingSaasInput interface {
	pulumi.Input

	ToRoleMappingSaasOutput() RoleMappingSaasOutput
	ToRoleMappingSaasOutputWithContext(ctx context.Context) RoleMappingSaasOutput
}

func (*RoleMappingSaas) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleMappingSaas)(nil)).Elem()
}

func (i *RoleMappingSaas) ToRoleMappingSaasOutput() RoleMappingSaasOutput {
	return i.ToRoleMappingSaasOutputWithContext(context.Background())
}

func (i *RoleMappingSaas) ToRoleMappingSaasOutputWithContext(ctx context.Context) RoleMappingSaasOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleMappingSaasOutput)
}

func (i *RoleMappingSaas) ToOutput(ctx context.Context) pulumix.Output[*RoleMappingSaas] {
	return pulumix.Output[*RoleMappingSaas]{
		OutputState: i.ToRoleMappingSaasOutputWithContext(ctx).OutputState,
	}
}

// RoleMappingSaasArrayInput is an input type that accepts RoleMappingSaasArray and RoleMappingSaasArrayOutput values.
// You can construct a concrete instance of `RoleMappingSaasArrayInput` via:
//
//	RoleMappingSaasArray{ RoleMappingSaasArgs{...} }
type RoleMappingSaasArrayInput interface {
	pulumi.Input

	ToRoleMappingSaasArrayOutput() RoleMappingSaasArrayOutput
	ToRoleMappingSaasArrayOutputWithContext(context.Context) RoleMappingSaasArrayOutput
}

type RoleMappingSaasArray []RoleMappingSaasInput

func (RoleMappingSaasArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleMappingSaas)(nil)).Elem()
}

func (i RoleMappingSaasArray) ToRoleMappingSaasArrayOutput() RoleMappingSaasArrayOutput {
	return i.ToRoleMappingSaasArrayOutputWithContext(context.Background())
}

func (i RoleMappingSaasArray) ToRoleMappingSaasArrayOutputWithContext(ctx context.Context) RoleMappingSaasArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleMappingSaasArrayOutput)
}

func (i RoleMappingSaasArray) ToOutput(ctx context.Context) pulumix.Output[[]*RoleMappingSaas] {
	return pulumix.Output[[]*RoleMappingSaas]{
		OutputState: i.ToRoleMappingSaasArrayOutputWithContext(ctx).OutputState,
	}
}

// RoleMappingSaasMapInput is an input type that accepts RoleMappingSaasMap and RoleMappingSaasMapOutput values.
// You can construct a concrete instance of `RoleMappingSaasMapInput` via:
//
//	RoleMappingSaasMap{ "key": RoleMappingSaasArgs{...} }
type RoleMappingSaasMapInput interface {
	pulumi.Input

	ToRoleMappingSaasMapOutput() RoleMappingSaasMapOutput
	ToRoleMappingSaasMapOutputWithContext(context.Context) RoleMappingSaasMapOutput
}

type RoleMappingSaasMap map[string]RoleMappingSaasInput

func (RoleMappingSaasMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleMappingSaas)(nil)).Elem()
}

func (i RoleMappingSaasMap) ToRoleMappingSaasMapOutput() RoleMappingSaasMapOutput {
	return i.ToRoleMappingSaasMapOutputWithContext(context.Background())
}

func (i RoleMappingSaasMap) ToRoleMappingSaasMapOutputWithContext(ctx context.Context) RoleMappingSaasMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RoleMappingSaasMapOutput)
}

func (i RoleMappingSaasMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*RoleMappingSaas] {
	return pulumix.Output[map[string]*RoleMappingSaas]{
		OutputState: i.ToRoleMappingSaasMapOutputWithContext(ctx).OutputState,
	}
}

type RoleMappingSaasOutput struct{ *pulumi.OutputState }

func (RoleMappingSaasOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RoleMappingSaas)(nil)).Elem()
}

func (o RoleMappingSaasOutput) ToRoleMappingSaasOutput() RoleMappingSaasOutput {
	return o
}

func (o RoleMappingSaasOutput) ToRoleMappingSaasOutputWithContext(ctx context.Context) RoleMappingSaasOutput {
	return o
}

func (o RoleMappingSaasOutput) ToOutput(ctx context.Context) pulumix.Output[*RoleMappingSaas] {
	return pulumix.Output[*RoleMappingSaas]{
		OutputState: o.OutputState,
	}
}

func (o RoleMappingSaasOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *RoleMappingSaas) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

func (o RoleMappingSaasOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleMappingSaas) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

func (o RoleMappingSaasOutput) CspRole() pulumi.StringOutput {
	return o.ApplyT(func(v *RoleMappingSaas) pulumi.StringOutput { return v.CspRole }).(pulumi.StringOutput)
}

func (o RoleMappingSaasOutput) RoleMappingId() pulumi.IntOutput {
	return o.ApplyT(func(v *RoleMappingSaas) pulumi.IntOutput { return v.RoleMappingId }).(pulumi.IntOutput)
}

func (o RoleMappingSaasOutput) SamlGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RoleMappingSaas) pulumi.StringArrayOutput { return v.SamlGroups }).(pulumi.StringArrayOutput)
}

type RoleMappingSaasArrayOutput struct{ *pulumi.OutputState }

func (RoleMappingSaasArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RoleMappingSaas)(nil)).Elem()
}

func (o RoleMappingSaasArrayOutput) ToRoleMappingSaasArrayOutput() RoleMappingSaasArrayOutput {
	return o
}

func (o RoleMappingSaasArrayOutput) ToRoleMappingSaasArrayOutputWithContext(ctx context.Context) RoleMappingSaasArrayOutput {
	return o
}

func (o RoleMappingSaasArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*RoleMappingSaas] {
	return pulumix.Output[[]*RoleMappingSaas]{
		OutputState: o.OutputState,
	}
}

func (o RoleMappingSaasArrayOutput) Index(i pulumi.IntInput) RoleMappingSaasOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RoleMappingSaas {
		return vs[0].([]*RoleMappingSaas)[vs[1].(int)]
	}).(RoleMappingSaasOutput)
}

type RoleMappingSaasMapOutput struct{ *pulumi.OutputState }

func (RoleMappingSaasMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RoleMappingSaas)(nil)).Elem()
}

func (o RoleMappingSaasMapOutput) ToRoleMappingSaasMapOutput() RoleMappingSaasMapOutput {
	return o
}

func (o RoleMappingSaasMapOutput) ToRoleMappingSaasMapOutputWithContext(ctx context.Context) RoleMappingSaasMapOutput {
	return o
}

func (o RoleMappingSaasMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*RoleMappingSaas] {
	return pulumix.Output[map[string]*RoleMappingSaas]{
		OutputState: o.OutputState,
	}
}

func (o RoleMappingSaasMapOutput) MapIndex(k pulumi.StringInput) RoleMappingSaasOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RoleMappingSaas {
		return vs[0].(map[string]*RoleMappingSaas)[vs[1].(string)]
	}).(RoleMappingSaasOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RoleMappingSaasInput)(nil)).Elem(), &RoleMappingSaas{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleMappingSaasArrayInput)(nil)).Elem(), RoleMappingSaasArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RoleMappingSaasMapInput)(nil)).Elem(), RoleMappingSaasMap{})
	pulumi.RegisterOutputType(RoleMappingSaasOutput{})
	pulumi.RegisterOutputType(RoleMappingSaasArrayOutput{})
	pulumi.RegisterOutputType(RoleMappingSaasMapOutput{})
}
