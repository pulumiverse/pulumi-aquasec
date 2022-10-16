// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumiverse.aquasec.outputs.GetRolesMappingSaasRolesMapping;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRolesMappingSaasResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetRolesMappingSaasRolesMapping> rolesMappings;

    @CustomType.Constructor
    private GetRolesMappingSaasResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("rolesMappings") List<GetRolesMappingSaasRolesMapping> rolesMappings) {
        this.id = id;
        this.rolesMappings = rolesMappings;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetRolesMappingSaasRolesMapping> rolesMappings() {
        return this.rolesMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolesMappingSaasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<GetRolesMappingSaasRolesMapping> rolesMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRolesMappingSaasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.rolesMappings = defaults.rolesMappings;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder rolesMappings(List<GetRolesMappingSaasRolesMapping> rolesMappings) {
            this.rolesMappings = Objects.requireNonNull(rolesMappings);
            return this;
        }
        public Builder rolesMappings(GetRolesMappingSaasRolesMapping... rolesMappings) {
            return rolesMappings(List.of(rolesMappings));
        }        public GetRolesMappingSaasResult build() {
            return new GetRolesMappingSaasResult(id, rolesMappings);
        }
    }
}