// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
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
//			_, err := aquasec.NewAcknowledge(ctx, "acknowledge", &aquasec.AcknowledgeArgs{
//				Comment: pulumi.String("comment"),
//				Issues: aquasec.AcknowledgeIssueArray{
//					&aquasec.AcknowledgeIssueArgs{
//						DockerId:        pulumi.String(""),
//						ImageName:       pulumi.String("image:latest"),
//						IssueName:       pulumi.String("CVE-2022-1271"),
//						IssueType:       pulumi.String("vulnerability"),
//						RegistryName:    pulumi.String("registry"),
//						ResourceCpe:     pulumi.String("cpe:/a:gnu:gzip:1.10"),
//						ResourceName:    pulumi.String("gzip"),
//						ResourcePath:    pulumi.String("/usr/bin/gzip"),
//						ResourceType:    pulumi.String("executable"),
//						ResourceVersion: pulumi.String("1.10"),
//					},
//					&aquasec.AcknowledgeIssueArgs{
//						DockerId:        pulumi.String("docker-id"),
//						ImageName:       pulumi.String("image-name"),
//						IssueName:       pulumi.String("ALAS2-2021-1722"),
//						IssueType:       pulumi.String("vulnerability"),
//						RegistryName:    pulumi.String("registry-name"),
//						ResourceCpe:     pulumi.String("pkg:/amzn:2:nss-softokn:3.44.0-8.amzn2"),
//						ResourceName:    pulumi.String("nss-softokn"),
//						ResourcePath:    pulumi.String(""),
//						ResourceType:    pulumi.String("package"),
//						ResourceVersion: pulumi.String("3.44.0-8.amzn2"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Acknowledge struct {
	pulumi.CustomResourceState

	// A comment describing the reason for the acknowledgment
	Comment pulumi.StringOutput `pulumi:"comment"`
	// A list of existing security acknowledges.
	Issues AcknowledgeIssueArrayOutput `pulumi:"issues"`
}

// NewAcknowledge registers a new resource with the given unique name, arguments, and options.
func NewAcknowledge(ctx *pulumi.Context,
	name string, args *AcknowledgeArgs, opts ...pulumi.ResourceOption) (*Acknowledge, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Comment == nil {
		return nil, errors.New("invalid value for required argument 'Comment'")
	}
	if args.Issues == nil {
		return nil, errors.New("invalid value for required argument 'Issues'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Acknowledge
	err := ctx.RegisterResource("aquasec:index/acknowledge:Acknowledge", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAcknowledge gets an existing Acknowledge resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAcknowledge(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AcknowledgeState, opts ...pulumi.ResourceOption) (*Acknowledge, error) {
	var resource Acknowledge
	err := ctx.ReadResource("aquasec:index/acknowledge:Acknowledge", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Acknowledge resources.
type acknowledgeState struct {
	// A comment describing the reason for the acknowledgment
	Comment *string `pulumi:"comment"`
	// A list of existing security acknowledges.
	Issues []AcknowledgeIssue `pulumi:"issues"`
}

type AcknowledgeState struct {
	// A comment describing the reason for the acknowledgment
	Comment pulumi.StringPtrInput
	// A list of existing security acknowledges.
	Issues AcknowledgeIssueArrayInput
}

func (AcknowledgeState) ElementType() reflect.Type {
	return reflect.TypeOf((*acknowledgeState)(nil)).Elem()
}

type acknowledgeArgs struct {
	// A comment describing the reason for the acknowledgment
	Comment string `pulumi:"comment"`
	// A list of existing security acknowledges.
	Issues []AcknowledgeIssue `pulumi:"issues"`
}

// The set of arguments for constructing a Acknowledge resource.
type AcknowledgeArgs struct {
	// A comment describing the reason for the acknowledgment
	Comment pulumi.StringInput
	// A list of existing security acknowledges.
	Issues AcknowledgeIssueArrayInput
}

func (AcknowledgeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*acknowledgeArgs)(nil)).Elem()
}

type AcknowledgeInput interface {
	pulumi.Input

	ToAcknowledgeOutput() AcknowledgeOutput
	ToAcknowledgeOutputWithContext(ctx context.Context) AcknowledgeOutput
}

func (*Acknowledge) ElementType() reflect.Type {
	return reflect.TypeOf((**Acknowledge)(nil)).Elem()
}

func (i *Acknowledge) ToAcknowledgeOutput() AcknowledgeOutput {
	return i.ToAcknowledgeOutputWithContext(context.Background())
}

func (i *Acknowledge) ToAcknowledgeOutputWithContext(ctx context.Context) AcknowledgeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AcknowledgeOutput)
}

// AcknowledgeArrayInput is an input type that accepts AcknowledgeArray and AcknowledgeArrayOutput values.
// You can construct a concrete instance of `AcknowledgeArrayInput` via:
//
//	AcknowledgeArray{ AcknowledgeArgs{...} }
type AcknowledgeArrayInput interface {
	pulumi.Input

	ToAcknowledgeArrayOutput() AcknowledgeArrayOutput
	ToAcknowledgeArrayOutputWithContext(context.Context) AcknowledgeArrayOutput
}

type AcknowledgeArray []AcknowledgeInput

func (AcknowledgeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Acknowledge)(nil)).Elem()
}

