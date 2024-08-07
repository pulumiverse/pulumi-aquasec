# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetFunctionRuntimePolicyResult',
    'AwaitableGetFunctionRuntimePolicyResult',
    'get_function_runtime_policy',
    'get_function_runtime_policy_output',
]

@pulumi.output_type
class GetFunctionRuntimePolicyResult:
    """
    A collection of values returned by getFunctionRuntimePolicy.
    """
    def __init__(__self__, application_scopes=None, author=None, block_malicious_executables=None, block_malicious_executables_allowed_processes=None, block_running_executables_in_tmp_folder=None, blocked_executables=None, description=None, drift_preventions=None, enabled=None, enforce=None, executable_blacklists=None, honeypot_access_key=None, honeypot_apply_ons=None, honeypot_secret_key=None, honeypot_serverless_app_name=None, id=None, name=None, scope_expression=None, scope_variables=None):
        if application_scopes and not isinstance(application_scopes, list):
            raise TypeError("Expected argument 'application_scopes' to be a list")
        pulumi.set(__self__, "application_scopes", application_scopes)
        if author and not isinstance(author, str):
            raise TypeError("Expected argument 'author' to be a str")
        pulumi.set(__self__, "author", author)
        if block_malicious_executables and not isinstance(block_malicious_executables, bool):
            raise TypeError("Expected argument 'block_malicious_executables' to be a bool")
        pulumi.set(__self__, "block_malicious_executables", block_malicious_executables)
        if block_malicious_executables_allowed_processes and not isinstance(block_malicious_executables_allowed_processes, list):
            raise TypeError("Expected argument 'block_malicious_executables_allowed_processes' to be a list")
        pulumi.set(__self__, "block_malicious_executables_allowed_processes", block_malicious_executables_allowed_processes)
        if block_running_executables_in_tmp_folder and not isinstance(block_running_executables_in_tmp_folder, bool):
            raise TypeError("Expected argument 'block_running_executables_in_tmp_folder' to be a bool")
        pulumi.set(__self__, "block_running_executables_in_tmp_folder", block_running_executables_in_tmp_folder)
        if blocked_executables and not isinstance(blocked_executables, list):
            raise TypeError("Expected argument 'blocked_executables' to be a list")
        pulumi.set(__self__, "blocked_executables", blocked_executables)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if drift_preventions and not isinstance(drift_preventions, list):
            raise TypeError("Expected argument 'drift_preventions' to be a list")
        pulumi.set(__self__, "drift_preventions", drift_preventions)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if enforce and not isinstance(enforce, bool):
            raise TypeError("Expected argument 'enforce' to be a bool")
        pulumi.set(__self__, "enforce", enforce)
        if executable_blacklists and not isinstance(executable_blacklists, list):
            raise TypeError("Expected argument 'executable_blacklists' to be a list")
        pulumi.set(__self__, "executable_blacklists", executable_blacklists)
        if honeypot_access_key and not isinstance(honeypot_access_key, str):
            raise TypeError("Expected argument 'honeypot_access_key' to be a str")
        pulumi.set(__self__, "honeypot_access_key", honeypot_access_key)
        if honeypot_apply_ons and not isinstance(honeypot_apply_ons, list):
            raise TypeError("Expected argument 'honeypot_apply_ons' to be a list")
        pulumi.set(__self__, "honeypot_apply_ons", honeypot_apply_ons)
        if honeypot_secret_key and not isinstance(honeypot_secret_key, str):
            raise TypeError("Expected argument 'honeypot_secret_key' to be a str")
        pulumi.set(__self__, "honeypot_secret_key", honeypot_secret_key)
        if honeypot_serverless_app_name and not isinstance(honeypot_serverless_app_name, str):
            raise TypeError("Expected argument 'honeypot_serverless_app_name' to be a str")
        pulumi.set(__self__, "honeypot_serverless_app_name", honeypot_serverless_app_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if scope_expression and not isinstance(scope_expression, str):
            raise TypeError("Expected argument 'scope_expression' to be a str")
        pulumi.set(__self__, "scope_expression", scope_expression)
        if scope_variables and not isinstance(scope_variables, list):
            raise TypeError("Expected argument 'scope_variables' to be a list")
        pulumi.set(__self__, "scope_variables", scope_variables)

    @property
    @pulumi.getter(name="applicationScopes")
    def application_scopes(self) -> Sequence[str]:
        """
        Indicates the application scope of the service.
        """
        return pulumi.get(self, "application_scopes")

    @property
    @pulumi.getter
    def author(self) -> str:
        """
        Username of the account that created the service.
        """
        return pulumi.get(self, "author")

    @property
    @pulumi.getter(name="blockMaliciousExecutables")
    def block_malicious_executables(self) -> bool:
        """
        If true, prevent creation of malicious executables in functions during their runtime post invocation.
        """
        return pulumi.get(self, "block_malicious_executables")

    @property
    @pulumi.getter(name="blockMaliciousExecutablesAllowedProcesses")
    def block_malicious_executables_allowed_processes(self) -> Sequence[str]:
        """
        List of processes that will be allowed
        """
        return pulumi.get(self, "block_malicious_executables_allowed_processes")

    @property
    @pulumi.getter(name="blockRunningExecutablesInTmpFolder")
    def block_running_executables_in_tmp_folder(self) -> bool:
        """
        If true, prevent running of executables in functions locate in /tmp folder during their runtime post invocation.
        """
        return pulumi.get(self, "block_running_executables_in_tmp_folder")

    @property
    @pulumi.getter(name="blockedExecutables")
    def blocked_executables(self) -> Sequence[str]:
        """
        List of executables that are prevented from running in containers.
        """
        return pulumi.get(self, "blocked_executables")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the function runtime policy
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="driftPreventions")
    def drift_preventions(self) -> Optional[Sequence['outputs.GetFunctionRuntimePolicyDriftPreventionResult']]:
        """
        Drift prevention configuration.
        """
        return pulumi.get(self, "drift_preventions")

    @property
    @pulumi.getter
    def enabled(self) -> bool:
        """
        Indicates if the runtime policy is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def enforce(self) -> bool:
        """
        Indicates that policy should effect container execution (not just for audit).
        """
        return pulumi.get(self, "enforce")

    @property
    @pulumi.getter(name="executableBlacklists")
    def executable_blacklists(self) -> Optional[Sequence['outputs.GetFunctionRuntimePolicyExecutableBlacklistResult']]:
        """
        Executable blacklist configuration.
        """
        return pulumi.get(self, "executable_blacklists")

    @property
    @pulumi.getter(name="honeypotAccessKey")
    def honeypot_access_key(self) -> str:
        """
        Honeypot User ID (Access Key)
        """
        return pulumi.get(self, "honeypot_access_key")

    @property
    @pulumi.getter(name="honeypotApplyOns")
    def honeypot_apply_ons(self) -> Sequence[str]:
        """
        List of options to apply the honeypot on (Environment Vairable, Layer, File)
        """
        return pulumi.get(self, "honeypot_apply_ons")

    @property
    @pulumi.getter(name="honeypotSecretKey")
    def honeypot_secret_key(self) -> str:
        """
        Honeypot User Password (Secret Key)
        """
        return pulumi.get(self, "honeypot_secret_key")

    @property
    @pulumi.getter(name="honeypotServerlessAppName")
    def honeypot_serverless_app_name(self) -> str:
        """
        Serverless application name
        """
        return pulumi.get(self, "honeypot_serverless_app_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the function runtime policy
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="scopeExpression")
    def scope_expression(self) -> str:
        """
        Logical expression of how to compute the dependency of the scope variables.
        """
        return pulumi.get(self, "scope_expression")

    @property
    @pulumi.getter(name="scopeVariables")
    def scope_variables(self) -> Sequence['outputs.GetFunctionRuntimePolicyScopeVariableResult']:
        """
        List of scope attributes.
        """
        return pulumi.get(self, "scope_variables")


class AwaitableGetFunctionRuntimePolicyResult(GetFunctionRuntimePolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFunctionRuntimePolicyResult(
            application_scopes=self.application_scopes,
            author=self.author,
            block_malicious_executables=self.block_malicious_executables,
            block_malicious_executables_allowed_processes=self.block_malicious_executables_allowed_processes,
            block_running_executables_in_tmp_folder=self.block_running_executables_in_tmp_folder,
            blocked_executables=self.blocked_executables,
            description=self.description,
            drift_preventions=self.drift_preventions,
            enabled=self.enabled,
            enforce=self.enforce,
            executable_blacklists=self.executable_blacklists,
            honeypot_access_key=self.honeypot_access_key,
            honeypot_apply_ons=self.honeypot_apply_ons,
            honeypot_secret_key=self.honeypot_secret_key,
            honeypot_serverless_app_name=self.honeypot_serverless_app_name,
            id=self.id,
            name=self.name,
            scope_expression=self.scope_expression,
            scope_variables=self.scope_variables)


def get_function_runtime_policy(drift_preventions: Optional[Sequence[pulumi.InputType['GetFunctionRuntimePolicyDriftPreventionArgs']]] = None,
                                executable_blacklists: Optional[Sequence[pulumi.InputType['GetFunctionRuntimePolicyExecutableBlacklistArgs']]] = None,
                                name: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFunctionRuntimePolicyResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_aquasec as aquasec

    function_runtime_policy = aquasec.get_function_runtime_policy(name="FunctionRuntimePolicyName")
    pulumi.export("functionRuntimePolicyDetails", function_runtime_policy)
    ```


    :param Sequence[pulumi.InputType['GetFunctionRuntimePolicyDriftPreventionArgs']] drift_preventions: Drift prevention configuration.
    :param Sequence[pulumi.InputType['GetFunctionRuntimePolicyExecutableBlacklistArgs']] executable_blacklists: Executable blacklist configuration.
    :param str name: Name of the function runtime policy
    """
    __args__ = dict()
    __args__['driftPreventions'] = drift_preventions
    __args__['executableBlacklists'] = executable_blacklists
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aquasec:index/getFunctionRuntimePolicy:getFunctionRuntimePolicy', __args__, opts=opts, typ=GetFunctionRuntimePolicyResult).value

    return AwaitableGetFunctionRuntimePolicyResult(
        application_scopes=pulumi.get(__ret__, 'application_scopes'),
        author=pulumi.get(__ret__, 'author'),
        block_malicious_executables=pulumi.get(__ret__, 'block_malicious_executables'),
        block_malicious_executables_allowed_processes=pulumi.get(__ret__, 'block_malicious_executables_allowed_processes'),
        block_running_executables_in_tmp_folder=pulumi.get(__ret__, 'block_running_executables_in_tmp_folder'),
        blocked_executables=pulumi.get(__ret__, 'blocked_executables'),
        description=pulumi.get(__ret__, 'description'),
        drift_preventions=pulumi.get(__ret__, 'drift_preventions'),
        enabled=pulumi.get(__ret__, 'enabled'),
        enforce=pulumi.get(__ret__, 'enforce'),
        executable_blacklists=pulumi.get(__ret__, 'executable_blacklists'),
        honeypot_access_key=pulumi.get(__ret__, 'honeypot_access_key'),
        honeypot_apply_ons=pulumi.get(__ret__, 'honeypot_apply_ons'),
        honeypot_secret_key=pulumi.get(__ret__, 'honeypot_secret_key'),
        honeypot_serverless_app_name=pulumi.get(__ret__, 'honeypot_serverless_app_name'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        scope_expression=pulumi.get(__ret__, 'scope_expression'),
        scope_variables=pulumi.get(__ret__, 'scope_variables'))


@_utilities.lift_output_func(get_function_runtime_policy)
def get_function_runtime_policy_output(drift_preventions: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetFunctionRuntimePolicyDriftPreventionArgs']]]]] = None,
                                       executable_blacklists: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetFunctionRuntimePolicyExecutableBlacklistArgs']]]]] = None,
                                       name: Optional[pulumi.Input[str]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFunctionRuntimePolicyResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_aquasec as aquasec

    function_runtime_policy = aquasec.get_function_runtime_policy(name="FunctionRuntimePolicyName")
    pulumi.export("functionRuntimePolicyDetails", function_runtime_policy)
    ```


    :param Sequence[pulumi.InputType['GetFunctionRuntimePolicyDriftPreventionArgs']] drift_preventions: Drift prevention configuration.
    :param Sequence[pulumi.InputType['GetFunctionRuntimePolicyExecutableBlacklistArgs']] executable_blacklists: Executable blacklist configuration.
    :param str name: Name of the function runtime policy
    """
    ...
