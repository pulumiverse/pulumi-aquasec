// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aquasec

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumiverse/pulumi-aquasec/sdk/go/aquasec/internal"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "aquasec:index/acknowledge:Acknowledge":
		r = &Acknowledge{}
	case "aquasec:index/applicationScope:ApplicationScope":
		r = &ApplicationScope{}
	case "aquasec:index/aquaLabel:AquaLabel":
		r = &AquaLabel{}
	case "aquasec:index/containerRuntimePolicy:ContainerRuntimePolicy":
		r = &ContainerRuntimePolicy{}
	case "aquasec:index/enforcerGroups:EnforcerGroups":
		r = &EnforcerGroups{}
	case "aquasec:index/firewallPolicy:FirewallPolicy":
		r = &FirewallPolicy{}
	case "aquasec:index/functionAssurancePolicy:FunctionAssurancePolicy":
		r = &FunctionAssurancePolicy{}
	case "aquasec:index/functionRuntimePolicy:FunctionRuntimePolicy":
		r = &FunctionRuntimePolicy{}
	case "aquasec:index/group:Group":
		r = &Group{}
	case "aquasec:index/hostAssurancePolicy:HostAssurancePolicy":
		r = &HostAssurancePolicy{}
	case "aquasec:index/hostRuntimePolicy:HostRuntimePolicy":
		r = &HostRuntimePolicy{}
	case "aquasec:index/image:Image":
		r = &Image{}
	case "aquasec:index/imageAssurancePolicy:ImageAssurancePolicy":
		r = &ImageAssurancePolicy{}
	case "aquasec:index/integrationRegistry:IntegrationRegistry":
		r = &IntegrationRegistry{}
	case "aquasec:index/kubernetesAssurancePolicy:KubernetesAssurancePolicy":
		r = &KubernetesAssurancePolicy{}
	case "aquasec:index/notification:Notification":
		r = &Notification{}
	case "aquasec:index/notificationSlack:NotificationSlack":
		r = &NotificationSlack{}
	case "aquasec:index/permissionsSets:PermissionsSets":
		r = &PermissionsSets{}
	case "aquasec:index/role:Role":
		r = &Role{}
	case "aquasec:index/roleMapping:RoleMapping":
		r = &RoleMapping{}
	case "aquasec:index/roleMappingSaas:RoleMappingSaas":
		r = &RoleMappingSaas{}
	case "aquasec:index/service:Service":
		r = &Service{}
	case "aquasec:index/user:User":
		r = &User{}
	case "aquasec:index/userSaas:UserSaas":
		r = &UserSaas{}
	case "aquasec:index/vmwareAssurancePolicy:VmwareAssurancePolicy":
		r = &VmwareAssurancePolicy{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:aquasec" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/acknowledge",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/applicationScope",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/aquaLabel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/containerRuntimePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/enforcerGroups",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/firewallPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/functionAssurancePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/functionRuntimePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/group",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/hostAssurancePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/hostRuntimePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/image",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/imageAssurancePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/integrationRegistry",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/kubernetesAssurancePolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/notification",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/notificationSlack",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/permissionsSets",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/role",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/roleMapping",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/roleMappingSaas",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/service",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/user",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/userSaas",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aquasec",
		"index/vmwareAssurancePolicy",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"aquasec",
		&pkg{version},
	)
}
