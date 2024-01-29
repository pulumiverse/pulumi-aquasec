// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumiverse/pulumi-aquasec/sdk/go/aquasec/internal"
)

// Provides an Aquasec Notification Slack resource
//
// > **Note about resource deprecation**
// Resource NotificationSlack is deprecated, please use Notification instead
type NotificationSlack struct {
	pulumi.CustomResourceState

	Channel    pulumi.StringOutput    `pulumi:"channel"`
	Enabled    pulumi.BoolOutput      `pulumi:"enabled"`
	Icon       pulumi.StringPtrOutput `pulumi:"icon"`
	MainText   pulumi.StringPtrOutput `pulumi:"mainText"`
	Name       pulumi.StringOutput    `pulumi:"name"`
	ServiceKey pulumi.StringPtrOutput `pulumi:"serviceKey"`
	Type       pulumi.StringOutput    `pulumi:"type"`
	UserName   pulumi.StringOutput    `pulumi:"userName"`
	WebhookUrl pulumi.StringOutput    `pulumi:"webhookUrl"`
}

// NewNotificationSlack registers a new resource with the given unique name, arguments, and options.
func NewNotificationSlack(ctx *pulumi.Context,
	name string, args *NotificationSlackArgs, opts ...pulumi.ResourceOption) (*NotificationSlack, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Channel == nil {
		return nil, errors.New("invalid value for required argument 'Channel'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.UserName == nil {
		return nil, errors.New("invalid value for required argument 'UserName'")
	}
	if args.WebhookUrl == nil {
		return nil, errors.New("invalid value for required argument 'WebhookUrl'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NotificationSlack
	err := ctx.RegisterResource("aquasec:index/notificationSlack:NotificationSlack", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationSlack gets an existing NotificationSlack resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationSlack(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationSlackState, opts ...pulumi.ResourceOption) (*NotificationSlack, error) {
	var resource NotificationSlack
	err := ctx.ReadResource("aquasec:index/notificationSlack:NotificationSlack", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationSlack resources.
type notificationSlackState struct {
	Channel    *string `pulumi:"channel"`
	Enabled    *bool   `pulumi:"enabled"`
	Icon       *string `pulumi:"icon"`
	MainText   *string `pulumi:"mainText"`
	Name       *string `pulumi:"name"`
	ServiceKey *string `pulumi:"serviceKey"`
	Type       *string `pulumi:"type"`
	UserName   *string `pulumi:"userName"`
	WebhookUrl *string `pulumi:"webhookUrl"`
}

type NotificationSlackState struct {
	Channel    pulumi.StringPtrInput
	Enabled    pulumi.BoolPtrInput
	Icon       pulumi.StringPtrInput
	MainText   pulumi.StringPtrInput
	Name       pulumi.StringPtrInput
	ServiceKey pulumi.StringPtrInput
	Type       pulumi.StringPtrInput
	UserName   pulumi.StringPtrInput
	WebhookUrl pulumi.StringPtrInput
}

func (NotificationSlackState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationSlackState)(nil)).Elem()
}

type notificationSlackArgs struct {
	Channel    string  `pulumi:"channel"`
	Enabled    bool    `pulumi:"enabled"`
	Icon       *string `pulumi:"icon"`
	MainText   *string `pulumi:"mainText"`
	Name       *string `pulumi:"name"`
	ServiceKey *string `pulumi:"serviceKey"`
	Type       string  `pulumi:"type"`
	UserName   string  `pulumi:"userName"`
	WebhookUrl string  `pulumi:"webhookUrl"`
}

// The set of arguments for constructing a NotificationSlack resource.
type NotificationSlackArgs struct {
	Channel    pulumi.StringInput
	Enabled    pulumi.BoolInput
	Icon       pulumi.StringPtrInput
	MainText   pulumi.StringPtrInput
	Name       pulumi.StringPtrInput
	ServiceKey pulumi.StringPtrInput
	Type       pulumi.StringInput
	UserName   pulumi.StringInput
	WebhookUrl pulumi.StringInput
}

func (NotificationSlackArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationSlackArgs)(nil)).Elem()
}

type NotificationSlackInput interface {
	pulumi.Input

	ToNotificationSlackOutput() NotificationSlackOutput
	ToNotificationSlackOutputWithContext(ctx context.Context) NotificationSlackOutput
}

func (*NotificationSlack) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationSlack)(nil)).Elem()
}

func (i *NotificationSlack) ToNotificationSlackOutput() NotificationSlackOutput {
	return i.ToNotificationSlackOutputWithContext(context.Background())
}

func (i *NotificationSlack) ToNotificationSlackOutputWithContext(ctx context.Context) NotificationSlackOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationSlackOutput)
}

