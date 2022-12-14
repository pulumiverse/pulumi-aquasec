// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryArtifact;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryEntityScope;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryInfrastructure;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryWorkload;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationScopeCategory extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationScopeCategory Empty = new GetApplicationScopeCategory();

    @Import(name="artifacts")
    private @Nullable List<GetApplicationScopeCategoryArtifact> artifacts;

    public Optional<List<GetApplicationScopeCategoryArtifact>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    @Import(name="entityScopes")
    private @Nullable List<GetApplicationScopeCategoryEntityScope> entityScopes;

    public Optional<List<GetApplicationScopeCategoryEntityScope>> entityScopes() {
        return Optional.ofNullable(this.entityScopes);
    }

    @Import(name="infrastructures")
    private @Nullable List<GetApplicationScopeCategoryInfrastructure> infrastructures;

    public Optional<List<GetApplicationScopeCategoryInfrastructure>> infrastructures() {
        return Optional.ofNullable(this.infrastructures);
    }

    @Import(name="workloads")
    private @Nullable List<GetApplicationScopeCategoryWorkload> workloads;

    public Optional<List<GetApplicationScopeCategoryWorkload>> workloads() {
        return Optional.ofNullable(this.workloads);
    }

    private GetApplicationScopeCategory() {}

    private GetApplicationScopeCategory(GetApplicationScopeCategory $) {
        this.artifacts = $.artifacts;
        this.entityScopes = $.entityScopes;
        this.infrastructures = $.infrastructures;
        this.workloads = $.workloads;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategory defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategory $;

        public Builder() {
            $ = new GetApplicationScopeCategory();
        }

        public Builder(GetApplicationScopeCategory defaults) {
            $ = new GetApplicationScopeCategory(Objects.requireNonNull(defaults));
        }

        public Builder artifacts(@Nullable List<GetApplicationScopeCategoryArtifact> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        public Builder artifacts(GetApplicationScopeCategoryArtifact... artifacts) {
            return artifacts(List.of(artifacts));
        }

        public Builder entityScopes(@Nullable List<GetApplicationScopeCategoryEntityScope> entityScopes) {
            $.entityScopes = entityScopes;
            return this;
        }

        public Builder entityScopes(GetApplicationScopeCategoryEntityScope... entityScopes) {
            return entityScopes(List.of(entityScopes));
        }

        public Builder infrastructures(@Nullable List<GetApplicationScopeCategoryInfrastructure> infrastructures) {
            $.infrastructures = infrastructures;
            return this;
        }

        public Builder infrastructures(GetApplicationScopeCategoryInfrastructure... infrastructures) {
            return infrastructures(List.of(infrastructures));
        }

        public Builder workloads(@Nullable List<GetApplicationScopeCategoryWorkload> workloads) {
            $.workloads = workloads;
            return this;
        }

        public Builder workloads(GetApplicationScopeCategoryWorkload... workloads) {
            return workloads(List.of(workloads));
        }

        public GetApplicationScopeCategory build() {
            return $;
        }
    }

}
