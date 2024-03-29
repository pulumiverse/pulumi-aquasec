// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { AcknowledgeArgs, AcknowledgeState } from "./acknowledge";
export type Acknowledge = import("./acknowledge").Acknowledge;
export const Acknowledge: typeof import("./acknowledge").Acknowledge = null as any;
utilities.lazyLoad(exports, ["Acknowledge"], () => require("./acknowledge"));

export { ApplicationScopeArgs, ApplicationScopeState } from "./applicationScope";
export type ApplicationScope = import("./applicationScope").ApplicationScope;
export const ApplicationScope: typeof import("./applicationScope").ApplicationScope = null as any;
utilities.lazyLoad(exports, ["ApplicationScope"], () => require("./applicationScope"));

export { AquaLabelArgs, AquaLabelState } from "./aquaLabel";
export type AquaLabel = import("./aquaLabel").AquaLabel;
export const AquaLabel: typeof import("./aquaLabel").AquaLabel = null as any;
utilities.lazyLoad(exports, ["AquaLabel"], () => require("./aquaLabel"));

export { ContainerRuntimePolicyArgs, ContainerRuntimePolicyState } from "./containerRuntimePolicy";
export type ContainerRuntimePolicy = import("./containerRuntimePolicy").ContainerRuntimePolicy;
export const ContainerRuntimePolicy: typeof import("./containerRuntimePolicy").ContainerRuntimePolicy = null as any;
utilities.lazyLoad(exports, ["ContainerRuntimePolicy"], () => require("./containerRuntimePolicy"));

export { EnforcerGroupsArgs, EnforcerGroupsState } from "./enforcerGroups";
export type EnforcerGroups = import("./enforcerGroups").EnforcerGroups;
export const EnforcerGroups: typeof import("./enforcerGroups").EnforcerGroups = null as any;
utilities.lazyLoad(exports, ["EnforcerGroups"], () => require("./enforcerGroups"));

export { FirewallPolicyArgs, FirewallPolicyState } from "./firewallPolicy";
export type FirewallPolicy = import("./firewallPolicy").FirewallPolicy;
export const FirewallPolicy: typeof import("./firewallPolicy").FirewallPolicy = null as any;
utilities.lazyLoad(exports, ["FirewallPolicy"], () => require("./firewallPolicy"));

export { FunctionAssurancePolicyArgs, FunctionAssurancePolicyState } from "./functionAssurancePolicy";
export type FunctionAssurancePolicy = import("./functionAssurancePolicy").FunctionAssurancePolicy;
export const FunctionAssurancePolicy: typeof import("./functionAssurancePolicy").FunctionAssurancePolicy = null as any;
utilities.lazyLoad(exports, ["FunctionAssurancePolicy"], () => require("./functionAssurancePolicy"));

export { FunctionRuntimePolicyArgs, FunctionRuntimePolicyState } from "./functionRuntimePolicy";
export type FunctionRuntimePolicy = import("./functionRuntimePolicy").FunctionRuntimePolicy;
export const FunctionRuntimePolicy: typeof import("./functionRuntimePolicy").FunctionRuntimePolicy = null as any;
utilities.lazyLoad(exports, ["FunctionRuntimePolicy"], () => require("./functionRuntimePolicy"));

export { GetAcknowledgesResult } from "./getAcknowledges";
export const getAcknowledges: typeof import("./getAcknowledges").getAcknowledges = null as any;
export const getAcknowledgesOutput: typeof import("./getAcknowledges").getAcknowledgesOutput = null as any;
utilities.lazyLoad(exports, ["getAcknowledges","getAcknowledgesOutput"], () => require("./getAcknowledges"));

export { GetApplicationScopeArgs, GetApplicationScopeResult, GetApplicationScopeOutputArgs } from "./getApplicationScope";
export const getApplicationScope: typeof import("./getApplicationScope").getApplicationScope = null as any;
export const getApplicationScopeOutput: typeof import("./getApplicationScope").getApplicationScopeOutput = null as any;
utilities.lazyLoad(exports, ["getApplicationScope","getApplicationScopeOutput"], () => require("./getApplicationScope"));

