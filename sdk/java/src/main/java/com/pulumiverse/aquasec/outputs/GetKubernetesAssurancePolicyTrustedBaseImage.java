// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesAssurancePolicyTrustedBaseImage {
    private final String imagename;
    private final String registry;

    @CustomType.Constructor
    private GetKubernetesAssurancePolicyTrustedBaseImage(
        @CustomType.Parameter("imagename") String imagename,
        @CustomType.Parameter("registry") String registry) {
        this.imagename = imagename;
        this.registry = registry;
    }

    public String imagename() {
        return this.imagename;
    }
    public String registry() {
        return this.registry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesAssurancePolicyTrustedBaseImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imagename;
        private String registry;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKubernetesAssurancePolicyTrustedBaseImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imagename = defaults.imagename;
    	      this.registry = defaults.registry;
        }

        public Builder imagename(String imagename) {
            this.imagename = Objects.requireNonNull(imagename);
            return this;
        }
        public Builder registry(String registry) {
            this.registry = Objects.requireNonNull(registry);
            return this;
        }        public GetKubernetesAssurancePolicyTrustedBaseImage build() {
            return new GetKubernetesAssurancePolicyTrustedBaseImage(imagename, registry);
        }
    }
}