// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUsersSaasUserGroup {
    private final String created;
    /**
     * @return The ID of this resource.
     * 
     */
    private final Integer id;
    private final String name;

    @CustomType.Constructor
    private GetUsersSaasUserGroup(
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("id") Integer id,
        @CustomType.Parameter("name") String name) {
        this.created = created;
        this.id = id;
        this.name = name;
    }

    public String created() {
        return this.created;
    }
    /**
     * @return The ID of this resource.
     * 
     */
    public Integer id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersSaasUserGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String created;
        private Integer id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUsersSaasUserGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetUsersSaasUserGroup build() {
            return new GetUsersSaasUserGroup(created, id, name);
        }
    }
}
