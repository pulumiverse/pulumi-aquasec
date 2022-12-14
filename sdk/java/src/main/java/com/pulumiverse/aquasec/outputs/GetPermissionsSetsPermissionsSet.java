// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPermissionsSetsPermissionsSet {
    private List<String> actions;
    private String author;
    private String description;
    private Boolean isSuper;
    private String name;
    private Boolean uiAccess;
    private String updatedAt;

    private GetPermissionsSetsPermissionsSet() {}
    public List<String> actions() {
        return this.actions;
    }
    public String author() {
        return this.author;
    }
    public String description() {
        return this.description;
    }
    public Boolean isSuper() {
        return this.isSuper;
    }
    public String name() {
        return this.name;
    }
    public Boolean uiAccess() {
        return this.uiAccess;
    }
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsSetsPermissionsSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> actions;
        private String author;
        private String description;
        private Boolean isSuper;
        private String name;
        private Boolean uiAccess;
        private String updatedAt;
        public Builder() {}
        public Builder(GetPermissionsSetsPermissionsSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.author = defaults.author;
    	      this.description = defaults.description;
    	      this.isSuper = defaults.isSuper;
    	      this.name = defaults.name;
    	      this.uiAccess = defaults.uiAccess;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder author(String author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder isSuper(Boolean isSuper) {
            this.isSuper = Objects.requireNonNull(isSuper);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder uiAccess(Boolean uiAccess) {
            this.uiAccess = Objects.requireNonNull(uiAccess);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public GetPermissionsSetsPermissionsSet build() {
            final var o = new GetPermissionsSetsPermissionsSet();
            o.actions = actions;
            o.author = author;
            o.description = description;
            o.isSuper = isSuper;
            o.name = name;
            o.uiAccess = uiAccess;
            o.updatedAt = updatedAt;
            return o;
        }
    }
}
