// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.ApplicationScopeCategoryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationScopeArgs Empty = new ApplicationScopeArgs();

    /**
     * Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
     * 
     */
    @Import(name="categories")
    private @Nullable Output<List<ApplicationScopeCategoryArgs>> categories;

    /**
     * @return Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
     * 
     */
    public Optional<Output<List<ApplicationScopeCategoryArgs>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * Description of the application scope.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the application scope.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of an application scope.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of an application scope.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of an application scope.
     * 
     */
    @Import(name="ownerEmail")
    private @Nullable Output<String> ownerEmail;

    /**
     * @return Name of an application scope.
     * 
     */
    public Optional<Output<String>> ownerEmail() {
        return Optional.ofNullable(this.ownerEmail);
    }

    private ApplicationScopeArgs() {}

    private ApplicationScopeArgs(ApplicationScopeArgs $) {
        this.categories = $.categories;
        this.description = $.description;
        this.name = $.name;
        this.ownerEmail = $.ownerEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationScopeArgs $;

        public Builder() {
            $ = new ApplicationScopeArgs();
        }

        public Builder(ApplicationScopeArgs defaults) {
            $ = new ApplicationScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categories Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
         * 
         * @return builder
         * 
         */
        public Builder categories(@Nullable Output<List<ApplicationScopeCategoryArgs>> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
         * 
         * @return builder
         * 
         */
        public Builder categories(List<ApplicationScopeCategoryArgs> categories) {
            return categories(Output.of(categories));
        }

        /**
         * @param categories Artifacts (of applications) / Workloads (containers) / Infrastructure (elements).
         * 
         * @return builder
         * 
         */
        public Builder categories(ApplicationScopeCategoryArgs... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param description Description of the application scope.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the application scope.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of an application scope.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of an application scope.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerEmail Name of an application scope.
         * 
         * @return builder
         * 
         */
        public Builder ownerEmail(@Nullable Output<String> ownerEmail) {
            $.ownerEmail = ownerEmail;
            return this;
        }

        /**
         * @param ownerEmail Name of an application scope.
         * 
         * @return builder
         * 
         */
        public Builder ownerEmail(String ownerEmail) {
            return ownerEmail(Output.of(ownerEmail));
        }

        public ApplicationScopeArgs build() {
            return $;
        }
    }

}
