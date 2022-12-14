// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class RoleMappingOauth2 {
    /**
     * @return Role Mapping is used to define the IdP role that the user will assume in Aqua
     * 
     */
    private Map<String,String> roleMapping;

    private RoleMappingOauth2() {}
    /**
     * @return Role Mapping is used to define the IdP role that the user will assume in Aqua
     * 
     */
    public Map<String,String> roleMapping() {
        return this.roleMapping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleMappingOauth2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> roleMapping;
        public Builder() {}
        public Builder(RoleMappingOauth2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleMapping = defaults.roleMapping;
        }

        @CustomType.Setter
        public Builder roleMapping(Map<String,String> roleMapping) {
            this.roleMapping = Objects.requireNonNull(roleMapping);
            return this;
        }
        public RoleMappingOauth2 build() {
            final var o = new RoleMappingOauth2();
            o.roleMapping = roleMapping;
            return o;
        }
    }
}
