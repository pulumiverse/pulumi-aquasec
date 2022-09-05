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
    'GetImageResult',
    'AwaitableGetImageResult',
    'get_image',
    'get_image_output',
]

@pulumi.output_type
class GetImageResult:
    """
    A collection of values returned by getImage.
    """
    def __init__(__self__, architecture=None, assurance_checks_performeds=None, author=None, blacklisted=None, comment=None, created=None, critical_vulnerabilities=None, default_user=None, digest=None, disallowed=None, disallowed_by_assurance_checks=None, docker_id=None, docker_labels=None, docker_version=None, dta_severity_score=None, dta_skipped=None, dta_skipped_reason=None, environment_variables=None, high_vulnerabilities=None, histories=None, id=None, image_size=None, image_type=None, labels=None, low_vulnerabilities=None, malware=None, medium_vulnerabilities=None, name=None, negligible_vulnerabilities=None, newer_image_exists=None, os=None, os_version=None, parent=None, partial_results=None, pending_disallowed=None, permission=None, permission_author=None, permission_comment=None, registry=None, registry_type=None, repo_digests=None, repository=None, scan_date=None, scan_error=None, scan_status=None, sensitive_data=None, tag=None, total_vulnerabilities=None, virtual_size=None, vulnerabilities=None, whitelisted=None):
        if architecture and not isinstance(architecture, str):
            raise TypeError("Expected argument 'architecture' to be a str")
        pulumi.set(__self__, "architecture", architecture)
        if assurance_checks_performeds and not isinstance(assurance_checks_performeds, list):
            raise TypeError("Expected argument 'assurance_checks_performeds' to be a list")
        pulumi.set(__self__, "assurance_checks_performeds", assurance_checks_performeds)
        if author and not isinstance(author, str):
            raise TypeError("Expected argument 'author' to be a str")
        pulumi.set(__self__, "author", author)
        if blacklisted and not isinstance(blacklisted, bool):
            raise TypeError("Expected argument 'blacklisted' to be a bool")
        pulumi.set(__self__, "blacklisted", blacklisted)
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if critical_vulnerabilities and not isinstance(critical_vulnerabilities, int):
            raise TypeError("Expected argument 'critical_vulnerabilities' to be a int")
        pulumi.set(__self__, "critical_vulnerabilities", critical_vulnerabilities)
        if default_user and not isinstance(default_user, str):
            raise TypeError("Expected argument 'default_user' to be a str")
        pulumi.set(__self__, "default_user", default_user)
        if digest and not isinstance(digest, str):
            raise TypeError("Expected argument 'digest' to be a str")
        pulumi.set(__self__, "digest", digest)
        if disallowed and not isinstance(disallowed, bool):
            raise TypeError("Expected argument 'disallowed' to be a bool")
        pulumi.set(__self__, "disallowed", disallowed)
        if disallowed_by_assurance_checks and not isinstance(disallowed_by_assurance_checks, bool):
            raise TypeError("Expected argument 'disallowed_by_assurance_checks' to be a bool")
        pulumi.set(__self__, "disallowed_by_assurance_checks", disallowed_by_assurance_checks)
        if docker_id and not isinstance(docker_id, str):
            raise TypeError("Expected argument 'docker_id' to be a str")
        pulumi.set(__self__, "docker_id", docker_id)
        if docker_labels and not isinstance(docker_labels, list):
            raise TypeError("Expected argument 'docker_labels' to be a list")
        pulumi.set(__self__, "docker_labels", docker_labels)
        if docker_version and not isinstance(docker_version, str):
            raise TypeError("Expected argument 'docker_version' to be a str")
        pulumi.set(__self__, "docker_version", docker_version)
        if dta_severity_score and not isinstance(dta_severity_score, str):
            raise TypeError("Expected argument 'dta_severity_score' to be a str")
        pulumi.set(__self__, "dta_severity_score", dta_severity_score)
        if dta_skipped and not isinstance(dta_skipped, bool):
            raise TypeError("Expected argument 'dta_skipped' to be a bool")
        pulumi.set(__self__, "dta_skipped", dta_skipped)
        if dta_skipped_reason and not isinstance(dta_skipped_reason, str):
            raise TypeError("Expected argument 'dta_skipped_reason' to be a str")
        pulumi.set(__self__, "dta_skipped_reason", dta_skipped_reason)
        if environment_variables and not isinstance(environment_variables, list):
            raise TypeError("Expected argument 'environment_variables' to be a list")
        pulumi.set(__self__, "environment_variables", environment_variables)
        if high_vulnerabilities and not isinstance(high_vulnerabilities, int):
            raise TypeError("Expected argument 'high_vulnerabilities' to be a int")
        pulumi.set(__self__, "high_vulnerabilities", high_vulnerabilities)
        if histories and not isinstance(histories, list):
            raise TypeError("Expected argument 'histories' to be a list")
        pulumi.set(__self__, "histories", histories)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if image_size and not isinstance(image_size, int):
            raise TypeError("Expected argument 'image_size' to be a int")
        pulumi.set(__self__, "image_size", image_size)
        if image_type and not isinstance(image_type, str):
            raise TypeError("Expected argument 'image_type' to be a str")
        pulumi.set(__self__, "image_type", image_type)
        if labels and not isinstance(labels, list):
            raise TypeError("Expected argument 'labels' to be a list")
        pulumi.set(__self__, "labels", labels)
        if low_vulnerabilities and not isinstance(low_vulnerabilities, int):
            raise TypeError("Expected argument 'low_vulnerabilities' to be a int")
        pulumi.set(__self__, "low_vulnerabilities", low_vulnerabilities)
        if malware and not isinstance(malware, int):
            raise TypeError("Expected argument 'malware' to be a int")
        pulumi.set(__self__, "malware", malware)
        if medium_vulnerabilities and not isinstance(medium_vulnerabilities, int):
            raise TypeError("Expected argument 'medium_vulnerabilities' to be a int")
        pulumi.set(__self__, "medium_vulnerabilities", medium_vulnerabilities)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if negligible_vulnerabilities and not isinstance(negligible_vulnerabilities, int):
            raise TypeError("Expected argument 'negligible_vulnerabilities' to be a int")
        pulumi.set(__self__, "negligible_vulnerabilities", negligible_vulnerabilities)
        if newer_image_exists and not isinstance(newer_image_exists, bool):
            raise TypeError("Expected argument 'newer_image_exists' to be a bool")
        pulumi.set(__self__, "newer_image_exists", newer_image_exists)
        if os and not isinstance(os, str):
            raise TypeError("Expected argument 'os' to be a str")
        pulumi.set(__self__, "os", os)
        if os_version and not isinstance(os_version, str):
            raise TypeError("Expected argument 'os_version' to be a str")
        pulumi.set(__self__, "os_version", os_version)
        if parent and not isinstance(parent, str):
            raise TypeError("Expected argument 'parent' to be a str")
        pulumi.set(__self__, "parent", parent)
        if partial_results and not isinstance(partial_results, bool):
            raise TypeError("Expected argument 'partial_results' to be a bool")
        pulumi.set(__self__, "partial_results", partial_results)
        if pending_disallowed and not isinstance(pending_disallowed, bool):
            raise TypeError("Expected argument 'pending_disallowed' to be a bool")
        pulumi.set(__self__, "pending_disallowed", pending_disallowed)
        if permission and not isinstance(permission, str):
            raise TypeError("Expected argument 'permission' to be a str")
        pulumi.set(__self__, "permission", permission)
        if permission_author and not isinstance(permission_author, str):
            raise TypeError("Expected argument 'permission_author' to be a str")
        pulumi.set(__self__, "permission_author", permission_author)
        if permission_comment and not isinstance(permission_comment, str):
            raise TypeError("Expected argument 'permission_comment' to be a str")
        pulumi.set(__self__, "permission_comment", permission_comment)
        if registry and not isinstance(registry, str):
            raise TypeError("Expected argument 'registry' to be a str")
        pulumi.set(__self__, "registry", registry)
        if registry_type and not isinstance(registry_type, str):
            raise TypeError("Expected argument 'registry_type' to be a str")
        pulumi.set(__self__, "registry_type", registry_type)
        if repo_digests and not isinstance(repo_digests, list):
            raise TypeError("Expected argument 'repo_digests' to be a list")
        pulumi.set(__self__, "repo_digests", repo_digests)
        if repository and not isinstance(repository, str):
            raise TypeError("Expected argument 'repository' to be a str")
        pulumi.set(__self__, "repository", repository)
        if scan_date and not isinstance(scan_date, str):
            raise TypeError("Expected argument 'scan_date' to be a str")
        pulumi.set(__self__, "scan_date", scan_date)
        if scan_error and not isinstance(scan_error, str):
            raise TypeError("Expected argument 'scan_error' to be a str")
        pulumi.set(__self__, "scan_error", scan_error)
        if scan_status and not isinstance(scan_status, str):
            raise TypeError("Expected argument 'scan_status' to be a str")
        pulumi.set(__self__, "scan_status", scan_status)
        if sensitive_data and not isinstance(sensitive_data, int):
            raise TypeError("Expected argument 'sensitive_data' to be a int")
        pulumi.set(__self__, "sensitive_data", sensitive_data)
        if tag and not isinstance(tag, str):
            raise TypeError("Expected argument 'tag' to be a str")
        pulumi.set(__self__, "tag", tag)
        if total_vulnerabilities and not isinstance(total_vulnerabilities, int):
            raise TypeError("Expected argument 'total_vulnerabilities' to be a int")
        pulumi.set(__self__, "total_vulnerabilities", total_vulnerabilities)
        if virtual_size and not isinstance(virtual_size, int):
            raise TypeError("Expected argument 'virtual_size' to be a int")
        pulumi.set(__self__, "virtual_size", virtual_size)
        if vulnerabilities and not isinstance(vulnerabilities, list):
            raise TypeError("Expected argument 'vulnerabilities' to be a list")
        pulumi.set(__self__, "vulnerabilities", vulnerabilities)
        if whitelisted and not isinstance(whitelisted, bool):
            raise TypeError("Expected argument 'whitelisted' to be a bool")
        pulumi.set(__self__, "whitelisted", whitelisted)

    @property
    @pulumi.getter
    def architecture(self) -> str:
        """
        The image architecture.
        """
        return pulumi.get(self, "architecture")

    @property
    @pulumi.getter(name="assuranceChecksPerformeds")
    def assurance_checks_performeds(self) -> Sequence['outputs.GetImageAssuranceChecksPerformedResult']:
        """
        The list of image assurance checks performed on the image.
        """
        return pulumi.get(self, "assurance_checks_performeds")

    @property
    @pulumi.getter
    def author(self) -> str:
        """
        The name of the user who registered the image.
        """
        return pulumi.get(self, "author")

    @property
    @pulumi.getter
    def blacklisted(self) -> bool:
        """
        Whether the image is blacklisted.
        """
        return pulumi.get(self, "blacklisted")

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        The image creation comment.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        The date and time when the image was registered.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="criticalVulnerabilities")
    def critical_vulnerabilities(self) -> int:
        """
        Number of critical severity vulnerabilities detected in the image.
        """
        return pulumi.get(self, "critical_vulnerabilities")

    @property
    @pulumi.getter(name="defaultUser")
    def default_user(self) -> str:
        """
        The default user of the image.
        """
        return pulumi.get(self, "default_user")

    @property
    @pulumi.getter
    def digest(self) -> str:
        """
        The content digest of the image.
        """
        return pulumi.get(self, "digest")

    @property
    @pulumi.getter
    def disallowed(self) -> bool:
        """
        Whether the image is disallowed (non-compliant).
        """
        return pulumi.get(self, "disallowed")

    @property
    @pulumi.getter(name="disallowedByAssuranceChecks")
    def disallowed_by_assurance_checks(self) -> bool:
        """
        Whether the image was disallowed because of Image Assurance Policies.
        """
        return pulumi.get(self, "disallowed_by_assurance_checks")

    @property
    @pulumi.getter(name="dockerId")
    def docker_id(self) -> str:
        """
        The Docker image ID.
        """
        return pulumi.get(self, "docker_id")

    @property
    @pulumi.getter(name="dockerLabels")
    def docker_labels(self) -> Sequence[str]:
        """
        Docker labels of the image.
        """
        return pulumi.get(self, "docker_labels")

    @property
    @pulumi.getter(name="dockerVersion")
    def docker_version(self) -> str:
        """
        The Docker version used when building the image.
        """
        return pulumi.get(self, "docker_version")

    @property
    @pulumi.getter(name="dtaSeverityScore")
    def dta_severity_score(self) -> str:
        """
        DTA severity score.
        """
        return pulumi.get(self, "dta_severity_score")

    @property
    @pulumi.getter(name="dtaSkipped")
    def dta_skipped(self) -> bool:
        """
        If DTA was skipped.
        """
        return pulumi.get(self, "dta_skipped")

    @property
    @pulumi.getter(name="dtaSkippedReason")
    def dta_skipped_reason(self) -> str:
        """
        The reason why DTA was skipped.
        """
        return pulumi.get(self, "dta_skipped_reason")

    @property
    @pulumi.getter(name="environmentVariables")
    def environment_variables(self) -> Sequence[str]:
        """
        Environment variables in the image.
        """
        return pulumi.get(self, "environment_variables")

    @property
    @pulumi.getter(name="highVulnerabilities")
    def high_vulnerabilities(self) -> int:
        """
        Number of high severity vulnerabilities detected in the image.
        """
        return pulumi.get(self, "high_vulnerabilities")

    @property
    @pulumi.getter
    def histories(self) -> Sequence['outputs.GetImageHistoryResult']:
        """
        The Docker history of the image.
        """
        return pulumi.get(self, "histories")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="imageSize")
    def image_size(self) -> int:
        """
        The size of the image in bytes.
        """
        return pulumi.get(self, "image_size")

    @property
    @pulumi.getter(name="imageType")
    def image_type(self) -> str:
        """
        The type of the image.
        """
        return pulumi.get(self, "image_type")

    @property
    @pulumi.getter
    def labels(self) -> Sequence[str]:
        """
        Aqua labels of the image.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="lowVulnerabilities")
    def low_vulnerabilities(self) -> int:
        """
        Number of low severity vulnerabilities detected in the image.
        """
        return pulumi.get(self, "low_vulnerabilities")

    @property
    @pulumi.getter
    def malware(self) -> int:
        """
        Number of malware found on the image.
        """
        return pulumi.get(self, "malware")

    @property
    @pulumi.getter(name="mediumVulnerabilities")
    def medium_vulnerabilities(self) -> int:
        """
        Number of medium severity vulnerabilities detected in the image.
        """
        return pulumi.get(self, "medium_vulnerabilities")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the image.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="negligibleVulnerabilities")
    def negligible_vulnerabilities(self) -> int:
        """
        Number of negligible severity vulnerabilities detected in the image.
        """
        return pulumi.get(self, "negligible_vulnerabilities")

    @property
    @pulumi.getter(name="newerImageExists")
    def newer_image_exists(self) -> bool:
        """
        Whether a new version of the image is available in the registry but is not scanned and registered yet.
        """
        return pulumi.get(self, "newer_image_exists")

    @property
    @pulumi.getter
    def os(self) -> str:
        """
        The operating system detected in the image
        """
        return pulumi.get(self, "os")

    @property
    @pulumi.getter(name="osVersion")
    def os_version(self) -> str:
        """
        The version of the OS detected in the image.
        """
        return pulumi.get(self, "os_version")

    @property
    @pulumi.getter
    def parent(self) -> str:
        """
        The ID of the parent image.
        """
        return pulumi.get(self, "parent")

    @property
    @pulumi.getter(name="partialResults")
    def partial_results(self) -> bool:
        """
        Whether the image could only be partially scanned.
        """
        return pulumi.get(self, "partial_results")

    @property
    @pulumi.getter(name="pendingDisallowed")
    def pending_disallowed(self) -> bool:
        """
        Whether the image is non-compliant, but is pending this status due to running containers.
        """
        return pulumi.get(self, "pending_disallowed")

    @property
    @pulumi.getter
    def permission(self) -> str:
        """
        Permission of the image.
        """
        return pulumi.get(self, "permission")

    @property
    @pulumi.getter(name="permissionAuthor")
    def permission_author(self) -> str:
        """
        The name of the user who last modified the image permissions.
        """
        return pulumi.get(self, "permission_author")

    @property
    @pulumi.getter(name="permissionComment")
    def permission_comment(self) -> str:
        """
        The comment provided when the image permissions were last modified
        """
        return pulumi.get(self, "permission_comment")

    @property
    @pulumi.getter
    def registry(self) -> str:
        """
        The name of the registry where the image is stored.
        """
        return pulumi.get(self, "registry")

    @property
    @pulumi.getter(name="registryType")
    def registry_type(self) -> str:
        """
        Type of the registry.
        """
        return pulumi.get(self, "registry_type")

    @property
    @pulumi.getter(name="repoDigests")
    def repo_digests(self) -> Sequence[str]:
        """
        The repository digests.
        """
        return pulumi.get(self, "repo_digests")

    @property
    @pulumi.getter
    def repository(self) -> str:
        """
        The name of the image's repository.
        """
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter(name="scanDate")
    def scan_date(self) -> str:
        """
        The date and time when the image was last scanned.
        """
        return pulumi.get(self, "scan_date")

    @property
    @pulumi.getter(name="scanError")
    def scan_error(self) -> str:
        """
        If the image scan failed, the failure message.
        """
        return pulumi.get(self, "scan_error")

    @property
    @pulumi.getter(name="scanStatus")
    def scan_status(self) -> str:
        """
        The scan status of the image (either 'pending', 'in*progress', 'finished', 'failed' or 'not*started').
        """
        return pulumi.get(self, "scan_status")

    @property
    @pulumi.getter(name="sensitiveData")
    def sensitive_data(self) -> int:
        """
        Number of sensitive data detected in the image.
        """
        return pulumi.get(self, "sensitive_data")

    @property
    @pulumi.getter
    def tag(self) -> str:
        """
        The tag of the image.
        """
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter(name="totalVulnerabilities")
    def total_vulnerabilities(self) -> int:
        """
        The total number of vulnerabilities detected in the image.
        """
        return pulumi.get(self, "total_vulnerabilities")

    @property
    @pulumi.getter(name="virtualSize")
    def virtual_size(self) -> int:
        """
        The virtual size of the image.
        """
        return pulumi.get(self, "virtual_size")

    @property
    @pulumi.getter
    def vulnerabilities(self) -> Sequence['outputs.GetImageVulnerabilityResult']:
        """
        A list of all the vulnerabilities found in the image
        """
        return pulumi.get(self, "vulnerabilities")

    @property
    @pulumi.getter
    def whitelisted(self) -> bool:
        """
        Whether the image is whitelisted.
        """
        return pulumi.get(self, "whitelisted")


class AwaitableGetImageResult(GetImageResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImageResult(
            architecture=self.architecture,
            assurance_checks_performeds=self.assurance_checks_performeds,
            author=self.author,
            blacklisted=self.blacklisted,
            comment=self.comment,
            created=self.created,
            critical_vulnerabilities=self.critical_vulnerabilities,
            default_user=self.default_user,
            digest=self.digest,
            disallowed=self.disallowed,
            disallowed_by_assurance_checks=self.disallowed_by_assurance_checks,
            docker_id=self.docker_id,
            docker_labels=self.docker_labels,
            docker_version=self.docker_version,
            dta_severity_score=self.dta_severity_score,
            dta_skipped=self.dta_skipped,
            dta_skipped_reason=self.dta_skipped_reason,
            environment_variables=self.environment_variables,
            high_vulnerabilities=self.high_vulnerabilities,
            histories=self.histories,
            id=self.id,
            image_size=self.image_size,
            image_type=self.image_type,
            labels=self.labels,
            low_vulnerabilities=self.low_vulnerabilities,
            malware=self.malware,
            medium_vulnerabilities=self.medium_vulnerabilities,
            name=self.name,
            negligible_vulnerabilities=self.negligible_vulnerabilities,
            newer_image_exists=self.newer_image_exists,
            os=self.os,
            os_version=self.os_version,
            parent=self.parent,
            partial_results=self.partial_results,
            pending_disallowed=self.pending_disallowed,
            permission=self.permission,
            permission_author=self.permission_author,
            permission_comment=self.permission_comment,
            registry=self.registry,
            registry_type=self.registry_type,
            repo_digests=self.repo_digests,
            repository=self.repository,
            scan_date=self.scan_date,
            scan_error=self.scan_error,
            scan_status=self.scan_status,
            sensitive_data=self.sensitive_data,
            tag=self.tag,
            total_vulnerabilities=self.total_vulnerabilities,
            virtual_size=self.virtual_size,
            vulnerabilities=self.vulnerabilities,
            whitelisted=self.whitelisted)


def get_image(registry: Optional[str] = None,
              repository: Optional[str] = None,
              tag: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImageResult:
    """
    Use this data source to access information about an existing resource.

    :param str registry: The name of the registry where the image is stored.
    :param str repository: The name of the image's repository.
    :param str tag: The tag of the image.
    """
    __args__ = dict()
    __args__['registry'] = registry
    __args__['repository'] = repository
    __args__['tag'] = tag
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aquasec:index/getImage:getImage', __args__, opts=opts, typ=GetImageResult).value

    return AwaitableGetImageResult(
        architecture=__ret__.architecture,
        assurance_checks_performeds=__ret__.assurance_checks_performeds,
        author=__ret__.author,
        blacklisted=__ret__.blacklisted,
        comment=__ret__.comment,
        created=__ret__.created,
        critical_vulnerabilities=__ret__.critical_vulnerabilities,
        default_user=__ret__.default_user,
        digest=__ret__.digest,
        disallowed=__ret__.disallowed,
        disallowed_by_assurance_checks=__ret__.disallowed_by_assurance_checks,
        docker_id=__ret__.docker_id,
        docker_labels=__ret__.docker_labels,
        docker_version=__ret__.docker_version,
        dta_severity_score=__ret__.dta_severity_score,
        dta_skipped=__ret__.dta_skipped,
        dta_skipped_reason=__ret__.dta_skipped_reason,
        environment_variables=__ret__.environment_variables,
        high_vulnerabilities=__ret__.high_vulnerabilities,
        histories=__ret__.histories,
        id=__ret__.id,
        image_size=__ret__.image_size,
        image_type=__ret__.image_type,
        labels=__ret__.labels,
        low_vulnerabilities=__ret__.low_vulnerabilities,
        malware=__ret__.malware,
        medium_vulnerabilities=__ret__.medium_vulnerabilities,
        name=__ret__.name,
        negligible_vulnerabilities=__ret__.negligible_vulnerabilities,
        newer_image_exists=__ret__.newer_image_exists,
        os=__ret__.os,
        os_version=__ret__.os_version,
        parent=__ret__.parent,
        partial_results=__ret__.partial_results,
        pending_disallowed=__ret__.pending_disallowed,
        permission=__ret__.permission,
        permission_author=__ret__.permission_author,
        permission_comment=__ret__.permission_comment,
        registry=__ret__.registry,
        registry_type=__ret__.registry_type,
        repo_digests=__ret__.repo_digests,
        repository=__ret__.repository,
        scan_date=__ret__.scan_date,
        scan_error=__ret__.scan_error,
        scan_status=__ret__.scan_status,
        sensitive_data=__ret__.sensitive_data,
        tag=__ret__.tag,
        total_vulnerabilities=__ret__.total_vulnerabilities,
        virtual_size=__ret__.virtual_size,
        vulnerabilities=__ret__.vulnerabilities,
        whitelisted=__ret__.whitelisted)


@_utilities.lift_output_func(get_image)
def get_image_output(registry: Optional[pulumi.Input[str]] = None,
                     repository: Optional[pulumi.Input[str]] = None,
                     tag: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetImageResult]:
    """
    Use this data source to access information about an existing resource.

    :param str registry: The name of the registry where the image is stored.
    :param str repository: The name of the image's repository.
    :param str tag: The tag of the image.
    """
    ...