export { GetAquaLabelsResult } from "./getAquaLabels";
export const getAquaLabels: typeof import("./getAquaLabels").getAquaLabels = null as any;
export const getAquaLabelsOutput: typeof import("./getAquaLabels").getAquaLabelsOutput = null as any;
utilities.lazyLoad(exports, ["getAquaLabels","getAquaLabelsOutput"], () => require("./getAquaLabels"));

export { GetContainerRuntimePolicyArgs, GetContainerRuntimePolicyResult, GetContainerRuntimePolicyOutputArgs } from "./getContainerRuntimePolicy";
export const getContainerRuntimePolicy: typeof import("./getContainerRuntimePolicy").getContainerRuntimePolicy = null as any;
export const getContainerRuntimePolicyOutput: typeof import("./getContainerRuntimePolicy").getContainerRuntimePolicyOutput = null as any;
utilities.lazyLoad(exports, ["getContainerRuntimePolicy","getContainerRuntimePolicyOutput"], () => require("./getContainerRuntimePolicy"));

export { GetEnforcerGroupsArgs, GetEnforcerGroupsResult, GetEnforcerGroupsOutputArgs } from "./getEnforcerGroups";
export const getEnforcerGroups: typeof import("./getEnforcerGroups").getEnforcerGroups = null as any;
export const getEnforcerGroupsOutput: typeof import("./getEnforcerGroups").getEnforcerGroupsOutput = null as any;
utilities.lazyLoad(exports, ["getEnforcerGroups","getEnforcerGroupsOutput"], () => require("./getEnforcerGroups"));

export { GetFirewallPolicyArgs, GetFirewallPolicyResult, GetFirewallPolicyOutputArgs } from "./getFirewallPolicy";
export const getFirewallPolicy: typeof import("./getFirewallPolicy").getFirewallPolicy = null as any;
export const getFirewallPolicyOutput: typeof import("./getFirewallPolicy").getFirewallPolicyOutput = null as any;
utilities.lazyLoad(exports, ["getFirewallPolicy","getFirewallPolicyOutput"], () => require("./getFirewallPolicy"));

export { GetFunctionAssurancePolicyArgs, GetFunctionAssurancePolicyResult, GetFunctionAssurancePolicyOutputArgs } from "./getFunctionAssurancePolicy";
export const getFunctionAssurancePolicy: typeof import("./getFunctionAssurancePolicy").getFunctionAssurancePolicy = null as any;
export const getFunctionAssurancePolicyOutput: typeof import("./getFunctionAssurancePolicy").getFunctionAssurancePolicyOutput = null as any;
utilities.lazyLoad(exports, ["getFunctionAssurancePolicy","getFunctionAssurancePolicyOutput"], () => require("./getFunctionAssurancePolicy"));

export { GetFunctionRuntimePolicyArgs, GetFunctionRuntimePolicyResult, GetFunctionRuntimePolicyOutputArgs } from "./getFunctionRuntimePolicy";
export const getFunctionRuntimePolicy: typeof import("./getFunctionRuntimePolicy").getFunctionRuntimePolicy = null as any;
export const getFunctionRuntimePolicyOutput: typeof import("./getFunctionRuntimePolicy").getFunctionRuntimePolicyOutput = null as any;
utilities.lazyLoad(exports, ["getFunctionRuntimePolicy","getFunctionRuntimePolicyOutput"], () => require("./getFunctionRuntimePolicy"));

export { GetGatewaysResult } from "./getGateways";
export const getGateways: typeof import("./getGateways").getGateways = null as any;
export const getGatewaysOutput: typeof import("./getGateways").getGatewaysOutput = null as any;
utilities.lazyLoad(exports, ["getGateways","getGatewaysOutput"], () => require("./getGateways"));

export { GetGroupsResult } from "./getGroups";
export const getGroups: typeof import("./getGroups").getGroups = null as any;
export const getGroupsOutput: typeof import("./getGroups").getGroupsOutput = null as any;
utilities.lazyLoad(exports, ["getGroups","getGroupsOutput"], () => require("./getGroups"));

