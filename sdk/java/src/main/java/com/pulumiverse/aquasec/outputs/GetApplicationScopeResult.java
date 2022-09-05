// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumiverse.aquasec.outputs.GetApplicationScopeCategory;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationScopeResult {
    /**
     * @return Username of the account that created the service.
     * 
     */
    private final String author;
    /**
     * @return Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
     * 
     */
    private final @Nullable List<GetApplicationScopeCategory> categories;
    /**
     * @return Description of the application scope.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Name of an application scope.
     * 
     */
    private final String name;
    /**
     * @return Name of an application scope.
     * 
     */
    private final @Nullable String ownerEmail;

    @CustomType.Constructor
    private GetApplicationScopeResult(
        @CustomType.Parameter("author") String author,
        @CustomType.Parameter("categories") @Nullable List<GetApplicationScopeCategory> categories,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("ownerEmail") @Nullable String ownerEmail) {
        this.author = author;
        this.categories = categories;
        this.description = description;
        this.id = id;
        this.name = name;
        this.ownerEmail = ownerEmail;
    }

    /**
     * @return Username of the account that created the service.
     * 
     */
    public String author() {
        return this.author;
    }
    /**
     * @return Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
     * 
     */
    public List<GetApplicationScopeCategory> categories() {
        return this.categories == null ? List.of() : this.categories;
    }
    /**
     * @return Description of the application scope.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of an application scope.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Name of an application scope.
     * 
     */
    public Optional<String> ownerEmail() {
        return Optional.ofNullable(this.ownerEmail);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationScopeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String author;
        private @Nullable List<GetApplicationScopeCategory> categories;
        private @Nullable String description;
        private String id;
        private String name;
        private @Nullable String ownerEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationScopeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.ownerEmail = defaults.ownerEmail;
        }

        public Builder author(String author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }
        public Builder categories(@Nullable List<GetApplicationScopeCategory> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(GetApplicationScopeCategory... categories) {
            return categories(List.of(categories));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder ownerEmail(@Nullable String ownerEmail) {
            this.ownerEmail = ownerEmail;
            return this;
        }        public GetApplicationScopeResult build() {
            return new GetApplicationScopeResult(author, categories, description, id, name, ownerEmail);
        }
    }
}