// NotificationSlackArrayInput is an input type that accepts NotificationSlackArray and NotificationSlackArrayOutput values.
// You can construct a concrete instance of `NotificationSlackArrayInput` via:
//
//	NotificationSlackArray{ NotificationSlackArgs{...} }
type NotificationSlackArrayInput interface {
	pulumi.Input

	ToNotificationSlackArrayOutput() NotificationSlackArrayOutput
	ToNotificationSlackArrayOutputWithContext(context.Context) NotificationSlackArrayOutput
}

type NotificationSlackArray []NotificationSlackInput

func (NotificationSlackArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationSlack)(nil)).Elem()
}

func (i NotificationSlackArray) ToNotificationSlackArrayOutput() NotificationSlackArrayOutput {
	return i.ToNotificationSlackArrayOutputWithContext(context.Background())
}

func (i NotificationSlackArray) ToNotificationSlackArrayOutputWithContext(ctx context.Context) NotificationSlackArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationSlackArrayOutput)
}

// NotificationSlackMapInput is an input type that accepts NotificationSlackMap and NotificationSlackMapOutput values.
// You can construct a concrete instance of `NotificationSlackMapInput` via:
//
//	NotificationSlackMap{ "key": NotificationSlackArgs{...} }
type NotificationSlackMapInput interface {
	pulumi.Input

	ToNotificationSlackMapOutput() NotificationSlackMapOutput
	ToNotificationSlackMapOutputWithContext(context.Context) NotificationSlackMapOutput
}

type NotificationSlackMap map[string]NotificationSlackInput

func (NotificationSlackMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationSlack)(nil)).Elem()
}

func (i NotificationSlackMap) ToNotificationSlackMapOutput() NotificationSlackMapOutput {
	return i.ToNotificationSlackMapOutputWithContext(context.Background())
}

func (i NotificationSlackMap) ToNotificationSlackMapOutputWithContext(ctx context.Context) NotificationSlackMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationSlackMapOutput)
}

type NotificationSlackOutput struct{ *pulumi.OutputState }

func (NotificationSlackOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationSlack)(nil)).Elem()
}

func (o NotificationSlackOutput) ToNotificationSlackOutput() NotificationSlackOutput {
	return o
}

func (o NotificationSlackOutput) ToNotificationSlackOutputWithContext(ctx context.Context) NotificationSlackOutput {
	return o
}

func (o NotificationSlackOutput) Channel() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationSlack) pulumi.StringOutput { return v.Channel }).(pulumi.StringOutput)
}

func (o NotificationSlackOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *NotificationSlack) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

func (o NotificationSlackOutput) Icon() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationSlack) pulumi.StringPtrOutput { return v.Icon }).(pulumi.StringPtrOutput)
}

func (o NotificationSlackOutput) MainText() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationSlack) pulumi.StringPtrOutput { return v.MainText }).(pulumi.StringPtrOutput)
}

func (o NotificationSlackOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationSlack) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o NotificationSlackOutput) ServiceKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationSlack) pulumi.StringPtrOutput { return v.ServiceKey }).(pulumi.StringPtrOutput)
}

func (o NotificationSlackOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationSlack) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

func (o NotificationSlackOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationSlack) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

func (o NotificationSlackOutput) WebhookUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationSlack) pulumi.StringOutput { return v.WebhookUrl }).(pulumi.StringOutput)
}

type NotificationSlackArrayOutput struct{ *pulumi.OutputState }

func (NotificationSlackArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationSlack)(nil)).Elem()
}

func (o NotificationSlackArrayOutput) ToNotificationSlackArrayOutput() NotificationSlackArrayOutput {
	return o
}

func (o NotificationSlackArrayOutput) ToNotificationSlackArrayOutputWithContext(ctx context.Context) NotificationSlackArrayOutput {
	return o
}

func (o NotificationSlackArrayOutput) Index(i pulumi.IntInput) NotificationSlackOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NotificationSlack {
		return vs[0].([]*NotificationSlack)[vs[1].(int)]
	}).(NotificationSlackOutput)
}

type NotificationSlackMapOutput struct{ *pulumi.OutputState }

func (NotificationSlackMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationSlack)(nil)).Elem()
}

func (o NotificationSlackMapOutput) ToNotificationSlackMapOutput() NotificationSlackMapOutput {
	return o
}

func (o NotificationSlackMapOutput) ToNotificationSlackMapOutputWithContext(ctx context.Context) NotificationSlackMapOutput {
	return o
}

func (o NotificationSlackMapOutput) MapIndex(k pulumi.StringInput) NotificationSlackOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NotificationSlack {
		return vs[0].(map[string]*NotificationSlack)[vs[1].(string)]
	}).(NotificationSlackOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationSlackInput)(nil)).Elem(), &NotificationSlack{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationSlackArrayInput)(nil)).Elem(), NotificationSlackArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationSlackMapInput)(nil)).Elem(), NotificationSlackMap{})
	pulumi.RegisterOutputType(NotificationSlackOutput{})
	pulumi.RegisterOutputType(NotificationSlackArrayOutput{})
	pulumi.RegisterOutputType(NotificationSlackMapOutput{})
}