export { GetHostAssurancePolicyArgs, GetHostAssurancePolicyResult, GetHostAssurancePolicyOutputArgs } from "./getHostAssurancePolicy";
export const getHostAssurancePolicy: typeof import("./getHostAssurancePolicy").getHostAssurancePolicy = null as any;
export const getHostAssurancePolicyOutput: typeof import("./getHostAssurancePolicy").getHostAssurancePolicyOutput = null as any;
utilities.lazyLoad(exports, ["getHostAssurancePolicy","getHostAssurancePolicyOutput"], () => require("./getHostAssurancePolicy"));

export { GetHostRuntimePolicyArgs, GetHostRuntimePolicyResult, GetHostRuntimePolicyOutputArgs } from "./getHostRuntimePolicy";
export const getHostRuntimePolicy: typeof import("./getHostRuntimePolicy").getHostRuntimePolicy = null as any;
export const getHostRuntimePolicyOutput: typeof import("./getHostRuntimePolicy").getHostRuntimePolicyOutput = null as any;
utilities.lazyLoad(exports, ["getHostRuntimePolicy","getHostRuntimePolicyOutput"], () => require("./getHostRuntimePolicy"));

export { GetImageArgs, GetImageResult, GetImageOutputArgs } from "./getImage";
export const getImage: typeof import("./getImage").getImage = null as any;
export const getImageOutput: typeof import("./getImage").getImageOutput = null as any;
utilities.lazyLoad(exports, ["getImage","getImageOutput"], () => require("./getImage"));

export { GetImageAssurancePolicyArgs, GetImageAssurancePolicyResult, GetImageAssurancePolicyOutputArgs } from "./getImageAssurancePolicy";
export const getImageAssurancePolicy: typeof import("./getImageAssurancePolicy").getImageAssurancePolicy = null as any;
export const getImageAssurancePolicyOutput: typeof import("./getImageAssurancePolicy").getImageAssurancePolicyOutput = null as any;
utilities.lazyLoad(exports, ["getImageAssurancePolicy","getImageAssurancePolicyOutput"], () => require("./getImageAssurancePolicy"));

export { GetIntegrationRegistriesArgs, GetIntegrationRegistriesResult, GetIntegrationRegistriesOutputArgs } from "./getIntegrationRegistries";
export const getIntegrationRegistries: typeof import("./getIntegrationRegistries").getIntegrationRegistries = null as any;
export const getIntegrationRegistriesOutput: typeof import("./getIntegrationRegistries").getIntegrationRegistriesOutput = null as any;
utilities.lazyLoad(exports, ["getIntegrationRegistries","getIntegrationRegistriesOutput"], () => require("./getIntegrationRegistries"));

export { GetIntegrationRegistryArgs, GetIntegrationRegistryResult, GetIntegrationRegistryOutputArgs } from "./getIntegrationRegistry";
export const getIntegrationRegistry: typeof import("./getIntegrationRegistry").getIntegrationRegistry = null as any;
export const getIntegrationRegistryOutput: typeof import("./getIntegrationRegistry").getIntegrationRegistryOutput = null as any;
utilities.lazyLoad(exports, ["getIntegrationRegistry","getIntegrationRegistryOutput"], () => require("./getIntegrationRegistry"));

export { GetIntegrationStateResult } from "./getIntegrationState";
export const getIntegrationState: typeof import("./getIntegrationState").getIntegrationState = null as any;
export const getIntegrationStateOutput: typeof import("./getIntegrationState").getIntegrationStateOutput = null as any;
utilities.lazyLoad(exports, ["getIntegrationState","getIntegrationStateOutput"], () => require("./getIntegrationState"));

export { GetKubernetesAssurancePolicyArgs, GetKubernetesAssurancePolicyResult, GetKubernetesAssurancePolicyOutputArgs } from "./getKubernetesAssurancePolicy";
export const getKubernetesAssurancePolicy: typeof import("./getKubernetesAssurancePolicy").getKubernetesAssurancePolicy = null as any;
export const getKubernetesAssurancePolicyOutput: typeof import("./getKubernetesAssurancePolicy").getKubernetesAssurancePolicyOutput = null as any;
utilities.lazyLoad(exports, ["getKubernetesAssurancePolicy","getKubernetesAssurancePolicyOutput"], () => require("./getKubernetesAssurancePolicy"));

