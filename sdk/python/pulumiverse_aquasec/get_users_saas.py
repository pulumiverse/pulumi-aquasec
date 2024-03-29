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

__all__ = [
    'GetUsersSaasResult',
    'AwaitableGetUsersSaasResult',
    'get_users_saas',
    'get_users_saas_output',
]

@pulumi.output_type
class GetUsersSaasResult:
    """
    A collection of values returned by getUsersSaas.
    """
    def __init__(__self__, id=None, users=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def users(self) -> Sequence['outputs.GetUsersSaasUserResult']:
        return pulumi.get(self, "users")


class AwaitableGetUsersSaasResult(GetUsersSaasResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUsersSaasResult(
            id=self.id,
            users=self.users)


def get_users_saas(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUsersSaasResult:
    """
    The data source `get_users_saas` provides a method to query all saas users within the Aqua users management. The fields returned from this query are detailed in the Schema section below.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aquasec as aquasec

    users = aquasec.get_users()
    pulumi.export("firstUserEmail", data["aquasec_users_saas"]["users"]["users"][0]["email"])
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aquasec:index/getUsersSaas:getUsersSaas', __args__, opts=opts, typ=GetUsersSaasResult).value

    return AwaitableGetUsersSaasResult(
        id=pulumi.get(__ret__, 'id'),
        users=pulumi.get(__ret__, 'users'))


@_utilities.lift_output_func(get_users_saas)
def get_users_saas_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUsersSaasResult]:
    """
    The data source `get_users_saas` provides a method to query all saas users within the Aqua users management. The fields returned from this query are detailed in the Schema section below.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aquasec as aquasec

    users = aquasec.get_users()
    pulumi.export("firstUserEmail", data["aquasec_users_saas"]["users"]["users"][0]["email"])
    ```
    """
    ...
