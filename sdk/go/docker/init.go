// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package docker

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "docker:index/container:Container":
		r = &Container{}
	case "docker:index/network:Network":
		r = &Network{}
	case "docker:index/plugin:Plugin":
		r = &Plugin{}
	case "docker:index/registryImage:RegistryImage":
		r = &RegistryImage{}
	case "docker:index/remoteImage:RemoteImage":
		r = &RemoteImage{}
	case "docker:index/secret:Secret":
		r = &Secret{}
	case "docker:index/service:Service":
		r = &Service{}
	case "docker:index/serviceConfig:ServiceConfig":
		r = &ServiceConfig{}
	case "docker:index/tag:Tag":
		r = &Tag{}
	case "docker:index/volume:Volume":
		r = &Volume{}
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
	if typ != "pulumi:providers:docker" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"docker",
		"index/container",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"docker",
		"index/network",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"docker",
		"index/plugin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"docker",
		"index/registryImage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"docker",
		"index/remoteImage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"docker",
		"index/secret",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"docker",
		"index/service",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"docker",
		"index/serviceConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"docker",
		"index/tag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"docker",
		"index/volume",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"docker",
		&pkg{version},
	)
}