export { GetNotificationsResult } from "./getNotifications";
export const getNotifications: typeof import("./getNotifications").getNotifications = null as any;
export const getNotificationsOutput: typeof import("./getNotifications").getNotificationsOutput = null as any;
utilities.lazyLoad(exports, ["getNotifications","getNotificationsOutput"], () => require("./getNotifications"));

export { GetPermissionsSetsResult } from "./getPermissionsSets";
export const getPermissionsSets: typeof import("./getPermissionsSets").getPermissionsSets = null as any;
export const getPermissionsSetsOutput: typeof import("./getPermissionsSets").getPermissionsSetsOutput = null as any;
utilities.lazyLoad(exports, ["getPermissionsSets","getPermissionsSetsOutput"], () => require("./getPermissionsSets"));

export { GetRolesResult } from "./getRoles";
export const getRoles: typeof import("./getRoles").getRoles = null as any;
export const getRolesOutput: typeof import("./getRoles").getRolesOutput = null as any;
utilities.lazyLoad(exports, ["getRoles","getRolesOutput"], () => require("./getRoles"));

export { GetRolesMappingResult } from "./getRolesMapping";
export const getRolesMapping: typeof import("./getRolesMapping").getRolesMapping = null as any;
export const getRolesMappingOutput: typeof import("./getRolesMapping").getRolesMappingOutput = null as any;
utilities.lazyLoad(exports, ["getRolesMapping","getRolesMappingOutput"], () => require("./getRolesMapping"));

export { GetRolesMappingSaasResult } from "./getRolesMappingSaas";
export const getRolesMappingSaas: typeof import("./getRolesMappingSaas").getRolesMappingSaas = null as any;
export const getRolesMappingSaasOutput: typeof import("./getRolesMappingSaas").getRolesMappingSaasOutput = null as any;
utilities.lazyLoad(exports, ["getRolesMappingSaas","getRolesMappingSaasOutput"], () => require("./getRolesMappingSaas"));

export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { GetUsersResult } from "./getUsers";
export const getUsers: typeof import("./getUsers").getUsers = null as any;
export const getUsersOutput: typeof import("./getUsers").getUsersOutput = null as any;
utilities.lazyLoad(exports, ["getUsers","getUsersOutput"], () => require("./getUsers"));

export { GetUsersSaasResult } from "./getUsersSaas";
export const getUsersSaas: typeof import("./getUsersSaas").getUsersSaas = null as any;
export const getUsersSaasOutput: typeof import("./getUsersSaas").getUsersSaasOutput = null as any;
utilities.lazyLoad(exports, ["getUsersSaas","getUsersSaasOutput"], () => require("./getUsersSaas"));

export { GroupArgs, GroupState } from "./group";
export type Group = import("./group").Group;
export const Group: typeof import("./group").Group = null as any;
utilities.lazyLoad(exports, ["Group"], () => require("./group"));

export { HostAssurancePolicyArgs, HostAssurancePolicyState } from "./hostAssurancePolicy";
export type HostAssurancePolicy = import("./hostAssurancePolicy").HostAssurancePolicy;
export const HostAssurancePolicy: typeof import("./hostAssurancePolicy").HostAssurancePolicy = null as any;
utilities.lazyLoad(exports, ["HostAssurancePolicy"], () => require("./hostAssurancePolicy"));

export { HostRuntimePolicyArgs, HostRuntimePolicyState } from "./hostRuntimePolicy";
export type HostRuntimePolicy = import("./hostRuntimePolicy").HostRuntimePolicy;
export const HostRuntimePolicy: typeof import("./hostRuntimePolicy").HostRuntimePolicy = null as any;
utilities.lazyLoad(exports, ["HostRuntimePolicy"], () => require("./hostRuntimePolicy"));

export { ImageArgs, ImageState } from "./image";
export type Image = import("./image").Image;
export const Image: typeof import("./image").Image = null as any;
utilities.lazyLoad(exports, ["Image"], () => require("./image"));

