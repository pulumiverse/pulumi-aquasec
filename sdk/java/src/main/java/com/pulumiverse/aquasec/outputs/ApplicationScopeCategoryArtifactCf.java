// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumiverse.aquasec.outputs.ApplicationScopeCategoryArtifactCfVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationScopeCategoryArtifactCf {
    private @Nullable String expression;
    private @Nullable List<ApplicationScopeCategoryArtifactCfVariable> variables;

    private ApplicationScopeCategoryArtifactCf() {}
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    public List<ApplicationScopeCategoryArtifactCfVariable> variables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationScopeCategoryArtifactCf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expression;
        private @Nullable List<ApplicationScopeCategoryArtifactCfVariable> variables;
        public Builder() {}
        public Builder(ApplicationScopeCategoryArtifactCf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.variables = defaults.variables;
        }

        @CustomType.Setter
        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder variables(@Nullable List<ApplicationScopeCategoryArtifactCfVariable> variables) {
            this.variables = variables;
            return this;
        }
        public Builder variables(ApplicationScopeCategoryArtifactCfVariable... variables) {
            return variables(List.of(variables));
        }
        public ApplicationScopeCategoryArtifactCf build() {
            final var o = new ApplicationScopeCategoryArtifactCf();
            o.expression = expression;
            o.variables = variables;
            return o;
        }
    }
}
