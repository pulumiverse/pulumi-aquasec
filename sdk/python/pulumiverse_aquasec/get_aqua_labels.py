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
    'GetAquaLabelsResult',
    'AwaitableGetAquaLabelsResult',
    'get_aqua_labels',
]

@pulumi.output_type
class GetAquaLabelsResult:
    """
    A collection of values returned by getAquaLabels.
    """
    def __init__(__self__, aqua_labels=None, id=None):
        if aqua_labels and not isinstance(aqua_labels, list):
            raise TypeError("Expected argument 'aqua_labels' to be a list")
        pulumi.set(__self__, "aqua_labels", aqua_labels)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="aquaLabels")
    def aqua_labels(self) -> Sequence['outputs.GetAquaLabelsAquaLabelResult']:
        return pulumi.get(self, "aqua_labels")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetAquaLabelsResult(GetAquaLabelsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAquaLabelsResult(
            aqua_labels=self.aqua_labels,
            id=self.id)


def get_aqua_labels(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAquaLabelsResult:
    """
    The data source `get_aqua_labels` provides a method to query all aqua labels within the Aqua account management.The fields returned from this query are detailed in the Schema section below.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aquasec as aquasec

    aqua_labels = aquasec.get_aqua_labels()
    pulumi.export("scopes", aqua_labels)
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aquasec:index/getAquaLabels:getAquaLabels', __args__, opts=opts, typ=GetAquaLabelsResult).value

    return AwaitableGetAquaLabelsResult(
        aqua_labels=__ret__.aqua_labels,
        id=__ret__.id)