export { ImageAssurancePolicyArgs, ImageAssurancePolicyState } from "./imageAssurancePolicy";
export type ImageAssurancePolicy = import("./imageAssurancePolicy").ImageAssurancePolicy;
export const ImageAssurancePolicy: typeof import("./imageAssurancePolicy").ImageAssurancePolicy = null as any;
utilities.lazyLoad(exports, ["ImageAssurancePolicy"], () => require("./imageAssurancePolicy"));

export { IntegrationRegistryArgs, IntegrationRegistryState } from "./integrationRegistry";
export type IntegrationRegistry = import("./integrationRegistry").IntegrationRegistry;
export const IntegrationRegistry: typeof import("./integrationRegistry").IntegrationRegistry = null as any;
utilities.lazyLoad(exports, ["IntegrationRegistry"], () => require("./integrationRegistry"));

export { KubernetesAssurancePolicyArgs, KubernetesAssurancePolicyState } from "./kubernetesAssurancePolicy";
export type KubernetesAssurancePolicy = import("./kubernetesAssurancePolicy").KubernetesAssurancePolicy;
export const KubernetesAssurancePolicy: typeof import("./kubernetesAssurancePolicy").KubernetesAssurancePolicy = null as any;
utilities.lazyLoad(exports, ["KubernetesAssurancePolicy"], () => require("./kubernetesAssurancePolicy"));

export { NotificationArgs, NotificationState } from "./notification";
export type Notification = import("./notification").Notification;
export const Notification: typeof import("./notification").Notification = null as any;
utilities.lazyLoad(exports, ["Notification"], () => require("./notification"));

export { NotificationSlackArgs, NotificationSlackState } from "./notificationSlack";
export type NotificationSlack = import("./notificationSlack").NotificationSlack;
export const NotificationSlack: typeof import("./notificationSlack").NotificationSlack = null as any;
utilities.lazyLoad(exports, ["NotificationSlack"], () => require("./notificationSlack"));

