// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.ApplicationScopeCategoryArtifactImageVariableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationScopeCategoryArtifactImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationScopeCategoryArtifactImageArgs Empty = new ApplicationScopeCategoryArtifactImageArgs();

    @Import(name="expression")
    private @Nullable Output<String> expression;

    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    @Import(name="variables")
    private @Nullable Output<List<ApplicationScopeCategoryArtifactImageVariableArgs>> variables;

    public Optional<Output<List<ApplicationScopeCategoryArtifactImageVariableArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private ApplicationScopeCategoryArtifactImageArgs() {}

    private ApplicationScopeCategoryArtifactImageArgs(ApplicationScopeCategoryArtifactImageArgs $) {
        this.expression = $.expression;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationScopeCategoryArtifactImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationScopeCategoryArtifactImageArgs $;

        public Builder() {
            $ = new ApplicationScopeCategoryArtifactImageArgs();
        }

        public Builder(ApplicationScopeCategoryArtifactImageArgs defaults) {
            $ = new ApplicationScopeCategoryArtifactImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public Builder variables(@Nullable Output<List<ApplicationScopeCategoryArtifactImageVariableArgs>> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(List<ApplicationScopeCategoryArtifactImageVariableArgs> variables) {
            return variables(Output.of(variables));
        }

        public Builder variables(ApplicationScopeCategoryArtifactImageVariableArgs... variables) {
            return variables(List.of(variables));
        }

        public ApplicationScopeCategoryArtifactImageArgs build() {
            return $;
        }
    }

}
