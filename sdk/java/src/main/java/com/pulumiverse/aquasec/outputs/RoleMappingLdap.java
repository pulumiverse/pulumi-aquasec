// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class RoleMappingLdap {
    /**
     * @return Role Mapping is used to define the IdP role that the user will assume in Aqua
     * 
     */
    private Map<String,String> roleMapping;

    private RoleMappingLdap() {}
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

    public static Builder builder(RoleMappingLdap defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> roleMapping;
        public Builder() {}
        public Builder(RoleMappingLdap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleMapping = defaults.roleMapping;
        }

        @CustomType.Setter
        public Builder roleMapping(Map<String,String> roleMapping) {
            this.roleMapping = Objects.requireNonNull(roleMapping);
            return this;
        }
        public RoleMappingLdap build() {
            final var o = new RoleMappingLdap();
            o.roleMapping = roleMapping;
            return o;
        }
    }
}