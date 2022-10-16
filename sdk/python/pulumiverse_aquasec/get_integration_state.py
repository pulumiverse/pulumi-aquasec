# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetIntegrationStateResult',
    'AwaitableGetIntegrationStateResult',
    'get_integration_state',
]

@pulumi.output_type
class GetIntegrationStateResult:
    """
    A collection of values returned by getIntegrationState.
    """
    def __init__(__self__, id=None, oidc_settings=None, openid_settings=None, saml_settings=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if oidc_settings and not isinstance(oidc_settings, bool):
            raise TypeError("Expected argument 'oidc_settings' to be a bool")
        pulumi.set(__self__, "oidc_settings", oidc_settings)
        if openid_settings and not isinstance(openid_settings, bool):
            raise TypeError("Expected argument 'openid_settings' to be a bool")
        pulumi.set(__self__, "openid_settings", openid_settings)
        if saml_settings and not isinstance(saml_settings, bool):
            raise TypeError("Expected argument 'saml_settings' to be a bool")
        pulumi.set(__self__, "saml_settings", saml_settings)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="oidcSettings")
    def oidc_settings(self) -> bool:
        """
        OIDCSettings enabled status
        """
        return pulumi.get(self, "oidc_settings")

    @property
    @pulumi.getter(name="openidSettings")
    def openid_settings(self) -> bool:
        """
        OpenIdSettings enabled status
        """
        return pulumi.get(self, "openid_settings")

    @property
    @pulumi.getter(name="samlSettings")
    def saml_settings(self) -> bool:
        """
        SAMLSettings enabled status
        """
        return pulumi.get(self, "saml_settings")


class AwaitableGetIntegrationStateResult(GetIntegrationStateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIntegrationStateResult(
            id=self.id,
            oidc_settings=self.oidc_settings,
            openid_settings=self.openid_settings,
            saml_settings=self.saml_settings)


def get_integration_state(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIntegrationStateResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_aquasec as aquasec

    integration_state = aquasec.get_integration_state()
    pulumi.export("aquasecIntegrationState", integration_state)
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aquasec:index/getIntegrationState:getIntegrationState', __args__, opts=opts, typ=GetIntegrationStateResult).value

    return AwaitableGetIntegrationStateResult(
        id=__ret__.id,
        oidc_settings=__ret__.oidc_settings,
        openid_settings=__ret__.openid_settings,
        saml_settings=__ret__.saml_settings)