export { PermissionsSetsArgs, PermissionsSetsState } from "./permissionsSets";
export type PermissionsSets = import("./permissionsSets").PermissionsSets;
export const PermissionsSets: typeof import("./permissionsSets").PermissionsSets = null as any;
utilities.lazyLoad(exports, ["PermissionsSets"], () => require("./permissionsSets"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { RoleArgs, RoleState } from "./role";
export type Role = import("./role").Role;
export const Role: typeof import("./role").Role = null as any;
utilities.lazyLoad(exports, ["Role"], () => require("./role"));

export { RoleMappingArgs, RoleMappingState } from "./roleMapping";
export type RoleMapping = import("./roleMapping").RoleMapping;
export const RoleMapping: typeof import("./roleMapping").RoleMapping = null as any;
utilities.lazyLoad(exports, ["RoleMapping"], () => require("./roleMapping"));

export { RoleMappingSaasArgs, RoleMappingSaasState } from "./roleMappingSaas";
export type RoleMappingSaas = import("./roleMappingSaas").RoleMappingSaas;
export const RoleMappingSaas: typeof import("./roleMappingSaas").RoleMappingSaas = null as any;
utilities.lazyLoad(exports, ["RoleMappingSaas"], () => require("./roleMappingSaas"));

export { ServiceArgs, ServiceState } from "./service";
export type Service = import("./service").Service;
export const Service: typeof import("./service").Service = null as any;
utilities.lazyLoad(exports, ["Service"], () => require("./service"));

export { UserArgs, UserState } from "./user";
export type User = import("./user").User;
export const User: typeof import("./user").User = null as any;
utilities.lazyLoad(exports, ["User"], () => require("./user"));

export { UserSaasArgs, UserSaasState } from "./userSaas";
export type UserSaas = import("./userSaas").UserSaas;
export const UserSaas: typeof import("./userSaas").UserSaas = null as any;
utilities.lazyLoad(exports, ["UserSaas"], () => require("./userSaas"));

export { VmwareAssurancePolicyArgs, VmwareAssurancePolicyState } from "./vmwareAssurancePolicy";
export type VmwareAssurancePolicy = import("./vmwareAssurancePolicy").VmwareAssurancePolicy;
export const VmwareAssurancePolicy: typeof import("./vmwareAssurancePolicy").VmwareAssurancePolicy = null as any;
utilities.lazyLoad(exports, ["VmwareAssurancePolicy"], () => require("./vmwareAssurancePolicy"));


// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aquasec:index/acknowledge:Acknowledge":
                return new Acknowledge(name, <any>undefined, { urn })
            case "aquasec:index/applicationScope:ApplicationScope":
                return new ApplicationScope(name, <any>undefined, { urn })
            case "aquasec:index/aquaLabel:AquaLabel":
                return new AquaLabel(name, <any>undefined, { urn })
            case "aquasec:index/containerRuntimePolicy:ContainerRuntimePolicy":
                return new ContainerRuntimePolicy(name, <any>undefined, { urn })
            case "aquasec:index/enforcerGroups:EnforcerGroups":
                return new EnforcerGroups(name, <any>undefined, { urn })
            case "aquasec:index/firewallPolicy:FirewallPolicy":
                return new FirewallPolicy(name, <any>undefined, { urn })
            case "aquasec:index/functionAssurancePolicy:FunctionAssurancePolicy":
                return new FunctionAssurancePolicy(name, <any>undefined, { urn })
            case "aquasec:index/functionRuntimePolicy:FunctionRuntimePolicy":
                return new FunctionRuntimePolicy(name, <any>undefined, { urn })
            case "aquasec:index/group:Group":
                return new Group(name, <any>undefined, { urn })
            case "aquasec:index/hostAssurancePolicy:HostAssurancePolicy":
                return new HostAssurancePolicy(name, <any>undefined, { urn })
            case "aquasec:index/hostRuntimePolicy:HostRuntimePolicy":
                return new HostRuntimePolicy(name, <any>undefined, { urn })
            case "aquasec:index/image:Image":
                return new Image(name, <any>undefined, { urn })
            case "aquasec:index/imageAssurancePolicy:ImageAssurancePolicy":
                return new ImageAssurancePolicy(name, <any>undefined, { urn })
            case "aquasec:index/integrationRegistry:IntegrationRegistry":
                return new IntegrationRegistry(name, <any>undefined, { urn })
            case "aquasec:index/kubernetesAssurancePolicy:KubernetesAssurancePolicy":
                return new KubernetesAssurancePolicy(name, <any>undefined, { urn })
            case "aquasec:index/notification:Notification":
                return new Notification(name, <any>undefined, { urn })
            case "aquasec:index/notificationSlack:NotificationSlack":
                return new NotificationSlack(name, <any>undefined, { urn })
            case "aquasec:index/permissionsSets:PermissionsSets":
                return new PermissionsSets(name, <any>undefined, { urn })
            case "aquasec:index/role:Role":
                return new Role(name, <any>undefined, { urn })
            case "aquasec:index/roleMapping:RoleMapping":
                return new RoleMapping(name, <any>undefined, { urn })
            case "aquasec:index/roleMappingSaas:RoleMappingSaas":
                return new RoleMappingSaas(name, <any>undefined, { urn })
            case "aquasec:index/service:Service":
                return new Service(name, <any>undefined, { urn })
            case "aquasec:index/user:User":
                return new User(name, <any>undefined, { urn })
            case "aquasec:index/userSaas:UserSaas":
                return new UserSaas(name, <any>undefined, { urn })
            case "aquasec:index/vmwareAssurancePolicy:VmwareAssurancePolicy":
                return new VmwareAssurancePolicy(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aquasec", "index/acknowledge", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/applicationScope", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/aquaLabel", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/containerRuntimePolicy", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/enforcerGroups", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/firewallPolicy", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/functionAssurancePolicy", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/functionRuntimePolicy", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/group", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/hostAssurancePolicy", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/hostRuntimePolicy", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/image", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/imageAssurancePolicy", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/integrationRegistry", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/kubernetesAssurancePolicy", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/notification", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/notificationSlack", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/permissionsSets", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/role", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/roleMapping", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/roleMappingSaas", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/service", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/user", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/userSaas", _module)
pulumi.runtime.registerResourceModule("aquasec", "index/vmwareAssurancePolicy", _module)
pulumi.runtime.registerResourcePackage("aquasec", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:aquasec") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
