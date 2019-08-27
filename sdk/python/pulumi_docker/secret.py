# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Secret(pulumi.CustomResource):
    data: pulumi.Output[str]
    """
    The base64 encoded data of the secret.
    """
    labels: pulumi.Output[dict]
    """
    User-defined key/value metadata.
    """
    name: pulumi.Output[str]
    """
    The name of the Docker secret.
    """
    def __init__(__self__, resource_name, opts=None, data=None, labels=None, name=None, __props__=None, __name__=None, __opts__=None):
        """
        Manages the secrets of a Docker service in a swarm.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data: The base64 encoded data of the secret.
        :param pulumi.Input[dict] labels: User-defined key/value metadata.
        :param pulumi.Input[str] name: The name of the Docker secret.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-docker/blob/master/website/docs/r/secret.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if data is None:
                raise TypeError("Missing required property 'data'")
            __props__['data'] = data
            __props__['labels'] = labels
            __props__['name'] = name
        super(Secret, __self__).__init__(
            'docker:index/secret:Secret',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, data=None, labels=None, name=None):
        """
        Get an existing Secret resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data: The base64 encoded data of the secret.
        :param pulumi.Input[dict] labels: User-defined key/value metadata.
        :param pulumi.Input[str] name: The name of the Docker secret.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-docker/blob/master/website/docs/r/secret.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["data"] = data
        __props__["labels"] = labels
        __props__["name"] = name
        return Secret(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