func (i AcknowledgeArray) ToAcknowledgeArrayOutput() AcknowledgeArrayOutput {
	return i.ToAcknowledgeArrayOutputWithContext(context.Background())
}

func (i AcknowledgeArray) ToAcknowledgeArrayOutputWithContext(ctx context.Context) AcknowledgeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AcknowledgeArrayOutput)
}

// AcknowledgeMapInput is an input type that accepts AcknowledgeMap and AcknowledgeMapOutput values.
// You can construct a concrete instance of `AcknowledgeMapInput` via:
//
//	AcknowledgeMap{ "key": AcknowledgeArgs{...} }
type AcknowledgeMapInput interface {
	pulumi.Input

	ToAcknowledgeMapOutput() AcknowledgeMapOutput
	ToAcknowledgeMapOutputWithContext(context.Context) AcknowledgeMapOutput
}

type AcknowledgeMap map[string]AcknowledgeInput

func (AcknowledgeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Acknowledge)(nil)).Elem()
}

func (i AcknowledgeMap) ToAcknowledgeMapOutput() AcknowledgeMapOutput {
	return i.ToAcknowledgeMapOutputWithContext(context.Background())
}

func (i AcknowledgeMap) ToAcknowledgeMapOutputWithContext(ctx context.Context) AcknowledgeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AcknowledgeMapOutput)
}

type AcknowledgeOutput struct{ *pulumi.OutputState }

func (AcknowledgeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Acknowledge)(nil)).Elem()
}

func (o AcknowledgeOutput) ToAcknowledgeOutput() AcknowledgeOutput {
	return o
}

func (o AcknowledgeOutput) ToAcknowledgeOutputWithContext(ctx context.Context) AcknowledgeOutput {
	return o
}

// A comment describing the reason for the acknowledgment
func (o AcknowledgeOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v *Acknowledge) pulumi.StringOutput { return v.Comment }).(pulumi.StringOutput)
}

// A list of existing security acknowledges.
func (o AcknowledgeOutput) Issues() AcknowledgeIssueArrayOutput {
	return o.ApplyT(func(v *Acknowledge) AcknowledgeIssueArrayOutput { return v.Issues }).(AcknowledgeIssueArrayOutput)
}

type AcknowledgeArrayOutput struct{ *pulumi.OutputState }

func (AcknowledgeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Acknowledge)(nil)).Elem()
}

func (o AcknowledgeArrayOutput) ToAcknowledgeArrayOutput() AcknowledgeArrayOutput {
	return o
}

func (o AcknowledgeArrayOutput) ToAcknowledgeArrayOutputWithContext(ctx context.Context) AcknowledgeArrayOutput {
	return o
}

func (o AcknowledgeArrayOutput) Index(i pulumi.IntInput) AcknowledgeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Acknowledge {
		return vs[0].([]*Acknowledge)[vs[1].(int)]
	}).(AcknowledgeOutput)
}

type AcknowledgeMapOutput struct{ *pulumi.OutputState }

func (AcknowledgeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Acknowledge)(nil)).Elem()
}

func (o AcknowledgeMapOutput) ToAcknowledgeMapOutput() AcknowledgeMapOutput {
	return o
}

func (o AcknowledgeMapOutput) ToAcknowledgeMapOutputWithContext(ctx context.Context) AcknowledgeMapOutput {
	return o
}

func (o AcknowledgeMapOutput) MapIndex(k pulumi.StringInput) AcknowledgeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Acknowledge {
		return vs[0].(map[string]*Acknowledge)[vs[1].(string)]
	}).(AcknowledgeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AcknowledgeInput)(nil)).Elem(), &Acknowledge{})
	pulumi.RegisterInputType(reflect.TypeOf((*AcknowledgeArrayInput)(nil)).Elem(), AcknowledgeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AcknowledgeMapInput)(nil)).Elem(), AcknowledgeMap{})
	pulumi.RegisterOutputType(AcknowledgeOutput{})
	pulumi.RegisterOutputType(AcknowledgeArrayOutput{})
	pulumi.RegisterOutputType(AcknowledgeMapOutput{})
}
